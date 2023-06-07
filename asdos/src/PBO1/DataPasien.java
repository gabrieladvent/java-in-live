/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO1;

import java.util.Scanner;

/**
 *
 * @author Tak Bertuan
 */
public class DataPasien {
    private String nama,umur,alamat;
    private DataDokter nm;
    private Resep obt;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public DataDokter getNm() {
        return nm;
    }

    public void setNm(DataDokter nm) {
        this.nm = nm;
    }

    public Resep getObt() {
        return obt;
    }

    public void setObt(Resep obt) {
        this.obt = obt;
    }
    
    
    public void inputD(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Nama Pasien: ");
        setNama(sc.next());
        System.out.print("Umur Pasien: ");
        setUmur(sc.next());
        System.out.print("Alamat Pasien: ");
        setAlamat(sc.next());
        System.out.println("");
    }
}
