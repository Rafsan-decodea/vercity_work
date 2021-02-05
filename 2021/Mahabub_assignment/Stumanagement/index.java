import java.util.*;

class index{

	public static  ArrayList stu_register_array = new ArrayList();
	public static  ArrayList teacher_register_array = new ArrayList();

	 void do_main()
	 {
		System.out.print("\n======Welcome To our Studnet management System=========\n");
		System.out.println("1) Login ");
		System.out.println("2) Register");
		System.out.println("======================");
		System.out.print("[+] Chooise===>");
		Scanner input  =  new Scanner(System.in);
		int  chooise = input.nextInt();
        if(chooise==2)
        {
        	System.out.println("\n========Welcome To register Panel==========\n\n");
            System.out.println("1) Studnet Register");
            System.out.println("2) Teachers Register");
            System.out.println("===========================");
            System.out.print("[+] Chooise ==>");
            int chooise3 = input.nextInt();
            if (chooise3==1)
            {
            	register reg = new register();
            	reg.stu_register();

            }
            else if(chooise3==2)
            {
            	register reg = new register();
            	reg.teacher_register();

            }

        }
        else if(chooise==1)
        {
        	System.out.println("\n==========Welcome To Login Panel===========\n\n");
        	System.out.println("1) Studnet Login");
        	System.out.println("2) Teachers Login");
        	System.out.println("==================");
        	System.out.print("[+] Chooise ===>");
        	int chooise2 = input.nextInt();
        	if(chooise2==1)
        	{
        		login login = new login();
        		login.stu_login();

        	}
        	else if(chooise2 ==2)
        	{
        		login login = new login();
        		login.teacher_login();

        	}
        }
	}
	 
	public static void main(String[] args) {
	
	  index index = new index();
	  index.do_main();

 }

}