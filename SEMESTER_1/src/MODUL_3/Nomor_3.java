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
public class Nomor_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double X, U, O;
        double f;
        System.out.print("Nilai x: ");
        X = input.nextDouble();
        System.out.print("Nilai µ: ");
        U = input.nextDouble();
        System.out.print("Nilai σ: ");
        O = input.nextDouble();
        f = (1/(U * Math.sqrt(2 * 3.14))) * (Math.pow((-1.0 / 2.0) * ((X - U) / O), 2));
        System.out.println("Hasil Distribusi adalah :"+f);
        
    }
    
    
}
