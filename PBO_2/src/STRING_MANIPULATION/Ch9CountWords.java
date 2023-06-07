/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package STRING_MANIPULATION;

/**
 *
 * @author ACER
 */
import java.util.*;
import javax.swing.JOptionPane;

class Ch9CountWords {
    private static final char BLANK = ' ';
    public static void main (String[] args) {
        int     index, wordCount, numberOfCharacters;
        String sentence = JOptionPane.showInputDialog("Enter a sentence: ");
        numberOfCharacters  = sentence.length( );
        index               = 0;
        wordCount           = 0;
        while ( index < numberOfCharacters ) {
            while (index < numberOfCharacters &&
                   sentence.charAt(index) == BLANK) {
                index++;
            }
            while (index < numberOfCharacters &&
                   sentence.charAt(index) != BLANK) {
                index++;
            }
            wordCount++;
        }
        System.out.println( "\nInput sentence: " + sentence );
        System.out.println( "    Word count: " + wordCount + " words" );
    }
}