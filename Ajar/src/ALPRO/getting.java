/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ALPRO;

import java.util.Scanner;

/**
 *
 * @author Tak Bertuan
 */
public class getting {
    public static void main(String[] args) {
        int a [] = {2, 5, 6, 3, 9};
        Scanner inp = new Scanner (System.in);
        
        System.out.print("Nilai: ");
        int b = inp.nextInt();
        boolean isFound = false;
        
        for (int i = 0; i < a.length; i++) {
            if (b == a[i]) {
                isFound = true;
                System.out.println("Di index: " + i);
            }
        }
        if (isFound == false) {
                System.out.println("tidak ada data");
            }
    }
}
