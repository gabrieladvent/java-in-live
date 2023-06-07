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
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ch9MatchJavaIdentifier2 {
    private static final String STOP    = "STOP";
    private static final String VALID   = "Valid Java identifier";
    private static final String INVALID = "Not a valid Java identifier";
    private static final String VALID_IDENTIFIER_PATTERN = "[a-zA-Z][a-zA-Z0-9_$]*";
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str, reply;
        Matcher  matcher;
        Pattern  pattern = Pattern.compile(VALID_IDENTIFIER_PATTERN);
        while (true) {
            System.out.print("Identifier: ");
            str = scanner.next();
            if (str.equals(STOP)) break;
            matcher = pattern.matcher(str);
            if (matcher.matches()) {
                reply = VALID;
            } else {
                reply = INVALID;
            }
            System.out.println(str + ": " + reply + "\n");
        }
    }
}
