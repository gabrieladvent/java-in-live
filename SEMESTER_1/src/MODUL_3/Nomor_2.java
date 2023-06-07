/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_3;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Nomor_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double f, x;
        System.out.print("Nilai x: ");
        x = input.nextDouble();
        f = 5 + (6 * x) + (8 * (Math.pow(x,2))) + (9 * (Math.pow(x,3))) + (5  * (Math.pow(x,4)));
        System.out.println("Nilai Fungsi f(x) :"+f);
        
        
    }
    
}
