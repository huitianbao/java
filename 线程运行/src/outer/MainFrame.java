

package outer;
import inner.*;
import java.awt.*;
import java.awt.event.*;

import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class MainFrame extends JFrame implements ActionListener{
	  Control cpu;
        
    
        public JFrame jchoice=new JFrame();
        public JFrame jmain=new JFrame(); 
        public JFrame jmain2=new JFrame();
        JMenuBar jm=new JMenuBar();//�˵���
        JMenu menu=new JMenu("����");
        JMenu menu2=new JMenu("���̹���"); 
        JMenuItem firstauthor=new JMenuItem("GaoJian");
        JMenuItem secondauthor=new JMenuItem("MaYongBo");
        JMenuItem creat = new JMenuItem("Create progress");
        
        JPopupMenu popupMenu=new JPopupMenu();
        JMenuItem run = new JMenuItem("set running");
        JMenuItem ready = new JMenuItem("set ready");
        JMenuItem wait = new JMenuItem("set waiting");
        JMenuItem finsh=new JMenuItem("end progress");
        
        
        public JTextField tfid=new JTextField();//��������
        public JTextField tft=new JTextField("60");//����ʱ��
        public JTextField tfy=new JTextField();//���ȼ�
        public JTextField tfnu=new JTextField();
        public JTextField tfstate=new JTextField("����");
        
        JPanel jpfirst=new JPanel();//ѡ�񴰿�
        JPanel jp=new JPanel();//������
        JPanel jp2=new JPanel();//�������̴���
        JPanel jp3=new JPanel();//�������̴���
        JPanel jp4=new JPanel();//��������
                             
        //�������̽���
        public Vector name=null;//���Զ�����������        
        public Vector data=null;
        public DefaultTableModel   model=   null;//�������ģ��             
        public JTable jtable;
        public String status;
        
        JLabel jlab=new JLabel("����:",JLabel.RIGHT);
        JLabel jlab2=new JLabel("ʱ��:",JLabel.RIGHT);
        JLabel jlab3=new JLabel();
        JLabel jlab4=new JLabel("��",JLabel.LEFT);
        JLabel jlab5=new JLabel("���ȼ�:",JLabel.RIGHT);
        JLabel jlab6=new JLabel();
                     
        JButton jbcreate=new JButton("Create process");//�������̰�ť      
        JButton jbfinsh=new JButton("Finish");//��ɰ�ť
	public MainFrame(Control cpu){                
		FristFrame();  
                this.cpu=cpu;
	}
	public void FristFrame(){
                //������
		jmain.setTitle("��̬���ȼ������㷨-2015020800031-2015020800091");
                jmain.setSize(800, 400);
		jmain.setLocation(300,20);
		jmain.add(jp,BorderLayout.NORTH);
                jmain.add(jp4,BorderLayout.CENTER);
           
                //BorderLayout border=new BorderLayout();                              
                jmain.setJMenuBar(jm);                                
              //  jm.add(menu);
               // jm.add(menu2);
               // menu.add(firstauthor);
               // menu.addSeparator();
              //  menu.add(secondauthor);               
              // menu2.add(creat);
                jm.add(firstauthor);
                jm.add(secondauthor);
               jm.add(creat);
              
                
                //�������̽���
                name=new Vector();               
                name.add("ProgressId");
                name.add("Name");
                name.add("Status");
                name.add("RemainTime");
                name.add("PriorityLevel");
                name.setSize(5);
                model=new   DefaultTableModel(data,name);//TableModel ��һ��ʵ��          
                //�����п�ѡ�в��ɱ༭
                jtable=new   JTable(model){                    
              
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return false;
                    }
                };
                jtable.setRowHeight(50);
                jtable.setPreferredScrollableViewportSize(new   Dimension(400,   80));
                JScrollPane   s   =   new   JScrollPane(jtable);//���������Ĵ���
                
                Container   contentPane   =   jmain.getContentPane();                
                s.getViewport().setBackground(Color.LIGHT_GRAY);
                contentPane.add(s,BorderLayout.CENTER);
                
                //�Զ�����Ⱦ���޸�ָ����Ԫ����ɫ
                jtable.setDefaultRenderer (Object.class, new TableCellRenderer ()
                {
                    @Override
                    public Component getTableCellRendererComponent ( JTable table, Object value, boolean isSelected,
                            boolean hasFocus, int row, int column )
                    {
                        DefaultTableCellRenderer dtcr=new DefaultTableCellRenderer();
                        Component render =dtcr.getTableCellRendererComponent (jtable, value, isSelected,hasFocus, row, column);
                    if ("����".equals (table.getValueAt (row, column))){
                            render.setBackground (Color.GREEN);
                    }
                    if ("����".equals (table.getValueAt (row, column))){
                            render.setBackground (Color.cyan);                        
                    }
                    if ("�ȴ�".equals (table.getValueAt (row, column))){             
                            render.setBackground (Color.LIGHT_GRAY);
                    }
                        return render;
                    }
                });

                //����ʽ�˵�
                jtable.addMouseListener(new MouseAdapter(){
                     public void mouseClicked(MouseEvent e) {
                         if(e.getModifiers()==MouseEvent.BUTTON3_MASK){
                             int row = jtable.getSelectedRow();
                             if (row < 0) {
                        return;
                    }
                             status = (String) model.getValueAt(row, 2);                         
                             run.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            if (!status.equals("����")) {
                              
                            for(int i=0;i<model.getRowCount();i++){
                                if(String.valueOf(model.getValueAt(i, 2)).equals("����")){
                                   int tempid=cpu.running.getPid();
                                   cpu.TransAuthority(tempid);
                             break;
                                }
                            }
                            int pin=Integer.parseInt(String.valueOf(jtable.getValueAt(jtable.getSelectedRow(),0)));
                            JinCheng temp=cpu.memory.jc[pin];
                            if(temp.getStatus().equals("����")){
                                cpu.memory.removeFromReady(pin);
                            }
                            if(temp.getStatus().equals("�ȴ�")){
                                cpu.memory.removeFromWaiting(pin);
                            }
                            cpu.run(temp);
                            temp.setPriority(100);   
                        }
                        }
                    });
                            ready.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (!status.equals("����")) {
                            int temp=Integer.parseInt(String.valueOf(jtable.getValueAt(jtable.getSelectedRow(),0)));
                            JinCheng pcb=cpu.memory.jc[temp];
                            System.out.println(cpu.memory.jc[temp].getStatus());
                            if(cpu.memory.jc[temp].getStatus().equals("����")){
                                cpu.TransAuthority(temp);
                            }
                            if(pcb.getStatus().equals("�ȴ�")){
                                cpu.memory.removeFromWaiting(temp);
                                cpu.memory.ready(temp);System.out.println("test");
                            }
                            }
                        }
                    });      
                             wait.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                             if (!status.equals("�ȴ�")) {
                                 System.out.println("error??");
                            int temp=Integer.parseInt(String.valueOf(jtable.getValueAt(jtable.getSelectedRow(),0)));
                            JinCheng pcb=cpu.memory.jc[temp];
                            if(pcb.getStatus().equals("����")){
                                cpu.TransAuthority(temp);
                            }
                            if(pcb.getStatus().equals("����")){
                                cpu.memory.removeFromReady(temp);
                            }
                            cpu.memory.waiting(temp);
                            //jtable.setValueAt(temp.getStatus(),jtable.getSelectedRow(), 2);
//                            ready.setEnabled(true);
//                            run.setEnabled(true);
                            }
                        }
                    });      
                             popupMenu.show(e.getComponent(), e.getX(), e.getY());
                         }
                     }
                });
                
                
                popupMenu.add(run);
                popupMenu.add(ready);
                popupMenu.add(wait);
                popupMenu.add(finsh);
                
                                                               
                //�Ӵ��ڣ���������
                jmain2.setTitle("��������");
                jmain2.setSize(300,150);
                jmain2.setLocation(100,100);
                jmain2.add(jp2,BorderLayout.SOUTH);
                jbfinsh.setSize(80,50);
                jp2.add(jbfinsh);
                
                //���������ı�
                jmain2.add(jp3,BorderLayout.CENTER);
                GridLayout grid=new GridLayout(3,3);                
                jp3.setLayout(grid);
                jp3.add(jlab);
                jp3.add(tfid);
                jp3.add(jlab3);
                jp3.add(jlab2);
                jp3.add(tft);
                jp3.add(jlab4);
                jp3.add(jlab5);
                jp3.add(tfy);
                jp3.add(jlab6);
                
                finsh.addActionListener(this);               
                jbfinsh.addActionListener(this);
                firstauthor.addActionListener(this);
                secondauthor.addActionListener(this);
                creat.addActionListener(this);
               
                jmain.setVisible(true); 
		jmain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
	}     
        public void actionPerformed (ActionEvent e){
           if(e.getSource()== firstauthor)
               JOptionPane.showMessageDialog(jmain,"2015020800031","ѧ��",JOptionPane.INFORMATION_MESSAGE);
           if(e.getSource()== secondauthor)
               JOptionPane.showMessageDialog(jmain,"2015020800091","ѧ��",JOptionPane.INFORMATION_MESSAGE);        
           if(e.getSource()==creat){
               jmain2.setVisible(true);
	       jmain2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
               
           }           
           if(e.getSource()==jbfinsh){
               
               if(tfid.getText().equals("")){
                   JOptionPane.showMessageDialog(jmain,"����������","ERROR",JOptionPane.INFORMATION_MESSAGE);
               }
               else if(tft.getText().equals("")){
                   JOptionPane.showMessageDialog(jmain,"������ʱ��","ERROR",JOptionPane.INFORMATION_MESSAGE);
               }
               else if(Double.parseDouble(tft.getText())>100||Double.parseDouble(tft.getText())<0){
                   JOptionPane.showMessageDialog(jmain,"ʱ����1��100��֮��","ERROR",JOptionPane.INFORMATION_MESSAGE);
               }
               else {
                   if(tfy.getText().equals("")){
                        JOptionPane.showMessageDialog(jmain,"���������ȼ�","ERROR",JOptionPane.INFORMATION_MESSAGE);
                   }
                   else{
                	   
                   jmain2.dispose();
                   data=new Vector();
                   
                  int newpid=cpu.createPcb(tfid.getText(), Integer.parseInt(tft.getText()), Integer.parseInt(tfy.getText()));
                  
                  tfnu.setText(Integer.toString(newpid));
                  data.add(tfnu.getText());
                  data.add(tfid.getText());
                  data.add(tfstate.getText());
                  data.add(tft.getText());
                  data.add(tfy.getText());
                  model.addRow(data);
           }
               }
   
           }
           if(e.getSource()==finsh){
               int pid=Integer.parseInt(String.valueOf(jtable.getValueAt(jtable.getSelectedRow(),0)));
               if(cpu.memory.jc[pid].getStatus().equals("����")){
                   cpu.running=null;
               }
               cpu.memory.destroy(pid);

               int selectedRow = jtable.getSelectedRow();
               model.removeRow(selectedRow);
           }
           
           
       }
        
}

 