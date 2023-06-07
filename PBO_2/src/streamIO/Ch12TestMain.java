package streamIO;

import javax.swing.*;
import java.io.*;

class Ch12TestMain {
    
    public static void main(String[] arg) {
        
        System.out.println(System.getProperty("user.dir"));
        
        File inFile = new File("sample.data");
        
        if (inFile.exists()) {
            JOptionPane.showMessageDialog(null, "Exists");
            
        } else {
            
            JOptionPane.showMessageDialog(null, "Doesn't Exist");
            
        }       
        
    }
}