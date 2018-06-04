
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Caculator extends JFrame {
	public static void main(String[] args) {

		JTextField L;
		
		JButton C, B;

		JFrame frm = new JFrame("边界式布局管理器  计算器");
		BorderLayout border = new BorderLayout(2, 2);

		frm.setLayout(null);
		frm.setLayout(border);
		
		frm.setSize(600, 400);

		L = new JTextField(9);
		L.setLocation(0, 0);
		/*
		L.setBounds(0, 0, 400, 40);
		
		L.setSize(10, 40);
		*/
	
		L.setHorizontalAlignment(JTextField.LEFT);
		frm.add(L, BorderLayout.NORTH);
		
		
		
		
		C = new JButton("C");
		B = new JButton("Back");

		JPanel p1 = new JPanel(); 
		//----------------------------------------------------
		//p1.setSize(400, 40);
		p1.setLocation(0, 0);
		
		GridLayout grid1=new GridLayout(1,2);
		p1.setLayout(null);
		p1.setLayout(grid1);
		B.setSize(3, 3);
		C.setSize(3, 3);
		
		p1.add(C);
		p1.add(B);
		
	
		
		
		
		/*
		JPanel p2=new JPanel();
		//---------------------------------------------------
		p2.setSize(400, 20);
		
		p2.add(B);
		p2.add(C);
		
		*/
		frm.add(p1,BorderLayout.CENTER);
		
		JPanel p3=new JPanel();
		frm.add(p3,BorderLayout.SOUTH);
		p3.setSize(120, 90);
		//p3.setLayout(border);
		

		JButton a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t;
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

	

	
		p3.add(a);
		p3.add(b);
		p3.add(c);
		p3.add(d);
		p3.add(e);
		p3.add(f);
		p3.add(g);
		p3.add(h);
		p3.add(i);
		p3.add(j);
		p3.add(k);
		p3.add(l);
		p3.add(m);
		p3.add(n);
		p3.add(o);
		p3.add(p);
		p3.add(q);
		p3.add(r);
		p3.add(s);
		p3.add(t);

	

		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);

	}

}
