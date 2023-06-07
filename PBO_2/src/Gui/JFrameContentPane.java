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
import java.awt.Container;
public class JFrameContentPane extends JFrame{
    public JFrameContentPane() {
      
        //contentPane dari JFrame
        Container contentPane = getContentPane();
        contentPane.add( new JButton("OK"));
        setSize( 400, 120 );
        setTitle("Try Contentpane");
    }
    public static void main(String args[ ]) {
        JFrameContentPane jf=new JFrameContentPane();
        jf.setVisible(true);
    }
}
