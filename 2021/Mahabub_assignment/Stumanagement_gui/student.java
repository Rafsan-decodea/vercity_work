import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;//for Action Listaner
import java.awt.BorderLayout;

class  student extends register implements ActionListener{

    public static JLabel Banner_label,id_label;
    public static  JButton see_details , update_details,log_out;
    public static JFrame jframe4 = new JFrame();
    public static JPanel jpanel4 = new JPanel();
    public   String id;
     void run (String id)
     {
       this.id = id;

        jframe4.setSize(300,400);
        jframe4.setDefaultCloseOperation(jframe4.DISPOSE_ON_CLOSE);
        jframe4.add(jpanel4);
        jpanel4.setLayout(null);

        Banner_label = new JLabel();
        Banner_label.setText("<html><p style='color:white; background-color:green;'>=========Welcome To Student Panel==============</p></html>");
        Banner_label.setBounds(5, 0, 500, 50);
        jpanel4.add(Banner_label);
        
        id_label = new JLabel();
        id_label.setText("<html><p style='color:white; background-color:black;'>===========Your Logine id is ===>"+id+"==========</p></html>");
        id_label.setBounds(5, 15 , 500, 50);
        jpanel4.add(id_label);

        see_details = new JButton("<html><p style='color:black;'>see Your Details</p></html>");
        see_details.setBounds(50,60,200,50);//hight , Width 
        jpanel4.add(see_details);

        update_details = new JButton("<html><p style='color:black;'>Update Your Details</p></html>");
        update_details.setBounds(50,120,200,50);//hight , Width 
        jpanel4.add(update_details);
        
        
      //   log_out = new JButton("<html><p style='color:red;'>logOut</p></html>");
      //   log_out.setBounds(50,180,200,50);
      //   jpanel4.add(log_out);


        see_details.addActionListener(this);
        update_details.addActionListener(this);
       // log_out.addActionListener(this);


        jframe4.setVisible(true);
        
     }


     public void actionPerformed(ActionEvent evt) { //  Button Action Start From Here
    
       if(evt.getSource()==see_details)//This is Responsible For Student See
       {
          class student_inforamtion extends data_segment{
            JFrame new_jframe4 = new JFrame("You Details");
            JPanel new_jpanel4 = new JPanel();
           void run(){ 
             
            student student = new student();
            
             new_jframe4.setSize(300,200);
             new_jframe4.setDefaultCloseOperation(jframe4.HIDE_ON_CLOSE);
             new_jframe4.add(new_jpanel4);
             new_jpanel4.setLayout(null);
             ArrayList<String> all_stu_data = stu_register_array.get(id);
             String name = "[+] Your name is ===>"+all_stu_data.get(2);
             String father_name ="[+] You father Name is===>"+all_stu_data.get(3);
             String mother_name = "[+] You Mother name is ==>"+all_stu_data.get(4);
             String age = "[+] You Date of Birth ===>"+all_stu_data.get(5);
             String birth = "[+] You Birth Daya ====>"+all_stu_data.get(6);

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
           student_inforamtion student_inforamtion = new student_inforamtion();
           student_inforamtion.run();


       }

       else if(evt.getSource()==update_details)
       {

       }

      //  else if(evt.getSource()==log_out)
      //  {
          
      //     jframe4.hide();

      //  }
          

     
   }

}

class  input_student implements ActionListener
{
     

    public static JLabel Banner_label, Banner_label2,id_label, name_label,father_name_label,mother_name_label,age_label,birthdata_label;
    public static  JButton   enter;
    public static JTextField name,father_name,mother_name,age,birthday;
    public static JFrame jframe5 = new JFrame("You Frist Login");
    public static JPanel jpanel5 = new JPanel();
    public String id ;
     void run(String id)
     {

      this.id = id;
      

      jframe5.setSize(300,400);
      jframe5.setDefaultCloseOperation(jframe5.DISPOSE_ON_CLOSE);
      jframe5.add(jpanel5);
      jpanel5.setLayout(null);
      

        Banner_label = new JLabel();
        Banner_label.setText("<html><p style='color:white; background-color:green;'>===Login Succes (id ==> "+id+") ===</p></html>");
        Banner_label.setBounds(20, 0, 500, 50);
        jpanel5.add(Banner_label);

        Banner_label2 = new JLabel();
        Banner_label2.setText("<html><p style='color:white; background-color:black;'>===Add You Whole Details====</p></html>");
        Banner_label2.setBounds(20, 20 , 500, 50);
        jpanel5.add(Banner_label2);
       
        name_label = new JLabel("<html><h4 style='color:blue;background-color:#a2beeb;'>Name </h4></html>");
        name_label.setBounds(30,90,100,20);
        jpanel5.add(name_label);


        name = new JTextField();
        name.setBounds(120,90,100,20);
        jpanel5.add(name);


        father_name_label = new JLabel("<html><h4 style='color:blue;background-color:#a2beeb;'>Father Name </h4></html>");
        father_name_label.setBounds(30,110,100,20);
        jpanel5.add(father_name_label);


        father_name = new JTextField();
        father_name.setBounds(120,110,100,20);
        jpanel5.add(father_name);
        
        
        
        
        mother_name_label = new JLabel("<html><h4 style='color:blue;background-color:#a2beeb;'>mother Name </h4></html>");
        mother_name_label.setBounds(30,130,100,20);
        jpanel5.add(mother_name_label);


        mother_name = new JTextField();
        mother_name.setBounds(120,130,100,20);
        jpanel5.add(mother_name);



       
        age_label = new JLabel("<html><h4 style='color:blue;background-color:#a2beeb;'>Age</h4></html>");
        age_label.setBounds(30,150,100,20);
        jpanel5.add(age_label);


        age = new JTextField();
        age.setBounds(120,150,100,20);
        jpanel5.add(age);



        birthdata_label = new JLabel("<html><h4 style='color:blue;background-color:#a2beeb;'>Birthday</h4></html>");
        birthdata_label.setBounds(30,170,100,20);
        jpanel5.add(birthdata_label);


        birthday = new JTextField();
        birthday.setBounds(120,170,100,20);
        jpanel5.add(birthday);


        enter = new JButton("Enter");
        enter.setBounds(120,190,100,20);
        jpanel5.add(enter);

        enter.addActionListener(this);
        jframe5.setVisible(true);
 

     }


     public void actionPerformed(ActionEvent evt) {

          if(evt.getSource()==enter)
          {
               class enter_student extends data_segment
               {
                            
                      void run()
                      {
                          ArrayList<String> student_entry = stu_register_array.get(id);
                          student_entry.add(2,name.getText());
                          student_entry.add(3,father_name.getText());
                          student_entry.add(4,mother_name.getText());
                          student_entry.add(5,age.getText());
                          student_entry.add(6,birthday.getText());
                          stu_register_array.put(id,student_entry);
                          student  student  = new student();
                          student.run(id);

                      }
                
                

               }

               enter_student enter_student = new enter_student();
               enter_student.run();
          }

     }

}