/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_1;

/**
 *
 * @author ACER
 */
public class BukuMain {
        public static void main(String[] args){
                Buku buku1 = new Buku ("Struktur Data", 1304595);
                buku1.pinjam();
        
                Buku buku2 = new Buku ("Java Fundamental", 1304300);
                buku2.kembali();
        
    }
}
