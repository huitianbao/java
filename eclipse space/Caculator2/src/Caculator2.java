import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Caculator2 extends JFrame implements ActionListener{
	
	
	static JPanel p1,p2;//�������
	static boolean clear;// �����ж��ı����ǿյģ����Ƿǿյ�
	
	static String operator; //�������������
	static double privious;  //�������������ǰ��Ĳ�����
	static double next;  //�����������������ĵڶ���������
	
	
	public Caculator2(){
		
		JFrame frm=new JFrame("������");
	
		
		BorderLayout border = new BorderLayout(2,2);
		frm.getContentPane().setLayout(border);
		frm.setSize(400, 400);
		
		JTextField tf=new JTextField();
		tf.setLocation(30, 15);


		JButton B=new JButton("Back");
		JButton C=new JButton("C");
		B.setSize(2, 2);
		C.setSize(2, 2);
		
		//GridLayout grid1=new GridLayout(1,2);//һ�У�����
		//GridLayout grid2=new GridLayout(5,4);//���У�����
		
		//������ô���������-------------------------
	
		
		p1.setLayout(new GridLayout(1,2));
		p1.setLocation(30, 50);
		
		p2.setLayout(new GridLayout(5,4));
		p2.setLocation(30, 100);
	
        p1.setSize(400, 20);
	    p2.setSize(400,300);
	    
	    
	  //���ı����������ֱ���봰���У����ô�С��λ�ã�
	    frm.add(tf,BorderLayout.NORTH);
	    frm.add(p1,BorderLayout.CENTER);
		frm.add(p2,BorderLayout.SOUTH);
		
	    
	    
		
		
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
		k = new JButton("2");
		l = new JButton("-");
		m = new JButton("0");
		n = new JButton("+/-");
		o = new JButton(".");
		p = new JButton("+");
		q = new JButton("1/x");
		r = new JButton("%");
		s = new JButton("sqrt");
		t = new JButton("=");
		

	
		//�����������Ĳ��ַ�ʽΪ����ʽ��������ť�������������
		p1.add(C);
		p1.add(B);
		
		
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
		
		 //��Ӳ˵���ͬʱΪ�����˵���ע���¼�����
		
		   
		
		
		
		
		
		
		
		

		frm.setResizable(false);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}


	
	/*
	public void addmyMenu(){
		JMenuBar mb1=new JMenuBar();
		frm.setJMenuBar(mb1);
		JMenu mf1=new JMenu("�ļ�");
		JMenu me1=new JMenu("����");
		
		mb1.add(mf1);
		mb1.add(me1);
		
		me1.add(new JMenuItem("����"));
		
		
	}
	

	*/
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	public static void main(String[] args){
		Caculator2 cal=new Caculator2();
	}
	
	
	

	
	

}


