/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_2;

/**
 *
 * @author ACER
 */
public class JarakTempuh {
public static void main(String[] args) {
    System.out.println("Carilah nilai jarak yang ditempuh mobil");
    System.out.println("------------------------------------------");
    System.out.println("Jawab");
    
    double V0, a, t;
    double r;
    
    System.out.println("Diketahui:");
    V0 = 4;
    System.out.println("v0: "+V0);
    a = 10;
    System.out.println("a: "+a);
    t = 40;
    System.out.println("t: "+t);
    r = V0 * t + (1/2) * a * t * t; 
    System.out.println("Jadi jarak yang ditempuh mobil tersebut adalah :"+r+" kilometer");
}
    
    
}
