
public class Number {
	private int n1,n2;
	
	public Number(int newN1,int newN2){
		n1=newN1;
		n2=newN2;
		
				
	}
	
	public int add(){
		return n1+n2;
	}
	
	public int sub(){
		return n1-n2;
		
	}
	
	public int mult(){
		return n1*n2;
	}
	
	public double divi(){
		double r = 0;
		try{
			r= n1/n2;
		}
		catch(ArithmeticException e){
			System.out.println("被除数不能为0");
		}
		
		return r;
	}

}
