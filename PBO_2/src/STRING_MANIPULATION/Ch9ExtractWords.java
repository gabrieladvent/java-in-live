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

class Ch9ExtractWords {
    private static final char BLANK = ' ';
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int       index,    numberOfCharacters,
                  beginIdx, endIdx;
        String    word, sentence;
        System.out.print("Input: ");
        sentence = scanner.nextLine();
        numberOfCharacters = sentence.length();
        index = 0;
        while ( index < numberOfCharacters ) {
            while (index < numberOfCharacters &&
                   sentence.charAt(index) == BLANK) {
                index++;
            }
            beginIdx = index;
            while (index < numberOfCharacters &&
                    sentence.charAt(index) != BLANK) {
                index++;
            }
            endIdx = index;
            if (beginIdx != endIdx) {
                word = sentence.substring( beginIdx, endIdx );
                System.out.println(word);
            }
        }
    }
}
