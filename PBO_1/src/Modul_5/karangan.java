/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_5;

/**
 *
 * @author ACER
 */
public class karangan {
        private String nama, alamat, nik;

public karangan(String nama, String alamat, String nik){
            this.nama = nama; this.nik = nik; this.alamat = alamat;
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

public String getNik() {
        return nik;
}
public void setNik(String nik) {
        this.nik = nik;
}
}