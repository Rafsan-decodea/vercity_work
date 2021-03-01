import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//for Action Listaner


class  student{

    public static JLabel Banner_label;
    public static  JButton see_details , update_details;
    public static JFrame jframe4 = new JFrame();
    public static JPanel jpanel4 = new JPanel();
     void run (String id)
     {
        jframe4.setSize(300,400);
        jframe4.setDefaultCloseOperation(jframe4.HIDE_ON_CLOSE);
        jframe4.add(jpanel4);
        jpanel4.setLayout(null);

        Banner_label = new JLabel();
        Banner_label.setText("<html><p style='color:green;'>=========Welcome To Student Panel==============</p></html>");
        Banner_label.setBounds(5, 0, 500, 50);
        jpanel4.add(Banner_label);
        
     
        see_details = new JButton("<html><p style='color:black;'>see Your Details</p></html>");
        see_details.setBounds(50,60,200,50);//hight , Width 
        jpanel4.add(see_details);

        update_details = new JButton("<html><p style='color:black;'>Update Your Details</p></html>");
        update_details.setBounds(50,120,200,50);//hight , Width 
        jpanel4.add(update_details);
        
        
        
       
        
       
        jframe4.setVisible(true);
        
     }
}