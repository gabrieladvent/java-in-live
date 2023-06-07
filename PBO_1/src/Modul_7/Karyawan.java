/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_7;

/**
 *
 * @author ACER
 */
public class Karyawan {
    private int npp, jmlAnak;
    private String nama;
    public static int subs_anak = 100000;

public Karyawan() {}

public int getNpp() {
        return npp;
}
public void setNpp(int npp) {
        this.npp = npp;
}

public int getJmlAnak() {
        return jmlAnak;
}
public void setJmlAnak(int jmlAnak) {
        this.jmlAnak = jmlAnak;
}

public String getNama() {
        return nama;
}
public void setNama(String nama) {
        this.nama = nama;
}
public int tunj(){
      int tunjangan = jmlAnak * subs_anak;
       return tunjangan;
}
}
