//import java.util.Scanner;

public class Stu {

	public static void main(String[] arge) {

		
		double sum[]=new double[10];
		double aver[]=new double[10];
		
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		// Student s5=new Student();
		
		
		
		/*

		s1.setStudent(201501, "huitianbao", "nan", true, 50, 100, 120);
		s2.setStudent(201502, "jiangminglai", "nan", false, 60, 110, 130);
		s3.setStudent(201503, "xiehaolai", "nan", true, 70, 120, 140);
		s4.setStudent(201504, "maochenjun", "nan", false, 80, 130, 140);
		
		
         */
		System.out.print("请输入学生的信息和成绩 如    201501 \"huitianbao\"   \"nan\" true 50 100 120");
		
		
		
	    s1.ShuRu();
	    /*
	    s2.ShuRu();
	    s3.ShuRu();
	    s4.ShuRu();
	    */
		sum[0] = s1.Sum();                                                    //s1.math, s1.yuwen, s1.English);
		System.out.print(sum[0]+"\n");
        aver[0]=s1.Aver();                                                    //s1.math, s1.yuwen, s1.English);
        System.out.print(aver[0]+"\n");
        System.out.print("------------------------------------------------");
   //-----------------------------------------------------------------     
        s2.ShuRu();
        
		sum[1] = s1.Sum();                                                     //s2.math, s2.yuwen, s2.English);
		System.out.println(sum[1]+"\n");
		aver[1]=s1.Aver();                                                      //s2.math, s2.yuwen, s2.English);
        System.out.print(aver[1]+"\n");
        System.out.print("------------------------------------------------");
   //-----------------------------------------------------------------     
        
	
        s3.ShuRu();
        
		sum[2] = s1.Sum();                                                        //s3.math, s3.yuwen, s3.English);
		System.out.println(sum[1]+"\n");
		aver[2]=s3.Aver();                                                         //s3.math, s3.yuwen, s3.English);
        System.out.print(aver[2]+"\n");
        System.out.print("------------------------------------------------");
        
   //-----------------------------------------------------------------     
        
        s4.ShuRu();
        
		sum[3] = s4.Sum();                                                           //s4.math, s4.yuwen, s4.English);
		System.out.println(sum[3]+"\n");
		aver[3]=s1.Aver();                                                             //s4.math, s4.yuwen, s4.English);
        System.out.print(aver[3]+"\n");
        System.out.print("-------------------------------------------------");
   //-----------------------------------------------------------------     
        

		
		
		
		

	}


}




