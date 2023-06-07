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
public class kelilingdanLuas {
    public static void main(String[] args) {
        double luas, keliling, jari, phi;
        
        jari = 2;
        phi = 3.14;
        luas = phi * (jari * jari);
        keliling = 2 * phi * jari;
        
        System.out.println("Nilai luas lingkaran: "+luas);
        System.out.println("Hasil keliling lingkaran: "+keliling);
    }
    
}
