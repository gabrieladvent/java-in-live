/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_7;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class nomor1 {
    public static void main(String[] args) {
        Scanner bie = new Scanner(System.in);
        double a, b, c, x1, x2, rumus;
        
        do {
            System.out.print("Silahkan memasukan angka koefisien X2: "); 
            a = bie.nextDouble();
                if (a <= 0) {
                    System.out.println("Silahkan masukan ulang \nDiharapkan memasukan bilangan di atas angka 0");
                }
        } while (a <= 0); /* koefisien X2 mesti diisi dengan 
        bilangan yang lebih besar dari 0. karena jika tidak, maka perintah menginpur X2 akan terus berjalan */
        
        System.out.print("Masukan nilai koefisien x: ");
        b = bie.nextDouble();
        System.out.print("Masukan bilangan konstanta: ");
        c = bie.nextDouble();
        
        rumus = b * b - ( 4 * a * c);
        
            if (rumus < 0 || a == 0) {
                System.out.println("Tidak mempunyai akar nyata");
            }
            else if (rumus == 0) {
                x1 = -b / (2 * a);
                System.out.println("Akarnya adalah akar tunggal, yakni: "+x1);
            }
            else {
                x1 = (-b + Math.sqrt(rumus)) / (2 * a);
                x2 = (-b - Math.sqrt(rumus)) / (2 * a);
                System.out.println("Akar pertama: "+x1);
                System.out.println("Akar kedua: "+x2);
            }
        
    }
}
