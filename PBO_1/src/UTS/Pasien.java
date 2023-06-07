/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

/**
 *
 * @author ACER
 */
public class Pasien {
        private String nik, nama; 
        private int usia;

Pasien(String nik, String nama){
        this.nik = nik; this.nama = nama;
}

public String getNik() {
        return nik;
}
public void setNik(String nik) {
        this.nik = nik;
}

public String getNama() {
        return nama;
}
public void setNama(String nama) {
        this.nama = nama;
}

public int getUsia() {
        return usia;
}
public void setUsia(int usia) {
        this.usia = usia;
}
}
