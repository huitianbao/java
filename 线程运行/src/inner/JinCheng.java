package inner;

public class JinCheng {
    public boolean exist=false;
    private int pid;      // ����id
    private String pName;        // ��������
    private String status;      // ����״̬
    private long pTime;    // ʣ������ʱ��
    private int priority;   //�������ȼ�
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
        return "����"+this.getPid()+"״̬��Ϊ"+this.status;
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
