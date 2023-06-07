/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_8;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class nomor4 {
public static void main(String[] args) {
        Scanner bie = new Scanner(System.in);
        double a, b, c, x, y = 0, D, x1, x2, i;
    
        do {
                System.out.print("Masukan nilai koefisien x2: ");
                a = bie.nextDouble();
                System.out.print("Masukan nilai koefisien x  : ");
                b = bie.nextDouble();
                System.out.print("Masukan nilai konstanta    : ");
                c = bie.nextDouble();
    
                D = Math.pow(b, 2) - (4 *a *c);
                        if (D <= 0) {
                                System.out.println("Hasilnya: "+D);
                                System.out.println("Semestinya D > 0");
                                System.out.println("Karena itu, harap mengisi nilai ulang\n");
                        }
        } while (D <= 0);
        
        x2 = ((-b) + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        x1 = ((-b) - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    
        System.out.println("Dari persamaan y       = "+a+"x2 + "+b+"x + "+c);
        System.out.println("Akar-akarnya adalah = "+x1+" dan "+x2);
        System.out.println("Nilai y untuk beberapa x antara kedua akar adalah  = ");
    
        System.out.println("------------------------------------------------------------");
        System.out.println("x         y = "+a+"x2 + "+b+"x + "+c);
        System.out.println("------------------------------------------------------------");
    
        for (i = x1; i <= x2; i += 0.25) {
        x = D;
                if (x > 0) {
                        y = (a * (Math.pow(i, 2))) + 4 * a * c;
                       System.out.println(+i+ "          "+y);
                }
        }
            
}
}
