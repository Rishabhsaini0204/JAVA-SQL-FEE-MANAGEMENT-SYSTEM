import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.*;

public class Student implements ActionListener{


	JFrame frame;
	JLabel label1,label2,title;
	JTextField textField1;
	JPasswordField passwordField;
	JButton Login,Cancel,Register;

Student(){
	

	frame=new JFrame("Student");
	
	frame.getContentPane().setLayout(null);
	frame.getContentPane().setBackground(Color.WHITE);
	 frame.setResizable(false);

	ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/loginphoto.jpg"));
	        Image i2 = i1.getImage().getScaledInstance(300,400,Image.SCALE_DEFAULT);
	        ImageIcon i3 =  new ImageIcon(i2);
	        JLabel l3 = new JLabel(i3);
	        l3.setBounds(280,0,300,400);
	    

	        title=new JLabel("LOGIN ");
	        title.setForeground(Color.RED);
	        title.setBounds(60,30,400,60);
	        title.setFont(new Font("SansSerif",Font.BOLD,70)); 

	        
	label1=new JLabel("UserName");
	label1.setForeground(Color.black);
	label1.setBounds(40,130,100,30);
	label1.setFont(new Font("Courier new",Font.BOLD,20));

	label2=new JLabel("Password");
	label2.setForeground(Color.black);
	label2.setBounds(40,170,150,30);
	label2.setFont(new Font("Courier new",Font.BOLD,20));

	textField1=new JTextField(10);
	textField1.setForeground(Color.blue);
	textField1.addActionListener(this);
	textField1.setBounds(150,130,150,30);


	passwordField=new JPasswordField(10);
	passwordField.setForeground(Color.blue);
	passwordField.setEchoChar('*');
	passwordField.addActionListener(this);
	passwordField.setBounds(150,170,150,30);

	Login=new JButton("Login");
	Login.setForeground(Color.WHITE);
	Login.setBackground(Color.BLACK);
	Login.setFont(new Font("serif",Font.BOLD,15));
	Login.addActionListener(this);
	Login.setBounds(40,220,120,30);


	Cancel=new JButton("Cancel");
	Cancel.setForeground(Color.white);
	Cancel.setBackground(Color.black);
	Cancel.setFont(new Font("serif",Font.BOLD,15));
	Cancel.addActionListener(this);
	Cancel.setBounds(180,220,120,30);

	Register = new JButton("Signup");
	Register.setForeground(Color.white);
	Register.setBackground(Color.black);
	Register.setFont(new Font("serif",Font.BOLD,15));
	Register.addActionListener(this);
	Register.setBounds(40,280,260,30);


	frame.getContentPane().add(label1);
	frame.getContentPane().add(label2);
	frame.getContentPane().add(textField1);
	frame.getContentPane().add(passwordField);
	frame.getContentPane().add(Login);
	frame.getContentPane().add(Cancel);
	frame.getContentPane().add(Register);
	frame.getContentPane().add(title);
	frame.getContentPane().add(l3);
	frame.setSize(600,380);
	frame.setLocation(250,220);

	frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Login) {
			try {
			conn c1 = new conn();
		    String u = textField1.getText();
		    String v = passwordField.getText();
		   String q = "select * from STUDENT where USERNAME='"+u+"' and PASSWRD='"+v+"'";
		    
		    ResultSet rs = c1.s.executeQuery(q); 
		    
		    if(textField1.getText().length()==0||passwordField.getText().length()==0)
			{
			JOptionPane.showMessageDialog(null,"Fields are empty");
			}
		    else if(rs.next()){
		         frame.setVisible(false);
//		         JOptionPane.showMessageDialog(null, "Login Succesful !");
		         new StdFeeSubmit();
		         
		         }
		    
		    else {
		        JOptionPane.showMessageDialog(null, "Invalid login");
		        }
		    }
		    catch(Exception ae){
		        ae.printStackTrace();
		    }
		
		}
		if(e.getSource()==Cancel)
		{
		frame.setVisible(false);
		new Choice();
		}
		
		if(e.getSource()==Register)
		
		{
			frame.setVisible(false);
			new StdRegister();
		}

	}
//	public static void main(String[] args) {
//	 new Student();
//	}

	}









