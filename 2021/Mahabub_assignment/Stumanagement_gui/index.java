import java.awt.*;
import java.awt.event.*;
import java.util.jar.JarFile;

import javax.swing.*;
import javax.swing.plaf.ButtonUI;

class index implements ActionListener {

    public static  JLabel user_label;
    public static  JTextField user_input ;
    public static JLabel password_label;
    public static JPasswordField user_password ;
    public static  JButton button ;

    static void gui() {
        JFrame jframe = new JFrame();
        JPanel jpanel = new JPanel();
        jframe.setSize(100,100);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.add(jpanel);
        jpanel.setLayout(null);

        user_label = new JLabel("USer");
        user_label.setBounds(10,20,80,25);
        jpanel.add(user_label);

        user_input = new JTextField();
        user_input.setBounds(100,20,165,25);
        jpanel.add(user_input);
        
        password_label = new JLabel("password");
        password_label.setBounds(10,50,80,25);
        jpanel.add(password_label);

        user_password = new JPasswordField();
        user_password.setBounds(100,50,165,25);
        jpanel.add(user_password);

        button = new JButton("login");
        button.setBounds(10,80,80,25);
        button.addActionListener(new index());
        jpanel.add(button);

        jframe.setVisible(true);




    }

    public void actionPerformed(ActionEvent e) {
         String usr = user_input.getText();
         String pass = user_password.getText();
         System.out.print(usr+" "+pass);
    }

    public static void main(String[] args) {
        gui();
    }
}