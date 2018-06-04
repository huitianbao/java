import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ImageAndSound extends JApplet{
	Image img;
	AudioClip song;
	
	JButton bnt_loop=new JButton("start");
	JButton bnt_stop=new JButton("stop");
	
	public void init(){
		
		img=getImage(getDocumentBase(),"fruit.jpg");
		song=getAudioClip(getDocumentBase(),"Sound.wav");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(bnt_loop);
		add(bnt_stop);
		
		bnt_loop.addActionListener(new MyActLit());
		bnt_stop.addActionListener(new MyActLit());
		
		
		
	}
	
	public void paint(Graphics g){
		g.drawImage(img, 80, 50, 140,98,this);
	}
	
	class MyActLit implements ActionListener{
		public void actionPerformed(ActionEvent e){
			JButton bnt=(JButton)e.getSource();
			if(bnt==bnt_loop){
				song.loop();
			}
			
			if(bnt==bnt_stop){
				song.stop();
			}
			
		}

	
	}
	

}
