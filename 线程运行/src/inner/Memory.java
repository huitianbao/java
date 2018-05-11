package inner;

import static inner.Control.mf;


public class Memory {
    public JinCheng jc[]=new JinCheng[101]; //���̳أ����ȴ�����100������,���ڴ���һͬʵ����
    public final int ready[];     // ��������
    private final int waiting[];  //�ȴ�����
    Memory() {
        ready=new int[101];
        waiting = new int[101];
        for(int x=0;x<100;x++){
        	jc[x]=new JinCheng();
        }
        System.out.println("���̳س�ʼ�����");
        System.out.println("���г�ʼ�����");
    }
    //���̴���������
    public int createPcb(String name, long time,int priority){
        int newpid=1;
    	while(jc[newpid].exist){
    		newpid++;
    	}
    	if(newpid<=100){
    		jc[newpid].setPid(newpid);
    		jc[newpid].exist=true;
    		jc[newpid].setName(name);
    		jc[newpid].setRemainTime(time);
    		jc[newpid].setPriority(priority);
            System.out.println("��������"+newpid);
            this.ready(newpid);//��ʼ����
            return newpid;
    	}
    	else{
    		return -1;
    	}
    }
    //�������ٷ���
    public void destroy(int dpid){
    	jc[dpid].exist=false;
    	jc[dpid].setPid(0);
        jc[dpid].setName(null);
        jc[dpid].setRemainTime(0);
        jc[dpid].setPriority(0);
        if(jc[dpid].getStatus().equals("����")){
            removeFromReady(dpid);
        }
        if(jc[dpid].getStatus().equals("�ȴ�")){
            removeFromWaiting(dpid);
        }
        System.out.println("����"+dpid+"��ֹ");
    }
    // �������в���
    public void ready(int pid) {
        int x=1;
        while(true){
            if(ready[x]==0){
                ready[x]=pid;
                jc[pid].setStatus("����");
                for(int i=0;i<mf.model.getRowCount();i++){                                  
                if(ready[x]==Integer.parseInt(String.valueOf(mf.model.getValueAt(i, 0)))){
                    //mf.data.set(2,"����");
                    mf.model.setValueAt(jc[pid].getStatus(),i, 2);
                }                   
            }
//                System.out.println("����"+ready[x]+"�����������");
                break;
            }
            x++;
        }
    }
    
    public void removeFromReady(int pid) {
        int x=1;
        while(x!=-1&&x<=100){
            if(ready[x]==pid){
                int y=x;
                while(true){
                    ready[y]=ready[y+1];
                    if(ready[y+1]==0){
                        x=-1;
//                        System.out.println("����"+pid+"�˳���������");
                        break;
                    }
                    y++;
                }
            }
            else {
                x++;
            }
        }
    }
    // �ȴ����в���
    public void waiting(int pid) {
    	int x=1;
        while(true){
            if(waiting[x]==0){
                waiting[x]=pid;
                jc[pid].setStatus("�ȴ�");
                for(int i=0;i<mf.model.getRowCount();i++){                                  
                if(pid==Integer.parseInt(String.valueOf(mf.model.getValueAt(i, 0)))){
                    mf.model.setValueAt(jc[pid].getStatus(),i, 2);
                }                   
            }
                System.out.println("����"+ready[x]+"����ȴ�����");
                break;
            }
            x++;
        }
    }
    
    public void removeFromWaiting(int pid) {
        int x=1;
        while(x!=-1){
            if(waiting[x]==pid){
                int y=x;
                while(true){
                    waiting[y]=waiting[y+1];
                    if(waiting[y+1]==0){
                        x=-1;
                        System.out.println("����"+pid+"�˳���������");
                        break;
                    }
                    y++;
                }
            }
            else {x++;}
        }
    }
}