/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_5;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class SegitigaSemua {
    public static void main(String[] args) {
        Scanner gab = new Scanner(System.in);
        int a, b, c, sisi;
        
        System.out.print("Panjang sisi a: ");
        a = gab.nextInt();
        System.out.print("Masukan sisi b: ");
        b = gab.nextInt();
        System.out.print("Masukan sisi c: ");
        c = gab.nextInt();
        System.out.println("Masukan sisi terpanjang\nDengan pilihan:");
        System.out.println("1. a\n2. b\n3. c");
        System.out.print("Masukan pilihan: ");
        sisi = gab.nextInt();
        
        if (sisi == 1) {
            if ((c * c) == (b * b) + (a * a)) {
                 System.out.println("Segitiga siku-siku");
            } else if ((a == b) && (b == c)) {
                 System.out.println("Segitiga sama sisi");
            } else if ((a == b) || (b ==c)) {
                 System.out.println("Segitiga sama kaki");
            } else
                 System.out.println("Segitiga sembarang");
                    
            } else if (sisi == 2) {
                if ((c * c) == (b * b) + (a * a)) {
                 System.out.println("Segitiga siku-siku");
                } else if ((a == b) && (b == c)) {
                System.out.println("Segitiga sama sisi");
                } else if ((a == b) || (b ==c)) {
                System.out.println("Segitiga sama kaki");
                } else
                System.out.println("Segitiga sembarang");
            
            } else if (sisi == 3) {
                if ((c * c) == (b * b) + (a * a)) {
                 System.out.println("Segitiga siku-siku");
                } else if ((a == b) && (b == c)) {
                System.out.println("Segitiga sama sisi");
                } else if ((a == b) || (a ==c) || (b == c)) {
                System.out.println("Segitiga sama kaki");
                } else
                System.out.println("Segitiga sembarang");
            
            } else
                System.out.println("NO VALID!!");
        
    }
}
