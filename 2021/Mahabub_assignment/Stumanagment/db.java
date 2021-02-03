import java.util.*;

import java.sql.*;

class  db{

    private Connection  conn;
   // public  Statement statement;
    public ResultSet result;
    void  stu_login(String username,String password)
     {
      try{

          Class.forName("com.mysql.cj.jdbc.Driver");  
          conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project","root","");  
          
          String sql = "SELECT * FROM stu_users WHERE username = ? and password = ?";
          PreparedStatement statement = conn.prepareStatement(sql);
          statement.setString(1, username);
          statement.setString(2, password);
          ResultSet result = statement.executeQuery();
          if(result.next())
          {
          	System.out.print("login");
          }
          else
          {
          	System.out.print("Not LOgin");
          }

        }      
        catch(Exception e){ 

              System.out.print("[+] Error Connection in database");
        
        } 
        
    }
    void Teacher_login()
    {
        
    } 

}
