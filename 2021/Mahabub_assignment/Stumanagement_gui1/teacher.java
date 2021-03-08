import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;//for Action Listaner
import java.awt.BorderLayout;

class  teacher extends register implements ActionListener {

    public  JLabel Banner_label,id_label;
    public  JButton see_details , update_details,log_out,add_student,see_student,see_total_student,delete_student,add_new_student;
    public   JFrame jframe5 = new JFrame();
    public   JPanel jpanel5 = new JPanel();
    public String id;
   void run (String id)
   {
    jframe5.setSize(300,560);
    jframe5.setDefaultCloseOperation(jframe5.DO_NOTHING_ON_CLOSE);
    jframe5.add(jpanel5);
    jpanel5.setLayout(null);
    this.id = id;
    Banner_label = new JLabel();
    Banner_label.setText("<html><p style='color:white; background-color:green;'>=========Welcome To Teacher_panel==============</p></html>");
    Banner_label.setBounds(5, 0, 500, 50);
    jpanel5.add(Banner_label);

    id_label = new JLabel();
    id_label.setText("<html><p style='color:white; background-color:black;'>===========Your Logine id is ===>"+id+"==========</p></html>");
    id_label.setBounds(5, 15 , 500, 50);
    jpanel5.add(id_label);

    see_details = new JButton("<html><p style='color:black;'>see Your Details</p></html>");
    see_details.setBounds(50,60,200,50);//hight , Width 
    jpanel5.add(see_details);


    update_details = new JButton("<html><p style='color:black;'>Update Your Details</p></html>");
    update_details.setBounds(50,120,200,50);//hight , Width 
    jpanel5.add(update_details);


    see_total_student = new JButton("<html><p style='color:black;'>See Total Student</p></html>");
    see_total_student.setBounds(50,170,200,50);
    jpanel5.add(see_total_student);

    see_student = new JButton("<html><p style='color:black;'>See One Specific Student Details </p></html>");
    see_student.setBounds(50,220,200,50);
    jpanel5.add(see_student);

    delete_student = new JButton("<html><p style='color:black;'>Delete One Specific Student </p></html>");
    delete_student.setBounds(50,270,200,50);
    jpanel5.add(delete_student);


    add_new_student = new JButton("<html><p style='color:black;'>Add New Student </p></html>");
    add_new_student.setBounds(50,320,200,50);
    jpanel5.add(add_new_student);


    log_out = new JButton("<html><p style='color:red;'>logOut</p></html>");
    log_out.setBounds(50,390,200,50);
    jpanel5.add(log_out);

    see_details.addActionListener(this);
    update_details.addActionListener(this);
    log_out.addActionListener(this);
    see_total_student.addActionListener(this);
    see_student.addActionListener(this);
    delete_student.addActionListener(this);
     
    jframe5.setVisible(true);

    
  


   }

   public void actionPerformed(ActionEvent evt)
   {

      if(evt.getSource()==see_details)
      {
            class teacher_see_details extends data_segment
            {
                JFrame new_jframe4 = new JFrame("You Details");
                JPanel new_jpanel4 = new JPanel();
                void run()
                {
                  
                    new_jframe4.setSize(300,200);
                    new_jframe4.setDefaultCloseOperation(new_jframe4.DISPOSE_ON_CLOSE);
                    new_jframe4.add(new_jpanel4);
                    new_jpanel4.setLayout(null);

                    ArrayList<String>  entry_teacher_details = teacher_register_array.get(id);
                    String name = "[+] Your name is ===>"+entry_teacher_details.get(2);
                   String father_name ="[+] You father Name is===>"+entry_teacher_details.get(3);
                   String mother_name = "[+] You Mother name is ==>"+entry_teacher_details.get(4);
                   String age = "[+] You Date of Birth ===>"+entry_teacher_details.get(5);
                   String birth = "[+] You Birth Daya ====>"+entry_teacher_details.get(6);


                   JLabel name_label = new JLabel(name);
                   name_label.setBounds(20, 30, 500, 50);
                   new_jpanel4.add(name_label);
      
                   JLabel father_label = new JLabel(father_name);
                   father_label.setBounds(20, 50, 500, 50);
                   new_jpanel4.add(father_label);
      
                   JLabel mother_label = new JLabel(mother_name);
                   mother_label.setBounds(20,70, 500, 50);
                   new_jpanel4.add(mother_label);
      
      
                   JLabel age_label = new JLabel(age);
                   age_label.setBounds(20, 90, 500, 50);
                   new_jpanel4.add(age_label);
      
      
                   JLabel birth_label = new JLabel(birth);
                   birth_label.setBounds(20, 110, 500, 50);
                   new_jpanel4.add(birth_label);
      
      
      
      
      
                   new_jframe4.setVisible(true);


                }
            }

            teacher_see_details teacher_see_details = new teacher_see_details();
            teacher_see_details.run();
     
        


      }

     else if(evt.getSource()==update_details)
      {
        jframe5.dispose();
        teacher_input teacher_input = new teacher_input();
        teacher_input.run(id,"update_details","update"); 
        System.out.print("update work");
      }

    else if(evt.getSource()==log_out)
    {
        class  logout_massage {//Error Message
            JFrame f;  
           void run(){  
                f=new JFrame(); 
                JOptionPane.showMessageDialog(f,"<html><p style='color:green;'>Log Out Success</p></html>");  
            }  
          }

         logout_massage  logout = new  logout_massage();
          logout.run();//error Massage End

     jframe5.dispose();
    }

    else if( evt.getSource()==see_total_student)
    {
      System.out.println("tigger total student");
          
         class total_student extends data_segment
         {
            JFrame new_jframe4 = new JFrame("Total Student");
            JPanel new_jpanel4 = new JPanel();
              void run()
              {

                new_jframe4.setSize(600,200);
                new_jframe4.setDefaultCloseOperation(new_jframe4.DISPOSE_ON_CLOSE);
                new_jframe4.add(new_jpanel4);
                new_jpanel4.setLayout(null);

                String data = "    You Have  Total     "+stu_register_array.size()+ "  Student    Are Enter and  There id's Id's Are  "+stu_register_array.keySet();
                
                JLabel jlabel = new JLabel(data);
                jlabel.setBounds(30,5,500,50);
                new_jframe4.add(jlabel);

                new_jframe4.setVisible(true);
              
              }
         }

         total_student total_student = new total_student();
         total_student.run();

    }




    else if(evt.getSource()==see_student)
    {

        class  see_student extends data_segment  implements ActionListener 
          {
                  public  JFrame new_jframe5 = new JFrame("See Student");
                  public JPanel new_jpanel5 = new JPanel();
                  public  JFrame new_jframe6 = new JFrame("See Student");
                  public JPanel new_jpanel6 = new JPanel();
                  public  JButton search ;
                  public JLabel name_label,father_name_label,mother_name_label,age_label,birthdata_label;
                  public JTextField input_filed;

               void run()
               {
                new_jframe5.setSize(300,100);
                new_jframe5.setDefaultCloseOperation(new_jframe5.DISPOSE_ON_CLOSE);
                new_jframe5.add(new_jpanel5);
                new_jpanel5.setLayout(null);
                
                 JLabel input_id_text= new JLabel("[+] input id ");
                 input_id_text.setBounds(30,5,500,50);
                 new_jpanel5.add(input_id_text);

                 input_filed = new JTextField();
                 input_filed.setBounds(120,5,100,20);
                 new_jpanel5.add(input_filed);
                 
                  search  = new JButton("Search");
                 search.setBounds(120,20,100,20);
                 new_jpanel5.add(search);

                 search.addActionListener(this);
                 new_jframe5.setVisible(true);
                       

               }
               public void actionPerformed(ActionEvent evt)
               {
               
                if(stu_register_array.containsKey(input_filed.getText()))
                  {
                      ArrayList<String> all_stu_data = stu_register_array.get(input_filed.getText());
                      if(2<=all_stu_data.size())
                      {
                        String name = "[+] Your name is ===>"+all_stu_data.get(2);
                        String father_name ="[+] You father Name is===>"+all_stu_data.get(3);
                        String mother_name = "[+] You Mother name is ==>"+all_stu_data.get(4);
                        String age = "[+] You Date of Birth ===>"+all_stu_data.get(5);
                        String birth = "[+] You Birth Daya ====>"+all_stu_data.get(6);
                        new_jframe6.setSize(400,500);
                        new_jframe6.setDefaultCloseOperation(new_jframe6.DISPOSE_ON_CLOSE);
                        new_jframe6.add(new_jpanel6);
                        new_jpanel6.setLayout(null);

                         name_label = new JLabel(name);
                         
                         name_label.setBounds(30,10,500,50);
                         new_jpanel6.add(name_label);

                         father_name_label = new JLabel(father_name);
                         father_name_label.setBounds(10,30,500,20);
                         new_jpanel6.add(father_name_label);

                         mother_name_label = new JLabel(mother_name);
                         mother_name_label.setBounds(30,60,500,20);
                         new_jpanel6.add(mother_name_label);

                         age_label = new JLabel(age);
                         age_label.setBounds(30,90,500,20);
                         new_jpanel6.add(age_label);

                         birthdata_label = new JLabel(birth);
                         birthdata_label.setBounds(30,120,500,20);
                         new_jpanel6.add(birthdata_label);
                       

                         new_jframe6.setVisible(true);
                      }

                      else
                      {
                        class  error_massage {//Error Message
                          JFrame f;  
                         void run(){  
                              f=new JFrame(); 
                              JOptionPane.showMessageDialog(f,"<html><p style='color:red;'>Id Have no Personal Data</p></html>");  
                          }  
                        }
              
                       error_massage  logout = new  error_massage();
                        logout.run();//error Massage End
                      }

                  }
                  else
                  {
                    class  error_massage {//Error Message
                      JFrame f;  
                     void run(){  
                          f=new JFrame(); 
                          JOptionPane.showMessageDialog(f,"<html><p style='color:red;'>Student id not Found</p></html>");  
                      }  
                    }
          
                   error_massage  logout = new  error_massage();
                    logout.run();//error Massage End
                  }

              }
                         
          }

             see_student see_student = new see_student();
             see_student.run();

          }

       else if(evt.getSource()==delete_student)
  
       {
            
               class delete_stu extends data_segment implements ActionListener
               {
                            public  JFrame new_jframe5 = new JFrame("See Student");
                           public JPanel new_jpanel5 = new JPanel();
                           public JTextField input_filed;
                           public JButton delete;
                      
                          void run()
                          {
                            new_jframe5.setSize(300,100);
                            new_jframe5.setDefaultCloseOperation(new_jframe5.DISPOSE_ON_CLOSE);
                            new_jframe5.add(new_jpanel5);
                            new_jpanel5.setLayout(null);

                            JLabel input_id_text= new JLabel("[+] input id ");
                            input_id_text.setBounds(30,5,500,50);
                            new_jpanel5.add(input_id_text);

                            input_filed = new JTextField();
                            input_filed.setBounds(120,5,100,20);
                            new_jpanel5.add(input_filed);
                 
                             delete = new JButton("Delete");
                            delete.setBounds(120,20,100,20);
                             new_jpanel5.add(delete);

                            delete.addActionListener(this);
                             new_jframe5.setVisible(true);







                               
                          }

                          public void actionPerformed(ActionEvent evt)
                          {
                            if(stu_register_array.containsKey(input_filed.getText()))
                            {
                                 stu_register_array.remove(input_filed.getText());
                                 class  error_massage {//Error Message
                                  JFrame f;  
                                 void run(){  
                                      f=new JFrame(); 
                                      JOptionPane.showMessageDialog(f,"<html><p style='color:green;'>Student id Removed</p></html>");  
                                  }  
                                }
                      
                               error_massage  logout = new  error_massage();
                                logout.run();//error Massage End
    
                               
                              
                              

                          }

                          else
                          {
                            class  error_massage {//Error Message
                              JFrame f;  
                             void run(){  
                                  f=new JFrame(); 
                                  JOptionPane.showMessageDialog(f,"<html><p style='color:red;'>Student id not Found</p></html>");  
                              }  
                            }
                  
                           error_massage  logout = new  error_massage();
                            logout.run();//error Massage End

                          }
                          
                     

               }

       }

       delete_stu delete_stu = new delete_stu();
       delete_stu.run(); 

      }
    
   }


class teacher_input extends teacher implements ActionListener
{
  
    public  JLabel Banner_label, Banner_label2,id_label, name_label,father_name_label,mother_name_label,age_label,birthdata_label;
    public   JButton   enter;
    public  JTextField name,father_name,mother_name,age,birthday;
   
    public  JPanel jpanel6 = new JPanel();
    public String id ;
    public JFrame jframe6 ;
    void run(String id, String frame_name , String button_name)
    {

         jframe6 = new JFrame(frame_name);
         this.id = id;
         jframe6.setSize(300,400);
         jframe6.setDefaultCloseOperation(jframe6.DISPOSE_ON_CLOSE);
         jframe6.add(jpanel6);
         jpanel6.setLayout(null);

         Banner_label = new JLabel();
        Banner_label.setText("<html><p style='color:white; background-color:green;'>===Login Succes (id ==> "+id+") ===</p></html>");
        Banner_label.setBounds(20, 0, 500, 50);
        jpanel6.add(Banner_label);

        Banner_label2 = new JLabel();
        Banner_label2.setText("<html><p style='color:white; background-color:black;'>===Add You Whole Details====</p></html>");
        Banner_label2.setBounds(20, 20 , 500, 50);
        jpanel6.add(Banner_label2);
       
        name_label = new JLabel("<html><h4 style='color:blue;background-color:#a2beeb;'>Name </h4></html>");
        name_label.setBounds(30,90,100,20);
        jpanel6.add(name_label);


        name = new JTextField();
        name.setBounds(120,90,100,20);
        jpanel6.add(name);


        father_name_label = new JLabel("<html><h4 style='color:blue;background-color:#a2beeb;'>Father Name </h4></html>");
        father_name_label.setBounds(30,110,100,20);
        jpanel6.add(father_name_label);


        father_name = new JTextField();
        father_name.setBounds(120,110,100,20);
        jpanel6.add(father_name);
        
        
        
        
        mother_name_label = new JLabel("<html><h4 style='color:blue;background-color:#a2beeb;'>mother Name </h4></html>");
        mother_name_label.setBounds(30,130,100,20);
        jpanel6.add(mother_name_label);


        mother_name = new JTextField();
        mother_name.setBounds(120,130,100,20);
        jpanel6.add(mother_name);



       
        age_label = new JLabel("<html><h4 style='color:blue;background-color:#a2beeb;'>Age</h4></html>");
        age_label.setBounds(30,150,100,20);
        jpanel6.add(age_label);


        age = new JTextField();
        age.setBounds(120,150,100,20);
        jpanel6.add(age);



        birthdata_label = new JLabel("<html><h4 style='color:blue;background-color:#a2beeb;'>Birthday</h4></html>");
        birthdata_label.setBounds(30,170,100,20);
        jpanel6.add(birthdata_label);


        birthday = new JTextField();
        birthday.setBounds(120,170,100,20);
        jpanel6.add(birthday);


        enter = new JButton(button_name);
        enter.setBounds(120,190,100,20);
        jpanel6.add(enter);
      
        jframe6.setVisible(true);

        enter.addActionListener(this);

    }

    public void actionPerformed(ActionEvent evt)
      {
     
      
         if(evt.getSource()==enter)
         {
            jframe5.dispose();
            class enter_teacher extends data_segment
            {
                         
                   void run()
                   {
                       ArrayList<String> teacher_entry = teacher_register_array.get(id);
                       teacher_entry.add(2,name.getText());
                       teacher_entry.add(3,father_name.getText());
                       teacher_entry.add(4,mother_name.getText());
                       teacher_entry.add(5,age.getText());
                       teacher_entry.add(6,birthday.getText());
                       teacher_register_array.put(id,teacher_entry);
                       teacher teacher = new teacher();
                       teacher.run(id);
                      
                   }
             
                  

            }
           
            enter_teacher enter_teacher = new enter_teacher();
            enter_teacher.run();

         }

        jframe6.dispose();

      }

 }
}