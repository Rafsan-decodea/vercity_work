import java.io.InputStreamReader;
import java.util.*;

class  student extends index 
{

     void add_Studnet_detailes(String id)
     {
         ArrayList<String> stu_add_details = stu_register_array.get(id); 
         Scanner input = new Scanner(System.in);
         System.out.println("========================================");
         System.out.println("\n[+] You Logine id is ===>"+id);
         System.out.println("================Add Your Details ======");
         System.out.print("[+] Your name===>");
         String name =  input.nextLine();
         stu_add_details.add(2,name);
         System.out.print("[+] your Father Name===>");
         String father_name = input.nextLine();
         stu_add_details.add(3,father_name);
         System.out.print("[+] Your Mother Name===>");
         String mother_name = input.nextLine();
         stu_add_details.add(4,mother_name);
         System.out.print("[+] Your Email===> ");
         String email = input.nextLine();
         stu_add_details.add(5,email);
         System.out.print("[+] Birth Day===>");
         String brith = input.nextLine();
         stu_add_details.add(6,brith);
         stu_register_array.put(id,stu_add_details);
         studnet_panel(id);
        



     }

    static  void  studnet_panel(String id)
     {
        System.out.println("\n=====Welcome to Student Panel=======\n") ;
        System.out.println("1) See Your  Details");
        System.out.println("2) Update Your Details ");
        System.out.println("3) Log Out ");
        System.out.println("===========================================");
        System.out.print("[+] input Your Choosie ===>");
     
        Scanner input = new Scanner(System.in);
      try{
        int  chooise = input.nextInt();
        if (chooise==1)
        {
         ArrayList stu_has_next = stu_register_array.get(id); // This is for get id Value From  id Keys Specefic Keys
         System.out.println("\n ========= Your Details ======");
          System.out.println("[+] Your name is ===> "+stu_has_next.get(2));
          System.out.println("[+] Your Father Name ===>"+stu_has_next.get(3));
          System.out.println("[+] Your Mother Name ===> "+stu_has_next.get(4));
          System.out.println("[+] You  Email ====>"+stu_has_next.get(5));
          System.out.println("[+] Your Birth Day ===>"+stu_has_next.get(6));
          System.out.println("[+] Your Id is ===>"+stu_has_next.get(0));
          System.out.print("[+] Your Password is ===>"+stu_has_next.get(1));
          studnet_panel(id);


        }
        else if(chooise==2)
        {
         class edit{ // This Class for  method under method

          void edit(){
          
            ArrayList<String> stu_has_next = stu_register_array.get(id);// This Convert my one key Deffrent Array
           System.out.println("\n ===== Your Details Edit Panel =====");
           System.out.println("1) Edit Your Name ");
           System.out.println("2) Edit Father Name ");
           System.out.println("3) Edit Mother Name  ");
           System.out.println("4) Edit Your Mail ");
           System.out.println("5) Edit Your Birth data ");
           System.out.println("===============================");
           System.out.print("[+] Choose ===>");
           int chooise = input.nextInt();

           try{

             if (chooise==1)
             {
                System.out.print("[+]input Your  New Name ====>");
                input.nextLine();// For Consume String Buffer in /n Carecter
                String new_name = input.nextLine();
                stu_has_next.add(2,new_name);
                System.out.println("[+]Your Name Changed ");
                studnet_panel(id);
             }  
             
             else if ( chooise==2)
             {
                System.out.print("[+] input you New father Name ===>");
                input.nextLine();// For Consume String Buffer in /n Carecter
                String new_father_name = input.nextLine();
                stu_has_next.add(3,new_father_name);
                System.out.println("[+]Your Father Name Changed ");
                studnet_panel(id);
             }
             else if(chooise==3)
             {
               System.out.print("[+] input you New Mother  Name ===>");
               input.nextLine();// For Consume String Buffer in /n Carecter
               String new_mother_name = input.nextLine();
               stu_has_next.add(4,new_mother_name);
               System.out.println("[+]Your Mother name is changed");
               studnet_panel(id);

             }

             else if(chooise==4)
             {
               System.out.print("[+] input you New mail ===>");
               input.nextLine();// For Consume String Buffer in /n Carecter
               String new_mail = input.nextLine();
               stu_has_next.add(5,new_mail);
               System.out.println("[+]Your Mail is Changed ");
               studnet_panel(id);
             }
            else if(chooise==5)
            {
               System.out.print("[+] input you New Birthday ===>");
               input.nextLine();// For Consume String Buffer in /n Carecter
               String new_birth_day = input.nextLine();
               stu_has_next.add(6,new_birth_day);
               System.out.println("[+]You Birthday is Changed");
               studnet_panel(id);
            }
            

           }
           catch(Exception e)
           {

              System.out.println("\n\n [!!!!!!!] Wrong input in Edit Panel \n\n");
              edit edit = new edit();
              edit.edit();
              
           }
         }
 
      }// This is end Class of Edit 

          edit edit = new edit();
          edit.edit();

        }
        else if(chooise==3)
        {
             System.out.print("\n[-] Loging Out .......\n");
             index index = new index();
             index.do_main();
        }

    }
      catch(Exception e )
      {
          System.out.print("\n[!!!!!!] Invalide Chooise in Student Section \n"+e);
          studnet_panel(id);
      }

        

  }// This is  End For Studnet Panel
}