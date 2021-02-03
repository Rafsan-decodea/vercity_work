import java.util.*;

import java.sql.*;

class  db{

    private Connection  conn;
    public  Statement statement;
    public ResultSet result;
    void  stu_login(String username,String password)
     {
      try{

          Class.forName("com.mysql.cj.jdbc.Driver");  
          conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project","root","");  
          statement=conn.createStatement(); 
          result =statement.executeQuery("select * from stu_users");  
         while( result.next())
         {
          System.out.println(result.getString("username"));
          System.out.println(result.getString("password"));
            if (result.getString("username").toString()==username && result.getString("password")==password)
            {
              System.out.print("login");
            } 
            else{
              System.out.print("False");
                }  
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
