package streamIO;

/*
    Introduction to OOP with Java 4th Ed, McGraw-Hill

    Wu/Otani

    Chapter 12 Sample Program: Illustrate the use of PrintWriter

    File: Ch12TestDataInputStream.java
*/

import java.io.*;

class Ch12TestPrintWriter {

   public static void main (String[] args) throws IOException {

      //setup file and stream
      File              outFile       = new File("sample3.data");
      FileOutputStream  outFileStream = new FileOutputStream(outFile);
      PrintWriter       outStream     = new PrintWriter(outFileStream);

      //write values of primitive data types to the stream
//      outStream.println(987654321);
//      outStream.println(11111111L);
//      outStream.println(22222222F);
      outStream.println(3333333D);
      outStream.println('A');
      outStream.println(true);

      //output done, so close the stream
      outStream.close();
   }
}