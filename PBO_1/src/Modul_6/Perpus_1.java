/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_6;
import java.util.Scanner;
import Modul_4.Buku;

/**
 *
 * @author ACER
 */
public class Perpus_1 {
    Scanner input = new Scanner(System.in);
        private static String nmaPerpus, alamat;
        static Buku [] koleksi; 
        
        Perpus_1(String nma, String a){
            nmaPerpus = nma; alamat = a;
        }

    public static String getNmaPerpus() {
        return nmaPerpus;
    }

    public static void setNmaPerpus(String nmaPerpus) {
        Perpus_1.nmaPerpus = nmaPerpus;
    }

    public static String getAlamat() {
        return alamat;
    }

    public static void setAlamat(String alamat) {
        Perpus_1.alamat = alamat;
    }

    public Buku[] getKoleksi() {
        return koleksi;
    }

    public void setKoleksi(Buku[] koleksi) {
        this.koleksi = koleksi;
    }
        
    public static void cari(String nm){
        for(int i = 0; i < koleksi.length; i++){
            if(koleksi[i].getJudul().equals(nm)){
                System.out.println(koleksi[i].getJudul());
            } else if (!nm.equals(koleksi[i].getJudul())){
                System.out.println("wek");
            }
                
            
        }
        
       /* if (nm.equals(Buku.getJudul())){
            System.out.println(Buku.getJudul());
            System.out.println(Buku.getKode());
        } else if (!nm.equals(Buku.getJudul())){
            System.out.println("Buku Tidak Ditemukan");
        }*/
       
    }
}
