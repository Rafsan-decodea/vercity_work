import javax.swing.*;


import java.awt.*;

class register 
{
    public static  JLabel Banner_label,id_label,username_label,password_label;
    public static  JTextField id_filed ,user_field,password_field;
    public static JFrame jframe3 = new JFrame();
    public static JPanel jpanel3 = new JPanel();
    void register()
    {
        jframe3.setSize(400,300);//width , higth
        jframe3.setDefaultCloseOperation(jframe3.HIDE_ON_CLOSE);
        jframe3.add(jpanel3);
        jpanel3.setLayout(null);
        
        Banner_label = new JLabel();//banner Label
        Banner_label.setText("<html><h3 style='color:green;background-color:#a2beeb;'>==Welcome Studnet Register Panel==</h3></html>");
        Banner_label.setBounds(50, 0, 400, 20);
        jpanel3.add(Banner_label);
    

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




   
        // user_input = new JTextField();
        // user_input.setBounds(100,20,165,25);
        // jpanel.add(user_input);

        jframe3.setVisible(true);
    }
}

