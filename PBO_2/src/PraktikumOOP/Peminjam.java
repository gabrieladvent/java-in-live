/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumOOP;

/**
 *
 * @author ASUS ZEPHYRUS
 */
public class Peminjam {
    public String idPeminjam, nama, alamat;
    public int maxPinjam;

    public Peminjam(){
        
    }
    public Peminjam(String idPeminjam, String nama, String alamat) {
        this.idPeminjam = idPeminjam;
        this.nama = nama;
        this.alamat = alamat;
    }
    public String getIdPeminjam() {
        return idPeminjam;
    }
    public void setIdPeminjam(String idPeminjam) {
        this.idPeminjam = idPeminjam;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public int getMaxPinjam() {
        return maxPinjam;
    }
    public void setMaxPinjam(int maxPinjam) {
        this.maxPinjam = maxPinjam;
    }

}
