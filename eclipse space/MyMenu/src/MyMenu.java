import java.awt.Component;
import java.awt.event.*;

import javax.swing.*;

public class MyMenu extends MouseAdapter implements ActionListener{

	JFrame f;
	JMenuBar mb1;
	JMenu mf1,me1;
	JPopupMenu pm1;
	JTextArea jta;
	
	JScrollPane jsp;
	public  void display(){
		f=new JFrame("�˵�");
		f.setSize(480, 180);
		f.setLocation(400, 200);
		f.setLayout(null);
		
		jta=new JTextArea();
		jsp=new JScrollPane(jta);
		
		jsp.setBounds(0, 0, 480, 180);
		f.add(jsp);
		
		jta.addMouseListener(this);
		addpopupMenu();
		addmyMenu();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		
		
		
	}
	private void addmyMenu() {
		mb1=new JMenuBar();
		f.setJMenuBar(mb1);
		mf1=new JMenu("�ļ�");
		me1=new JMenu("�༭");
		
		mb1.add(mf1);
		mb1.add(me1);
		
		mf1.add(new JRadioButton("��"));
		mf1.add(new JRadioButton("����"));
		mf1.addSeparator();
		JMenuItem itemExit=new JMenuItem("�˳�");
		
		mf1.add(itemExit);
		itemExit.addActionListener(this);
		
		me1.add(new JRadioButton("����"));
		me1.add(new JRadioButton("����"));
		
		
		
		
	}
	private void addpopupMenu() {
		pm1=new JPopupMenu("Popup");
		pm1.add(new JRadioButton("����"));
		pm1.add(new JRadioButton("ճ��"));
		
		jta.add(pm1);
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getActionCommand()=="�˳�")
			System.exit(0);
		
		
	}
	
	public  void mouseReleased(MouseEvent mer){
		if(mer.isPopupTrigger())
			pm1.show((Component)mer.getSource(),mer.getX(),mer.getY());
		
		
	}

	public static void main(String[] args){
		(new MyMenu()).display();
	}
}
