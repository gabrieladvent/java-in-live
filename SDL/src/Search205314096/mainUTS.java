/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Search205314096;

import static Search205314096.methodUTS.Print;
import static Search205314096.methodUTS.interpolasi;
import static Search205314096.methodUTS.quickObjek;

/**
 *
 * @author ACER
 */
public class mainUTS {
    public static void main(String[] args) {
        Barang Obj[] = new Barang [7];
    Obj[0] = new Barang ("Rinso", 7);
    Obj[1] = new Barang ("Sabun", 1);
    Obj[2] = new Barang ("Laptop", 48);
    Obj[3] = new Barang ("Sendal", 11);
    Obj[4] = new Barang ("Motor", 81);
    Obj[5] = new Barang ("Batu", 56);
    Obj[6] = new Barang ("Kotak", 12);
    
    System.out.println("Data sebelum diurutkan: ");
        for (int i = 0; i < Obj.length; i++) {
            System.out.println(Obj [i] + ", ");
    }
    System.out.println("\nData Setelah Diurutkan: ");
    quickObjek(Obj, 0, Obj.length - 1); 
       for (int i = 0; i < Obj.length; i++) {
            System.out.println(Obj[i] + ", ");
        }
    
        System.out.println("");
    System.out.println("--> Mencari Data");
    Barang Search = new Barang ("Sendal", 11);
     int hasil = interpolasi(Obj, Search);
     if (hasil == -1){
        System.out.println("Barang Yang Dicari Tidak ditemukan");
    } else {
        System.out.println("Barang Yang Dicari: "+Search.getBerat() +
                " Ada di index: "+hasil);
    }
        System.out.println("");
    Barang Cari = new Barang ("Kaki", 10);
    int hasil2 = interpolasi(Obj, Search);
     if (hasil == -1){
        System.out.println("Barang Yang Dicari: "+Cari.getBerat() +
                " Ada di index: "+hasil2);
    } else {
        System.out.println("Barang Yang Dicari Tidak ditemukan");
    }
    }
}
