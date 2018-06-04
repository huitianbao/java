import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Tool extends JFrame implements ActionListener{
	private JToolBar toolBar=new JToolBar("fu dong");
	private JButton jb1=new JButton();
	private JButton jb2=new JButton();
	private JButton jb3=new JButton();
	
	private JTextArea jta=new JTextArea("jin yong",10,30);
	private ImageIcon image1,image2,image3;
	public Tool(){
		//super(strTitle);
		image1=new ImageIcon("open.jpg");
		image2=new ImageIcon("save.jpg");
		image3=new ImageIcon("color.jpg");
		
		jb1.setIcon(image1);
		jb2.setIcon(image2);
		jb3.setIcon(image3);
		
		jb1.addActionListener(this);
		
		toolBar.add(jb1);
		toolBar.add(jb2);
		toolBar.add(jb3);
		
		this.add(toolBar,BorderLayout.NORTH);
		this.add(jta, BorderLayout.CENTER);
		
		jta.setEnabled(false);
		jta.setDisabledTextColor(Color.RED);
		
		this.setSize(260, 160);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
	
	public static void main(String[] args){
		Tool frm=new Tool();
	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton jb4=(JButton)e.getSource();
		if(jb4==jb1){
			jta.setEnabled(true);
			jta.setText("can  edit");
			
		}
		
	}

}
