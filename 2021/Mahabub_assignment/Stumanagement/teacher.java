import java.util.*;

class  teacher extends index
{
    public static  int choose4;
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
        System.out.print("[+] Phone number ====>");
        String phone = input.nextLine();
        System.out.print("[+] Birth Day===>");
        String brith = input.nextLine();
        teacher_add_details.add(2,name);
        teacher_add_details.add(3,father_name);
        teacher_add_details.add(4,mother_name);
        teacher_add_details.add(5,email);
        teacher_add_details.add(6,phone);
        teacher_add_details.add(7,brith);
        teacher_register_array.put(id,teacher_add_details);

      
        teacher_panal(id);
    

    }

    static void teacher_panal(String id)
    {
        System.out.println("\n ===== Welcome to teacher Panel =========\n");
        System.out.println("1) See Student Details ");
        System.out.println("2) Add A new Student ");
        System.out.println("3) See Total Student Count ");
        System.out.println("4) Update A Student Details");
        System.out.println("5) Delete Studnet From Entry");
        System.out.println("6) See Your information");
        System.out.println("7) Update Your information");
        System.out.println("8) log out");
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
                ArrayList<String> stu_add_details =  new ArrayList<>();
                System.out.println("============= Add Student Segment ==========\n");
                System.out.print("[+] Give Student id ====>");
                String stu_id = input.next();
                if(stu_register_array.containsKey(stu_id))
                {
                    System.out.println("[!!] Student Id Already Exist ");
                    teacher_panal(id);
                }
                else{

                      System.out.print("[+] Give Student username ====> ");
                      String stu_username = input.next();
                      stu_add_details.add(0,stu_username);
                      System.out.print("[+] Give Student Password ===>");
                      String stu_password = input.next();
                      stu_add_details.add(1,stu_password);
                      System.out.print("[+] Student name===>");
                      String name =  input.next();
                      stu_add_details.add(2,name);
                      System.out.print("[+] "+name+"'s  Father Name===>");
                      String father_name = input.next();
                      stu_add_details.add(3,father_name);
                      System.out.print("[+] "+name+"'s  Mother Name===>");
                      String mother_name = input.next();
                      stu_add_details.add(4,mother_name);
                      System.out.print("[+] "+name+"'s  Email Address===>");
                      String email = input.next();
                      stu_add_details.add(5,email);
                      System.out.print("[+] "+name+"'s  birth day ===>");
                      String brith = input.next();
                      stu_add_details.add(6,brith);
                      stu_register_array.put(stu_id,stu_add_details);
                      System.out.println("[+] Student Successfully Added \n");
                      System.out.print(stu_register_array);
                      teacher_panal(id);
                }
            }


            else if(chooise==3)
            {
                System.out.print("\n\n[+]You Have in total "+stu_register_array.size()+" in your entry And There Id's Are==> ");
                System.out.print(stu_register_array.keySet()+"\n\n");
                teacher_panal(id);
                
            }

            else if(chooise==4)
            {
                 System.out.print("\n[+] Enter Student id ===> ");
                 String stu_id = input.next();
                
             
                 if(stu_register_array.containsKey(stu_id))
                 {
                    ArrayList<String> stu_details_add = stu_register_array.get(stu_id);

                    if(2>=stu_details_add.size())
                    { 
                        System.out.println("[!] Warning This is like a new Stdent \n") ;

                        System.out.println("========Update Student Panel========");
                        System.out.println("1) Update  Name");
                        System.out.println("2) Update  Father Name");
                        System.out.println("3) Update  Mother Name");
                        System.out.println("4) Update  Email");
                        System.out.println("5) Update  Bithday");
                        System.out.println("6) Update Username");
                        System.out.println("7) Update  Password");
                        System.out.println("==========================================");
                        System.out.println("[+] Choose ===>");
                         choose4 = input.nextInt();



                       
                    }
                    else{
                       
                        System.out.println("========Update Student Panel========");
                       System.out.println("1) Update "+stu_details_add.get(2)+" Name");
                       System.out.println("2) Update "+stu_details_add.get(2)+" Father Name");
                       System.out.println("3) Update "+stu_details_add.get(2)+" Mother Name");
                       System.out.println("4) Update "+stu_details_add.get(2)+" Email");
                       System.out.println("5) Update "+stu_details_add.get(2)+" Bithday");
                       System.out.println("6) Update "+stu_details_add.get(2)+" Username");
                       System.out.println("7) Update "+stu_details_add.get(2)+" Password");
                       System.out.println("==========================================");
                       System.out.println("[+] Choose ===>");
                       choose4 = input.nextInt();

                       

                    }
                    
                    try{

                        if (choose4==1)
                        {
                          if(2>=stu_details_add.size())
                             {
                                System.out.print("[+]input  New Name ====>");
                        
                            }
                         else{  
                         System.out.print("[+]input "+stu_details_add.get(2)+"  New Name ====>");
                          }
                          
                           String  new_name = input.next();
                           stu_details_add.add(2,new_name);
                           System.out.println("[+]His/her Name Changed ");
                           teacher_panal(id);
                        }  
                        
                        else if ( choose4==2)
                        {
                           System.out.print("[+] input his/her  New father Name ===>");
                           String new_father_name = input.next();
                           stu_details_add.add(3,new_father_name);
                           System.out.println("[+]His/her Father Name Changed ");
                           teacher_panal(id);
                        }
                        else if(choose4==3)
                        {
                          System.out.print("[+] input his/her  New Mother  Name ===>");
                          String new_mother_name = input.next();
                          stu_details_add.add(4,new_mother_name);
                          System.out.println("[+]His/her Mother name is changed");
                          teacher_panal(id);
           
                        }
           
                        else if(choose4==4)
                        {
                          System.out.print("[+] input  his/her  New mail ===>");
                          String new_mail = input.next();
                          stu_details_add.add(5,new_mail);
                          System.out.println("[+]His/her Mail is Changed ");
                          teacher_panal(id);
                        }
                       else if(choose4==5)
                       {
                          System.out.print("[+] input  his/her  New Birthday ===>");
                          String new_birth_day = input.next();
                          stu_details_add.add(6,new_birth_day);
                          System.out.println("[+]His/her Birthday is Changed");
                          teacher_panal(id);
                       }
                       
                       else if(choose4==6)
                       {
                           System.out.println("[+] input his/her new Username===>");
                           String new_user = input.next();
                           stu_details_add.add(0,new_user);
                           System.out.println("[+] His/her Username changed");
                           teacher_panal(id);
                       }

                       else if(choose4==7)
                       {
                        System.out.println("[+] input his/her new password===>");
                        String new_pass = input.next();
                        stu_details_add.add(1,new_pass);
                        System.out.println("[+] His/her password changed");
                        teacher_panal(id);

                       }
           
                      }
                      catch(Exception e)
                      {
           
                         System.out.println("\n\n [!!!!!!!] Wrong input in Edit Panel \n\n");
                         teacher_panal(id);
                         
                      }

                     
                 }
                 else
                 {
                       System.out.println("[+]Student Id Not Exist!!!!\n");
                       teacher_panal(id);
                 }
            }
            else if(chooise==5)
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
            else if(chooise==6)
            {
               ArrayList<String>  teacher_details = teacher_register_array.get(id);
                System.out.println("\n[+] Your name is ===> "+teacher_details.get(2));
                System.out.println("[+] Your Father Name ===>"+teacher_details.get(3));
                System.out.println("[+] Your Mother Name ===> "+teacher_details.get(4));
                System.out.println("[+] You  Email ====>"+teacher_details.get(5));
                System.out.println("[+] Your Phone number is ===>"+teacher_details.get(6));
                System.out.println("[+] Your Birth Day ===>"+teacher_details.get(7));
                System.out.println("[+] Your Id is ===>"+teacher_details.get(0));
                System.out.print("[+] Your Password is ===>"+teacher_details.get(1));
                System.out.print("\n");
                teacher_panal(id);
            }

            else if(chooise==7)
            {
                 ArrayList<String> teacher_details = teacher_register_array.get(id);
                System.out.println("\n1)Changed Your Name");
                System.out.println("2)Changed  your Father Name");
                System.out.println("3)Changed your Mother Name");
                System.out.println("4)Changed your Email");
                System.out.println("5)Change Your Phone ");
                System.out.println("6)Changed your BirthDay ");
                System.out.println("7)Changed your Password");
                System.out.println("=============================");
                System.out.print("[+]Choose ===>");
                int chooise2 = input.nextInt();
                if (chooise2==1)
                {
                    System.out.print("\n[+] Input your New name==>");
                    //input.nextLine();
                    String new_name= input.next();
                    teacher_details.add(2,new_name);
                    System.out.println("[+] Your name is update");
                    teacher_panal(id);

                }
                else if(chooise2==2)
                {
                    System.out.print("\n[+] input your New Father Name==>");
                    //input.nextLine();
                    String new_father_name = input.next();
                    teacher_details.add(3,new_father_name);
                    System.out.println("\n[+] Your Father name is Update");
                    teacher_panal(id);

                }
                else if(chooise2==3)
                {
                    System.out.print("[+] Input Your new Mother Name====>");
                   // input.nextLine();
                    String new_mother_name = input.next();
                    teacher_details.add(4,new_mother_name);
                    System.out.print("\n[+] Your Mother Name Update ");
                    teacher_panal(id);
                }
                else if(chooise2==4)
                {
                    System.out.print("[+] Input Your new Email ====>");
                   // input.nextLine();
                    String new_email = input.next();
                    teacher_details.add(5,new_email);
                    System.out.print("\n [+] Your Email Details Successfully Update");
                    teacher_panal(id);


                }

                else if(chooise2==5)
                {
                    System.out.print("[+] input Your New Phone  ===>");
                   
                    String new_phone = input.next();
                    teacher_details.add(6,new_phone);
                    System.out.print("\n [+] Your Phone Number Successfully Update");
                    teacher_panal(id);
                }

                else if(chooise2 == 6)
                {
                    System.out.print("[+] input your new  Birthday ===>");
                    //input.nextLine();
                    String new_bithday = input.next();
                    teacher_details.add(7,new_bithday);
                    System.out.print("[+] Your Birthday is Success Fully Update");
                    teacher_panal(id);
                }

                else if(chooise2==7)
                {
                    System.out.print("[+] input your new Password ===>");
                    //input.nextLine();
                    String new_password = input.next();
                    teacher_details.add(1,new_password);
                    System.out.print("\n [+] Your Password Successs fully Update ");
                    teacher_panal(id);

                }
                else
                {
                    System.out.println("[!!!] invelide Choose From Teacher Panel");
                    teacher_panal(id);
                }

            }
            else if(chooise==8)
            {
                System.out.print("\n[-] Loging Out .......\n");
                index index = new index();
                index.do_main();
            }
            else
            {
                teacher_panal(id);
            }

        }
        catch(Exception e)
        {
            System.out.print("\n[!!!!!!!] invalide input ... Try Again\n\n"+e);
            teacher_panal(id);
        }

    }

}