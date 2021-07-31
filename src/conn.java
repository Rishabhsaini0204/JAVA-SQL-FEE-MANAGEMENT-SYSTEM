import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;  

public class conn{
        	 Connection c;
        	 static Statement s;
        	    public conn(){  
        	        try{  
        	        	String url="jdbc:mysql://localhost:3306/myproject";
        	    		String user="root";
        	    		String password="root";
        	        	 Class.forName("com.mysql.cj.jdbc.Driver"); 
        	            c =DriverManager.getConnection(url, user, password);
                          s =(Statement)c.createStatement();  
        	                  	           
        	        }catch(Exception e){ 
        	            System.out.println(e);
        	        }  
        	    }  
        	
    
     
        
}  
