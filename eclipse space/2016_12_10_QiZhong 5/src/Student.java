import java.util.*;

public class Student {
	Scanner reader =new Scanner(System.in);
	
	private String password;
	protected String name;
	
	public void getPassword(){
		System.out.println("please input password and name:");
		password=reader.next();
		name=reader.next();
		while(true){
			if(password.length()<6||password.length()>16){
				System.out.println("密码长度不对");
			}
			
			else{
				System.out.println("name is   "+name+"          ,password is    "+password);
				break;
			}
		}
	
		
		
	}

}



/*

do{
	System.out.println("密码长度不对");
	password=reader.next();
	
}while(password.length()>6||password.length()>16);


*/