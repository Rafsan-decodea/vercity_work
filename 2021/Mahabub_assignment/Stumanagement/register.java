import java.util.*;
import java.util.HashMap;


class register extends index{
        
        
	 void stu_register()
	 {  
       
       
        Scanner input = new Scanner(System.in);
	System.out.println("\n\n=========Welcome to Studnet Register ==========\n\n");
        System.out.print("[+] Input Your id number===>");
        String id_num = input.next();
        if(stu_register_array.containsKey(id_num))
        {
                System.out.print("\n[+] Your User id is Already Exist =====\n");
                register reg = new register();
                reg.stu_register();

        
        }
        else
        {
                System.out.print("[+] Username ===>");
                String  username = input.next();
                stu_id_values.add(0,username);
                System.out.print("[+] Password ===>");
                String  password = input.next();
                stu_id_values.add(1,password);
                stu_register_array.put(id_num,stu_id_values);
                 System.out.print("\n===========================\n");
                 System.out.print("[+] Data recorded");
                
                 index index = new index();
                 index.do_main();
        }
        

	 }
         
  void teacher_register ()
	 {  
                 
   
	Scanner input = new Scanner(System.in);
	System.out.println("\n\n=========Welcome to Teacher Register ==========\n\n");
        System.out.print("[+] Input Your id number===>");
        String id_num = input.next();
        if(teacher_register_array.containsKey(id_num))
        {
                System.out.print("\n[+] Your User id is Already Exist =====\n");
                register reg = new register();
                reg.teacher_register();
       
        }
        else
        {
                System.out.print("[+] Username ===>");
                String username = input.next();
                teacher_id_values.add(0,username);
                System.out.print("[+] Password ===>");
                String password = input.next();
                teacher_id_values.add(1,password);
                teacher_register_array.put(id_num,teacher_id_values);
                System.out.print("\n===========================\n");
                System.out.print("[+] Data recorded");
                index index = new index();
                index.do_main();
               
        }
      

	 }
}
