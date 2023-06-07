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

public class cProgress extends JFrame{
    JProgressBar jb;    
    int i = 0;
    int num = 0;     
    cProgress(){    
        jb = new JProgressBar(0,2000);    
        jb.setBounds(40,40,160,30);         
        jb.setValue(0);    
        jb.setStringPainted(true);    
        this.add(jb);    
        this.setSize(250,150);    
        this.setLayout(null);    
}    
public void iterate(){    
    while(i<=2000){    
        jb.setValue(i);    
        i = i+20;    
        try{Thread.sleep(150);}catch(InterruptedException e){}    
    }    
}    
public static void main(String[] args) {    
    cProgress m = new cProgress();    
        m.setTitle("Contoh Progess Bar");
        m.setVisible(true);    
        m.iterate();    
    }        
}
