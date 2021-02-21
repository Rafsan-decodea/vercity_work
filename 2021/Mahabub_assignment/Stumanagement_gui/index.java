import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class main_gui {
    
    public static  JTextArea Banner_label;
    public static  JTextField user_input ;
    public static JPasswordField user_password ;
    public static  JButton login,register;
    public static JFrame jframe = new JFrame();
    public static JPanel jpanel = new JPanel();
    
       void gui()
    {
        
        
        jframe.setSize(300,150);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.add(jpanel);
        jpanel.setLayout(null);
        frist_panel user= new frist_panel();
        user.Panel();
        jframe.setVisible(true);
    }
}


class frist_panel  extends main_gui  implements ActionListener  {

   

     void  Panel() {
        
     
        Banner_label= new JTextArea();
        Banner_label.setText("==Welcome Studnet Management System==");
        Banner_label.setBounds(10, 0, 250, 20);
        jpanel.add(Banner_label);
        
        login = new JButton("login");
        login.setBounds(10,40,100,50);//hight , Width 
        jpanel.add(login);
        register= new JButton("register");
        register.setBounds(150,40,100,50);
        jpanel.add(register);
        
        login.addActionListener(this);
        register.addActionListener(this);
        


      
        

        // user_input = new JTextField();
        // user_input.setBounds(100,20,165,25);
        // jpanel.add(user_input);
        
        // password_label = new JLabel("password");
        // password_label.setBounds(10,50,80,25);
        // jpanel.add(password_label);

        // user_password = new JPasswordField();
        // user_password.setBounds(100,50,165,25);
        // jpanel.add(user_password);
        

        // button = new JButton("login");
        // button.setBounds(10,80,80,25);
        // button.addActionListener(new index());
        // jpanel.add(button);

       }

    public void actionPerformed(ActionEvent evt) {
        //  String usr = user_input.getText();
        //  String pass = user_password.getText();
        //  System.out.print(usr+" "+pass);
     if(evt.getSource()==login)
     {
         System.out.print("button 1");
     }
     if(evt.getSource()==register)
     {
         System.out.print("button 2");
     }

    }



}




class index
{
    
    public static void main(String[] args) {
        main_gui gui = new main_gui();
        gui.gui();
    }
}