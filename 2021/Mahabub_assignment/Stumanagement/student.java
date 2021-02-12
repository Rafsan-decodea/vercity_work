import java.io.InputStreamReader;
import java.util.*;

class  student extends index 
{
     void add_Studnet_detailes(String id)
     {
         Scanner input = new Scanner(System.in);
         System.out.println("========================================");
         System.out.println("\n[+] You Logine id is ===>"+id);
         System.out.println("================Add Your Details ======");
         System.out.print("[+] Your name===>");
         String name =  input.nextLine();
         System.out.print("[+] your Father Name===>");
         String father_name = input.nextLine();
         System.out.print("[+] Your Mother Name===>");
         String mother_name = input.nextLine();
         System.out.print("[+] Your Email===> ");
         String email = input.nextLine();
         System.out.print("[+] Birth Day===>");
         String brith = input.nextLine();
         stu_id_values.add(name);
         stu_id_values.add(father_name);
         stu_id_values.add(mother_name);
         stu_id_values.add(email);
         stu_id_values.add(brith);
         stu_register_array.put(id,stu_id_values);
         System.out.print(stu_register_array);


     }
}