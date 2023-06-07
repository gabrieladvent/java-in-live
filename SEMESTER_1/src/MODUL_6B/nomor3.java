/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_6B;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class nomor3 {
       public static void main(String[] args) {
        Scanner bie = new Scanner(System.in);
        int max, min, sel;
        System.out.println("TABEL KONVERSI CELCIUS KE REAMUR DAN FAHRENHEIT ");
        System.out.print("Masukan nilai minimal: ");
        min = bie.nextInt();
        System.out.print("Masukan nilai maksimal: ");
        max = bie.nextInt();
        System.out.print("Masukan selisih kenaikan: ");
        sel = bie.nextInt();
        System.out.println("==================================");
        System.out.println("Celsius | Reamur  | Fahrenheit");
        
        int C=0, R = 0, F = 0;
        while ((C >= min ) && (C <=max)) {
            R = (4 * C) / 5;
            F = (9 * C) / 5 + 32;
            System.out.println(C+"     |     "+R+"      |    "+F);
            C += sel; //C += Sel
        }
        System.out.println("==================================");
    } 
}
