
import java.util.*;
import java.util.ArrayList;


class calculator_main{
	
    static void  add()
    {
		Scanner input  = new Scanner(System.in);
    	System.out.print("\n=====Addition Sectior=======\n");
		System.out.print("[+] input How many intiger you want sum ===>");
		int data = input.nextInt();
		
		//ArrayList<Integer> dataList = new ArrayList<Integer>();
       // List<Integer> dataList = Arrays.asList(data);
        //int sum = MathUtils.sum(dataList);
      int[] array = new int[100];
      int sum = 0;
      
      for (int i=0; i<data; i++)
      {
      	  String formate = String.format("[-] Enter the Element[%x] ==>",i);
      	  System.out.print(formate);
    	  array[i] = input.nextInt();
      }
      for( int num : array) {
          sum = sum+num;
      }
      System.out.println("[+] Sum of array elements is:===>"+sum);

		

 }

     static void  sub()
    {
	  int c = 0;
	  while(c<100)
	  {
		Scanner input  = new Scanner(System.in);
    	System.out.print("\n=====Subtract Sectior=======\n");
		System.out.print("[+] Input 1st number ===>");
		int data = input.nextInt();
		System.out.print("[+] input 2nd  number===>");
		int data2 = input.nextInt();
		int result = data-data2;
		System.out.print("\n\t[+] Sum Result is ==>"+result);
		System.out.print("\n[-]Do you want more Operation(for Yes press 1)===> ");
		int yes_no = input.nextInt();
		if (yes_no==1)
		{
			calculator_main m = new calculator_main();
			m.sub();
		}
		else{
			break;
		}
	}
		


    
    }

   static void multiple()
    {
    	int c = 0;
	  while(c<100)
	  {
		Scanner input  = new Scanner(System.in);
    	System.out.print("\n=====multiplication Sectior=======\n");
		System.out.print("[+] Input 1st number ===>");
		int data = input.nextInt();
		System.out.print("[+] input 2nd  number===>");
	    int data2 = input.nextInt();
		int result = data*data2;
		System.out.print("\n\t[+] Sum Result is ==>"+result);
		System.out.print("\n[-]Do you want more Operation(for Yes press 1)===> ");
		int yes_no = input.nextInt();
		if (yes_no==1)
		{
			calculator_main m = new calculator_main();
			m.sub();
		}
		else{
			break;
		}
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
}