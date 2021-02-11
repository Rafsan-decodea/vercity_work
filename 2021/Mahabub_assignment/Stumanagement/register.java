import java.util.*;
import java.util.HashMap;

class register extends index{

	 void stu_register()
	 {   

        ArrayList<String> id = new ArrayList<String>();
       
        Scanner input = new Scanner(System.in);
	System.out.println("\n\n=========Welcome to Studnet Register ==========\n\n");
        System.out.print("[+] Input Your id number===>");
        String id_num = input.next();
        System.out.print("[+] Username ===>");
        String  username = input.next();
        id.add(username);
        System.out.print("[+] Password ===>");
        String  password = input.next();
        id.add(password);
        stu_register_array.put(id_num,id);
       
        System.out.print("\n===========================\n");
        System.out.print("[+] Data recorded");
        index index = new index();
        index.do_main();
        

	 }
         
  void teacher_register ()
	 {  
                 
        ArrayList<String> id = new ArrayList<String>();

	Scanner input = new Scanner(System.in);
	System.out.println("\n\n=========Welcome to Student Register ==========\n\n");
        System.out.print("[+] Input Your id number===>");
        String id_num = input.next();
     
        System.out.print("[+] Username ===>");
        String username = input.next();
        id.add(username);
        System.out.print("[+] Password ===>");
        String password = input.next();
        id.add(password);
        stu_register_array.put(id_num,id);
        System.out.print("\n===========================\n");
        System.out.print("[+] Data recorded");
        index index = new index();
        index.do_main();
      

	 }
}
