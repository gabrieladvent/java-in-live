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

public class ctMenu {
    JMenu menu, submenu;  
    JMenuItem i1, i2, i3, i4, i5;  
    ctMenu(){  
        JFrame f = new JFrame("Contoh Menu dan Menu Item");  
        JMenuBar mb = new JMenuBar();  
        menu = new JMenu("Menu");  
        submenu = new JMenu("Sub Menu");  
        i1 = new JMenuItem("Item 1");  
        i2 = new JMenuItem("Item 2");  
        i3 = new JMenuItem("Item 3");  
        i4 = new JMenuItem("Item 4");  
        i5 = new JMenuItem("Item 5");  
        menu.add(i1); menu.add(i2); menu.add(i3);  
        submenu.add(i4); submenu.add(i5);  
        menu.add(submenu);  
        mb.add(menu);  
        f.setJMenuBar(mb);  
        f.setSize(400,200);  
        f.setLayout(null);  
        f.setVisible(true);  
    }  
public static void main(String args[])  
    {  
        new ctMenu();  
    }    
}
