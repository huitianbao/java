


	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.awt.event.MouseListener;

	import javax.swing.*;

	public class Caculator extends JFrame implements ActionListener {

		
		static JPanel pan = new JPanel();//������
		static JPanel pan1 = new JPanel();//������1
		JTextField tf = new JTextField();//�ı���
		JMenuBar mb1=new JMenuBar();//�����˵���
		JMenu mf1=new JMenu();//�����˵�
		JMenu me1=new JMenu();
		static JButton[] b = new JButton[10];//���ּ���ť
		static JButton ba, bb, bc, bd, be, bf, bg, c, bh, bi, bj, bk;//��ť
		private boolean First = true;// �ж���������Ƿ��ǵ�һ����
		private double result = 0;//��¼�������ֵ
		private String operator = "=";//��¼������������ֵ������Ϊ�Ⱥţ�ԭ������˴��߼���
		//���캯��
		public Caculator() {

			for (int i = 0; i < 10; i++) {
				b[i] = new JButton("" + i);
				b[i].setForeground(Color.blue);//�����ֵ���ɫ
			}
			ba = new JButton("Back");ba.setForeground(Color.red);
			c = new JButton("C");c.setForeground(Color.red);
			bb = new JButton(".");bb.setForeground(Color.blue);
			bc = new JButton("+");bc.setForeground(Color.red);
			bd = new JButton("-");bd.setForeground(Color.red);
			be = new JButton("x");be.setForeground(Color.red);
			bf = new JButton("��");bf.setForeground(Color.red);
			bg = new JButton("=");bg.setForeground(Color.red);
			bh = new JButton("sqrt");bh.setForeground(Color.red);
			bi = new JButton("1/x");bi.setForeground(Color.red);
			bj = new JButton("%");bj.setForeground(Color.red);
			bk = new JButton("+/-");bk.setForeground(Color.red);

			this.setTitle("������");
			this.setLayout(null);
			this.setSize(240, 355);
			this.setResizable(false);
			GridLayout grid = new GridLayout(5, 4);
			GridLayout grid1 = new GridLayout(1, 2);
			pan.setLayout(grid);
			pan1.setLayout(grid1);
			tf.setBounds(0, 0, 240, 30);
			pan1.setBounds(0, 30, 240, 30);
			pan.setBounds(0, 60, 240, 240);
			tf.setBackground(Color.WHITE);
			tf.setHorizontalAlignment(JTextField.LEFT);
			
			// ��������ʽ
			pan1.add(ba);
			pan1.add(c);
			pan.add(b[7]);
			pan.add(b[8]);
			pan.add(b[9]);
			pan.add(be);
			pan.add(b[4]);
			pan.add(b[5]);
			pan.add(b[6]);
			pan.add(bf);
			pan.add(b[1]);
			pan.add(b[2]);
			pan.add(b[3]);
			pan.add(bc);
			pan.add(b[0]);
			pan.add(bb);
			pan.add(bk);
			pan.add(bd);
			pan.add(bi);
			pan.add(bj);
			pan.add(bh);
			pan.add(bg);

			this.add(pan1);
			this.add(pan);
			this.add(tf);
			// ��ÿ����ť���ü�����
			ba.addActionListener(this);
			bb.addActionListener(this);
			bc.addActionListener(this);
			bd.addActionListener(this);
			be.addActionListener(this);
			bf.addActionListener(this);
			bg.addActionListener(this);
			bh.addActionListener(this);
			bi.addActionListener(this);
			bj.addActionListener(this);
			bk.addActionListener(this);
			c.addActionListener(this);
			for (int i = 0; i < 10; i++)
				b[i].addActionListener(this);
			
			//��Ӳ˵�
			this.setJMenuBar(mb1);//����һ���˵���
			mf1=new JMenu("�ļ�");//�˵�
			me1=new JMenu("����");
			mb1.add(mf1);//����˵�
			mb1.add(me1);		
			mf1.add(new JMenuItem("�ļ�"));//�˵���
			mf1.addSeparator();//�ӷָ���
			JMenuItem Exit=new JMenuItem("�˳�");
			mf1.add(Exit);
			Exit.addActionListener(this);
			JMenuItem Help=new JMenuItem("����");
			me1.add(Help);
			Help.addActionListener(this);
			
			
			
			

		}
		

		public void actionPerformed(ActionEvent e) {
			String f="123456789.";
			// ���ذ�ť�ϵ�ֵ
			String label = e.getActionCommand();
			if(label.equals("�˳�"))
				System.exit(0);
			if(label.equals("����"))
			{
				JOptionPane.showMessageDialog(this, "��鿴�����ĵ�");
			}

			if (label.equals("Back")) {
					Back(); // ��β��ɾ��һ���ַ�
			} 
				 
			else if (label.equals("C")) {		
				clean();// ����"C"��,����ı�������
			} 
			 else if (f.indexOf(label) >= 0) //indexOf()�������Է��ر������ַ�����һ�γ��ֵ�λ�ã���û�и��ַ�����С���㣬
				                            //ͨ������������ж��Ƿ��Ѿ�����С����
			 {		
				Figure(label);// �û��������ּ�����С�����
			}
			else {
					Operator(label);// �û������������
			}
		}

		private void clean() {  
		      tf.setText("0");  
		       First = true;//������Ϊtrue��ʹ���������Լ���������һ��������  
		       operator = "=";  
		  }  
		 private void Back() { 
			   	String t = tf.getText();    
			       if (t.length() > 0) {  		           
			          t = t.substring(0,t.length()- 1);  //���ش�0����t.length()- 1λ�õ��ַ������൱��ɾ�����һ���ַ�
			          if (t.length() == 0) {  
			               // ����ı�û�������ݣ����ʼ���������ĸ���ֵ  
			               tf.setText("0");  
			               First = true;  
			               operator = "=";  
			           } else {  
			              // ��ʾ�µ��ı�  
			               tf.setText(t);  
			           }  
			       } 
		 }

		private void Figure(String key) {
			if (First) {
				// ����ĵ�һ������
				tf.setText(key);
			} 
			else if ((key.equals(".")) && (tf.getText().indexOf(".") < 0)) // С����δ���ֹ�����ʾ��С����
			{
				// ֮ǰû��С���㣬��С��������ı���
				tf.setText(tf.getText() + ".");
			} 
			else if (!key.equals(".")) 
			{
				// �����ּ����ı���
				tf.setText(tf.getText() + key);
			}
			//�ж�������Ƿ��ǵ�һ������ִ��������ĳ���֮���������ʱ��϶����ǵ�һ����
			First = false;
		}

		
		private void Operator(String key) {
			
			if (operator.equals("��")) {
				
				// �����ǰ����ı����е�ֵ����0
				if (getNumber() == 0) {
					tf.setText("��������Ϊ��");
					return;
				} 
				else {
					result /= getNumber();// ����
				}
			} else if(operator.equals("x")){
				
				result *= getNumber();// �˷�
			}
			 
			 else if (operator.equals("+")) {
				
				result += getNumber();// �ӷ�
			}
			else if (operator.equals("-")) {
				
				result -= getNumber();// ����
			}
			
			 else if (operator.equals("sqrt")){
				
				
				result = (double) Math.sqrt(result);// ��ƽ����
				
			} else if (operator.equals("%")) {
				
				result = result / 100;//�����������ı���// �ٷֺţ�����100
				tf.setText(""+result);
				
			} else if (operator.equals("+/-")) 
			{			
				result = result * (-1);// ������������			
				
			} 
			else if (operator.equals("1/x")) 
			{
				result=1/result;//ȥ����
			}
			else if (operator.equals("=")) {	
				
				result = (double) getNumber();//��ֵ
			}

			
			operator = key;//���ڰ��İ�ť
			First = true;//������Ϊtrue��ʹ���������Լ���������һ��������
			tf.setText(""+result);//�����������ı���
			
			//�˴��߼������Ƚ�operator��Ϊ��=�����������������ťʱ��ִ����������������ж�opeator��ֵ����Ϊһ��ʼ
			//ʱ���ںţ����ԣ����򽫵�һ����������ֵ����result��Ȼ�󽫰��µ��������ֵ����operator�������û�������ڶ���
			//��������Ȼ�󰴡�=�������ٴ�ִ�д˺�������ʱ��operator�ǵ�һ���������ֵ�����ǻ�ִ�ж�Ӧ������Ĳ�����Ȼ��ִ��
			//tf.setText(""+result)������������

		}

		private double getNumber() {
			double result = 0;
			result = Double.parseDouble(tf.getText());//�ַ�������ת����double����	
			return result;
		}

		public static void main(String args[]) {
			Caculator c1 = new Caculator();	//����Calculator��һ�����󣬲�ִ�й��캯��	
			c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			c1.setVisible(true);
		}

		
	}



