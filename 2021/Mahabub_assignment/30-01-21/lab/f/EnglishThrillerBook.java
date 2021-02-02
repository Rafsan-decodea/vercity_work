import java.security.DrbgParameters.NextBytes;
import java.util.*;

 class EnglishThrillerBook extends Book {

    
       public String Yop ;
       
 void  ragister ()
 {
     Scanner input = new Scanner(System.in);
     System.out.print("[+] input ID===>");
     int data = input.nextInt();
      
     setid(data);
     System.out.print("[+]input Book ====>");
     String data2=  input.next();
     arry.add(data2);
     System.out.print("[+] input Price ===>");
     int p = input.nextInt();
     Price(p);

    System.out.println("============================================");
    getId();
    show_price();

    for (int i =0 ; i<=arry.size()-1;i++)
    {
        String data4  = String.format("[+]Book is===>%s\n",arry.get(i));
        System.out.print(data4);
    }


     

 }



 }