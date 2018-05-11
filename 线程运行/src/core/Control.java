
package core;

import java.util.Timer;
import java.util.TimerTask;
import view.MainFrame;
public final class Control {
    static MainFrame mf;
    public final Memory memory=new Memory(); 
    public Pcb work=null;  //存放当前正在运行的PCB对象
    private static Control man2=null;
    private static final long DELAY = 1000L;
    Timer timer=new Timer();//计时器

    private Control(){
        System.out.println("CPU已启动  ");
        ClockPriority();
    }


    //创建进程用的方法
    public int createPcb(String name, long time,int priority){
        return memory.createPcb(name, time, priority);
    }
    //设置算法
    public void ClockPriority(){
        System.out.println("调度算法已设置    "+"静态优先级调度算法");
        this.timer.schedule(task, 0, DELAY);
    }
    //计时器任务的声明
    TimerTask task=new TimerTask(){
        @Override
        public void run(){
            plan();
        }
    };

    //进程占用CPU
    public void work(Pcb pcb){
        if(work==null){
            this.work=pcb;
            pcb.setStatus("运行");
            for(int i=0;i<mf.model.getRowCount();i++){                                  
                if(work.getPid()==Integer.parseInt(String.valueOf(mf.model.getValueAt(i, 0)))){
                    //mf.data.set(2,"运行");
                    mf.model.setValueAt(work.getStatus(),i, 2);
                    mf.model.setValueAt(work.getRemainTime(),i, 3);
                    break;
                }                   
            }
            System.out.println("换进进程，Pid="+work.getPid()+"  Pname="+work.getName());
        }
        else{
            System.out.println("处理器不足");
        }
    }
    //进程让出处理器
    public void retire(){
        this.work=null;
    }
    //获取让出处理器进程的id
    private int getRetireId() {
        if(work!=null){
            return work.getPid();
        }
        else{
//            System.out.println("运行队列为空");
            return -1;
        }
    }
    //选出将要占用CPU的进程
    public int getWorkId() {
        if(memory.ready[1]==0){
//            System.out.println("就绪队列为空");
                return -1;
        }
        int maxpriority=0;
        int mpid=-1;
        if(work!=null){
            maxpriority=work.getPriority();
            mpid=work.getPid();
        }
        for(int x=1;x<101;x++){
            if(memory.pcb[memory.ready[x]].getPriority()>maxpriority){
                mpid=memory.ready[x];
                maxpriority=memory.pcb[memory.ready[x]].getPriority();
            }
            if(memory.ready[x+1]==0){
               return mpid;
            }
        }
        return -1;
    }
    
    //进程时间减少
    public void reduce(int pid){
        if(pid!=-1){
            memory.pcb[pid].setRemainTime(memory.pcb[pid].getRemainTime()-1);
            int y=0;
            for(int i=0;i<mf.model.getRowCount();i++){                                  
                if(pid==Integer.parseInt(String.valueOf(mf.model.getValueAt(i, 0)))){
                    mf.model.setValueAt(memory.pcb[pid].getRemainTime(),i, 3);
                    y=i;
                }                   
            }
            if(memory.pcb[pid].getRemainTime()<=0){
                retire();
                memory.destroy(pid);
                mf.model.removeRow(y);
            }
        }
    }
    //进程让出处理器
    public void humility(int retire){
        if(retire!=-1&&memory.pcb[retire].exist){
            retire();
            memory.ready(retire);
            System.out.println("换出进程,pid="+retire+"   pname="+memory.pcb[retire].getName());
        }
    }
    //占用处理器
    void occupy(int work){
        if(work!=-1){
            memory.removeFromReady(work);
            work(memory.pcb[work]);
        }
    }
    public void plan(){
        System.out.println("CPU调度程序开始运行");
        int retire=getRetireId();
        int work=getWorkId();
        if((retire!=-1&&retire==work)||(retire!=-1&&work==-1)){
            reduce(retire);
            System.out.println("没有优先级更高的进程");
        }
        else{
            humility(retire);
            reduce(retire);
            occupy(work);
        }
    } 
    public static Control display(){
        if( man2==null){
            man2=new Control();
            mf=new MainFrame(man2);
        }
        return man2;
    }
}
