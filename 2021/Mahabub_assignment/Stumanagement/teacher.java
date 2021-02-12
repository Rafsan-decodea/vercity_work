import java.util.*;

class  teacher extends index
{
   
    void teacher_add_details(String id)
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
        teacher_id_values.add(name);
        teacher_id_values.add(father_name);
        teacher_id_values.add(mother_name);
        teacher_id_values.add(email);
        teacher_id_values.add(brith);
        teacher_register_array.put(id,teacher_id_values);
        System.out.print(teacher_register_array);
        teacher_panal(id);
       index index = new index();
       index.do_main();

    }

    static void teacher_panal(String id)
    {
        System.out.println("\n[+] ===== Welcome to teacher Panel =========\n");
    }

}