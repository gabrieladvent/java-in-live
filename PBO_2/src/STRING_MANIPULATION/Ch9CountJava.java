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

class Ch9CountJava {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int       javaCount  = 0;
        String    word;
        while (true) {
            System.out.print("Next word: ");
            word = scanner.next();
            if ( word.equals("STOP") )   {
                break;
            } else if ( word.equalsIgnoreCase("Java") ) {
                javaCount++;
            }
        }
        System.out.println("'Java' count: " + javaCount );
    }
}
