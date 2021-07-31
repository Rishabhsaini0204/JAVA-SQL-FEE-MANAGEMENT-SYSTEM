import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.*;


public class AdmRegister implements ActionListener {
	 Connection con=null;
	  PreparedStatement ps;
	   Statement st;
	JFrame frame;
	String[] gender={"Male","Female"}; 
    JLabel nameLabel=new JLabel("NAME");
    JLabel genderLabel=new JLabel("GENDER");
    JLabel bg=new JLabel();
    JLabel id=new JLabel("ID");
    JLabel fatherNameLabel=new JLabel("FATHER NAME");
    JLabel passwordLabel=new JLabel("PASSWORD");
    JLabel confirmPasswordLabel=new JLabel("CONFIRM PASS");
    JLabel cityLabel=new JLabel("CITY");
    JLabel emailLabel=new JLabel("EMAIL");
    JTextField nameTextField=new JTextField();
    JComboBox genderComboBox=new JComboBox(gender);
    JTextField fatherTextField=new JTextField();
    JTextField ID=new JTextField();
    JPasswordField passwordField=new JPasswordField();
    JPasswordField confirmPasswordField=new JPasswordField();
    JTextField cityTextField=new JTextField();
    JTextField emailTextField=new JTextField();
    JButton registerButton=new JButton("REGISTER");
    JButton resetButton=new JButton("RESET");
    JButton back=new JButton("LOGIN");
	AdmRegister(){
		 frame=new JFrame();
	        frame.setTitle("Registration Form");
	        frame.setBounds(300,70,800,600);
	        frame.getContentPane().setBackground(Color.white);
	        frame.getContentPane().setLayout(null);
	        frame.setVisible(true);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setResizable(false);
	        
	        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/loginphoto.jpg"));
	        Image i2 = i1.getImage().getScaledInstance(500,600,Image.SCALE_DEFAULT);
	        ImageIcon i3 =  new ImageIcon(i2);
	        JLabel l3 = new JLabel(i3);
	        l3.setBounds(300,0,500,600);
	    
	        
	        nameLabel.setBounds(20,20,100,70);
	        nameLabel.setForeground(Color.black);
	        nameLabel.setFont(new Font("Courier new",Font.BOLD,20));
	        
	        genderLabel.setBounds(20,70,80,70);
	        genderLabel.setForeground(Color.black);
	        genderLabel.setFont(new Font("Courier new",Font.BOLD,20));
	        
	        id.setBounds(20,383,80,23);
	        id.setForeground(Color.black);
	        id.setFont(new Font("Courier new",Font.BOLD,20));
	        
	        fatherNameLabel.setBounds(20,120,150,70);
	        fatherNameLabel.setForeground(Color.black);
	        fatherNameLabel.setFont(new Font("Courier new",Font.BOLD,20));
	        
	        passwordLabel.setBounds(20,170,100,70);
	        passwordLabel.setForeground(Color.black);
	        passwordLabel.setFont(new Font("Courier new",Font.BOLD,20));
	        
	        confirmPasswordLabel.setBounds(20,220,160,70);
	        confirmPasswordLabel.setForeground(Color.black);
	        confirmPasswordLabel.setFont(new Font("Courier new",Font.BOLD,20));
	        
	        cityLabel.setBounds(20,270,100,70);
	        cityLabel.setForeground(Color.black);
	        cityLabel.setFont(new Font("Courier new",Font.BOLD,20));
	        
	        emailLabel.setBounds(20,320,100,70);
	        emailLabel.setForeground(Color.black);
	        emailLabel.setFont(new Font("Courier new",Font.BOLD,20));
	        
	        nameTextField.setBounds(180,43,165,23);
	        nameTextField.setForeground(Color.blue);
	        
	        genderComboBox.setBounds(180,93,165,23);
	        genderComboBox.setForeground(Color.blue);
	        
	        fatherTextField.setBounds(180,143,165,23);
	        fatherTextField.setForeground(Color.blue);
	        
	        passwordField.setBounds(180,193,165,23);
	        passwordField.setForeground(Color.blue);
	        
	        confirmPasswordField.setBounds(180,243,165,23);
	        confirmPasswordField.setForeground(Color.blue);
	        
	        cityTextField.setBounds(180,293,165,23);
	        cityTextField.setForeground(Color.blue);
	        
	        emailTextField.setBounds(180,343,165,23);
	        emailTextField.setForeground(Color.blue);
	        
	        ID.setBounds(180,383,165,23);
	        ID.setForeground(Color.blue);
	        
	        registerButton.setBounds(10,440,150,35);
	        registerButton.setForeground(Color.white);
	        registerButton.setBackground(Color.black);
	        registerButton.setFont(new Font("serif",Font.BOLD,15));
	        registerButton.addActionListener(this);
	        
	        
	        resetButton.setBounds(190,440,150,35);
	        resetButton.setForeground(Color.white);
	        resetButton.setBackground(Color.black);
	        resetButton.setFont(new Font("serif",Font.BOLD,15));
	        resetButton.addActionListener(this);
	        
	        back.setBounds(120,500,150,35);
	        back.setForeground(Color.white);
	        back.setBackground(Color.black);
	        back.setFont(new Font("serif",Font.BOLD,15));
	        back.addActionListener(this);
	        
	        //Adding components to Frame
	        frame.add(nameLabel);
	        frame.add(genderLabel);
	        frame.add(fatherNameLabel);
	        frame.add(passwordLabel);
	        frame.add(confirmPasswordLabel);
	        frame.add(cityLabel);
	        frame.add(emailLabel);
	        frame.add(nameTextField);
	        frame.add(genderComboBox);
	        frame.add(fatherTextField);
	        frame.add(passwordField);
	        frame.add(confirmPasswordField);
	        frame.add(cityTextField);
	        frame.add(emailTextField);
	        frame.add(registerButton);
	        frame.add(resetButton);
	        frame.add(id);
	        frame.add(ID);
	        frame.add(back);
	        frame.add(l3);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==registerButton)
        {
            try {             
				 String url="jdbc:mysql://localhost:3306/myproject";
	 	    		String DBuser="root";
	 	    		String password="root";
	 	        	 Class.forName("com.mysql.cj.jdbc.Driver"); 
	 	            con =DriverManager.getConnection(url, DBuser, password);
	                st =(Statement)con.createStatement();  
					ps=con.prepareStatement("insert into admindata values(?,?,?,?,?,?,?,?)");
				
				
                //Specifying the values of it's parameter
                ps.setString(1,nameTextField.getText());
                ps.setString(2,genderComboBox.getSelectedItem().toString());
                ps.setString(3,fatherTextField.getText());
                ps.setString(4,passwordField.getText());
                ps.setString(5,confirmPasswordField.getText());
                ps.setString(6,cityTextField.getText());
                ps.setString(7,emailTextField.getText());
                ps.setString(8,ID.getText());
                //Checking for the Password match
                if(passwordField.getText().equalsIgnoreCase(confirmPasswordField.getText()))
                {
                    //Executing query
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Data Registered Successfully");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"password did not match");
                }
 
            } catch(Exception ae){
		        ae.printStackTrace();
		    }
 
 
        }
        if(e.getSource()==resetButton)
        {
            //Clearing Fields
            nameTextField.setText("");
            genderComboBox.setSelectedItem("Male");
            fatherTextField.setText("");
            passwordField.setText("");
            confirmPasswordField.setText("");
            cityTextField.setText("");
            emailTextField.setText("");
		
	}
        if(e.getSource()==back) {
        	frame.setVisible(false);
        	new Student();
        }
	

}
//	 public static void main(String[] args)
//	    {
//	        new AdmRegister();
//	    }
}
