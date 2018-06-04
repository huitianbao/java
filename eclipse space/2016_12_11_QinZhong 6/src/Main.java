import java.util.Random;

public class Main {
	public static void main(String[] args){
		
		
		int r=(int)(Math.random()*10);
		Circle c1=new Circle(r);
		
		System.out.println(r);
		
		c1.printArea();
		
	}

}
