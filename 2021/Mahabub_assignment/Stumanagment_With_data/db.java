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
              login login = new login();
              login.stu_login();
          }

        }      
        catch(Exception e){ 

              System.out.print("[+] Error Connection in database");
        
        } 
        
    }
    void Teacher_login(String username , String password)
    {
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");  
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project","root","");  
            String sql = "SELECT * FROM teacher_users WHERE username = ? and password = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet result = statement.executeQuery();
            if(result.next())
            {
                System.out.print("\n=========Logine Student Panel =======\n");
                System.out.print("\n[+] Your Login  id is ");
                
                
            }
            else
            {
                System.out.print("Not LOgin");
                login login = new login();
                login.teacher_login();


            }
  
          }      
          catch(Exception e){ 
  
                System.out.print("[+] Error Connection in database");
          
          } 
        
    } 


  void  stu_register(String name, String  father_name , String mother_name , String address ,String  email ,String phone ,String usernmae , String password)
  {
   
          
      

  }


}
