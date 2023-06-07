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

public class ctComboBox {
    JFrame f = new JFrame("Contoh ComboBox");;    
    ctComboBox(){    
    String country[] = {"Andreas","Herry","Matius","Yakobus","Markus","Filipus","Bartolomeus","Tomas","Tadeus","Paulus","Simon"};        
    JComboBox cb = new JComboBox(country);    
    cb.setBounds(20,20,300,20);    
    f.add(cb);        
    f.setLayout(null);    
    f.setSize(350,100);    
    f.setVisible(true);         
}    
public static void main(String[] args) {    
    new ctComboBox();         
}        
}
