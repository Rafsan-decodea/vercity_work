import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;//for Action Listaner


class  student extends register implements ActionListener{

    public static JLabel Banner_label,id_label;
    public static  JButton see_details , update_details,log_out;
    public static JFrame jframe4 = new JFrame();
    public static JPanel jpanel4 = new JPanel();
    public  String id;
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
            JFrame new_jframe4 = new JFrame();
            JPanel new_jpanel4 = new JPanel();
           void run(){ 
             
            student student = new student();
            
             new_jframe4.setSize(300,400);
             new_jframe4.setDefaultCloseOperation(jframe4.HIDE_ON_CLOSE);
             new_jframe4.add(new_jpanel4);
             new_jpanel4.setLayout(null);
             String id = "[+] Your id is ====>"+student.id;
             ArrayList<String> all_stu_data = stu_register_array.get(id);
             String name = "[+] Your name is ===>"+all_stu_data.get(2);
             String father_name ="[+] You father Name is===>"+all_stu_data.get(3);
             String mother_name = "[+] You Mother name is ==>"+all_stu_data.get(4);
             String birth = "[+] You Date of Birth ===>"+all_stu_data.get(5);
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

class  input_student extends main_gui
{

    public static JLabel Banner_label, Banner_label2,id_label;
    public static  JButton see_details , update_details,log_out;
    public static JFrame jframe5 = new JFrame();
    public static JPanel jpanel5 = new JPanel();
     void run()
     {
      jframe5.setSize(300,400);
      jframe5.setDefaultCloseOperation(jframe5.DISPOSE_ON_CLOSE);
      jframe5.add(jpanel5);
      jpanel5.setLayout(null);

        Banner_label = new JLabel();
        Banner_label.setText("<html><p style='color:white; background-color:green;'>=========Login Succes ==============</p></html>");
        Banner_label.setBounds(5, 0, 500, 50);
        jframe5.add(Banner_label);
        Banner_label2 = new JLabel();
        Banner_label2.setText("<html><p style='color:white; background-color:green;'>=========Add You Whole Details==============</p></html>");
        Banner_label2.setBounds(5, 10, 500, 50);
        jframe5.setVisible(true);
 

     }

}