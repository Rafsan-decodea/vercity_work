
import java.util.*;
import java.util.ArrayList;


class calculator_main{
	public static ArrayList history = new ArrayList();
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
      	  String formate = String.format("[-] Enter the Element[%d] ==>",i);
      	  System.out.print(formate);
    	  array[i] = input.nextInt();
      }
      for( int num : array) {
          sum = sum+num;
      }
	  System.out.println("[+] Sum of array elements is:===>"+sum);
	  history.add("[+]Ans From Addition==> "+sum);

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
		history.add("[+]Ans From  Subtract ==>"+result);
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
		history.add("[+]Ans From Multiple==>"+result);
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


static  void division()
{
	int c = 0;
	  while(c<100)
	  {
		Scanner input  = new Scanner(System.in);
    	System.out.print("\n=====Division Sectior=======\n");
		System.out.print("[+] Input 1st number ===>");
		int data = input.nextInt();
		System.out.print("[+] input 2nd  number===>");
	    float data2 = input.nextInt();
		float  result = data/data2;
		System.out.print("\n\t[+] Sum Result is ==>"+result);
		history.add("[+]Ans From Division"+result);
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

static void trigono()
{
	 int c = 0;
	 while(c<100)
	 {
		 Scanner input = new Scanner(System.in);
		 System.out.print("\n==========Trigonomiti Sector========\n");
		 System.out.println("1) Press one for Sign Value for your input ");
		 System.out.println("2) Press two for Cos value for your input  ");
		 System.out.println("3) Press Three for Tan Value for your input");
		 System.out.println("4) Press Four for Squroot For  yout input ");
		 System.out.println("5) Press Five for Pi value for your input");
		 System.out.println("6) Press SIX for Root Over for your input");
		 System.out.println("========================================");
		 System.out.print("[+] input your Choose===>");
		 int chooise = input.nextInt();
		 if (chooise==1) 
		 {
			 System.out.println("================================");
			 System.out.print("\n[+] Input your Value for Sine=====>");
			 float sign = input.nextFloat();
			 String sing_format = String.format("\n\t[+] This %2f Sign value is ===>%2f\n",sign,Math.sin(sign));
			 System.out.print(sing_format);
			 history.add("[+] Ans from Trigonomiti Sign "+sign);
		 }
		 else if(chooise==2)
		 {
			System.out.println("================================");
			System.out.print("\n[+] Input your Value for Cose=====>");
			float cos = input.nextFloat();
			String cos_format = String.format("\n\t[+] This %2f Cos value is ===>%2f\n",cos,Math.cos(cos));
			System.out.print(cos_format);
			history.add("[+] Ans from Trigonomiti cos"+cos);
               
		 }
		 else if (chooise==3)
		 {
			System.out.println("================================");
			System.out.print("\n[+] Input your Value for Tan=====>");
			float tan = input.nextFloat();
			String tan_format = String.format("\n\t[+] This %2f Tan value is ===>%2f\n",tan,Math.sin(tan));
			System.out.print(tan_format);
			history.add("[+]  Ans from Trigonomiti  Tan"+tan);

		 }
		 else if (chooise==4)
		 {
			System.out.println("================================");
			System.out.print("\n[+] Input your Value for Sqroot=====>");
			double  sqroot = input.nextDouble();
			String sqroot_format = String.format("\n\t[+] This %2f Sign value is ===>%2f\n",sqroot,Math.sqrt(sqroot));
			System.out.print(sqroot_format);
			history.add("[+]  Ans from Trigonomiti sqroot "+sqroot);

		 }
		 else if (chooise==5)
		 {
			System.out.println("================================");
			System.out.print("\n[+] Input your Value for multiplay with PI =====>");
			float pi = input.nextFloat();
			String pi_format = String.format("\n\t[+] This %2f Sign value is ===>%2f\n",pi,(Math.PI*pi));
			System.out.print(pi_format);
			history.add("[+]  Ans from Trigonomiti pi "+pi);

		 }
		 else if (chooise==6)
		 {
			System.out.println("================================");
			System.out.print("\n[+] Input your Value=====>");
			double data = input.nextDouble();
			System.out.print("\n[+] input Pow value===>");
			double pow = input.nextDouble();
			String pow_format = String.format("\n\t[+] This %2f Sign value is ===>%2f\n",data,Math.pow(data, pow));
			System.out.print(pow_format);
			history.add("[+]  Ans from Trigonomiti pow "+pow);
		 }

		 System.out.print("[!] Do you Want continue This Trigonomiti Sector (Press 1 for Yes / No For 2)==>");
		 int yes_no = input.nextInt();
		 if (yes_no==1)
		{
			calculator_main m = new calculator_main();
			m.trigono();
		}
		else{
			break;
		}
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
		 System.out.println("5) input five for Go Trigono Martic Sector");
		 System.out.println("6) Press 6 For see history");
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
				System.out.print(e);
            }	
		 }
		 else if (chooise == 3)
		 {
		 	try{multiple();}
		 	catch(Exception e)
		 	{
		 		System.out.print("\n[+] Some this Went Wrong in Multiplication ... Try Again\n");
				 System.out.print(e);
		 	}
		 }
		 else if (chooise ==4) 
		 {
		    try{division();}
		    catch(Exception e)
		    {
				System.out.print("\n[+] Some this Went Wrong in Division ... Try Again\n");
				System.out.print(e);
		    }	
		 }
		 else if(chooise==5)
		 {
			 try{trigono();}
			 catch(Exception e)
			 {
				System.out.print("\n[+] Some this Went Wrong in Division ... Try Again\n");
				System.out.print(e);
			 }
		 }

		 else if(chooise==6)
		 {
			 try{
				 System.out.println("\n=========Printing History=========\n");
				 for (int j=0 ; j<=history.size()-1; j++)
				 {
					 System.out.println(history.get(j));
				 }

			 }
			 catch(Exception e)
			 {
				 System.out.print("\n[!!] some Think Wrong for \n"+e);
			 }
		 }
		
	}

		
	}
}
