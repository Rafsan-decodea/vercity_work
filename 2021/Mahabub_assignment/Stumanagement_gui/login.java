import javax.swing.*;
import java.awt.*;


class login  {
    public static  JLabel Banner_label;
    public static JFrame jframe2 = new JFrame();
    public static JPanel jpanel2 = new JPanel();
      void login()
      {
        
        jframe2.setSize(400,450);
        jframe2.setDefaultCloseOperation(jframe2.HIDE_ON_CLOSE);
        jframe2.add(jpanel2);
        jpanel2.setLayout(null);
       
        Banner_label = new JLabel();
        Banner_label.setText("<html><p style='color:green;background-color:#a2beeb;'>==Welcome Studnet Management System==</p></html>");
        Banner_label.setBounds(20, 0, 300, 20);
        jpanel2.add(Banner_label);

        jframe2.setVisible(true);
      }

  
}