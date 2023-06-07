/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamIO;

/**
 *
 * @author SriHartatiWijono
 */
import java.io.*;

public class WriteDataDemo {
    
    /** Creates a new instance of WriteDataDemo */
    public WriteDataDemo() {
    }
    
    public static void main(String[] args) throws IOException {
        // write the data out with FileOutputStream
        // buat file
        File outputFile = new File("latihan.txt");
        // buka stream
        FileOutputStream out = new FileOutputStream(outputFile);
        // sediakan data string
        String testOutput ="This is an exercise to write data to a file with FileOutputStream";
        /* Cara 1 : tulis data ke stream
        for(int i=0;i<testOutput.length();i++){
            out.write((byte)testOutput.charAt(i));
        }
        */
        /*Cara 2  : tulis data ke stream*/
        out.write(testOutput.getBytes());
        // tutup stream
        out.close();
    }
}

