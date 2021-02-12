import java.util.*;



class auth extends register{

     void auth_student(String id,  String username, String password)
     {
   
   
        if(stu_register_array.containsKey(id))
        {
             if ( stu_register_array.get(id).get(0).equals(username) && stu_register_array.get(id).get(1).equals(password) )
             {
                 System.out.print("\n[+] Success Fully  Logine As Studnet\n");
                 student stu = new student();
                 stu.add_Studnet_detailes(id);
     
            }
             else
             {
                  System.out.print("Logine Filed");
          
              }
        } 
        

}

void auth_teacher( String id ,String username , String password)
     {
      
          if (teacher_register_array.get(id).get(0).equals(username) && teacher_register_array.get(id).get(1).equals(password))
          {
               System.out.print("Logine");
               
          }
          else 
          {
               System.out.print("not Logine");
          }
       

     }

    

}



