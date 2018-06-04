import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RectApplet extends JApplet{
	int x1,y1,x2,y2,width,height;
	
	boolean flag=false;
	public void init(){
		
	}
	
	public void mousePressed(MouseEvent e){
		flag=true;
		x1=e.getX();
		y1=e.getY();
	}
	
	public void mouseRealsed(MouseEvent e){
		x2=e.getX();
		y2=e.getY();
		
		repaint();
		
		
	}
	
	
	public void paint(Graphics g){
		if(flag){
			width=Math.abs(x1-x2);
			height=Math.abs(y1-y2);
			if(x1>x2&&y1>y2){
				x1=x2;
				y1=y2;
			}
			else if(x1>x2&&y1<y2){
				x1=x2;
				
			}
			
			else if(x1<x2&&y1>y2){
				y1=y2;
			}
			
			g.drawRect(x1, y1, width, height);
			
		}
	}
	
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mouseClicked(MouseEvent e){}
	

}
