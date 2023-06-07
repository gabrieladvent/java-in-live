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
public class Buku {
        private String judul, pengarang, penerbit, kategori;
        private int ISBN;
   
public Buku (String JUDUL, int isbn) {
       judul = JUDUL;
       ISBN = isbn;
}
    
public void pinjam (){
        System.out.println("Buku dengan judul: '"+judul+"' dan ber-ISBN: "+ISBN);
        System.out.println("->Sedang dipinjam");
        System.out.println();
}

public void kembali () {
        System.out.println("Buku dengan judul: '"+judul+"' dan ber-ISBN: "+ISBN);
        System.out.println("->Sudah dikembalikan");
}
}
