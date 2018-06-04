
public class Circle extends Shape{
	private final double PI=3.14;
	private int radius;
	
	public Circle(int newRadius){
		radius=newRadius;
	}
	
	public double Area(){
		return PI*radius*radius;
		
	}
	
	public void printArea(){
		System.out.println("Circle's area is  "+this.Area());
		
	}

}
