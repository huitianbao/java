import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.*;

public class TxtEditor extends JFrame implements ActionListener{
	JFrame frm=new JFrame("¼òµ¥ÎÄ±¾±à¼­Æ÷");
	
	private static JToolBar toolbar=new JToolBar("tool");
	
	private static JButton bd=new JButton();
	private static JButton bb=new JButton();
	private static JButton bc=new JButton();
	
	private static JTextArea jta=new JTextArea("jing yong",400,200);
	BufferedImage image1;

	BufferedImage image2;

	private static ImageIcon image3;
	private static JScrollPane jsp=new JScrollPane(jta);
	
	
	public TxtEditor(){
		
		
		frm.setSize(600, 300);
		
		
		image1=ImageIO.read(new File("open.jpg"));
		image2=ImageIO.read(new File("save.jpg"));
		//image3=new ImageIcon("D:\eclipse space\2016_12_4_java book page 332\image\folder\color.jpg");
		
		bd.setIcon(image1);
		bb.setIcon(image2);
		bc.setIcon(image3);
		
		bd.setToolTipText("open");
		bb.setToolTipText("save");
		bc.setToolTipText("color");
		
		bd.addActionListener(this);
		bb.addActionListener(this);
		bc.addActionListener(this);
		
		toolbar.add(bb);
		toolbar.add(bd);
		toolbar.add(bc);
		
		frm.add(toolbar);
		frm.add(jta);
		frm.add(jsp);
		
		jta.setEditable(false);
		jta.setDisabledTextColor(Color.RED);
		
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args){
		TxtEditor t=new TxtEditor();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
	}
	
	

}
