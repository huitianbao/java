import java.util.Scanner;


public class Student {

		Scanner reader = new Scanner(System.in);

		public long ID;
		public String name;
		public String sex;
		public boolean gan;
		public int math, yuwen, English;

		
		/*
		public void setStudent(long id,String n,String s,boolean g,int m,int y,int E){
			ID=id;
			name=n;
			sex=s;
			gan=g;
			math=m;
			yuwen=y;
			English=E;
		}
		
		*/
		
		
		public void ShuRu() {
			
			
			ID = reader.nextLong();
			name = reader.next();
			sex = reader.next();
			gan = reader.nextBoolean();
			math = reader.nextInt();
			yuwen = reader.nextInt();
			English = reader.nextInt();

		}

		public int Sum() {
			return math+yuwen+English;

		}

		public double Aver(){
			return (math+yuwen+English)/3.0;
		}

}
