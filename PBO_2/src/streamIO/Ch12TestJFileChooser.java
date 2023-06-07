package streamIO;

/*
    Introduction to OOP with Java 4th Ed, McGraw-Hill

    Wu/Otani

    Chapter 12 Sample Program: Illustrate the use of the
                                JFileChooser and File classes.

    File: TestJFileChooser.java
*/
import java.io.*;
import javax.swing.*;

class Ch12TestJFileChooser {

    public static void main (String[] args) {

        JFileChooser chooser;
        File         file, directory;
        int          status;

        chooser = new JFileChooser( );
        //chooser = new JFileChooser(System.getProperty("user.dir"));
        //chooser = new JFileChooser("N:/Programs");


        // status = chooser.showDialog(null,"Run"); //Customized label

        // Filter only .java files
        chooser.setFileFilter(new JavaFilter());

        status = chooser.showOpenDialog(null);

        if (status == JFileChooser.APPROVE_OPTION) {
            file      = chooser.getSelectedFile();
            directory = chooser.getCurrentDirectory();

            System.out.println("Directory: " +
                                directory.getName());

            System.out.println("File selected to open: " +
                                file.getName());

            System.out.println("Full path name: " +
                                file.getAbsolutePath());

        } else {
            JOptionPane.showMessageDialog(null, "Open File dialog canceled");
        }

        System.out.println("\n\n");

        status = chooser.showSaveDialog(null);

        if (status == JFileChooser.APPROVE_OPTION) {
            file      = chooser.getSelectedFile();
            directory = chooser.getCurrentDirectory();

            System.out.println("Directory: " +
                                 directory.getName());

            System.out.println("File selected for saving data: " +
                                 file.getName());

            System.out.println("Full path name: " +
                                file.getAbsolutePath());
        } else {
            JOptionPane.showMessageDialog(null, "Save File dialog canceled");
        }
    }
}