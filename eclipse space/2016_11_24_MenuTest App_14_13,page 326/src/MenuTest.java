import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuTest extends JFrame{
	private Color[] colorValues={Color.BLACK,Color.BLUE,Color.RED,Color.GREEN};
	
	private JRadioButtonMenuItem[] colorItems,fonts;    //单选菜单选项
	private JCheckBoxMenuItem[] styleItems;       //带复选框的菜单选项
	
	private JTextArea display;
	private ButtonGroup colorGrip,fontGroup;
	
	private int style;
	
	
	public MenuTest(){
		super("菜单应用程序");
		JMenu fileMenu=new JMenu("文件（F）");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		
		JMenuItem aboutItem=new JMenuItem("关于...A");
		aboutItem.setMnemonic(KeyEvent.VK_A);
		
		
	}

}
