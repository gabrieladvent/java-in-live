package streamIO;

/*
    Introduction to OOP with Java 4th Ed, McGraw-Hill

    Wu/Otani

    Chapter 12 Sample Program: Illustrate the use of ObjectOutputStream

    File: Ch12TestObjectOutputStream.java
*/

import java.io.*;

class Ch12TestObjectOutputStream {

    public static void main (String[] args) throws IOException {

        //setup the streams
        File               outFile  = new File("objects.dat");
        FileOutputStream   outFileStream
                                    = new FileOutputStream(outFile);
        ObjectOutputStream outObjectStream
                                    = new ObjectOutputStream(outFileStream);

        //write serializable Person objects one at a time
        Person[] person=new Person[10];
        for (int i = 0; i < 10; i++) {
            person[i] = new Person("Mr. Gab " + i, 20+i, 'M');
        }
            outObjectStream.writeObject(person);
        

        //output done, so close the stream
        outObjectStream.close();
   }
}