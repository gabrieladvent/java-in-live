/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7;

/**
 *
 * @author Tak Bertuan
 */
public class Resep {
    static int maxobat = 20;
    private int jumdata;
    private String namaResep;
    private Dokter dokter;
    private Pasien pasien;
    private Obat[] dataObat;

    public Resep(String namaResep) {
        this.namaResep = namaResep;
        dataObat = new Obat[maxobat];
        jumdata = 0 ;
    }

    public static int getMaxobat() {
        return maxobat;
    }

    public static void setMaxobat(int maxobat) {
        Resep.maxobat = maxobat;
    }

    public int getJumdata() {
        return jumdata;
    }

    public void setJumdata(int jumdata) {
        this.jumdata = jumdata;
    }

    public String getNamaResep() {
        return namaResep;
    }

    public void setNamaResep(String namaResep) {
        this.namaResep = namaResep;
    }

    public Dokter getDokter() {
        return dokter;
    }

    public void setDokter(Dokter dokter) {
        this.dokter = dokter;
    }

    public Pasien getPasien() {
        return pasien;
    }

    public void setPasien(Pasien pasien) {
        this.pasien = pasien;
    }

    public Obat[] getDataObat() {
        return dataObat;
    }

    public void setDataObat(Obat dataObat) {
        this.dataObat[this.jumdata] = dataObat;
        this.jumdata++;
    }
    
    public Obat getDataObat(int index) {
        return dataObat[index];
    }
}

