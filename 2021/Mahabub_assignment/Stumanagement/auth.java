import java.util.*;



class auth extends register{

     void auth_student(String username, String password)
     {
       
      for (int i=0; i<stu_register_array.size();i++)
      {  
        
           
      }  
      System.out.print("not LOgin");
        

     }

     void auth_teacher(String username , String password)
     {
          if (teacher_register_array.get(0).equals(username) && teacher_register_array.get(0).equals(password))
          {
               System.out.print("Logine");
          }
          else 
          {
               System.out.print("not Logine");
          }

     }



}