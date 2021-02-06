import java.util.*;



class auth extends register{

     void auth_student(String username, String password)
     {
       
      for (int i=0; i<stu_register_array.size();i++)
      {  
  

        if (stu_register_array.get(i).equals(username))
        {
             if(stu_register_array.get(i+1).equals(password))
             {
             	System.out.print("LOgin");
             }

        }
        else
        {
        	      System.out.print(i+" From Frist i \n"); 
        	            System.out.print(i+1+" From Second i \n");   
        	//System.out.print(stu_register_array.get(i));
        }

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