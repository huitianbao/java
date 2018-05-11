package inner;

import java.util.Timer;
import java.util.TimerTask;
import outer.MainFrame;
public final class Control {
    static MainFrame mf;
    public final Memory memory=new Memory(); 
    public JinCheng running=null;  //��ŵ�ǰ�������е�PCB����
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
        this.timer.schedule(task, 0, DELAY);
    }
    //��ʱ�����������
    TimerTask task=new TimerTask(){
        public void run(){
            plan();
        }
    };

    //����ռ��CPU
    public void run(JinCheng pcb){
        if(running==null){
            this.running=pcb;
            pcb.setStatus("����");
            for(int i=0;i<mf.model.getRowCount();i++){                                  
                if(running.getPid()==Integer.parseInt(String.valueOf(mf.model.getValueAt(i, 0)))){
                    mf.model.setValueAt(running.getStatus(),i, 2);
                    mf.model.setValueAt(running.getRemainTime(),i, 3);
                    break;
                }                   
            }          
        }
        else{
            System.out.println("����������");
        }
    }
    //��ȡ�ó����������̵�id
    private int getTransedAuthorityId() {
        if(running!=null){
            return running.getPid();
        }
        else{
            return -1;
        }
    }
    //ѡ����Ҫռ��CPU�Ľ���
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
    
    //����ʱ�����
    public void reduce(int pid){
        if(pid!=-1){
        	//��ʱ��
            memory.jc[pid].setRemainTime(memory.jc[pid].getRemainTime()-1);
            int y=0;
            //��ʱ��
            for(int i=0;i<mf.model.getRowCount();i++){                                  
                if(pid==Integer.parseInt(String.valueOf(mf.model.getValueAt(i, 0)))){
                    mf.model.setValueAt(memory.jc[pid].getRemainTime(),i, 3);
                    y=i;
                }                   
            }
            //ɾ
            if(memory.jc[pid].getRemainTime()<=0){
            	 this.running=null;
                memory.destroy(pid);
                mf.model.removeRow(y);
            }
        }
    }
    //�����ó�������������������
    public void TransAuthority(int transedAuthority){
        if(transedAuthority!=-1&&memory.jc[transedAuthority].exist){
        	 this.running=null;
            memory.ready(transedAuthority);
            System.out.println("��������,pid="+transedAuthority+"   pname="+memory.jc[transedAuthority].getName());
        }
    }
    //ռ�ô�����
    void occupy(int gotAuthority){
        if(gotAuthority!=-1){
            memory.removeFromReady(gotAuthority);
            run(memory.jc[gotAuthority]);
        }
    }
    public void plan(){
        System.out.println("CPU���ȳ���ʼ����");
        int transedAuthority=getTransedAuthorityId();
        int gotAuthority=getGotAuthorityId();
        if((transedAuthority!=-1&&transedAuthority==gotAuthority)||(transedAuthority!=-1&&gotAuthority==-1)){
            reduce(transedAuthority);
            System.out.println("û�����ȼ����ߵ�gotAuthority����");
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