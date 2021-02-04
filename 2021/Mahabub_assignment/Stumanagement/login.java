import java.util.*;

class login{

    
	void stu_login()
	{
		System.out.println("\n====Welcome to Student Logine========\n");
        Scanner input = new Scanner(System.in);
		System.out.print("[+] input Username ====>");
		String username = input.nextLine();
		System.out.print("[+] input Password ===>");
		String password = input.nextLine();

	}

	void teacher_login()
	{
		System.out.println("\n=====Welcome to our Teachers Logine =====\n");
		Scanner input = new Scanner(System.in);
		System.out.print("[+] input Username ====>");
		String username = input.nextLine();
		System.out.print("[+] input Password ===>");
		String password = input.nextLine();

	}



}