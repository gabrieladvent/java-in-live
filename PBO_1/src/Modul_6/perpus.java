/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_6;

import Modul_4.Buku;

/**
 *
 * @author ACER
 */
public class perpus {
        public static String nmaPerpus, alamat;
        static Buku [] koleksi; 
        
public perpus(String nama, String almt){
            nmaPerpus = nama; alamat = almt;
}

public static String getNmaPerpus() {
        return nmaPerpus;
}
public static void setNmaPerpus(String nmaPerpus) {
        perpus.nmaPerpus = nmaPerpus;
}

public static String getAlamat() {
        return alamat;
}
public static void setAlamat(String alamat) {
        perpus.alamat = alamat;
}

public static Buku[] getKoleksi() {
        return koleksi;
}
public static void setKoleksi(Buku[] koleksi) {
        perpus.koleksi = koleksi;
}
        
public static String cari(String nm){
        return nm;
}

public static void seba(String name){
    
}
}
