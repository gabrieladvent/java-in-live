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
import java.awt.Color;
import javax.swing.*;

public class ctJTextField {
public static void main(String args[])  
    {  
    JFrame f = new JFrame("Contoh TextField");  
    JTextField t1,t2;  
    t1 = new JTextField("Selamat Datang di Kuliah PBO2.");  
    t1.setBounds(30,50, 400,30);  
    t2 = new JTextField("Tutorial GUI");  
    t2.setBounds(30,20, 400,30);  
    f.add(t1); f.add(t2);  
    f.setSize(500,150);  
    f.setLayout(null);  
    f.setVisible(true);
    }      
}
