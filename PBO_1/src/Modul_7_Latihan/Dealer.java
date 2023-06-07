/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_7_Latihan;

/**
 *
 * @author ACER
 */
public class Dealer {
        private String namaDealer;
        private String alamat;
        private String pemilik;
        private String NPWP;
        private Mobil[] daftarMobil;
    
public Dealer(String namaDealer, String pemilik){
        this.namaDealer = namaDealer;
        this.pemilik = pemilik;
}

public String getNamaDealer(){
        return namaDealer;
}
public String getPemilik(){
        return pemilik;
}

public String getAlamat(){
        return alamat;
}
public void setAlamat(String almt){
        this.alamat = almt;
}

public String getNPWP(){
        return NPWP;
}
public void setNPWP(String NPWP){
        this.NPWP = NPWP;
}

public Mobil[] getMobil(){
        return daftarMobil;
}
public void setMobil(Mobil[] dftMobil){
        this.daftarMobil = dftMobil;    
}
}