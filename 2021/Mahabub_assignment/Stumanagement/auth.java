import java.util.*;



class auth extends register{

     void auth_student(String id,  String username, String password)
     {
     


        if ( stu_register_array.get(id).get(0).equals(username) && stu_register_array.get(id).get(1).equals(password) )
             {
                 System.out.print("\n[+] Success Fully  Logine As Studnet\n");
                 ArrayList<String> stu_has_next = stu_register_array.get(id);

               if(2 >=stu_has_next.size() ) // New USer details input
                {
                    System.out.print("\n[+] You Are new USer here ... Please input Your Details \n");
                    student stu = new student();
                    stu.add_Studnet_detailes(id); 
                    System.out.println(stu_has_next.size());  
                    
                      
                } 
               
                else
                {
               
                   
                      student stu = new student();
                      stu.studnet_panel(id);
                      System.out.println(stu_has_next.size());  
                }
     
            }
             else
             {
                  System.out.print("\n\n Logine Filed.... Try Again \n\n");
                  index index = new index();
                  index.do_main();
          
              }
        
        

}

void auth_teacher( String id ,String username , String password)
     {
      
          if (teacher_register_array.get(id).get(0).equals(username) && teacher_register_array.get(id).get(1).equals(password))
          {
               System.out.print("\n[+] Success Fully  Logine As teacher\n");

               ArrayList<String> teacher_has_next = teacher_register_array.get(id);

               if(2>=teacher_has_next.size())
               {
                    System.out.print("\n[+] You Are new USer here ... Please input Your Details \n");
                    teacher teacher = new teacher();
                    teacher.teacher_add_details(id);
              }
               
               else 
               {
                    teacher teacher = new teacher();
                    teacher.teacher_panal(id);
                    
               }
               
          }
          
          else 
          {
               System.out.print("\n\n Login Failed ... Try Again \n\n");
               index index = new index();
               index.do_main();
          
          }
       

     }

    

}



