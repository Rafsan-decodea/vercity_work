import java.util.*;

class register extends index{

	 void stu_register()
	 {
	 	Scanner input = new Scanner(System.in);
	 	System.out.println("\n\n=========Welcome to Studnet Register ==========\n\n");
        System.out.print("[+] Username ===>");
        String username = input.next();
        this.stu_register_array.add(username);
        System.out.print("[+] Password ===>");
        String password = input.next();
        this.stu_register_array.add(password);
        System.out.print("\n===========================\n");
        System.out.print("[+] Data recorded");
        System.out.print(this.stu_register_array.size());
        index index = new index();
        index.main();

	 }
	 void teacher_register ()
	 {
	 	Scanner input = new Scanner(System.in);
	 	System.out.println("\n\n=========Welcome to Student Register ==========\n\n");
        System.out.print("[+] Username ===>");
        String username = input.next();
        teacher_register_array.add(username);
        System.out.print("[+] Password ===>");
        String password = input.next();
        teacher_register_array.add(password);
        System.out.print("\n===========================\n");
        System.out.print("[+] Data recorded");
        login login = new login();
        login.teacher_login();

	 }
}
