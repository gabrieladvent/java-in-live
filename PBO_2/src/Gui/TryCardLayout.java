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
import javax.swing.JFrame; import javax.swing.JButton;
import java.awt.Toolkit; import java.awt.Dimension;
import java.awt.Container; import java.awt.CardLayout;
import java.awt.event.ActionEvent; import java.awt.event.ActionListener;
public class TryCardLayout {
  static JFrame aWindow = new JFrame("This is a CardLayout"); 
  public static void main(String[] args) {
    Toolkit theKit = aWindow.getToolkit();         
    Dimension wndSize = theKit.getScreenSize();    
    aWindow.setBounds(wndSize.width/4, wndSize.height/4, wndSize.width/2, wndSize.height/2);  
    aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    final CardLayout card = new CardLayout(300,180);            
    Container content = aWindow.getContentPane();  
    content.setLayout(card);                       
    JButton button;                                  
    for(int i = 1; i <= 6; i++) {
      content.add(button = new JButton("Press " + i), "card" + i); 
      button.addActionListener(new java.awt.event.ActionListener() {   
          public void actionPerformed(java.awt.event.ActionEvent evt) { card.next(aWindow.getContentPane()); }
      });
    }
    aWindow.setVisible(true);                      
  }
}

