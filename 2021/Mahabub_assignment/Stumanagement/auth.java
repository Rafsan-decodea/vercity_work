import java.util.*;

import javax.lang.model.util.ElementScanner14;

class auth extends register{

     void auth_student(String username, String password)
     {
            

        if (stu_register_array.get(0).equals(username) && stu_register_array.get(1).equals(password))
        {
            System.out.print("Login");

        }
        else{

            System.out.print("Not LOgin");
            System.out.print(stu_register_array.get(0));
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