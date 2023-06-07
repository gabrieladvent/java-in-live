/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_3;

/**
 *
 * @author ACER
 */
public class DataBuku {
        private String Kode_buku;
        private String judul;
        private String nama_penulis;
        private int tahun_terbit;
        private cetakan penerbit;

DataBuku(){}

public String getKode_buku() {
        return Kode_buku;
}
public void setKode_buku(String Kode_buku) {
        this.Kode_buku = Kode_buku;
}
public String getJudul() {
        return judul;
}
public void setJudul(String judul) {
        this.judul = judul;
}
public String getNama_penulis() {
        return nama_penulis;
}
public void setNama_penulis(String nama_penulis) {
        this.nama_penulis = nama_penulis;
}
public int getTahun_terbit() {
        return tahun_terbit;
}
public void setTahun_terbit(int tahun_terbit) {
        this.tahun_terbit = tahun_terbit;
}
public cetakan getPenerbit() {
        return penerbit;
}
public void setPenerbit(cetakan penerbit) {
        this.penerbit = penerbit;
}            
public int thn_trbt(){
        int total;
        return total = 2019 -tahun_terbit;        
}   
}