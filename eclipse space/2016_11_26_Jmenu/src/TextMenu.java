import javax.swing.*;
import java.awt.*;

public class TextMenu {
	public static void main(String[] args){
		JFrame frm=new JFrame("Menu");
		
		frm.setSize(300, 300);
		
		JMenuBar jmb=new JMenuBar();
		
		JMenu jm=new JMenu("wen");
		
		jmb.add(jm);
		
		frm.setJMenuBar(jmb);//Ìí¼Ó²Ëµ¥À¸
		
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
		
	}
	
	

}
