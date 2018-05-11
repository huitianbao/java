package core;

import static core.Control.mf;


public class Memory {
    public Pcb pcb[]=new Pcb[101]; //进程池，事先创建好100个进程,随内存类一同实例化
    public final int ready[];     // 就绪数组
    private final int waiting[];  //等待数组
    Memory() {
        ready=new int[101];
        waiting = new int[101];
        for(int x=0;x<100;x++){
            pcb[x]=new Pcb();
        }
        System.out.println("进程池初始化完成");
        System.out.println("队列初始化完成");
    }
    //进程创建方法。
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
            System.out.println("创建进程"+newpid);
            this.ready(newpid);//初始就绪
            return newpid;
    	}
    	else{
    		return -1;
    	}
    }
    //进程销毁方法
    public void destroy(int dpid){
        pcb[dpid].exist=false;
        pcb[dpid].setPid(0);
        pcb[dpid].setName(null);
        pcb[dpid].setRemainTime(0);
        pcb[dpid].setPriority(0);
        if(pcb[dpid].getStatus().equals("就绪")){
            removeFromReady(dpid);
        }
        if(pcb[dpid].getStatus().equals("等待")){
            removeFromWaiting(dpid);
        }
        System.out.println("进程"+dpid+"终止");
    }
    // 就绪队列操作
    public void ready(int pid) {
        int x=1;
        while(true){
            if(ready[x]==0){
                ready[x]=pid;
                pcb[pid].setStatus("就绪");
                for(int i=0;i<mf.model.getRowCount();i++){                                  
                if(ready[x]==Integer.parseInt(String.valueOf(mf.model.getValueAt(i, 0)))){
                    //mf.data.set(2,"运行");
                    mf.model.setValueAt(pcb[pid].getStatus(),i, 2);
                }                   
            }
//                System.out.println("进程"+ready[x]+"加入就绪队列");
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
//                        System.out.println("进程"+pid+"退出就绪队列");
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
    // 等待队列操作
    public void waiting(int pid) {
    	int x=1;
        while(true){
            if(waiting[x]==0){
                waiting[x]=pid;
                pcb[pid].setStatus("等待");
                for(int i=0;i<mf.model.getRowCount();i++){                                  
                if(pid==Integer.parseInt(String.valueOf(mf.model.getValueAt(i, 0)))){
                    mf.model.setValueAt(pcb[pid].getStatus(),i, 2);
                }                   
            }
                System.out.println("进程"+ready[x]+"加入等待队列");
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
                        System.out.println("进程"+pid+"退出就绪队列");
                        break;
                    }
                    y++;
                }
            }
            else {x++;}
        }
    }
}