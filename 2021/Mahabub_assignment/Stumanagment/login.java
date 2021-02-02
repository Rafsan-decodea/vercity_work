import java.util.*;

import javax.naming.spi.DirStateFactory.Result;

import java.sql.*;

class login{

     void  hello()
     {
      try{

          Class.forName("com.mysql.cj.jdbc.Driver");  
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project","root","");  
//here sonoo is database name, root is username and password  
          Statement stmt=con.createStatement();  
          ResultSet rs=stmt.executeQuery("select * from users");  
         // while(rs.next())  
         // { 
            // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
            rs.next();
             System.out.print(rs.getString(1));
             String data = "admin";
            if (rs.getString(1)==data)
            {
              System.out.print("login");
            } 
            else{
              System.out.print("False");
            }   
      //}   
        }      
        catch(Exception e){ System.out.println(e);}  

  


} 

}
