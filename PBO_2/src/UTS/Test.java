/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

/**
 *
 * @author ACER
 */
import java.awt.*;
import javax.swing.*;

public class Test {
  public static void main(String[] args) {
    Component c = new JButton("OK");
    JFrame frame = new JFrame("My Frame");
    frame.add(c);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
} 

