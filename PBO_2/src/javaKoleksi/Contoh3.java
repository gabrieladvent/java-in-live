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


public class Contoh3 {
    public static void main (String[] args) {
        ArrayList<Integer> deret = new ArrayList<Integer>();
        System.out.println("Panjang deret awal :" + deret.size());

        for (int i = 0; i < 100; i++) {
                 deret.add(i * 10);
            }

        System.out.println("\nPanjang deret setelah ditambahkan elemen: " + deret.size());

        System.out.println("\nmemeriksa apakah array list kosong: ");
        System.out.println(deret.isEmpty());

        System.out.println("\nmencari indeks dari suatu nilai di dalam  array list: ");
        System.out.println(deret.indexOf(60));
        System.out.println(deret.indexOf(70));
        System.out.println(deret.indexOf(80));

        System.out.println("\nmemeriksa keberadaan suatu nilai di dalam array list: ");
        System.out.println(deret.contains(60));
        System.out.println(deret.contains(70));
        System.out.println(deret.contains(80));
    
        System.out.println("\nUpdate suatu nilai di dalam array list: ");
        deret.set(6, 600);
        deret.set(7, 700);
        deret.set(8, 800);
        System.out.println(deret.get(6));
        System.out.println(deret.get(7));
        System.out.println(deret.get(8));

        System.out.println("\nMenghapus suatu nilai di dalam array list");
        deret.remove(6);
        System.out.println("\nPanjang deret setelah menghapus beberapa elemen: " + deret.size());

        for (int nilai : deret) {
            System.out.println(nilai);
        }

        deret.clear();
        System.out.println(deret);
    
    }
}
