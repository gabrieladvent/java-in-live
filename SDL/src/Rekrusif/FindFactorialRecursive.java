/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rekrusif;

/**
 *
 * @author ACER
 */
public class FindFactorialRecursive { //Contoh 1
public static int findFactorial(int number) {
        if ((number == 1) || (number == 0)) {
            return 1;
        } else {
            return (number * findFactorial(number - 1));
        }
 }
public static void main(String args[]) {
        for (int i = 1; i < 10; i++) {
                System.out.println(i + "! = " + findFactorial(i));
        }
}
}
