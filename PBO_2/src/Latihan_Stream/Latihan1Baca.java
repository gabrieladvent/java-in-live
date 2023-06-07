/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan_Stream;

/**
 *
 * @author Tak Bertuan
 */
import java.io.*;

public class Latihan1Baca {

   public static void main (String args[]) throws IOException {

     //setup file and stream
      File           inFile     = new File("Gab.data");
      FileReader     fileReader = new FileReader(inFile);
      BufferedReader bufReader  = new BufferedReader(fileReader);
      String kunci;
        String Tampilkan;
        int k;
      //baca dan tampilkan kunci
      kunci=bufReader.readLine();
       System.out.println(kunci);
      //baca dan tampilkan jawaban
       for (int i = 0; i < 2; i++) {
           System.out.println(bufReader.readLine());
           Tampilkan=bufReader.readLine();
           System.out.print(Tampilkan);
           k=0;
           for(int j=0;j<kunci.length();j++)
           {
               if(kunci.charAt(j) == Tampilkan.charAt(j))
                   k++;
           }
           System.out.println(" : "+k);
       }
      //input done, so close the stream
      bufReader.close();
   }
}
