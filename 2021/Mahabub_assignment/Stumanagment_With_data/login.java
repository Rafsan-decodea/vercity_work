import java.util.*;

import java.sql.*;

class login {
 
  void login_()
        {   
          System.out.println("1) For AS a Student");
          System.out.println("2) For Teacher Logine");
          System.out.println("3) As a new User ?? Regester ");
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
        System.out.println("\n\n=========Teacher's Login=============\n\n");
        db db = new db();
        Scanner input = new Scanner(System.in);
        System.out.print("[+] Enter User name ===>");
        String username = input.next();
        System.out.print("[+] Enter Password===>");
        String password = input.next();
        db.Teacher_login(username, password);
        
       }

    static void register ()
    {
      Scanner input = new Scanner(System.in);
      System.out.println("\n\n ========Register Information==========\n");
      System.out.println("1) Student Register ");
      System.out.println("2) Teacher Register ");
      System.out.println("===================================");
      System.out.print("[+] Chooise===>");
      int choose = input.nextInt();
      if(choose == 1)
      {
         System.out.println("\n\n ============Welcome to Student Register ========\n");
         System.out.print("[+]Enter Name ====>");
         String name = input.nextLine();
         System.out.print("[+]Enter Father Name===>");
         String father_name = input.nextLine();
         System.out.print("[+]Enter Mother Name ===>");
         String mother_name = input.nextLine();
         System.out.print("[+]Enter Address===> ");
         String  address  = input.nextLine();
         System.out.print("[+]Email===>");
         String email = input.nextLine();
         System.out.print("[+]Phone==>");
         String phone = input.nextLine();
         System.out.print("[+] Username ==>");
         String username = input.nextLine();
         System.out.print("[+]Password===>");
         String password = input.nextLine();

      }
    else if(choose ==2)
    {
      System.out.println("\n\n ============Welcome to Student Register ========\n");
         System.out.print("[+]Enter Name ====>");
         String name = input.nextLine();
         System.out.print("[+]Enter Father Name===>");
         String father_name = input.nextLine();
         System.out.print("[+]Enter Mother Name ===>");
         String mother_name = input.nextLine();
         System.out.print("[+]Enter Address===> ");
         String  address  = input.nextLine();
         System.out.print("[+]Email===>");
         String email = input.nextLine();
         System.out.print("[+]Phone==>");
         String phone = input.nextLine();
         System.out.print("[+] Username ==>");
         String username = input.nextLine();
         System.out.print("[+]Password===>");
         String password = input.nextLine();
         
      }


    }

  


} 


