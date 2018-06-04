import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.colorchooser.*;

//2016_11_28

public class Notebook extends JFrame implements ActionListener,ChangeListener{
	
	static JFrame frm=new JFrame("记事本");
	
	private static JTextArea ta=new JTextArea(300,200);
	private static JFileChooser jfc=new JFileChooser(new File("."));
	
	public Notebook(){
		JMenuBar jmb=new JMenuBar();
		
		frm.setSize(300, 300);
		
		JMenu jm1=new JMenu("文件");
		JMenu jm2=new JMenu("编辑");
		
		
		JMenuItem jmi1=new JMenuItem("新建");
		JMenuItem jmi2=new JMenuItem("打开");
		JMenuItem jmi3=new JMenuItem("保存");
		JMenuItem jmi4=new JMenuItem("另存为");
		JMenuItem jmi5=new JMenuItem("退出");
		
		JMenuItem jmi6=new JMenuItem("全选");
		JMenuItem jmi7=new JMenuItem("前景色");
		JMenuItem jmi8=new JMenuItem("背景色");
		
		//----------------------------------------------------------
		
	
		
		
		jmi1.addActionListener(this);
		jmi2.addActionListener(this);
		jmi3.addActionListener(this);
		jmi4.addActionListener(this);
		jmi5.addActionListener(this);
		jmi6.addActionListener(this);
		
		jmi7.addChangeListener(this);
		jmi8.addChangeListener(this);
		
		
		//((JMenu) jmi3).addSeparator();
		
		frm.setJMenuBar(jmb);
		
		jmb.add(jm1);
		jmb.add(jm2);
		
		jm1.add(jmi1);
		jm1.add(jmi2);
		jm1.addSeparator();
		jm1.add(jmi3);
		jm1.add(jmi4);
		jm1.addSeparator();
		jm1.add(jmi5);
		
		jm2.add(jmi6);
		jm2.addSeparator();
		jm2.add(jmi7);
		jm2.add(jmi8);
		
		
		
		DefaultColorSelectionModel model=new DefaultColorSelectionModel();
	//	JColorChooser colorChooser=new JColorChooser(model);
		
		model.addChangeListener(this);
		
		
		
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
		
		
		
	}

	
	
	public static void main(String[] args){
		Notebook notebook1=new Notebook();
		
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		Object tmp=e.getActionCommand();
		
		if(tmp=="退出"){
			System.exit(0);
			
		}
		
		
		
		if(tmp=="打开"){
			int status=jfc.showOpenDialog(this);
			if(status!=JFileChooser.APPROVE_OPTION){
				ta.setText("没有选择文件");
			}
			else{
				try{
					File file1=jfc.getSelectedFile();
					FileInputStream f=new FileInputStream(file1);
					BufferedInputStream in=new BufferedInputStream(f);
					
					byte[] b=new byte[in.available()];
					in.read(b,0,b.length);
					ta.append(new String(b,0,b.length));
					
					in.close();
				}
				
				catch(IOException ioe){};
				
			}
		}
		
		
		if(tmp=="保存"){
			
		    int re=jfc.showSaveDialog(this);
		    if(re==JFileChooser.APPROVE_OPTION){
		    	
		    try{
			
		
			File file2=jfc.getSelectedFile();
			FileOutputStream f=new FileOutputStream(file2);
			BufferedOutputStream out=new BufferedOutputStream(f);
			byte[] b=(ta.getText()).getBytes();
			out.write(b,0,b.length);
			out.close();
			
				}
		    catch(IOException ioe){};
		    }
		}
		
	
		
	}



	@Override
	public void stateChanged(ChangeEvent e) {
		
		Object tmp=e.getSource();
		
		if(tmp=="前景色"){
			Color newColor;
			JColorChooser colorChooser;
		
				Color c=new Color(0,0,190);
				JColorChooser jc=new JColorChooser();
				c=jc.showDialog(frm, "ccccccc", Color.blue);
				
		}
		
		if(tmp=="背景色"){
			Color c=new Color(0,0,190);
			JColorChooser jc=new JColorChooser();
			c=jc.showDialog(ta, "ccccccc", Color.red);
			
		}
		
		
		
	}
	
}
			
		
		




	





