import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Mouse extends MouseAdapter implements MouseMotionListener{
	JFrame f;
	JTextField t;
	public void display(){
		f=new JFrame("鼠标事件");
		f.setSize(300,200);
		f.setLayout(null);
		
		t=new JTextField(20);
		t.setBounds(20, 70, 200, 20);
		f.add(t);
		
		f.addMouseListener(this);
		f.addMouseMotionListener(this);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}
	
	public static void main(String[] args){
		(new Mouse()).display();
		
	}
	
	//static class MyMouseList implements MouseListener{
	
	
	public void mousePressed(MouseEvent e){
		
		int px,py;
		px=e.getX();
		py=e.getY();
		
		t.setText("鼠标按下"+"("+px+","+py+")");
		
		
	}
	public void mouseReleased(MouseEvent e){
		int px,py;
		px=e.getX();
		py=e.getY();
		
		t.setText("鼠标释放"+"(x="+px+"y="+py+")");
		
	}
	
	public void mouseMoved(MouseEvent e){
		int px,py;
		px=e.getX();
		py=e.getY();
		
		t.setText("鼠标移动"+"(x="+px+"y="+py+")");
		
	}
	
	public void mouseDragged(MouseEvent e){
		
	}
	

}

