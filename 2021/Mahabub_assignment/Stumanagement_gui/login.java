import javax.accessibility.Accessible;
import javax.swing.*;



import java.awt.*;
import java.awt.event.*;//for Action Listaner


class login implements ActionListener {




    public static  JLabel Banner_label,id_label,username_label,password_label;
    public static  JTextField id_filed ,user_field,password_field;
    public static JFrame jframe2 = new JFrame("Login System");
    public static JPanel jpanel2 = new JPanel();
    public static JRadioButton stu_login_jbutton,teacher_login_button;
    public static JButton login;
      void login()
      {
        
        jframe2.setSize(400,300);
        jframe2.setDefaultCloseOperation(jframe2.HIDE_ON_CLOSE);
        jframe2.add(jpanel2);
        jpanel2.setLayout(null);

        stu_login_jbutton = new JRadioButton("As a Student "); // 1st Radio Button
        stu_login_jbutton.setBounds(50, 30, 400,20);
        jpanel2.add(stu_login_jbutton);
        
        teacher_login_button = new JRadioButton("As a Teacher ");//2nd radio Button
        teacher_login_button.setBounds(50,60,400,20);
        jpanel2.add(teacher_login_button);
         
       
        
        Banner_label = new JLabel();
        Banner_label.setText("<html><h3 style='color:green;background-color:#a2beeb;'>==Welcome  Login Panel==</h3></html>");
        Banner_label.setBounds(20, 0, 400, 20);
        jpanel2.add(Banner_label);

        id_label= new  JLabel();// Enter Your ID 
        id_label.setText("<html><h4 style='color:blue;background-color:#a2beeb;'>Enter Your id </h4></html>");
        id_label.setBounds(50,40,100,100);
        jpanel2.add(id_label);

        id_filed = new JTextField();
        id_filed.setBounds(150,80,100,20);
        jpanel2.add(id_filed);
        

        username_label = new JLabel();  // Enter Your USername
        username_label.setText("<html><h4 style='color:blue;background-color:#a2beeb;'> Username </h4></html>");
        username_label.setBounds(50,100,100,20);
        jpanel2.add(username_label);

        user_field = new  JTextField();
        user_field.setBounds(150,100,100,20);
        jpanel2.add(user_field);
       
        

        password_label = new JLabel();// Enter Your Password
        password_label.setText("<html><h4 style='color:blue;background-color:#a2beeb;'> Password </h4></html>");
        password_label.setBounds(50,120,100,20);
        jpanel2.add(password_label);

        password_field = new JPasswordField();//password 
        password_field.setBounds(150, 120, 100, 20);
        jpanel2.add(password_field);

        login = new JButton("<html><p style='color:green;'>Login</p></html>");//login Button
        login.setBounds(150,150,100,20);
        jpanel2.add(login);



        
        // user_input = new JTextField();
        // user_input.setBounds(100,20,165,25);
        // jpanel.add(user_input);
        stu_login_jbutton.addActionListener(this);// just set Action What Will be Happed After Select
        teacher_login_button.addActionListener(this);
        login.addActionListener(this);

        jframe2.setVisible(true);
      }

      public void actionPerformed(ActionEvent evt)
      {
            if(stu_login_jbutton.isSelected())
            {
                teacher_login_button.setSelected(false);// if Select Stu Radio Button ... Teacher is unselected
                System.out.println("You Select Studnet");
            }
            if(teacher_login_button.isSelected())
            {
                stu_login_jbutton.setSelected(false);
                System.out.println("You  Select teacher");
            }



            if(evt.getSource()==login)
            {
                if(stu_login_jbutton.isSelected())
                {
                    class stu_login_controller extends data_segment
                    {

                    void run()
                    { 
                       
                    if(stu_register_array.containsKey(id_filed.getText())) //Checking if Student id is Exist
                    {

                        if(stu_register_array.get(id_filed.getText()).get(0).equals(user_field.getText()) && stu_register_array.get(id_filed.getText()).get(1).equals(password_field.getText()))
                        {
                       
                             // DO Next Step in student_login
                             System.out.println("Login as Student");
                             student student = new student();
                             student.run(id_filed.getText());
                              

                        }
                        else
                        {
                            class  Error_massage {//Error Message
                                JFrame f;  
                               void run(){  
                                    f=new JFrame(); 
                                    JOptionPane.showMessageDialog(f,"<html><p style='color:red;'>Logine Failed as Student  .. Try Again</p></html>");  
                                }  
                              }

                              Error_massage o = new Error_massage();
                              o.run();//error Massage End
                    
                        }
                    }

                    else
                    {
                        class  Error_massage {//Error Message
                            JFrame f;  
                           void run(){  
                                f=new JFrame(); 
                                JOptionPane.showMessageDialog(f,"<html><p style='color:red;'>Student ID Dose not Exist  .. Try Again</p></html>");  
                            }  
                          }

                          Error_massage o = new Error_massage();
                          o.run();//error Massage End

                    }
                  
                
                  }
                    
                }


                    stu_login_controller sl= new  stu_login_controller();
                    sl.run();
                }

               if(teacher_login_button.isSelected())
               {

                       class teacher_register_controller extends data_segment
                       {
                           void run()
                           {

                              if(teacher_register_array.containsKey(id_filed.getText()))
                              {


                               if(teacher_register_array.get(id_filed.getText()).get(0).equals(user_field.getText()) && teacher_register_array.get(id_filed.getText()).get(1).equals(password_field.getText()))
                               {
                                   System.out.println("Login as teacher");
                                   //Doo What you Want
                               }
                               
                               else
                               {
                                class  Error_massage {//Error Message
                                    JFrame f;  
                                   void run(){  
                                        f=new JFrame(); 
                                        JOptionPane.showMessageDialog(f,"<html><p style='color:red;'>Logine Failed as teacher .. Try Again</p></html>");  
                                    }  
                                  }
    
                                  Error_massage o = new Error_massage();
                                  o.run();//error Massage End
                        

                               }
                            
                            
                             }

                             else
                             {
                                class  Error_massage {//Error Message
                                    JFrame f;  
                                   void run(){  
                                        f=new JFrame(); 
                                        JOptionPane.showMessageDialog(f,"<html><p style='color:red;'>Teacher ID Dose not Exist  .. Try Again</p></html>");  
                                    }  
                                  }
        
                                  Error_massage o = new Error_massage();
                                  o.run();//error Massage End
                                 
                             }


                           }
                       }

                       teacher_register_controller tr = new teacher_register_controller();
                       tr.run();
                   
               }

            }




      }

  
}