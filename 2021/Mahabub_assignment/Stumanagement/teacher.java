import java.util.*;

class  teacher extends index
{
   
    void teacher_add_details(String id)
    {
        ArrayList<String> teacher_add_details =  teacher_register_array.get(id);
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
        teacher_add_details.add(2,name);
        teacher_add_details.add(3,father_name);
        teacher_add_details.add(4,mother_name);
        teacher_add_details.add(5,email);
        teacher_add_details.add(6,brith);
        teacher_register_array.put(id,teacher_add_details);
      
        teacher_panal(id);
    

    }

    static void teacher_panal(String id)
    {
        System.out.println("\n[+] ===== Welcome to teacher Panel =========\n");
        System.out.println("1) See Student Details ");
        System.out.println("2) See Total Student Count ");
        System.out.println("3) Delete Studnet From Entry");
        System.out.println("4) See Your information");
        System.out.println("5) Update Your information");
        System.out.println("6) log out");
        System.out.println("==================================");
        System.out.print("[+] Choose ===>");
        Scanner input = new Scanner(System.in);
        int chooise = input.nextInt();
        try
        {
          if(chooise==1)
            {
             

                        System.out.println("\n=====See Studnet Details =======\n");
                        System.out.print("[+] Enter a Studnet id =====>");
                        input.nextLine();
                        String stu_id = input.nextLine();
                        if(stu_register_array.containsKey(stu_id))
                             {  
                           
                                ArrayList<String> stu_has_next = stu_register_array.get(stu_id);
                                if(2>=stu_has_next.size())
                                {
                                    System.out.print("\n[!!!] Your Enter id's is ("+stu_id+") Whitch information Not ablavel Expect User id("+stu_has_next.get(0)+") And password ("+stu_has_next.get(1)+") \n\n");
                                    teacher_panal(id);
                                }
                                else{    
                                
                                System.out.println("[+] Your name is ===> "+stu_has_next.get(2));
                                System.out.println("[+] Your Father Name ===>"+stu_has_next.get(3));
                                System.out.println("[+] Your Mother Name ===> "+stu_has_next.get(4));
                                System.out.println("[+] You  Email ====>"+stu_has_next.get(5));
                                System.out.println("[+] Your Birth Day ===>"+stu_has_next.get(6));
                                System.out.println("[+] Your Id is ===>"+stu_has_next.get(0));
                                System.out.print("[+] Your Password is ===>"+stu_has_next.get(1));
                               
                                }
                                teacher_panal(id);

                              }
                         else
                             {
                                System.out.print("\n\n[+] Student id dose not Exits \n\n"); 
                                teacher_panal(id);

                              }

            } 

            else if(chooise==2)
            {
                System.out.print("\n\n[+]You Have in total "+stu_register_array.size()+" in your entry And There Id's Are==> ");
                System.out.print(stu_register_array.keySet()+"\n\n");
                teacher_panal(id);
                
            }
            else if(chooise==3)
            {
               System.out.print("[+] Enter Id number of Student ===>");
              String remove_id = input.next();
              if (stu_register_array.containsKey(remove_id))
              {
                stu_register_array.remove(remove_id);
                System.out.print("\nn[+] Succesfully Remove this Studnet \n\n");
                teacher_panal(id);

              }
              else
              {
                System.out.print("\nn[+] Your Enter Studnet id Not Exist \n\n");
                teacher_panal(id);

              }
               
            }
            else if(chooise==4)
            {
               ArrayList<String>  teacher_details = teacher_register_array.get(id);
                System.out.println("\n[+] Your name is ===> "+teacher_details.get(2));
                System.out.println("[+] Your Father Name ===>"+teacher_details.get(3));
                System.out.println("[+] Your Mother Name ===> "+teacher_details.get(4));
                System.out.println("[+] You  Email ====>"+teacher_details.get(5));
                System.out.println("[+] Your Birth Day ===>"+teacher_details.get(6));
                System.out.println("[+] Your Id is ===>"+teacher_details.get(0));
                System.out.print("[+] Your Password is ===>"+teacher_details.get(1));
                System.out.print("\n");
                teacher_panal(id);
            }

            else if(chooise==5)
            {

            }
            else if(chooise==6)
            {
                System.out.print("\n[-] Loging Out .......\n");
                index index = new index();
                index.do_main();
            }

        }
        catch(Exception e)
        {
            System.out.print("\n[!!!!!!!] invalide input ... Try Again\n\n");
            teacher_panal(id);
        }

    }

}