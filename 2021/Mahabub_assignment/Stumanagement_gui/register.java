import javax.swing.*;
import java.awt.*;

class register 
{
    public static  JLabel Banner_label;
    public static JFrame jframe3 = new JFrame();
    public static JPanel jpanel3 = new JPanel();
    void register()
    {
        jframe3.setSize(400,450);//width , higth
        jframe3.setDefaultCloseOperation(jframe3.HIDE_ON_CLOSE);
        jframe3.add(jpanel3);
        jpanel3.setLayout(null);
        
        Banner_label = new JLabel();
        Banner_label.setText("<html><p style='color:green;background-color:#a2beeb;'>==Welcome Studnet Management System==</p></html>");
        Banner_label.setBounds(50, 0, 300, 20);
        jpanel3.add(Banner_label);

        jframe3.setVisible(true);
    }
}

