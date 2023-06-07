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
public class Koleksi {
    protected String idKoleksi, judul, penerbit, tahunTerbit;
    protected boolean statusPinjam;
    
    public Koleksi(){
        
    }
    public Koleksi(String idKoleksi, String judul, String tahunTerbit){
        this.idKoleksi = idKoleksi;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }
    public String getIdKoleksi() {
        return idKoleksi;
    }
    public void setIdKoleksi(String idKoleksi) {
        this.idKoleksi = idKoleksi;
    }
    public String getJudul() {
        return judul;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public String getPenerbit() {
        return penerbit;
    }
    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
    public String getTahunterbit() {
        return tahunTerbit;
    }
    public void setTahunterbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }
    public boolean isStatusPinjam() {
        return statusPinjam;
    }
    public void setStatusPinjam(boolean statusPinjam) {
        this.statusPinjam = statusPinjam;
    }
}
