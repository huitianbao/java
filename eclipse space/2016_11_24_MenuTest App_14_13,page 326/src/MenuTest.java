import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuTest extends JFrame{
	private Color[] colorValues={Color.BLACK,Color.BLUE,Color.RED,Color.GREEN};
	
	private JRadioButtonMenuItem[] colorItems,fonts;    //��ѡ�˵�ѡ��
	private JCheckBoxMenuItem[] styleItems;       //����ѡ��Ĳ˵�ѡ��
	
	private JTextArea display;
	private ButtonGroup colorGrip,fontGroup;
	
	private int style;
	
	
	public MenuTest(){
		super("�˵�Ӧ�ó���");
		JMenu fileMenu=new JMenu("�ļ���F��");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		
		JMenuItem aboutItem=new JMenuItem("����...A");
		aboutItem.setMnemonic(KeyEvent.VK_A);
		
		
	}

}
