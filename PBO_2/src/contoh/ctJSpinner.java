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

public class ctJSpinner {
    public static void main(String[] args) {    
        JFrame f=new JFrame("Contoh Spinner");    
        SpinnerModel value = new SpinnerNumberModel(5, //Nilai Awal  
                0, //Nilai Minimum  
                50, //Nilai Maksimum  
                5); //step  
    JSpinner spinner = new JSpinner(value);   
            spinner.setBounds(20,20,80,30);    
            f.add(spinner);    
            f.setSize(300,120);    
            f.setLayout(null);    
            f.setVisible(true);     
}  
    
}
