import java.awt.*;
import javax.swing.*;

public class test2 {
	public static void main(String[] args){

	JFrame frm=new JFrame();
	frm.setSize(400, 600);
	frm.setLayout(null);
	
	frm.setTitle("������Ϣ����");
	
	JLabel L1=new JLabel("��ѡ�������Ȥ����");
	L1.setBounds(40, 20, 200, 40);
	
	JCheckBox jchk1=new JCheckBox("����");
	JCheckBox jchk2=new JCheckBox("����");
	JCheckBox jchk3=new JCheckBox("�˶�");
	
	JLabel L2=new JLabel("��ѡ����İ༶");
	L2.setBounds(40,100, 100, 40);
	
	JRadioButton jrb1=new JRadioButton("�����");
	JRadioButton jrb2=new JRadioButton("�������");
	JRadioButton jrb3=new JRadioButton("�����");
	
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
	
	
	
	
	JButton btn=new JButton("�ύ");
	btn.setBounds(100, 300, 100, 30);
	
	frm.add(btn);
	
	frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frm.setVisible(true);
	
	
	
	
	
	

	

}
}
