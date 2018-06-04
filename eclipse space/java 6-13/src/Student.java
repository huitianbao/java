import java.util.*;

public class Student {

	public Student(){}
	
	public void shuRu(int newNum,int newMath,int newEng,int newChinese,String newName,String newSex,boolean newBan){
		num=newNum;       math=newMath;      Eng=newEng;    chinese=newChinese;   name=newName;   sex=newSex;    ban=newBan;
		
		
	}
	
	
	public int total(){
		return chinese+Eng+math;
	}
	
	public double average(){
		return (chinese+Eng+math)/3.0;
	}
	
	private
	int num;
	int math;
	int Eng;
	int chinese;
	String name;
	String sex;
	boolean ban;

	public static void main(String[] args){
		Student stu=new Student();
		stu.shuRu(123456, 90, 90, 90, "hui", "male", false);
		System.out.println("the total ss"+stu.total()+"    the average is "+stu.average());
		
		
		
	}
}


