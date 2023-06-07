package streamIO;

/*
    Introduction to OOP with Java 4th Ed, McGraw-Hill

    Wu/Otani

    Chapter 12 Sample Program: Illustrate the use of Scanner to input textfile

    File: Ch12TestScanner.java
*/

import java.util.*;
import java.io.*;

class Ch12TestScanner {

    public static void main (String args[]) throws FileNotFoundException,
                                                   IOException {

        //open the Scanner

        Scanner scanner = new Scanner(new File("sample3.data"));

//        //get integer
//        int i = scanner.nextInt();
//
//        //get integer
//        long l = scanner.nextLong();
//
//        //get float
//        float f = scanner.nextFloat();

        //get double
        double d = scanner.nextDouble();

        //get char
        char c = scanner.next().charAt(0);

        //get boolean
        boolean b = scanner.nextBoolean();

//        System.out.println(i);
//        System.out.println(l);
//        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);

        //input done, so close the scanner
        scanner.close();
   }
}