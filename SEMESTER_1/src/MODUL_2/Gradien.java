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
public class Gradien {
    public static void main(String[] args) {
       System.out.println("Mencari nilai gradien");
       System.out.println("--------------------------");
       System.out.println("Jawab");
       
       
        double x1, y1, x2, y2;
        double gradien;
        
        System.out.println("Diketahui:");
        x1 = 2;
        System.out.println("x1 :"+x1); 
        y1 = 3;
        System.out.println("y1 :"+y1); 
        x2 = -2;
        System.out.println("x2 :"+x2);
        y2 = 1;
        System.out.println("y2 :"+y2);
        gradien = (y1-y2)/(x1-x2); 
        System.out.println("Jadi nilai gradien dari persamaan tersebut adalah :"+gradien);
        
    }
    
}
