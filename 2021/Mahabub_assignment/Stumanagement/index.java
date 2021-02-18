import java.util.*;
import java.util.HashMap;

class index{
	
	public static  HashMap<String, ArrayList<String>> stu_register_array = new HashMap<String, ArrayList<String>> ();
	public static  HashMap<String,ArrayList<String>> teacher_register_array = new HashMap<String,ArrayList<String>>();
    public  	ArrayList<String> stu_id_values = new ArrayList<String>();
    public  	ArrayList<String> teacher_id_values = new ArrayList<String>();
	
	 void do_main()
	 {
	  try{

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
		else{
			  index index = new index();
			  index.do_main();
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
			else 
			{
				index index = new index();
			    index.do_main();
			}

		
        }

		else
		{
			index index = new index();
			  index.do_main();
		}
	}
	catch(Exception e)
	{
		System.out.println("\n[+] Invalide Chooise \n");
		index index = new index();
		index.do_main(); 

	}
		
	}
	 
	public static void main(String[] args) {
	
	  index index = new index();
	  index.do_main();

 }

}