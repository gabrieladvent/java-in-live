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
public class hambatan {

    private static int jenis;
    public static void main(String[] args) {
        System.out.println("Hitunglah besarnya hambatan (resitor) yang disusun seri dan pararel");
        System.out.println("jika yang diketahui adalah r1,r2, dan r3");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("jawab:");
        
        double r1, r2, r3;
        double rt;
        
        r1 = 5;
        System.out.println("r1: "+r1);
        r2 = 2;
        System.out.println("r2: "+r2);
        r3 = 10;
        System.out.println("r3: "+r3);
        rt = (r1 + r2 + r3);
        double hasil2 = (1/r1) + (1/r2) + (1/r3);
        hasil2 = 1/hasil2;
        System.out.println("Besar sebuah hambatan jika disusun secara seri adalah: "+rt);
        System.out.println("Besar sebuah hambatan jika disusun secara pararel adalah: "+hasil2);
      
        
    }
    
}
