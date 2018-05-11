
package core;

import java.util.Timer;
import java.util.TimerTask;
import view.MainFrame;
public final class Control {
    static MainFrame mf;
    public final Memory memory=new Memory(); 
    public Pcb work=null;  //��ŵ�ǰ�������е�PCB����
    private static Control man2=null;
    private static final long DELAY = 1000L;
    Timer timer=new Timer();//��ʱ��

    private Control(){
        System.out.println("CPU������  ");
        ClockPriority();
    }


    //���������õķ���
    public int createPcb(String name, long time,int priority){
        return memory.createPcb(name, time, priority);
    }
    //�����㷨
    public void ClockPriority(){
        System.out.println("�����㷨������    "+"��̬���ȼ������㷨");
        this.timer.schedule(task, 0, DELAY);
    }
    //��ʱ�����������
    TimerTask task=new TimerTask(){
        @Override
        public void run(){
            plan();
        }
    };

    //����ռ��CPU
    public void work(Pcb pcb){
        if(work==null){
            this.work=pcb;
            pcb.setStatus("����");
            for(int i=0;i<mf.model.getRowCount();i++){                                  
                if(work.getPid()==Integer.parseInt(String.valueOf(mf.model.getValueAt(i, 0)))){
                    //mf.data.set(2,"����");
                    mf.model.setValueAt(work.getStatus(),i, 2);
                    mf.model.setValueAt(work.getRemainTime(),i, 3);
                    break;
                }                   
            }
            System.out.println("�������̣�Pid="+work.getPid()+"  Pname="+work.getName());
        }
        else{
            System.out.println("����������");
        }
    }
    //�����ó�������
    public void retire(){
        this.work=null;
    }
    //��ȡ�ó����������̵�id
    private int getRetireId() {
        if(work!=null){
            return work.getPid();
        }
        else{
//            System.out.println("���ж���Ϊ��");
            return -1;
        }
    }
    //ѡ����Ҫռ��CPU�Ľ���
    public int getWorkId() {
        if(memory.ready[1]==0){
//            System.out.println("��������Ϊ��");
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
    
    //����ʱ�����
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
    //�����ó�������
    public void humility(int retire){
        if(retire!=-1&&memory.pcb[retire].exist){
            retire();
            memory.ready(retire);
            System.out.println("��������,pid="+retire+"   pname="+memory.pcb[retire].getName());
        }
    }
    //ռ�ô�����
    void occupy(int work){
        if(work!=-1){
            memory.removeFromReady(work);
            work(memory.pcb[work]);
        }
    }
    public void plan(){
        System.out.println("CPU���ȳ���ʼ����");
        int retire=getRetireId();
        int work=getWorkId();
        if((retire!=-1&&retire==work)||(retire!=-1&&work==-1)){
            reduce(retire);
            System.out.println("û�����ȼ����ߵĽ���");
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
