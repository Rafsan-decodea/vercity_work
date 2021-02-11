import java.util.*;
import java.util.HashMap;


class register extends index{

        
	 void stu_register()
	 {   

       
       
        Scanner input = new Scanner(System.in);
	System.out.println("\n\n=========Welcome to Studnet Register ==========\n\n");
        System.out.print("[+] Input Your id number===>");
        String id_num = input.next();
        System.out.print("[+] Username ===>");
        String  username = input.next();
        stu_id_values.add(username);
        System.out.print("[+] Password ===>");
        String  password = input.next();
        stu_id_values.add(password);
        stu_register_array.put(id_num,stu_id_values);
       
        System.out.print("\n===========================\n");
        System.out.print("[+] Data recorded");
        index index = new index();
        index.do_main();
        

	 }
         
  void teacher_register ()
	 {  
                 
       

	Scanner input = new Scanner(System.in);
	System.out.println("\n\n=========Welcome to Student Register ==========\n\n");
        System.out.print("[+] Input Your id number===>");
        String id_num = input.next();
     
        System.out.print("[+] Username ===>");
        String username = input.next();
        teacher_id_values.add(username);
        System.out.print("[+] Password ===>");
        String password = input.next();
        teacher_id_values.add(password);
        teacher_register_array.put(id_num,teacher_id_values);
        System.out.print("\n===========================\n");
        System.out.print("[+] Data recorded");
        index index = new index();
        index.do_main();
      

	 }
}
