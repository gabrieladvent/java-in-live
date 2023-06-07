/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoh;

/**
 *
 * @author ACER
 */
import javax.swing.*;

public class  cont2{ //ctDialog
    	public static void main(String[] args) {
	JFrame frame = new JFrame("Gabriel Advent Batan_205314986");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.show();

	JOptionPane.showConfirmDialog(frame,
            "Contoh dialog konfirmasi ...",
            "Contoh Dialog",
            JOptionPane.OK_CANCEL_OPTION, 	//Jenis Tombol
            JOptionPane.QUESTION_MESSAGE);	//Icon
	}
    
}
