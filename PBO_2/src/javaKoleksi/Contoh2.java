/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaKoleksi;

/**
 *
 * @author ACER
 */
import java.util.ArrayList;
import java.util.List;


public class Contoh2 {
    public static void main (String[] args) {
        ArrayList<Integer> memori = new ArrayList<Integer>();
        System.out.println("Ukuran Sebelum ArrayList: " + memori.size());
        System.out.println("====================");
        System.out.println("Mengisi ArrayList");
        System.out.println("====================");
        for (int i = 0; i < 10; i++) {
            memori.add(i);
        }
        System.out.println("====================");
        System.out.println("Menampilkan ArrayList");
        System.out.println("====================");
	 System.out.println(memori);
        for (int nilai : memori) {
            System.out.println(nilai);
        }
    }
    
}
