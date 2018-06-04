import java.awt.*;
import javax.swing.*;

public class test2 {
	public static void main(String[] args){

	JFrame frm=new JFrame();
	frm.setSize(400, 600);
	frm.setLayout(null);
	
	frm.setTitle("个人信息调查");
	
	JLabel L1=new JLabel("请选择你的兴趣爱好");
	L1.setBounds(40, 20, 200, 40);
	
	JCheckBox jchk1=new JCheckBox("读书");
	JCheckBox jchk2=new JCheckBox("旅游");
	JCheckBox jchk3=new JCheckBox("运动");
	
	JLabel L2=new JLabel("请选择你的班级");
	L2.setBounds(40,100, 100, 40);
	
	JRadioButton jrb1=new JRadioButton("软件班");
	JRadioButton jrb2=new JRadioButton("计算机班");
	JRadioButton jrb3=new JRadioButton("网络班");
	
	jchk1.setBounds(40, 60, 100, 40);
	jchk2.setBounds(140, 60, 100, 40);
	jchk3.setBounds(240, 60, 100, 40);
	
	jrb1.setBounds(40, 150, 100, 40);
	jrb2.setBounds(140, 150, 100, 40);
	jrb3.setBounds(240, 150, 100, 40);
	
	
	frm.add(jchk1);
	frm.add(jchk2);
	frm.add(jchk3);
	
	frm.add(jrb1);
	frm.add(jrb2);
	frm.add(jrb3);
	
	frm.add(L1);
	frm.add(L2);
	
	
	
	
	JButton btn=new JButton("提交");
	btn.setBounds(100, 300, 100, 30);
	
	frm.add(btn);
	
	frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frm.setVisible(true);
	
	
	
	
	
	

	

}
}
