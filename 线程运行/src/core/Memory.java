package core;

import static core.Control.mf;


public class Memory {
    public Pcb pcb[]=new Pcb[101]; //���̳أ����ȴ�����100������,���ڴ���һͬʵ����
    public final int ready[];     // ��������
    private final int waiting[];  //�ȴ�����
    Memory() {
        ready=new int[101];
        waiting = new int[101];
        for(int x=0;x<100;x++){
            pcb[x]=new Pcb();
        }
        System.out.println("���̳س�ʼ�����");
        System.out.println("���г�ʼ�����");
    }
    //���̴���������
    public int createPcb(String name, long time,int priority){
        int newpid=1;
    	while(pcb[newpid].exist){
    		newpid++;
    	}
    	if(newpid<=100){
            pcb[newpid].setPid(newpid);
            pcb[newpid].exist=true;
            pcb[newpid].setName(name);
            pcb[newpid].setRemainTime(time);
            pcb[newpid].setPriority(priority);
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
        pcb[dpid].exist=false;
        pcb[dpid].setPid(0);
        pcb[dpid].setName(null);
        pcb[dpid].setRemainTime(0);
        pcb[dpid].setPriority(0);
        if(pcb[dpid].getStatus().equals("����")){
            removeFromReady(dpid);
        }
        if(pcb[dpid].getStatus().equals("�ȴ�")){
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
                pcb[pid].setStatus("����");
                for(int i=0;i<mf.model.getRowCount();i++){                                  
                if(ready[x]==Integer.parseInt(String.valueOf(mf.model.getValueAt(i, 0)))){
                    //mf.data.set(2,"����");
                    mf.model.setValueAt(pcb[pid].getStatus(),i, 2);
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
                pcb[pid].setStatus("�ȴ�");
                for(int i=0;i<mf.model.getRowCount();i++){                                  
                if(pid==Integer.parseInt(String.valueOf(mf.model.getValueAt(i, 0)))){
                    mf.model.setValueAt(pcb[pid].getStatus(),i, 2);
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