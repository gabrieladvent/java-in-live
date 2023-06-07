/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_4;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class lebihBesar {
    public static void main(String[] args) {
        Scanner bil = new Scanner(System.in);
        int A, B;
        
        System.out.print("Nilai A: ");
        A = bil.nextInt();
        System.out.print("Nilai B: ");
        B = bil.nextInt();
                
        if (A > B) {
            System.out.println(A+" adalah angka terbesar"); 
        } else {
            System.out.println(B+" adalah angka terbesar");
          
        }   
    }
}
