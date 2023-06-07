/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoh;

import java.time.LocalDate;

/**
 *
 * @author hertada
 */
public class Pegawai {
    private String nama;
    private String alamat;
    private int jumGaji;
    private LocalDate tgLahir;
    

    public Pegawai() {
        this.nama="noname";
        this.alamat="none";
    }

    public Pegawai(String nama, String alamat, int jumGaji, LocalDate tgLahir) {
        this.nama = nama;
        this.alamat = alamat;
        this.jumGaji = jumGaji;
        this.tgLahir = tgLahir;
    }
      
    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the jumGaji
     */
    public int getJumGaji() {
        return jumGaji;
    }

    /**
     * @param jumGaji the jumGaji to set
     */
    public void setJumGaji(int jumGaji) {
        this.jumGaji = jumGaji;
    }

    /**
     * @return the tgLahir
     */
    public LocalDate getTgLahir() {
        return tgLahir;
    }

    /**
     * @param tgLahir the tgLahir to set
     */
    public void setTgLahir(LocalDate tgLahir) {
        this.tgLahir = tgLahir;
    }

    
    
}
