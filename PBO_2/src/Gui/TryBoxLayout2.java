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
import javax.swing.*; 
import java.awt.*; 
import javax.swing.border.*; 
public class TryBoxLayout2 {
  static JFrame aWindow = new JFrame("This is a Box Layout"); 
  public static void main(String[] args) {
    Box left = Box.createVerticalBox(); 
    JPanel leftPanel = new JPanel(new BorderLayout());
    leftPanel.setBorder(new TitledBorder(new EtchedBorder(), "Line Color"));
    leftPanel.add(left, BorderLayout.CENTER);
    Box right = Box.createVerticalBox();
    JPanel rightPanel = new JPanel(new BorderLayout());
    rightPanel.setBorder(new TitledBorder(new EtchedBorder(), "Line Properties"));   
    rightPanel.add(right, BorderLayout.CENTER);
    Box top = Box.createHorizontalBox();
    top.add(leftPanel);
    top.add(Box.createHorizontalStrut(5));         
    top.add(rightPanel);
    JPanel bottomPanel = new JPanel();
    bottomPanel.setBorder(new CompoundBorder(BorderFactory.createLineBorder(Color.black, 1),         
           BorderFactory.createBevelBorder(BevelBorder.RAISED)));  
    Container content = aWindow.getContentPane();  
    BoxLayout box = new BoxLayout(content, BoxLayout.Y_AXIS); 
    content.setLayout(box);         
    content.add(top);
    content.add(bottomPanel);
    aWindow.setSize(400, 400);
    aWindow.setVisible(true); }
}

