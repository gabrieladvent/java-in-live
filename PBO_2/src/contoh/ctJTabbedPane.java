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
import javax.swing.*;

public class ctJTabbedPane { //cont4
    JFrame f;  
    ctJTabbedPane(){  
        f=new JFrame();  
        JTextArea ta=new JTextArea(200,200);  
        JPanel p1=new JPanel();  
        p1.add(ta);  
        JPanel p2=new JPanel();  
        JPanel p3=new JPanel();  
        JTabbedPane tp=new JTabbedPane();  
        tp.setBounds(10,10,200,200);  
        tp.add("main",p1);  
        tp.add("visit",p2);  
        tp.add("help",p3);    
        f.add(tp);  
        f.setTitle("Contoh TabbedPane");
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
    }  
public static void main(String[] args) {  
    new ctJTabbedPane();  
}    
}
