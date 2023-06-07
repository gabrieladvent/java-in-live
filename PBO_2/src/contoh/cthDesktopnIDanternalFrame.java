/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoh;

/**
 *
 * @author ACER
 */
import java.awt.*;
import javax.swing.*;

public class cthDesktopnIDanternalFrame extends JFrame{ //cnth 5
  public cthDesktopnIDanternalFrame() {  
    CustomDesktopPane desktopPane = new CustomDesktopPane();  
    Container contentPane = getContentPane();  
    contentPane.add(desktopPane, BorderLayout.CENTER);  
    desktopPane.display(desktopPane);  
  
    setTitle("JDesktopPane Example");  
    setSize(300,350);  
    setVisible(true);  
  }  
  public static void  main(String args[])  
  {  
    new cthDesktopnIDanternalFrame();  
  }  
}  
class CustomDesktopPane extends JDesktopPane  
{  
  int numFrames = 3,  x = 30, y = 30;  
  public void display(CustomDesktopPane dp)   
  {  
    for(int  i = 0; i < numFrames ; ++i )   
    {  
      JInternalFrame jframe = new JInternalFrame("Internal Frame " + i ,  true, true, true, true);  
  
      jframe.setBounds(x, y, 230, 85);  
      Container c1 = jframe.getContentPane( ) ;  
      c1.add(new JLabel("I love my country"));  
      dp.add( jframe );  
      jframe.setVisible(true);         
      y += 85;  
    }  
  }      
}
