
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

public class cal extends JFrame implements ActionListener{
	static JFrame frm=new JFrame("Cal");

	static JPanel p1,p2;//两个面板
	static boolean clear;// 用来判断文本框是空的，还是非空的
	
	static String operator; //用来保存运算符
	static double privious;  //用来保存运算符前面的操作数
	static double next;  //用来保存运算符后面的第二个操作数
	
	
	public cal(){
		frm.setLayout(null);
		frm.setLayout(new BorderLayout(2,2));
		frm.setSize(600, 600);
		frm.setLocation(400, 400);
		
		JTextField jtf=new JTextField(10);
		jtf.setHorizontalAlignment(JTextField.LEFT);
		jtf.setLocation(0, 0);
		jtf.setSize(450, 30);
		
		
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		
		p1.setLayout(null);
		p1.setLayout(new GridLayout(1,2));
		p1.setBounds(0, 40, 400,20);
		
		p2.setLayout(null);
		p2.setBounds(0, 80, 400, 500);
		
		JButton jb,jc;
		jb=new JButton("Back");
		jc=new JButton("C");
		jb.setSize(200, 20);
		jc.setSize(200, 20);
		
		jb.setLocation(0, 40);
		jc.setLocation(210,40);
		
		p1.add(jb);
		p1.add(jc);
		
	
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
		
		
	
		
	}
	
	public static void main(String[] args){
		cal c=new cal();
		
	}
}
