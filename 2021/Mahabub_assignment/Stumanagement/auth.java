import java.util.*;



class auth extends register{

     void auth_student(String id,  String username, String password)
     {
     System.out.print("\n"+ stu_register_array);
   
        if(stu_register_array.containsKey(id))
        {
             if ( stu_register_array.get(id).get(0).equals(username) && stu_register_array.get(id).get(1).equals(password) )
             {
          System.out.print("Logine");


             }
             else
             {
                  System.out.print("Logine Filed");
          
             }
        }
        else{
             System.out.print("not");
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