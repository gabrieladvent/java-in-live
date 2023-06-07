package streamIO;

/*
    Introduction to OOP with Java 4th Ed, McGraw-Hill

    Wu/Otani

    Chapter 12 Sample Program: Illustrate the use of BufferedReader

    File: Ch12TestBufferedReader.java
*/

import java.io.*;

class Ch12TestBufferedReader {

   public static void main (String args[]) throws IOException {

     //setup file and stream
      File           inFile     = new File("sample3.data");
      FileReader     fileReader = new FileReader(inFile);
      BufferedReader bufReader  = new BufferedReader(fileReader);
      String str;

      //get integer
//      str = bufReader.readLine();
//      int i = Integer.parseInt(str);
//
//      //get long
//      str = bufReader.readLine();
//      long l = Long.parseLong(str);
//
//      //get float
//      str = bufReader.readLine();
//      float f = Float.parseFloat(str);

      //get double
      str = bufReader.readLine();
      double d = Double.parseDouble(str);

      //get char
      str = bufReader.readLine();
      char c = str.charAt(0);

      //get boolean
      str = bufReader.readLine();
      Boolean boolObj = new Boolean(str);
      boolean b = boolObj.booleanValue( );

//      System.out.println(i);
//      System.out.println(l);
//      System.out.println(f);
      System.out.println(d);
      System.out.println(c);
      System.out.println(b);

      //input done, so close the stream
      bufReader.close();
   }
}