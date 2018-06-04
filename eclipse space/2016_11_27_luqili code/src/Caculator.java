


	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.awt.event.MouseListener;

	import javax.swing.*;

	public class Caculator extends JFrame implements ActionListener {

		
		static JPanel pan = new JPanel();//面板对象
		static JPanel pan1 = new JPanel();//面板对象1
		JTextField tf = new JTextField();//文本框
		JMenuBar mb1=new JMenuBar();//创建菜单栏
		JMenu mf1=new JMenu();//创建菜单
		JMenu me1=new JMenu();
		static JButton[] b = new JButton[10];//数字键按钮
		static JButton ba, bb, bc, bd, be, bf, bg, c, bh, bi, bj, bk;//按钮
		private boolean First = true;// 判断输入的数是否是第一个数
		private double result = 0;//记录输入的数值
		private String operator = "=";//记录输入的运算符的值，先置为等号，原因见“此处逻辑”
		//构造函数
		public Caculator() {

			for (int i = 0; i < 10; i++) {
				b[i] = new JButton("" + i);
				b[i].setForeground(Color.blue);//设置字的颜色
			}
			ba = new JButton("Back");ba.setForeground(Color.red);
			c = new JButton("C");c.setForeground(Color.red);
			bb = new JButton(".");bb.setForeground(Color.blue);
			bc = new JButton("+");bc.setForeground(Color.red);
			bd = new JButton("-");bd.setForeground(Color.red);
			be = new JButton("x");be.setForeground(Color.red);
			bf = new JButton("÷");bf.setForeground(Color.red);
			bg = new JButton("=");bg.setForeground(Color.red);
			bh = new JButton("sqrt");bh.setForeground(Color.red);
			bi = new JButton("1/x");bi.setForeground(Color.red);
			bj = new JButton("%");bj.setForeground(Color.red);
			bk = new JButton("+/-");bk.setForeground(Color.red);

			this.setTitle("计算器");
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
			
			// 计算器版式
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
			// 给每个按钮设置监听者
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
			
			//添加菜单
			this.setJMenuBar(mb1);//生成一个菜单栏
			mf1=new JMenu("文件");//菜单
			me1=new JMenu("关于");
			mb1.add(mf1);//加入菜单
			mb1.add(me1);		
			mf1.add(new JMenuItem("文件"));//菜单项
			mf1.addSeparator();//加分隔线
			JMenuItem Exit=new JMenuItem("退出");
			mf1.add(Exit);
			Exit.addActionListener(this);
			JMenuItem Help=new JMenuItem("帮助");
			me1.add(Help);
			Help.addActionListener(this);
			
			
			
			

		}
		

		public void actionPerformed(ActionEvent e) {
			String f="123456789.";
			// 返回按钮上的值
			String label = e.getActionCommand();
			if(label.equals("退出"))
				System.exit(0);
			if(label.equals("帮助"))
			{
				JOptionPane.showMessageDialog(this, "请查看帮助文档");
			}

			if (label.equals("Back")) {
					Back(); // 从尾部删除一个字符
			} 
				 
			else if (label.equals("C")) {		
				clean();// 按了"C"键,清空文本框内容
			} 
			 else if (f.indexOf(label) >= 0) //indexOf()函数可以返回被搜索字符串第一次出现的位置，若没有该字符，则小于零，
				                            //通过这个，可以判断是否已经输入小数点
			 {		
				Figure(label);// 用户按了数字键或者小数点键
			}
			else {
					Operator(label);// 用户按了运算符键
			}
		}

		private void clean() {  
		      tf.setText("0");  
		       First = true;//将其设为true，使计算器可以继续接受下一个操作数  
		       operator = "=";  
		  }  
		 private void Back() { 
			   	String t = tf.getText();    
			       if (t.length() > 0) {  		           
			          t = t.substring(0,t.length()- 1);  //返回从0，到t.length()- 1位置的字符串，相当于删除最后一个字符
			          if (t.length() == 0) {  
			               // 如果文本没有了内容，则初始化计算器的各种值  
			               tf.setText("0");  
			               First = true;  
			               operator = "=";  
			           } else {  
			              // 显示新的文本  
			               tf.setText(t);  
			           }  
			       } 
		 }

		private void Figure(String key) {
			if (First) {
				// 输入的第一个数字
				tf.setText(key);
			} 
			else if ((key.equals(".")) && (tf.getText().indexOf(".") < 0)) // 小数点未出现过，显示出小数点
			{
				// 之前没有小数点，则将小数点加入文本框
				tf.setText(tf.getText() + ".");
			} 
			else if (!key.equals(".")) 
			{
				// 将数字加入文本框
				tf.setText(tf.getText() + key);
			}
			//判断输入的是否是第一个数，执行完上面的程序之后，再输入的时候肯定不是第一个数
			First = false;
		}

		
		private void Operator(String key) {
			
			if (operator.equals("÷")) {
				
				// 如果当前结果文本框中的值等于0
				if (getNumber() == 0) {
					tf.setText("除数不能为零");
					return;
				} 
				else {
					result /= getNumber();// 除法
				}
			} else if(operator.equals("x")){
				
				result *= getNumber();// 乘法
			}
			 
			 else if (operator.equals("+")) {
				
				result += getNumber();// 加法
			}
			else if (operator.equals("-")) {
				
				result -= getNumber();// 减法
			}
			
			 else if (operator.equals("sqrt")){
				
				
				result = (double) Math.sqrt(result);// 求平方根
				
			} else if (operator.equals("%")) {
				
				result = result / 100;//将结果输出到文本框// 百分号，除以100
				tf.setText(""+result);
				
			} else if (operator.equals("+/-")) 
			{			
				result = result * (-1);// 正数负数运算			
				
			} 
			else if (operator.equals("1/x")) 
			{
				result=1/result;//去倒数
			}
			else if (operator.equals("=")) {	
				
				result = (double) getNumber();//赋值
			}

			
			operator = key;//等于按的按钮
			First = true;//将其设为true，使计算器可以继续接受下一个操作数
			tf.setText(""+result);//将结果输出到文本框
			
			//此处逻辑：首先将operator置为“=”，当按下运算符按钮时，执行这个函数，首先判断opeator的值，因为一开始
			//时等于号，所以，程序将第一个操作数的值赋给result，然后将按下的运算符的值赋给operator，接着用户会输入第二个
			//操作数，然后按“=”键，再次执行此函数，此时的operator是第一个运算符的值，于是会执行对应运算符的操作，然后执行
			//tf.setText(""+result)操作，输出结果

		}

		private double getNumber() {
			double result = 0;
			result = Double.parseDouble(tf.getText());//字符串类型转换成double类型	
			return result;
		}

		public static void main(String args[]) {
			Caculator c1 = new Caculator();	//创建Calculator的一个对象，并执行构造函数	
			c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			c1.setVisible(true);
		}

		
	}



