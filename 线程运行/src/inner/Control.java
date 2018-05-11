package inner;

import java.util.Timer;
import java.util.TimerTask;
import outer.MainFrame;
public final class Control {
    static MainFrame mf;
    public final Memory memory=new Memory(); 
    public JinCheng running=null;  //存放当前正在运行的PCB对象
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
        this.timer.schedule(task, 0, DELAY);
    }
    //计时器任务的声明
    TimerTask task=new TimerTask(){
        public void run(){
            plan();
        }
    };

    //进程占用CPU
    public void run(JinCheng pcb){
        if(running==null){
            this.running=pcb;
            pcb.setStatus("运行");
            for(int i=0;i<mf.model.getRowCount();i++){                                  
                if(running.getPid()==Integer.parseInt(String.valueOf(mf.model.getValueAt(i, 0)))){
                    mf.model.setValueAt(running.getStatus(),i, 2);
                    mf.model.setValueAt(running.getRemainTime(),i, 3);
                    break;
                }                   
            }          
        }
        else{
            System.out.println("处理器不足");
        }
    }
    //获取让出处理器进程的id
    private int getTransedAuthorityId() {
        if(running!=null){
            return running.getPid();
        }
        else{
            return -1;
        }
    }
    //选出将要占用CPU的进程
    public int getGotAuthorityId() {
        if(memory.ready[1]==0){
                return -1;
        }
        int maxpriority=0;
        int mpid=-1;
        if(running!=null){
            maxpriority=running.getPriority();
            mpid=running.getPid();
        }
        for(int x=1;x<101;x++){
            if(memory.jc[memory.ready[x]].getPriority()>maxpriority){
                mpid=memory.ready[x];
                maxpriority=memory.jc[memory.ready[x]].getPriority();
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
        	//剪时间
            memory.jc[pid].setRemainTime(memory.jc[pid].getRemainTime()-1);
            int y=0;
            //给时间
            for(int i=0;i<mf.model.getRowCount();i++){                                  
                if(pid==Integer.parseInt(String.valueOf(mf.model.getValueAt(i, 0)))){
                    mf.model.setValueAt(memory.jc[pid].getRemainTime(),i, 3);
                    y=i;
                }                   
            }
            //删
            if(memory.jc[pid].getRemainTime()<=0){
            	 this.running=null;
                memory.destroy(pid);
                mf.model.removeRow(y);
            }
        }
    }
    //进程让出处理器，换进程运行
    public void TransAuthority(int transedAuthority){
        if(transedAuthority!=-1&&memory.jc[transedAuthority].exist){
        	 this.running=null;
            memory.ready(transedAuthority);
            System.out.println("换出进程,pid="+transedAuthority+"   pname="+memory.jc[transedAuthority].getName());
        }
    }
    //占用处理器
    void occupy(int gotAuthority){
        if(gotAuthority!=-1){
            memory.removeFromReady(gotAuthority);
            run(memory.jc[gotAuthority]);
        }
    }
    public void plan(){
        System.out.println("CPU调度程序开始运行");
        int transedAuthority=getTransedAuthorityId();
        int gotAuthority=getGotAuthorityId();
        if((transedAuthority!=-1&&transedAuthority==gotAuthority)||(transedAuthority!=-1&&gotAuthority==-1)){
            reduce(transedAuthority);
            System.out.println("没有优先级更高的gotAuthority进程");
        }
        else{
        	TransAuthority(transedAuthority);
            reduce(transedAuthority);
            occupy(gotAuthority);
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