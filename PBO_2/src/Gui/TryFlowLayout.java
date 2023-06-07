/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

/**
 *
 * @author ACER
 */
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Container;
import java.awt.FlowLayout;
public class TryFlowLayout {
  static JFrame aWindow = new JFrame("This is a Flow Layout"); 
  public static void main(String[] args) {
    Toolkit theKit = aWindow.getToolkit();         
    Dimension wndSize = theKit.getScreenSize();   
    aWindow.setBounds(wndSize.width/4, wndSize.height/4, wndSize.width/2, wndSize.height/2);  
    aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    FlowLayout flow = new FlowLayout();            
    Container content = aWindow.getContentPane();  
    content.setLayout(flow); 
    for(int i = 1; i <= 6; i++)
      content.add(new JButton("Press " + i));      
    aWindow.setVisible(true); 
  }
}

