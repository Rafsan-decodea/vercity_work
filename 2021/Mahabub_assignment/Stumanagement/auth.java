import java.util.*;

import javax.lang.model.element.Element;



class auth extends register{

     void auth_student(String username, String password)
     {
     System.out.print("\n"+this.stu_register_array);
   
           if(stu_register_array.containsValue(username)&&stu_register_array.containsValue(password))
           {
                System.out.print("logine");

           }
           else
           { 
                
              System.out.print("not LOgin");
                

           }

           
   
     
        

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