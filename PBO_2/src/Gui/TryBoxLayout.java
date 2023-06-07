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
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Container;
import java.awt.BorderLayout;
import javax.swing.border.Border;
public class TryBoxLayout {
  static JFrame aWindow = new JFrame("This is a Box Layout");
  public static void main(String[] args) {
    Toolkit theKit = aWindow.getToolkit();       
    Dimension wndSize = theKit.getScreenSize(); 
    aWindow.setBounds(wndSize.width/4, wndSize.height/4,   
                      wndSize.width/2, wndSize.height/2);  
    aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Box left = Box.createVerticalBox();
    ButtonGroup radioGroup = new ButtonGroup();             
    JRadioButton rbutton;                                   
    radioGroup.add(rbutton = new JRadioButton("Red"));      
    left.add(rbutton);                                      
    radioGroup.add(rbutton = new JRadioButton("Green"));
    left.add(rbutton);
    radioGroup.add(rbutton = new JRadioButton("Blue"));
    left.add(rbutton);
    radioGroup.add(rbutton = new JRadioButton("Yellow"));
    left.add(rbutton);
    Box right = Box.createVerticalBox();
    right.add(new JCheckBox("Dashed"));
    right.add(new JCheckBox("Thick"));
    right.add(new JCheckBox("Rounded"));
    Box top = Box.createHorizontalBox();  
    top.add(left);
    top.add(right);
    JPanel bottomPanel = new JPanel();
    Border edge = BorderFactory.createRaisedBevelBorder();  
    JButton button;
    Dimension size = new Dimension(80,20);
    bottomPanel.add(button = new JButton("Defaults"));
    button.setBorder(edge);
    button.setPreferredSize(size);
    bottomPanel.add(button = new JButton("OK"));
    button.setBorder(edge);
    button.setPreferredSize(size);
    bottomPanel.add(button = new JButton("Cancel"));
    button.setBorder(edge);
    button.setPreferredSize(size);
    Container content = aWindow.getContentPane();    
    content.setLayout(new BorderLayout());           
    content.add(top, BorderLayout.CENTER);
    content.add(bottomPanel, BorderLayout.SOUTH);
    aWindow.setVisible(true);                        
  }
}

