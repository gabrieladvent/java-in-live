/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_5;
import Modul_2.Pegawai;

/**
 *
 * @author ACER
 */
public class Perusahaan {
private String nama, alamat, pemilik, npwp;

public Perusahaan(){}
public Perusahaan(String nama, String Alamat, String Pemilik, String npwp){
        this.nama = nama;
        this.alamat = alamat;
        this.pemilik = pemilik;
        this.npwp = npwp;
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

public String getPemilik() {
        return pemilik;
}
public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
}

public String getNpwp() {
        return npwp;
}
public void setNpwp(String npwp) {
        this.npwp = npwp;
}
}