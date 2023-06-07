package streamIO;

/*
    Introduction to OOP with Java 4th Ed, McGraw-Hill

    Wu/Otani

    Chapter 12 Sample Program: Illustrate the use of BufferedReader

    File: Ch12TestBufferedReader.java
*/

import java.io.*;

class BacaJawaban {

   public static void main (String args[]) throws IOException {

     //setup file and stream
      File           inFile     = new File("jawaban.data");
      FileReader     fileReader = new FileReader(inFile);
      BufferedReader bufReader  = new BufferedReader(fileReader);
      String kunci;
        String Tampilkan;
        int k;
      //baca dan tampilkan kunci
      kunci=bufReader.readLine();
       System.out.println(kunci);
      //baca dan tampilkan jawaban
       for (int i = 0; i < 3; i++) {
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