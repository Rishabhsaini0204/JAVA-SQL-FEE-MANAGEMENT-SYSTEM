import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AdminFeeSubmit {

	 Connection con=null;
	  PreparedStatement ps;
	   Statement st;	
	   
	JFrame frame;
	JLabel  title, studentname, fatherN, roll,email, contact, address, feeLabel,gender, passingY12, marks12, passingY10,bglabel ;
	JButton Submit,Back,Print,Reset,GenerateRecipt;
	ImageIcon img;
	JTextArea area2, addressArea;
	 JRadioButton regularBtn, privateBtn, hostlerBtn,dayBtn, rb5, rb6,rb7; 
	JTextField stnametf, fatherNametf, rolltf, emailtf, contacttf, natuionlitytf, markstf, tf9, tf10; 
	
AdminFeeSubmit(){
	 frame=new JFrame("Admin Fee Submit");
    frame.setLayout(null);
    frame.setResizable(false);
  
	
	 
	  
	  
	  bglabel=new JLabel();
     bglabel.setBounds(0,0,1366,768);
     bglabel.setLayout(null);
	  ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/Adminpay.jpg"));
	  Image i2 = i1.getImage().getScaledInstance(1366,768,Image.SCALE_DEFAULT);
	  ImageIcon i3 =  new ImageIcon(i2);
     bglabel.setIcon(i3);
	
     
     title=new JLabel("Fee Submit Panel");
	  title.setForeground(Color.WHITE);
	  title.setBounds(450,10,600,100);
	  title.setFont(new Font("SansSerif",Font.BOLD,40));
	  bglabel.add(title);
     

	  
	  studentname = new JLabel("Student Name:"); 
     studentname.setBounds(30, 150, 250, 20); 
     studentname.setForeground(Color.white);
     studentname.setFont(new Font("Courier new",Font.BOLD,20));
     bglabel.add(studentname);

     stnametf = new JTextField(30); 
     stnametf.setBounds(240, 150, 250, 20); 
     stnametf.setForeground(Color.blue);
     bglabel.add(stnametf);
	  
     fatherN = new JLabel("Father Name:"); 
     fatherN.setBounds(30, 200, 250, 20); 
     fatherN.setForeground(Color.white);
     fatherN.setFont(new Font("Courier new",Font.BOLD,20));
     bglabel.add(fatherN);

     fatherNametf = new JTextField(30); 
     fatherNametf.setBounds(240, 200, 250, 20); 
     fatherNametf.setForeground(Color.blue);
     bglabel.add(fatherNametf);
	  
     roll = new JLabel("Roll No:"); 
     roll.setBounds(30, 250, 250, 20); 
     roll.setForeground(Color.white);
     roll.setFont(new Font("Courier new",Font.BOLD,20));
     bglabel.add(roll);

     rolltf = new JTextField(10); 
     rolltf.setBounds(240, 250, 250, 20); 
     rolltf.setForeground(Color.blue);
     bglabel.add(rolltf);
	  
     
     email = new JLabel( "Email ID:"); 
     email.setBounds(30, 300, 250, 20); 
     email.setForeground(Color.white);
     email.setFont(new Font("Courier new",Font.BOLD,20));
     bglabel.add(email);

     emailtf = new JTextField(30); 
     emailtf.setBounds(240, 300, 250, 20); 
     emailtf.setForeground(Color.blue);
     bglabel.add(emailtf);
     
     contact = new JLabel("Contact Number:"); 
     contact.setForeground(Color.white);
     contact.setFont(new Font("Courier new",Font.BOLD,20));
     contact.setBounds(30, 350, 250, 20); 
     bglabel.add(contact);

     contacttf = new JTextField(); 
     contacttf.setForeground(Color.blue);
     contacttf.setBounds(240, 350, 250, 20); 
     bglabel.add(contacttf);
     

     address = new JLabel("Address:"); 
     address.setBounds(30, 430, 250, 20); 
     address.setForeground(Color.white);
     address.setFont(new Font("Courier new",Font.BOLD,20));
     bglabel.add(address);
      
     addressArea = new JTextArea(); 
     addressArea.setBounds(240, 400, 250, 90); 
     addressArea.setForeground(Color.blue);
     bglabel.add(addressArea);
     

     gender = new JLabel("Gender:"); 
     gender.setFont(new Font("Courier new",Font.BOLD,20));
     gender.setForeground(Color.white);
     bglabel.add(gender);
     gender.setBounds(30, 530, 300, 20); 

     JRadioButton male= new JRadioButton(" Male"); 
     JRadioButton female = new JRadioButton(" Female");
     JRadioButton other=new JRadioButton("other");
    
     male.setBounds(240, 530,100,30);
     male.setBackground(Color.white);
     male.setForeground(Color.black);
     male.setFont(new Font("Courier new",Font.BOLD,15));  
     female.setBounds(340, 530, 100, 30); 
     female.setBackground(Color.white);
     female.setForeground(Color.black);
     female.setFont(new Font("Courier new",Font.BOLD,15));
     other.setBounds(440,530,70,30);
     other.setBackground(Color.white);
     other.setForeground(Color.black);
     other.setFont(new Font("Courier new",Font.BOLD,15));
     ButtonGroup bg = new ButtonGroup(); 
     bg.add(male); 
     bg.add(female);
     bg.add(other);
	  bglabel.add(male);
	  bglabel.add(female);
	  bglabel.add(other);
     
	  
     regularBtn = new JRadioButton("REGULAR");
     regularBtn.setForeground(Color.black);
     regularBtn.setBackground(Color.white);
     regularBtn.setFont(new Font("Courier new",Font.BOLD,20));
     regularBtn.setBounds(600, 150, 150, 30); 
     bglabel.add(regularBtn);
     
     

     privateBtn = new JRadioButton("PRIVATE"); 
     privateBtn.setBackground(Color.white);
     privateBtn.setForeground(Color.black);
     privateBtn.setFont(new Font("Courier new",Font.BOLD,20));
     privateBtn.setBounds(750, 150, 130, 30); 
     bglabel.add(privateBtn);
     ButtonGroup bg1 = new ButtonGroup(); 

     bg1.add(regularBtn); 
     bg1.add(privateBtn); 
     

     hostlerBtn = new JRadioButton("HOSTELLER"); 
     hostlerBtn.setFont(new Font("Courier new",Font.BOLD,20));
     hostlerBtn.setForeground(Color.BLACK);
     hostlerBtn.setBackground(Color.white);
     hostlerBtn.setBounds(800, 230, 140, 30); 
     bglabel.add(hostlerBtn);

     dayBtn = new JRadioButton("DAY SCHOLAR"); 
     dayBtn.setBounds(940, 230, 160, 30);
     dayBtn.setFont(new Font("Courier new",Font.BOLD,20));
     dayBtn.setForeground(Color.BLACK);
     dayBtn.setBackground(Color.white);
     bglabel.add(dayBtn);

     ButtonGroup bg2 = new ButtonGroup(); 
     bg2.add(hostlerBtn); 
     bg2.add(dayBtn); 
    
     feeLabel = new JLabel("Course With Fees:"); 
     feeLabel.setBounds(600, 195, 250, 20); 
     feeLabel.setFont(new Font("Courier new",Font.BOLD,20));
     feeLabel.setForeground(Color.white);
     bglabel.add(feeLabel);
     
     String languages[]= { "CSE", "ECE","EEE","CIVIL", "MECH" }; 
     
     final JComboBox cb = new JComboBox(languages); 
     cb.setBounds(600, 230, 100, 30); 
     bglabel.add(cb);

     final JLabel label = new JLabel(); 
     label.setBounds(600, 400, 700, 50);
     label.setForeground(Color.white);
     label.setFont(new Font ("Extra-light 200",Font.BOLD,15));
     bglabel.add(label);

     JButton show = new JButton("Show"); 
     show.setBounds(950, 320, 150, 40);
     show.setBackground(Color.black);
     show.setForeground(Color.white);
     show.setFont(new Font ("Extra-light 200",Font.BOLD,20));
     
     bglabel.add(show);

     final DefaultListModel<String> li1= new DefaultListModel<>(); 
     li1.addElement("CSE (3, 50, 000)"); 
     li1.addElement("ECE (2, 50, 000)"); 
     li1.addElement("EEE (1, 50, 000)"); 
     li1.addElement("MECH(2, 00, 000)"); 
     li1.addElement("CIVIL(1, 00, 000)"); 
    

     final JList<String> list1 = new JList<>(li1); 
     list1.setBounds(600, 290, 100, 100); 
     bglabel.add(list1);

     DefaultListModel<String> li2 = new DefaultListModel<>(); 
     li2.addElement("2 SHARE(1,50, 000)"); 
     li2.addElement("3 SHARE(1,40, 000)"); 
     li2.addElement("5 SHARE(1,20, 000)"); 
     li2.addElement("8 SHARE(1,10, 000)"); 
     li2.addElement("CollageBus(40,000)"); 

     final JList<String> list2 = new JList<>(li2); 
     list2.setBounds( 800, 290, 120, 100); 
     bglabel.add(list2);
     
     JButton Receipt = new JButton("Receipt"); 
     Receipt.setBounds(30, 600, 150, 30); 
     Receipt.setBackground(Color.black);
     Receipt.setForeground(Color.white);
     Receipt.setFont(new Font ("Extra-light 200",Font.BOLD,20));
     bglabel.add(Receipt);
     
     JButton reset = new JButton("Reset"); 
     reset.setBounds(180, 600, 150, 30); 
     reset.setBackground(Color.black);
     reset.setForeground(Color.white);
     reset.setFont(new Font ("Extra-light 200",Font.BOLD,20));
     bglabel.add(reset);
     
     JButton Print = new JButton("Print"); 
     Print.setBounds(320, 600, 150, 30); 
     Print.setBackground(Color.black);
     Print.setForeground(Color.white);
     Print.setFont(new Font ("Extra-light 200",Font.BOLD,20));
     bglabel.add(Print);
     
     area2 = new JTextArea(); 
     area2.setBounds(600, 450, 450, 250); 
     bglabel.add(area2);
     
     
     show.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			String data=" ";
			 if (list1.getSelectedIndex() != -1)
			     { 
               data = "You had selected the Group: "+ list1.getSelectedValue(); 
               label.setText(data); 
			     }
			if(list2.getSelectedIndex() !=-1) {
				
				data+=" and Hostel with the" +" facility of ";      
				  
              for (Object frame : 
              	list2.getSelectedValues()) { 
                  data += frame + " "; 
              } 
          }
			else if(list1.getSelectedIndex()==-1 && list1.getSelectedIndex()==-1)
				{data="You Have Not Selected any option ";}
          label.setText(data); 
		}  
     });
	  
     reset.addActionListener( new ActionListener() {

 		@Override
 		public void actionPerformed(ActionEvent e) {
 			 { 
                  area2.setText(""); 
                  addressArea.setText(" "); 
                  stnametf.setText(""); 
                  fatherNametf.setText(""); 
                  rolltf.setText(""); 
                  emailtf.setText(""); 
                  contacttf.setText(""); 
                  
                  
              } 
 		} }); 
       
     Print.addActionListener(new ActionListener() {

 		@Override
 		public void actionPerformed(ActionEvent e) {
 			  try {
 				  area2.print();
 				  
 			  }
 			  catch(java.awt.print.PrinterException a)
 			  {
 				  System.err.format("No Priner Found", a.getMessage());
 				  
 			  }
 			
 		}});
	 
     Receipt.addActionListener(new ActionListener() {

 		@Override
 		public void actionPerformed(ActionEvent e) {
 			
 			area2.setText( 
                     "--------------------------------"
                     + "--------------------------"
                     + "--------------------------"
                     + "--------------------------"
                     + "-------------------\n"
                     + "Receipt By :- Rishabh saini,MCA(2021)\n"
                     + "--------------------------------"
                     + "-----------FEE RECEIPT----"
                     + "--------------------------"
                     + "--------------------------"
                     + "-------------------\n"); 
 			area2.setText(area2.getText()
 					+"Student Name: "
 					+stnametf.getText()
 					+"\n");
             area2.setText(area2.getText() 
                     + "Father's Name: "
                     + fatherNametf.getText() 
                     + "\n"); 
             if(male.isSelected()) {
             	area2.setText(area2.getText()+"Gender: male"+"\n");
             	
             }
             if(female.isSelected()) {
             	area2.setText(area2.getText()+"Gender: female"+"\n");
             	
             }
             if(other.isSelected()) {
             	area2.setText(area2.getText()+"Gender: other"+"\n");
             	
             }
            area2.setText(area2.getText() 
                     + "Roll Number: "
                     + rolltf.getText() 
                     + "\n"); 
            area2.setText(area2.getText() 
                     + "Email ID: "
                     + emailtf.getText() 
                     + "\n"); 
            area2.setText(area2.getText() 
                     + "Contact Number: "
                     + contacttf.getText() 
                     + "\n"); 
       
           area2.setText(area2.getText() 
                     + "You Chosen : "
                     + cb.getSelectedItem().toString() 
                     + "\n"); 
          
        
           
       if (regularBtn.isSelected())
       { 
           area2.setText(area2.getText()+"Wants to Join : Regular"+"\n");
 			
       }	
       if(privateBtn.isSelected())
       {
     	  area2.setText(area2.getText()+"Wants to Join : Private"+"\n");
     	 
       }
       
       if(hostlerBtn.isSelected()) {
     	    
     	  area2.setText(area2.getText()+"Want to be: Hostile"+"\n");
       }
       if(dayBtn.isSelected())
       {
     	  area2.setText(area2.getText()+"You Selected  : Collage Bus" +"\n");
       }
 	    
       area2.setText(area2.getText()+"Had Choosen: "+ list1.getSelectedValue().toString()+" \t And " + list2.getSelectedValue().toString()+"\n" );
   
       
       int index1=list1.getSelectedIndex();
       
       int index2=list2.getSelectedIndex();
       
   if((index1==0)&&(index2==0))
   {
 	  area2.setText(area2.getText()+"Total Amount To be Paid =5,00,00");
   }
      
   if((index1==0)&&(index2==1))
   {
 	  area2.setText(area2.getText()+"Total Amount To be Paid =4,90,000");
   }
   if((index1==0)&&(index2==2))
   {
 	  area2.setText(area2.getText()+"Total Amount To be Paid =4,70,00 ");
   }
   if((index1==0)&&(index2==3))
   {
 	  area2.setText(area2.getText()+"Total Amount To be Paid =4,60,000 ");
   }
       
   if((index1==0)&&(index2==4))
   {
 	  area2.setText(area2.getText()+"Total Amount To be Paid =3,90,000 ");
   }
   
   
   
   if((index1==1)&&(index2==0))
   {
 	  area2.setText(area2.getText()+"Total Amount To be Paid =4,00,00");
   }
      
   if((index1==1)&&(index2==1))
   {
 	  area2.setText(area2.getText()+"Total Amount To be Paid =3,90,000");
   }
   if((index1==1)&&(index2==2))
   {
 	  area2.setText(area2.getText()+"Total Amount To be Paid =3,70,00 ");
   }
   if((index1==1)&&(index2==3))
   {
 	  area2.setText(area2.getText()+"Total Amount To be Paid =3,60,000 ");
   }
       
   if((index1==1)&&(index2==4))
   {
 	  area2.setText(area2.getText()+"Total Amount To be Paid =2,90,000 ");
   }
       
   
   
     if((index1==2)&&(index2==0))
   {
 	  area2.setText(area2.getText()+"Total Amount To be Paid =3,00,00");
   }
      
   if((index1==2)&&(index2==1))
   {
 	  area2.setText(area2.getText()+"Total Amount To be Paid =2,90,000");
   }
   if((index1==2)&&(index2==2))
   {
 	  area2.setText(area2.getText()+"Total Amount To be Paid =2,70,00 ");
   }
   if((index1==2)&&(index2==3))
   {
 	  area2.setText(area2.getText()+"Total Amount To be Paid =2,60,000 ");
   }
       
   if((index1==2)&&(index2==4))
   {
 	  area2.setText(area2.getText()+"Total Amount To be Paid =1,90,000 ");
   }
       
   
   
   if((index1==3)&&(index2==0))
   {
 	  area2.setText(area2.getText()+"Total Amount To be Paid =3,50,00");
   }
      
   if((index1==3)&&(index2==1))
   {
 	  area2.setText(area2.getText()+"Total Amount To be Paid =3,40,000");
   }
   if((index1==3)&&(index2==2))
   {
 	  area2.setText(area2.getText()+"Total Amount To be Paid =3,20,00 ");
   }
   if((index1==3)&&(index2==3))
   {
 	  area2.setText(area2.getText()+"Total Amount To be Paid =3,10,000 ");
   }
       
   if((index1==3)&&(index2==4))
   {
 	  area2.setText(area2.getText()+"Total Amount To be Paid =2,40,000 ");
   }
       
   
   if((index1==4)&&(index2==0))
   {
 	  area2.setText(area2.getText()+"Total Amount To be Paid =2,50,00");
   }
      
   if((index1==4)&&(index2==1))
   {
 	  area2.setText(area2.getText()+"Total Amount To be Paid =2,40,000");
   }
   if((index1==4)&&(index2==2))
   {
 	  area2.setText(area2.getText()+"Total Amount To be Paid =2,20,00 ");
   }
   if((index1==4)&&(index2==3))
   {
 	  area2.setText(area2.getText()+"Total Amount To be Paid =2,10,000 ");
   }
       
   if((index1==4)&&(index2==4))
   {
 	  area2.setText(area2.getText()+"Total Amount To be Paid =1,40,000 ");
 	  
   }
       
   if (e.getSource() == Receipt) { 
   	try {             
			 String url="jdbc:mysql://localhost:3306/myproject";
	    		String DBuser="root";
	    		String password="root";
	        	 Class.forName("com.mysql.cj.jdbc.Driver"); 
	            con =DriverManager.getConnection(url, DBuser, password);
              st =(Statement)con.createStatement();  
				ps=con.prepareStatement("insert into stfee values(?,?,?,?,?,?,?)");
			
				
			
          //Specifying the values of it's parameter
          ps.setString(1,rolltf.getText() );
          ps.setString(2,stnametf.getText());
          ps.setString(3,fatherNametf.getText());
          ps.setString(4,emailtf.getText());
          ps.setString(5,contacttf.getText() );
          ps.setString(6,"Regular");
          ps.setString(7,"1000000");
          //Checking for the Password match
          if(rolltf.getText().length()==0|| stnametf.getText().length()==0)
          {
          	
          		JOptionPane.showMessageDialog(null,"Fields are empty");
          }
              //Executing query
          else
          {
          	 ps.executeUpdate();
                  JOptionPane.showMessageDialog(null,"FEE PAID SUCESSFULLY");
          }

      } catch(Exception ae){
	        ae.printStackTrace();
	    }
  }  
 		};
 });
     
     
     
	  
     frame.getContentPane().add(bglabel);
     frame.setSize(1366,768);
	  frame.setVisible(true);
	  frame.setLocation(0,0);
}
	
	
	


	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
