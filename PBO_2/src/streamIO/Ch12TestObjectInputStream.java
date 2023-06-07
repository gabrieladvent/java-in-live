package streamIO;

/*
    Introduction to OOP with Java 4th Ed, McGraw-Hill

    Wu/Otani

    Chapter 12 Sample Program: Illustrate the use of ObjectInputStream

    File: Ch12TestObjectInputStream.java
*/

import java.io.*;

class Ch12TestObjectInputStream {

    public static void main (String[] args) throws ClassNotFoundException,
                                                   IOException {

        //setup file and stream
        File              inFile  = new File("objects.dat");

        FileInputStream   inFileStream
                                  = new FileInputStream(inFile);

        ObjectInputStream inObjectStream
                                  = new ObjectInputStream(inFileStream);

        //read the Person objects from a file
        Person[] person=new Person[10];
 
            person = (Person[]) inObjectStream.readObject();
       for (int i = 0; i < 10; i++) {
            System.out.println(person[i].getName() + "     " +
                               person[i].getAge()  + "     " +
                               person[i].getGender());
        }

        //input done, so close the stream
        inObjectStream.close();
   }
}