/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_6;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Overload {
        double a, b, c, d, x1, x2;
        
//public Overload(){}
   
public void tampilAkar(){
        System.out.println("Nilai Determinenya Adalah: "+d);
        System.out.println("Tidak mempunyai akar nyata/real");
}
public void tampilAkar(double x1){
        x1 = -b/(2*a);
        this.x1 = x1;
        System.out.println("Nilai Determinenya Adalah: "+d);
        System.out.println("Akarnya tunggal yakni : "+this.x1);
}
public void tampilAkar(double x1, double x2){
        x1 = (-b + Math.sqrt(d))/ (2*a);
        x2 = (-b - Math.sqrt(d))/ (2*a);
        this.x1 = x1; this.x2 = x2;
        System.out.println("Nilai Determinenya Adalah: "+d);
        System.out.println("Akar pertama : "+this.x1);
        System.out.println("Akar kedua   : "+this.x2);
}

public static void main(String [] args){
        Scanner bie = new Scanner(System.in);
        Overload obj1 = new Overload();
        double a, b, c, d, x1 = 0, x2 = 0;
        
        System.out.print(" Koefisien x2 (a) : ");
            a = bie.nextDouble();
            obj1.a = a;
        System.out.print(" Koefisien x (b)  : ");
            b = bie.nextDouble();
            obj1.b = b;
        System.out.print(" Konstanta (c)    : ");
            c = bie.nextDouble();
            obj1.c = c;
            
            d = b * b - (4 * a * c);
            obj1.d = d;
            if (d < 0){
                obj1.tampilAkar();
            } else if ( d == 0){
                obj1.tampilAkar(x1);
            } else if (d > 0){
                obj1.tampilAkar(x1, x2);
            }       
}
}
