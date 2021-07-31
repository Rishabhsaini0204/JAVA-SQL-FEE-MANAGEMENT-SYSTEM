import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

 class Welcome
{
	
JFrame frame;
JLabel label1,label2,label3,label4;
Button btn;
ImageIcon img;

Welcome()
{
  
  frame=new JFrame("Welcome");
  frame.getContentPane().setLayout(null);
  frame.getContentPane().setBackground(Color.DARK_GRAY);
  frame.setUndecorated(true);
 
  
  ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/Back.jpg"));
  Image i2 = i1.getImage().getScaledInstance(1366,768,Image.SCALE_DEFAULT);
  ImageIcon i3 =  new ImageIcon(i2);
  JLabel bg = new JLabel(i3);
  bg.setBounds(0,0,1366,768);
  

label3=new JLabel("WELCOME");
label3.setBounds(450,330,1000,70);
label3.setFont(new Font("Verdana", Font.BOLD,60));
label3.setBackground(Color.BLACK);
label3.setForeground(Color.WHITE); 
  
label1=new JLabel("FEE REPORT");
label1.setBounds(420,380,1400,100);
label1.setFont(new Font("Verdana", Font.BOLD,60));
label1.setBackground(Color.BLACK);
label1.setForeground(Color.WHITE);


label4=new JLabel("SOFTWARE");
label4.setBounds(430,450,1400,100);
label4.setFont(new Font("Verdana", Font.BOLD,60));
label4.setBackground(Color.BLACK);
label4.setForeground(Color.WHITE);





label2=new JLabel(" By Rishabh Saini");
label2.setFont(new Font("Courier new",Font.ITALIC,20));
label2.setBounds(550,520,800,40);
label2.setForeground(Color.YELLOW);

btn=new Button("NEXT");
btn.setBackground(Color.black);
btn.setForeground(Color.white);
btn.setBounds(270, 580, 800, 40);
btn.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		 frame.setVisible(false);
  	  new Choice();
		
		  
	}});


frame.getContentPane().add(label1);
frame.getContentPane().add(btn);
frame.getContentPane().add(label2);
frame.getContentPane().add(label3);
frame.getContentPane().add(label4);
frame.getContentPane().add(bg);
frame.setSize(1366,768);
frame.setVisible(true);
}

public static void main(String args[])
{
new Welcome();
}

}