import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Windows2 {
	JFrame f;
	JLabel l;
	
	public void display(){
		f=new JFrame("�����¼�2");
		f.setSize(300, 200);
		f.setLayout(null);
		
		l=new JLabel("�õ�����");
		l.setBounds(20, 20, 80, 20);
		f.add(l);
		
		WinClose winclose=new WinClose();
		
		f.addWindowListener(winclose);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		
		
	}
	
	public static void main(String[] args){
		(new Windows2()).display();
		
	}
	
	class WinClose extends WindowAdapter{
		public void windowActivated(WindowEvent e){
			l.setText("�õ�����");
		}
		
		public void windowDeactivated(WindowEvent e){
			l.setText("ʧȥ����");
			
		}
		
	}
	

}
