/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package streamIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author My Windows
 */
public class TulisJawaban {
    public static void main (String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
      //setup file and stream
      File              outFile       = new File("jawaban.data");
      FileOutputStream  outFileStream = new FileOutputStream(outFile);
      PrintWriter       outStream     = new PrintWriter(outFileStream);

      //kunci jawaban
      System.out.println("Masukkan kunci jawaban");
      outStream.println(sc.next());
      //jawaban siswa
      
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukan nama :");
            outStream.println(sc.next());
            System.out.println("Masukan jawaban :");
            outStream.println(sc.next());
        }
      
      //output done, so close the stream
      outStream.close();
   }
}
