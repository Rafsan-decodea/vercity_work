import javax.swing.*;
import java.awt.*;


class login  {
    public static  JLabel Banner_label,id_label,username_label,password_label;
    public static  JTextField id_filed ,user_field,password_field;
    public static JFrame jframe2 = new JFrame();
    public static JPanel jpanel2 = new JPanel();
      void login()
      {
        
        jframe2.setSize(400,300);
        jframe2.setDefaultCloseOperation(jframe2.HIDE_ON_CLOSE);
        jframe2.add(jpanel2);
        jpanel2.setLayout(null);
       
        
        Banner_label = new JLabel();
        Banner_label.setText("<html><h3 style='color:green;background-color:#a2beeb;'>==Welcome Studnet Login Panel==</h3></html>");
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



        
        // user_input = new JTextField();
        // user_input.setBounds(100,20,165,25);
        // jpanel.add(user_input);


        jframe2.setVisible(true);
      }

  
}