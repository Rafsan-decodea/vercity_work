import java.util.*;

import javax.naming.spi.DirStateFactory.Result;

import java.sql.*;

class login{

     private Connection con;
     private Statement st;
     private ResultSet rs;
     void hello()
     {
     try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/softek", "root", "");
        st = con.createStatement();

     }
     catch(Exception e)
     {
       System.out.print(e);
     }

      
     }


  void get_data()
  {
      String query = "select * from app1_booklist";
      rs = st.executeQuery(query);
       
      while(rs.next())
      {
          System.out.print(rs.getString(0));
      }

  }


}