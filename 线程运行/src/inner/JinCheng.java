package inner;

public class JinCheng {
    public boolean exist=false;
    private int pid;      // 进程id
    private String pName;        // 进程名称
    private String status;      // 进程状态
    private long pTime;    // 剩余运行时间
    private int priority;   //进程优先级
    public JinCheng() {}
    public void setPid(int pid){
        this.pid=pid;
    }
    public int getPid() {
        return this.pid;
    }
    public String getName() {
        return this.pName;
    }
    public void setName(String newName) {
        this.pName = newName;
    }
    public String getStatus() {
        return this.status;
    }
    public String setStatus(String status) {
        this.status = status;
        return "进程"+this.getPid()+"状态改为"+this.status;
    }
    public void setRemainTime(long time) {
        this.pTime = time;
    }
    public long getRemainTime() {
        return this.pTime;
    }
    public void setPriority(int priority){
        this.priority=priority;
    }
    public int getPriority(){
        return priority;
    }
}
