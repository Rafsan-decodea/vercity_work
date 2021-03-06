import javax.swing.*;
import java.awt.event.*;//for Action Listaner

import java.awt.*;



class register extends login implements ActionListener
{
    public static  JLabel Banner_label,id_label,username_label,password_label;
    public static  JTextField id_filed ,user_field,password_field;
    public static JFrame jframe3 = new JFrame("Register System");
    public static JPanel jpanel3 = new JPanel();
    public static JRadioButton stu_register_jbutton,teacher_register_button;
    public static JButton register;
    void register()
    {
        jframe2.setVisible(false);

        jframe3.setSize(400,300);//width , higth
        jframe3.setDefaultCloseOperation(jframe3.HIDE_ON_CLOSE);
        jframe3.add(jpanel3);
        jpanel3.setLayout(null);
        
        Banner_label = new JLabel();//banner Label
        Banner_label.setText("<html><h3 style='color:green;background-color:#a2beeb;'>==Welcome Register Panel==</h3></html>");
        Banner_label.setBounds(50, 0, 400, 20);
        jpanel3.add(Banner_label);

        stu_register_jbutton = new JRadioButton("As a Student "); // 1st Radio Button
        stu_register_jbutton.setBounds(50, 30, 400,20);
        jpanel3.add(stu_register_jbutton);
        
        teacher_register_button = new JRadioButton("As a Teacher ");//2nd radio Button
        teacher_register_button.setBounds(50,60,400,20);
        jpanel3.add(teacher_register_button);
         



    

        id_label= new  JLabel();// Enter Your ID 
        id_label.setText("<html><h4 style='color:blue;background-color:#a2beeb;'>Enter Your id </h4></html>");
        id_label.setBounds(50,40,100,100);
        jpanel3.add(id_label);

        id_filed = new JTextField();
        id_filed.setBounds(150,80,100,20);
        jpanel3.add(id_filed);
        

        username_label = new JLabel();  // Enter Your USername
        username_label.setText("<html><h4 style='color:blue;background-color:#a2beeb;'> Username </h4></html>");
        username_label.setBounds(50,100,100,20);
        jpanel3.add(username_label);

        user_field = new  JTextField();
        user_field.setBounds(150,100,100,20);
        jpanel3.add(user_field);
       
        

        password_label = new JLabel();// Enter Your Password
        password_label.setText("<html><h4 style='color:blue;background-color:#a2beeb;'> Password </h4></html>");
        password_label.setBounds(50,120,100,20);
        jpanel3.add(password_label);

        password_field = new JPasswordField();//password 
        password_field.setBounds(150, 120, 100, 20);
        jpanel3.add(password_field);
      
        register = new JButton("<html><p style='color:green;'>register</p></html>");//Register Button
        register.setBounds(150,150,100,20);
        jpanel3.add(register);



   
        // user_input = new JTextField();
        // user_input.setBounds(100,20,165,25);
        // jpanel.add(user_input);
        stu_register_jbutton.addActionListener(this);// just set Action What Will be Happed After Select
        teacher_register_button.addActionListener(this);
        register.addActionListener(this);

        jframe3.setVisible(true);

    }
    
    public void actionPerformed(ActionEvent evt)//action
    {
      if(stu_register_jbutton.isSelected())
          {
              teacher_register_button.setSelected(false);// if Select Stu Radio Button ... Teacher is unselected
             System.out.println("You Select Studnet");
          }
      if(teacher_register_button.isSelected())
          {
              stu_register_jbutton.setSelected(false);
              System.out.println("You  Select teacher");
          }


        if( evt.getSource()==register)
           {
         
               if(stu_register_jbutton.isSelected())
                    {
            
                         class student_register_controller extends data_segment // This  class Create for Sturegister Data Handel
                           {
                           void run()
                           {

                               if(stu_register_array.containsKey(id_filed.getText()))
                               {

                                class  error_massage {//Error Message
                                    JFrame f;  
                                   void run(){ 
                                    //String text = "<html><h4 style='color:blue;background-color:#a2beeb;'> this ID===> "+id_filed.getText()+" is register Success </h4></html>"; 
                                        f=new JFrame(); 
                                        JOptionPane.showMessageDialog(f,"<html><p style='color:red;'>Student Id Already Exist .. Try Again</p></html>");  
                                    }  
                                  }
    
                                  error_massage o = new error_massage();
                                  o.run();// success Massage End
                                   

                               }

                            else if(id_filed.getText().isBlank() || user_field.getText().isBlank()|| password_field.getText().isBlank())
                               {

                                class  error_massage {//Error Message
                                    JFrame f;  
                                   void run(){ 
                                    //String text = "<html><h4 style='color:blue;background-color:#a2beeb;'> this ID===> "+id_filed.getText()+" is register Success </h4></html>"; 
                                        f=new JFrame(); 
                                        JOptionPane.showMessageDialog(f,"<html><p style='color:red;'>Fill up Every input Flied</p></html>");  
                                    }  
                                  }
    
                                  error_massage o = new error_massage();
                                  o.run();// success Massage End
                                            

                               }


                               else{
                                  System.out.print("Studnet register is Trigger");
                                  String id = id_filed.getText();
                                  String username = user_field.getText();
                                  String password=  password_field.getText();
                                  stu_id_values.add(0,username);
                                  stu_id_values.add(1,password);
                                  stu_register_array.put(id,stu_id_values);
                                  System.out.println(stu_register_array);

                                  class  Success_massage {//success Message
                                    JFrame f;  
                                   void run(){ 
                                    String text = "<html><h4 style='color:blue;background-color:#a2beeb;'> this ID===> "+id_filed.getText()+" is register Success </h4></html>"; 
                                        f=new JFrame(); 
                                        JOptionPane.showMessageDialog(f,text);  
                                    }  
                                  }
    
                                  Success_massage o = new Success_massage();
                                  o.run();// success Massage End
                               }



                            }


                          }

                         student_register_controller s = new student_register_controller();
                          s.run();
           
                     }




                 else if(teacher_register_button.isSelected())
                  {
                     class teacher_register_object extends data_segment
                      {
                        void run()
                        {
                           if(teacher_register_array.containsKey(id_filed.getText()))
                           {
                            class  error_massage {//Error Message
                                JFrame f;  
                               void run(){ 
                                //String text = "<html><h4 style='color:blue;background-color:#a2beeb;'> this ID===> "+id_filed.getText()+" is register Success </h4></html>"; 
                                    f=new JFrame(); 
                                    JOptionPane.showMessageDialog(f,"<html><p style='color:red;'>Teacher Id Already Exist .. Try Again</p></html>");  
                                }  
                              }

                              error_massage o = new error_massage();
                              o.run();// success Massage End
                               
                           }
                           else if(id_filed.getText().isBlank() || user_field.getText().isBlank()|| password_field.getText().isBlank())
                               {

                                class  error_massage {//Error Message
                                    JFrame f;  
                                   void run(){ 
                                    //String text = "<html><h4 style='color:blue;background-color:#a2beeb;'> this ID===> "+id_filed.getText()+" is register Success </h4></html>"; 
                                        f=new JFrame(); 
                                        JOptionPane.showMessageDialog(f,"<html><p style='color:red;'>Fill up Every input Flied</p></html>");  
                                    }  
                                  }
    
                                  error_massage o = new error_massage();
                                  o.run();// success Massage End
                                            

                               }

                           else{ 
                            teacher_id_values.add(0,user_field.getText());
                            teacher_id_values.add(1,password_field.getText());
                            teacher_register_array.put(id_filed.getText(),teacher_id_values);
                            System.out.println(teacher_register_array);

                            class  Success_massage {//success Message
                                JFrame f;  
                               void run(){ 
                                String text = "<html><h4 style='color:blue;background-color:#a2beeb;'> this ID===> "+id_filed.getText()+" is register Success </h4></html>"; 
                                    f=new JFrame(); 
                                    JOptionPane.showMessageDialog(f,text);  
                                }  
                              }

                              Success_massage o = new Success_massage();
                              o.run();// success Massage End
                           }
                           
                          
                        }
                       
                    }

                    
                 teacher_register_object t = new teacher_register_object();
                 t.run();
                  
                }
               
            }

          

          
    }

  
}

