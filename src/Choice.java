import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Choice  implements ActionListener
{

	JFrame frame;
	JLabel label1,bglabel;
	JButton admin,student,back;
//	ImageIcon img;
	
	
Choice()
{
	  frame=new JFrame("Choice");
      frame.setLayout(null);
	  frame.getContentPane().setBackground(Color.DARK_GRAY);
	  frame.setUndecorated(true);
	 
	  
	  
	  
	  bglabel=new JLabel();
      bglabel.setBounds(0,0,1368,768);
      bglabel.setLayout(null);

	  ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/choicebg.jpg"));
	  Image i2 = i1.getImage().getScaledInstance(1368,768,Image.SCALE_DEFAULT);
	  ImageIcon i3 =  new ImageIcon(i2);
      bglabel.setIcon(i3);
	  
	  
		
	  label1=new JLabel("Who You Are ?");
	  label1.setForeground(Color.WHITE);
	  label1.setBounds(380,100,600,100);
	  label1.setFont(new Font("SansSerif",Font.BOLD,70));
	  bglabel.add(label1);
	  
	  
	  admin = new JButton(" Admin ");
      admin.setBackground(Color.BLACK);
      admin.setForeground(Color.WHITE);
      admin.setBounds(400,250,200,50);
      admin.addActionListener(this);
      admin.setBorder(new RoundedBorder(20));
      admin.setFont(new Font("SansSerif",Font.BOLD,20));
      bglabel.add(admin);
	  
      
      
      student = new JButton("Student");
      student.setBackground(Color.BLACK);
      student.setForeground(Color.WHITE);
      student.addActionListener(this);
      student.setFont(new Font(" SansSerif",Font.BOLD,20));
      student.setBounds(650, 250, 200, 50);
      student.setBorder(new RoundedBorder(20));
      bglabel.add(student);
	  
      
      
     back = new JButton("Back");
     back.setBackground(Color.BLACK);
     back.setForeground(Color.WHITE);
     back.addActionListener(this);
     back.setFont(new Font(" SansSerif",Font.BOLD,20));
     back.setBounds(400, 420, 450, 50);
     back.setBorder(new RoundedBorder(20));
     bglabel.add(back);
      
	  
  	  frame.getContentPane().add(bglabel);
  	  frame.setSize(1366,768);
	  frame.setVisible(true);
	  frame.setLocation(0,0);
	  
		
		
	}

@Override
public void actionPerformed(ActionEvent e) {
	  if(e.getSource()==admin) {
//		  JOptionPane.showMessageDialog(null,"You Have Selected Admin Option");
		  frame.setVisible(false);
		  new Admin();
	  }
	  
	  
	  else if(e.getSource()==student){
//		  JOptionPane.showMessageDialog(null,"You Have Selected StudentOption");
	  frame.setVisible(false);
		  new Student();
	  }
	  
	  else if(e.getSource()==back) {
		  new Welcome();
		  
	  }
	 
}
	

	
//public static void main(String args[])
//{
//new Choice();
//}

}
