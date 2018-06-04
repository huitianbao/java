import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class App_13_11 extends JFrame implements ActionListener {

	JButton a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t;
	JButton B, C;

	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();

	JTextField jtf = new JTextField();

	boolean clear;
	String operator;
	double previous;
	double next;

	public App_13_11() {
		JFrame frm = new JFrame();
		frm.setTitle("GridLayout");                                     //2016_11_27    怎么输入负数？？？？

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

		B = new JButton("Back");
		C = new JButton("C");

		frm.setLayout(null);
		frm.setSize(400, 300);
		frm.setResizable(false);

		GridLayout grid1 = new GridLayout(1, 2);
		GridLayout grid2 = new GridLayout(5, 4);

		p1.add(B);
		p1.add(C);
		p2.add(a);
		p2.add(b);
		p2.add(c);
		p2.add(d);
		p2.add(e);
		p2.add(f);
		p2.add(g);
		p2.add(h);
		p2.add(i);
		p2.add(j);
		p2.add(k);
		p2.add(l);
		p2.add(m);
		p2.add(n);
		p2.add(o);
		p2.add(p);
		p2.add(q);
		p2.add(r);
		p2.add(s);
		p2.add(t);

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

		// ----------------------------------------------------------------------------------
		JMenuBar jmb = new JMenuBar();

		JMenu menu1 = new JMenu("文件");
		JMenu menu2 = new JMenu("帮助");
		JMenuItem about = new JMenuItem("关于");
	
		jmb.add(menu1);
		jmb.add(menu2);
		menu2.add(about);

		frm.setJMenuBar(jmb);

		// -----------------------------------------------------------------------------------

		//menu2.addActionListener(frm);

		B.addActionListener(this);
		C.addActionListener(this);

		a.addActionListener(this);
		b.addActionListener(this);
		c.addActionListener(this);
		d.addActionListener(this);
		e.addActionListener(this);
		f.addActionListener(this);
		g.addActionListener(this);
		h.addActionListener(this);
		i.addActionListener(this);
		j.addActionListener(this);
		k.addActionListener(this);
		l.addActionListener(this);
		m.addActionListener(this);
		n.addActionListener(this);
		o.addActionListener(this);
		p.addActionListener(this);
		q.addActionListener(this);
		r.addActionListener(this);
		s.addActionListener(this);
		t.addActionListener(this);
		
		about.addActionListener(this);//这句话竟然忘写了

		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setResizable(false);
		frm.setVisible(true);

	}

	public void actionPerformed(ActionEvent ee) {

		Object temp = ee.getSource();
		
		
		
		String label = ee.getActionCommand();
		if(label.equals("退出"))
			System.exit(0);
		if(label.equals("关于"))
		{
			JOptionPane.showMessageDialog(App_13_11.this, "请查看帮助文档");
		}
		
		
		
		
		//if(temp.equals("关于")){
		//	JOptionPane.showMessageDialog(App_13_11.this, "请查看帮助文档","tip",JOptionPane.WARNING_MESSAGE);
		//}
		
		
		
		
		if (temp == C) {
			jtf.setText(null);

		}

		if (temp == B) {

		}
		
		

		if (temp == m) {
			jtf.setText(jtf.getText() + "0");
		}

		if (temp == i) {

			jtf.setText(jtf.getText() + "1");
		}

		if (temp == j) {
			jtf.setText(jtf.getText() + "2");
		}

		if (temp == k) {
			jtf.setText(jtf.getText() + "3");

		}

		if (temp == e) {
			jtf.setText(jtf.getText() + "4");

		}

		if (temp == f) {
			jtf.setText(jtf.getText() + "5");

		}

		if (temp == g) {
			jtf.setText(jtf.getText() + "6");

		}

		if (temp == a) {
			jtf.setText(jtf.getText() + "7");

		}
		if (temp == b) {
			jtf.setText(jtf.getText() + "8");
		}

		if (temp == c) {
			jtf.setText(jtf.getText() + "9");

		}

		if (temp == p) {
			// +

			previous = Double.parseDouble(jtf.getText());
			operator = "+";
			jtf.setText(null);

		}
		if (temp == l) {
			// -
			previous = Double.parseDouble(jtf.getText());
			
			operator = "-";
			//jtf.setText(null);

		}

		if (temp == h) {
			// x
			previous = Double.parseDouble(jtf.getText());
			operator = "x";
			jtf.setText(null);

		}

		if (temp == d) {
			// /
			previous = Double.parseDouble(jtf.getText());
			operator = "/";
			jtf.setText(null);

		}

		if (temp == n) {
			// +/-
			previous = Double.parseDouble(jtf.getText());
			operator = "+/-";
			jtf.setText(null);

		}

		if (temp == o) {

			// .
			jtf.setText(jtf.getText() + ".");
		}

		if (temp == q) {
			// 1/x
			previous = Double.parseDouble(jtf.getText());
			operator = "1/x";
			jtf.setText(null);

		}

		if (temp == r) {
			// %
			previous = Double.parseDouble(jtf.getText());
			operator = "%";
			jtf.setText(null);

		}

		if (temp == s) {
			// sqrt
			previous = Double.parseDouble(jtf.getText());
			operator = "sqrt";
			// jtf.setText(null);

		}

		//if(temp=="帮助"){
			//JOptionPane.showMessageDialog(, "请查看帮助文档", "tip", JOptionPane.WARNING_MESSAGE);

		//}
		if (operator == "%") {
			double tmp = previous / 100;
			String s = ("" + tmp + "%");
			jtf.setText(s);
		}

		if (operator == "1/x") {
			if(previous==0){
				jtf.setText("1/x   x不能为0");
			}
			else{
			double tmp = 1 / previous;
			String s = ("" + tmp);
			jtf.setText(s);
		}
		}

		if (operator == "sqrt") {
			if(previous<=0){
				jtf.setText("输入的数必须大于等于0");
			}
			else{
			double tmp = Math.sqrt(previous);
			String s = ("" + tmp);
			jtf.setText(s);
			}
		}
		
		if(operator=="+/-"){
			String s = null;
			if(previous>=0){
				s=(""+previous);
			}
			if(previous<0){
				s=("-"+previous);
			}
			
			jtf.setText(s);
		}

		
		if (temp == t) {
			// =
			next = Double.parseDouble(jtf.getText());
			if (operator == "+") {
				double tmp = previous + next;
				String s = ("" + tmp);

				jtf.setText(s);
			}

			if (operator == "-") {
				String s=null;
				double tmptmp=Double.parseDouble(jtf.getText());
				if(tmptmp==0.0){
					s=("-"+next);                                                           ///////////////////////////////////////////////
				}
				
				if(previous!=0){
				double tmp = previous - next;
				s = ("" + tmp);

				jtf.setText(s);
				}
			}

			if (operator == "x") {
				double tmp = previous * next;
				
				String s = ("" + tmp);

				jtf.setText(s);
			}

			if (operator == "/") {
				double tmp = previous / next;
				String s = ("" + tmp);

				jtf.setText(s);
			}
			
		

		}

	}

	public static void main(String[] args) {

		App_13_11 cal = new App_13_11();

	}

}
