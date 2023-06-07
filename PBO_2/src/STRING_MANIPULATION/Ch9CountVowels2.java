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

class Ch9CountVowels2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String    name, nameUpper;
        int       numberOfCharacters,
                  vowelCount = 0;
        char       letter;
        System.out.print("What is your name?");
        name = scanner.nextLine();
        numberOfCharacters = name.length();
        nameUpper = name.toUpperCase();
        for (int i = 0; i < numberOfCharacters; i++) {
            letter = nameUpper.charAt(i);
            if ( letter == 'A' ||
                 letter == 'E' ||
                 letter == 'I' ||
                 letter == 'O' ||
                 letter == 'U'     ) {
                vowelCount++;
            }
        }
        System.out.println(name + ", your name has " +
                           vowelCount + " vowels" );
    }
}
