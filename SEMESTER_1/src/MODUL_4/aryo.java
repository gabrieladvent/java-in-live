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
public class aryo {
    static double x1, x2, x3, y1, y2, y3;
    public static void main(String[] args) {  
    hitungLuas();
    }

     static void bacaTitik() {
       Scanner bie = new Scanner(System.in);
       System.out.print("Masukan nilai x1: ");
        x1 = bie.nextDouble();
       System.out.print("Masukan nilai x2: ");
        x2 = bie.nextDouble();
       System.out.print("Masukan nilai y1: ");
        y1 = bie.nextDouble();
       System.out.print("Masukan nilai y2: ");
        y2 = bie.nextDouble();
       System.out.print("Masukan nilai x3: ");
        x3 = bie.nextDouble();
       System.out.print("Masukan nilai y3: ");
        y3 = bie.nextDouble();
     }

    static double hitungJarak(double a1, double a2, double b1, double b2) {
        double sisi = Math.sqrt(Math.pow((a2 - a1),2) + Math.pow((b2 - b1), 2));
        System.out.println("Sisinya: "+sisi);
        return  sisi;
    }

    static double hitungKel(double a1, double a2, double a3, double b1, double b2, double b3) {
    return hitungJarak(a1, a2, b1, b2) +  hitungJarak(a2, a3, b2, b3) + hitungJarak(a3, a1, b3, b1);
    }

    static void hitungLuas() {
    bacaTitik();
    double s = hitungKel(x1, y1, x2, y2, x3, y3) / 2;
    double l = Math.sqrt(s * (s - hitungJarak(x1, y1, x2, y2)) * (s - hitungJarak(x2, x3, y2, y3)) * (s - hitungJarak(x3, x1, y3, y1)));
    
    System.out.println("Keliling segitiga = "+hitungKel(x1, y1, x2, y2, x3, y3)+" cm");
    System.out.println("Luas Segitiga = "+l+" cm");
    }
}
     
