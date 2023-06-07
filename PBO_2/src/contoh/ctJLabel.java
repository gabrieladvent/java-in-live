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
class LabelExample  
{  
public static void main(String args[])  
    {  
    JFrame f= new JFrame("Contoh JLabel");  
    JLabel l1,l2;  
    l1=new JLabel("Label Pertama.");  
    l1.setBounds(50,50, 100,30);  
    l2=new JLabel("Label Kedua");  
    l2.setBounds(50,100, 100,30);  
    f.add(l1); f.add(l2);  
    f.setSize(300,300);  
    f.setLayout(null);  
    f.setVisible(true);  
    }  
    }  
