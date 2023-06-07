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
public class cetakan {
        private String nama_penerbit;
        private String alamat;
        private String tahun_berdirinya;    
public cetakan(String nama_penerbit, String tahun_berdirinya){
        this.nama_penerbit = nama_penerbit;
        this.tahun_berdirinya = tahun_berdirinya;
}
        public String getNama_penerbit() {
        return nama_penerbit;
}
        public void setNama_penerbit(String nama_penerbit) {
        this.nama_penerbit = nama_penerbit;
}
public String getAlamat() {
        return alamat;
}
public void setAlamat(String alamat) {
        this.alamat = alamat;
}
        public String getTahun_berdirinya() {
        return tahun_berdirinya;
}
public void setTahun_berdirinya(String tahun_berdirinya) {
        this.tahun_berdirinya = tahun_berdirinya;
    } 
}
