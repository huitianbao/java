import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Windows1 {
	JFrame f;
	JLabel lab;
	public void display(){
		f=new JFrame("�����¼�1");
		f.setSize(300, 200);
		f.setLayout(null);
		
		lab=new JLabel("�õ�����");
		lab.setBounds(20, 20, 80, 20);
		
		f.add(lab);
		
		WinClose winclose=new WinClose();//  Ϊʲô��Ҫ static 
		
		
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
			lab.setText("�õ�����");
			
			
			
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
			lab.setText("ʧȥ����");
			
			
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
