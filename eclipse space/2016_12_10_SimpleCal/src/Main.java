
public class Main {
	public static void main(String[] args){
		
	
	Number num=new Number(6,3);
	int addn,subn,multn;
	double divin;
	
	
	addn=num.add();
	subn=num.sub();
	multn=num.mult();
	divin=num.divi();
	
	System.out.println("addn="+addn);
	System.out.println("subn="+subn);
	System.out.println("multn="+multn);
	System.out.println("divin="+divin);
	
	Number num2=new Number(2,0);
	
	
	addn=num2.add();
	subn=num2.sub();
	multn=num2.mult();
	divin=num2.divi();

	
	System.out.println("addn="+addn);
	System.out.println("subn="+subn);
	System.out.println("multn="+multn);
	System.out.println("divin="+divin);
	
	
	
	
	}
}
