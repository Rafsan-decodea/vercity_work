import java.util.*;

class login extends index{

    
	void stu_login()
	{
		auth auth = new auth();
		System.out.println("\n====Welcome to Student Logine========\n");
        Scanner input = new Scanner(System.in);
		System.out.print("[+] input your ID===>");
		String id = input.nextLine();
		if(stu_register_array.containsKey(id))
		{
		//student stu = new student();//This is create for Passwing Student ID 
		//stu.add_Studnet_detailes(id);

		System.out.print("[+] input Username ====>");
		String username = input.nextLine();
		System.out.print("[+] input Password ===>");
		String password = input.nextLine(); 
		auth.auth_student(id,username,password);
		}
		else
		{
			System.out.print("\n[+] Error Your Login id is not Found !!!!! You Cannot Login !! Please register \n");
			index index = new index();
			index.do_main();
		}
        
	}

	void teacher_login()
	{
		auth auth = new auth();
		System.out.println("\n=====Welcome to our Teachers Logine =====\n");
		Scanner input = new Scanner(System.in);
		System.out.print("[+] Enter id===>");
		String id = input.nextLine();
		if(teacher_register_array.containsKey(id))
		{ 
		System.out.print("[+] input Username ====>");
		String username = input.nextLine();
		System.out.print("[+] input Password ===>");
		String password = input.nextLine();
        auth.auth_teacher(id, username, password);
		
		}
		else
		{
				System.out.print("\n[!!!!] User id is not found Please Register \n");
				index index = new index();
				index.do_main();
		}
 

	}



}