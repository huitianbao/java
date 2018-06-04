import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Windows1 {
	JFrame f;
	JLabel lab;
	public void display(){
		f=new JFrame("窗口事件1");
		f.setSize(300, 200);
		f.setLayout(null);
		
		lab=new JLabel("得到焦点");
		lab.setBounds(20, 20, 80, 20);
		
		f.add(lab);
		
		WinClose winclose=new WinClose();//  为什么不要 static 
		
		
		f.addWindowListener(winclose);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}
	
	public static void main(String[] args){
		(new Windows1()).display();
		
	}
	
	class WinClose implements WindowListener{

		@Override
		public void windowActivated(WindowEvent e) {
			lab.setText("得到焦点");
			
			
			
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			lab.setText("失去焦点");
			
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
	}

}
