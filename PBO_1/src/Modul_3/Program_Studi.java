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
public class Program_Studi {
        private String kode_prodi;
        private String nama_prodi;
        private Pgw ketua_prodi;

public Program_Studi(String kode_prodi, String nama_prodi){
        this.kode_prodi = kode_prodi;
        this.nama_prodi = nama_prodi;
}
public String getKode_prodi() {
        return kode_prodi;
}
public void setKode_prodi(String kode_prodi) {
        this.kode_prodi = kode_prodi;
}
public String getNama_prodi() {
        return nama_prodi;
}
public void setNama_prodi(String nama_prodi) {
        this.nama_prodi = nama_prodi;
}
public Pgw getKetua_prodi() {
        return ketua_prodi;
}
public void setKetua_prodi(Pgw ketua_prodi) {
        this.ketua_prodi = ketua_prodi;
}
}
