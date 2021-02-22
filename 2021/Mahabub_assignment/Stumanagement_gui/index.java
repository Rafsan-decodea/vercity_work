import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.Border;

class data_segment
{
    public static  HashMap<String, ArrayList<String>> stu_register_array = new HashMap<String, ArrayList<String>> ();
	public static  HashMap<String,ArrayList<String>> teacher_register_array = new HashMap<String,ArrayList<String>>();
    public  	ArrayList<String> stu_id_values = new ArrayList<String>();
    public  	ArrayList<String> teacher_id_values = new ArrayList<String>();

}




class main_gui {
    
    public static  JLabel Banner_label;
    public static  JTextField user_input ;
    public static JPasswordField user_password ;
    public static  JButton login,register;
    public static JFrame jframe = new JFrame();
    public static JPanel jpanel = new JPanel();
    
       void gui()
    {
        
        
        jframe.setSize(300,200);
        jframe.setDefaultCloseOperation(jframe.HIDE_ON_CLOSE);
        jframe.add(jpanel);
        jpanel.setLayout(null);
        frist_panel user= new frist_panel();
        user.Panel();
        jframe.setVisible(true);
    }
}


class frist_panel  extends main_gui  implements ActionListener  {

   

     void  Panel() {
        
     
        Banner_label = new JLabel();
        Banner_label.setText("<html><div style='color:green;background-color:#a2beeb;'><h3 style='color:red;'> Group Lab | 8</h3> <br><pre>==Welcome Studnet Management System== </pre></div></html>");
        Banner_label.setBounds(10, 0, 500, 100);
        jpanel.add(Banner_label);
    
        String login_str = String.format("<html><p style='color:red;'>logine</p></html>");
        login = new JButton(login_str);
        login.setBounds(10,100,100,50);//hight , Width 
        jpanel.add(login);


        String register_str = String.format("<html><p style='color:green;'>register</p></html>");
        register= new JButton(register_str);
        register.setBounds(150,100,100,50);
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
         login login = new login();
         login.login();
     }
     if(evt.getSource()==register)
     {
         register register = new register();
         register.register();
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