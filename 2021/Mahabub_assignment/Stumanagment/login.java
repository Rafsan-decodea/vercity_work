import java.util.*;

import java.sql.*;

class login {
 
  void login_()
        {   
          System.out.println("1) For AS a Student");
          System.out.println("2) For Teacher Logine");
          System.out.println("========================");
          System.out.print("[+] Choose===>");
          Scanner input = new Scanner(System.in);
          int chooise = input.nextInt(); 
          if (chooise==1)
          {
              stu_login();
          }
          else if(chooise==2)
          {
            teacher_login();
          }
               
        
        }
  static void  stu_login()
        {
            System.out.println("\n\n=========Student Login=============\n\n");
            db db = new db();
            Scanner input = new Scanner(System.in);
            System.out.print("[+] Enter User name ===>");
            String username = input.next();
            System.out.print("[+] Enter Password===>");
            String password = input.next();
            db.stu_login(username,password);
            

        }
  static void teacher_login()
       {

       }
  


} 


