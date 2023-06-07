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

public class ctSlider extends JFrame{
    public ctSlider() {  
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 150, 25);  
        JPanel panel = new JPanel();  
        panel.add(slider);  
        add(panel);  
}  
  
public static void main(String s[]) {  
        ctSlider frame = new ctSlider();  
        frame.pack();
        frame.setTitle("Contoh Slider");
        frame.setVisible(true);  
    }      
}
