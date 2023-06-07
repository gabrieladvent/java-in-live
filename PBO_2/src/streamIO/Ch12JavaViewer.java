package streamIO;

/*
    Introduction to OOP with Java 4th Ed, McGraw-Hill

    Wu/Otani

    Chapter 12 Sample Program: Display a Java source file.

    File: Ch12JavaViewer.java
*/

/*
    This program uses the JavaFilter class to restrict the listing
    to Java source files in JFileChooser. The FileManager class is
    used to read the Java source file. The selected source file
    is displayed by using JOptionPane. NOTE: Open only small files. If
    the source file is long, the JOptionPane dialog expands beyond
    the top and bottom of the screen. If this happens, terminate
    the program from your Java IDE.
*/

import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

class Ch12JavaViewer {

	/** the content of file read */
	private String document;

//----------------------------------
//      Main method
//----------------------------------
    public static void main(String[] args) {
        Ch12JavaViewer viewer = new Ch12JavaViewer();
        viewer.start( );
    }

//----------------------------------
//    Constructors
//----------------------------------

    /**
     * Default constructor
     */
    public Ch12JavaViewer() {

    }


//-------------------------------------------------
//      Public Methods:
//
//
//------------------------------------------------

	/**
	 * The top-level method
	 *
	 */
	public void start( ) {

		if (openFile()) {
			//file is opened and document is read
			//correctly, so display it

			JOptionPane.showMessageDialog(null, document);
		}
    }


//-------------------------------------------------
//      Private Methods:
//
//
//------------------------------------------------


    /**
     * Let the end user select the Java source file
     * to open.
     */
    private boolean openFile( ) {

        JFileChooser chooser;
        int          status;

        chooser = new JFileChooser( );

        //Use the following statement to open the file chooser
        //at the directory this class is being executed

        //chooser = new JFileChooser(System.getProperty("user.dir"));
        chooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
        chooser.setFileFilter(new JavaFilter());

        status = chooser.showOpenDialog(null);

        if (status == JFileChooser.APPROVE_OPTION) {
            document =  readSource(chooser.getSelectedFile());

            return true;

        } else {
            JOptionPane.showMessageDialog(null, "Open File dialog canceled");

            return false;
        }
    }

    /**
     * Opens the selected file and displays the file content
     *
     * @param file the file to open
     *
     * @exception IOException
     */
    private String readSource(File file) {

		String doc = "";

        try {
            FileManager fm = new FileManager();

            doc = fm.openFile(file.getAbsolutePath());

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error in opening a file: \n"
                                            + e.getMessage());
        }

		return doc;
    }
}