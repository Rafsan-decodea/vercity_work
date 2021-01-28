
import java.util.*;

class calculator_main{

    static void  add()
    {
    	System.out.print("\n=====Addition Sectior=======\n");
    	System.out.print("[+] ")
 
    }

     static void  sub()
    {
    	System.out.print("\n hi .. I am from sub");
    
    }

   static void multiple()
    {
    	System.out.print("\n hi ... I am from multiple\n");
    	
    }

   static void division()
    {
    	System.out.print("\n hi .. I am from division\n");
    	

    }



	public static void main(String[] args) {

		Scanner input  = new Scanner(System.in);
		int i = 0;
        while(i<5)
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