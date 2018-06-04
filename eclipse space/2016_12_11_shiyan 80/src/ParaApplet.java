import java.awt.Graphics;
import javax.swing.JApplet;

public class ParaApplet extends JApplet{
	
	private String name;
	private int age;
	public void init(){
		name=getParameter("myName");
		age=Integer.parseInt(getParameter("myAge"));
		
		
	}
	
	public void paint(Graphics g){
		System.out.println(name);
		System.out.println(age);
		
		
	}

}
