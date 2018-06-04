import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.*;

public class Cal extends JFrame implements ActionListener{

	static boolean clear;
	static String operator;
	static double previous;
	static double next;
	
	
	public Cal(){
	

		static JFrame frm=new JFrame("GridLayout");
		static JTextField jtf=new JTextField();
		
		static JButton a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t;
		static JButton B,C;
		
		static JPanel p1=new JPanel();
		static JPanel p2=new JPanel();
		
		
		
		
		
		a = new JButton("7");
		b = new JButton("8");
		c = new JButton("9");
		d = new JButton("/");
		
		e = new JButton("4");
		f = new JButton("5");
		g = new JButton("6");
		h = new JButton("x");
		
		i = new JButton("1");
		j = new JButton("2");
		k = new JButton("3");
		l = new JButton("-");
		
		m = new JButton("0");
		n = new JButton("+/-");
		o = new JButton(".");
		p = new JButton("+");
		
		q = new JButton("1/x");
		r = new JButton("%");
		s = new JButton("sqrt");
		t = new JButton("=");
		
		B=new JButton("Back");
		C=new JButton("C");
		
		
		frm.setLayout(null);
		frm.setSize(400, 300);
		frm.setResizable(false);
		
		
		
		GridLayout grid1 =new GridLayout(1,2);
		GridLayout grid2=new GridLayout(5,4);
		
		p1.add(B);   p1.add(C);
		p2.add(a);   p2.add(b);  p2.add(c); p2.add(d);
		p2.add(e);   p2.add(f);  p2.add(g); p2.add(h);
		p2.add(i);   p2.add(j);  p2.add(k); p2.add(l);
		p2.add(m);   p2.add(n);  p2.add(o); p2.add(p);
		p2.add(q);   p2.add(r);  p2.add(s); p2.add(t);
		
		p1.setLayout(null);
		p2.setLayout(null);
		
		
		p1.setLayout(grid1);
		p2.setLayout(grid2);
		
		
		jtf.setBounds(35, 15, 300, 25);
		jtf.setHorizontalAlignment(JTextField.RIGHT);
		p1.setBounds(35, 50, 300, 25);
		p2.setBounds(35, 85, 300, 120);
		
		
		frm.add(p1);
		frm.add(p2);
		frm.add(jtf);
		
		
		
		
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
	}
}

		
	


		
		
		public static void main(String[] args){
			
			Cal cal=new Cal();
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			
			
		}

	



