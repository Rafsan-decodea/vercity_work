
import java.util.*;


class calculator_main{
	
    static void  add()
    {
		Scanner input  = new Scanner(System.in);
    	System.out.print("\n=====Addition Sectior=======\n");
		System.out.print("[+] input your 1st data ===>");
		int input1 = input.nextInt();
		System.out.print("[+] input you 2nd number====>");
		int input2 = input.nextInt();
		int result = input1+input2;
		System.out.print("[+] OK your 2 digite summition is ===>"+result);


 }

     static void  sub()
    {
		Scanner input  = new Scanner(System.in);
    	System.out.print("\n=====Substract Section=======\n");
		System.out.print("[+] input your 1st data ===>");
		int input1 = input.nextInt();
		System.out.print("[+] input you 2nd number====>");
		int input2 = input.nextInt();
		int result = input1-input2;
		System.out.print("[+] OK your 2 digite Substraction is ===>"+result);
    
    }

   static void multiple()
    {
    	Scanner input  = new Scanner(System.in);
    	System.out.print("\n=====multliplication Section=======\n");
		System.out.print("[+] input your 1st data ===>");
		int input1 = input.nextInt();
		System.out.print("[+] input you 2nd number====>");
		int input2 = input.nextInt();
		int result = input1*input2;
		System.out.print("[+] OK your 2 digite multiplicaton is ===>"+result);
    }

   static void division()
    {
    	Scanner input  = new Scanner(System.in);
    	System.out.print("\n=====Divition Section=======\n");
		System.out.print("[+] input your 1st data ===>");
		int input1 = input.nextInt();
		System.out.print("[+] input you 2nd number====>");
		int input2 = input.nextInt();
		int result = input1/input2;
		System.out.print("[+] OK your 2 digite divition is ===>"+result);
    	
    }



	public static void main(String[] args) {

		Scanner input  = new Scanner(System.in);
		int i = 0;
		while(i<554)
        {
		 System.out.println("\n======calculator=======");
		 System.out.println("1) input one for Addition ");
		 System.out.println("2) input tow For  subtract ");
		 System.out.println("3) input three for Multiplication");
		 System.out.println("4) input four for division");
		 System.out.println("=============================");
		 System.out.print("[+] input your Chose===>");
		 int chooise = input.nextInt();
		 if (chooise ==1)
		 {
            try {add();}
            catch(Exception e)
            {
				System.out.print("\n[+] Some this Went Wrong in Adding ... Try Again\n");
			    System.out.print(e);

            }
		 }
		 else if (chooise==2) 
		 {
            try{sub();}
            catch(Exception e)
            {
            	System.out.print("\n[+] Some this Went Wrong in subtracting ... Try Again\n");

            }	
		 }
		 else if (chooise == 3)
		 {
		 	try{multiple();}
		 	catch(Exception e)
		 	{
		 		System.out.print("\n[+] Some this Went Wrong in Multiplication ... Try Again\n");

		 	}
		 }
		 else if (chooise ==4) 
		 {
		    try{division();}
		    catch(Exception e)
		    {
		    	System.out.print("\n[+] Some this Went Wrong in Division ... Try Again\n");
		    }	
		 }
        }

		
	}
}