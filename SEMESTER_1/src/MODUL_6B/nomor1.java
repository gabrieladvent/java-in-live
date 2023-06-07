/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_6B;
/**
 *
 * @author ACER
 */
public class nomor1 {
    public static void main(String[] args) {
        int h1 = 6500, liter = 1;
        
        System.out.println("Harga per liter: "+h1);
        System.out.println("Liter          Harga");
        System.out.println("======================");
        
        while (liter <= 20) {
           int h2 = 6500;
            h1 = liter * h2;
           System.out.println(liter+"  :           "+h1);  
            liter ++; 
        }
    }
}
