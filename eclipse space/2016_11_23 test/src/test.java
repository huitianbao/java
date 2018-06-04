
import java.awt.BorderLayout;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

public class test {
	static JFrame frm=new JFrame("wwww");
	
	public static void main(String[] args){
		frm.setLayout(null);
		frm.setLayout(new BorderLayout(2,2));
	
		frm.setSize(900, 300);
		frm.setLocation(400, 400);
		
		JPanel p1=new JPanel();
		
		JButton jb1=new JButton("bbb");
		
		frm.add(p1,BorderLayout.SOUTH);
		p1.add(jb1);
		
		
		frm.setResizable(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
		
		
	}

}
