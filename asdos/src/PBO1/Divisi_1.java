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
public class Divisi {
    static int maxPegawai = 20;
    private String namaDivisi;
    private Pegawai kepalaDivisi;
    private Pegawai[] dataPegawai;
    private int jumPe;

    public Divisi(String namaDivisi, Pegawai kepalaDivisi) {
        this.namaDivisi = namaDivisi;
        this.kepalaDivisi = kepalaDivisi;
        dataPegawai = new Pegawai[maxPegawai];
        jumPe = 0;
    }

    public static int getMaxPegawai() {
        return maxPegawai;
    }

    public static void setMaxPegawai(int maxPegawai) {
        Divisi.maxPegawai = maxPegawai;
    }

    public String getNamaDivisi() {
        return namaDivisi;
    }

    public void setNamaDivisi(String namaDivisi) {
        this.namaDivisi = namaDivisi;
    }

    public Pegawai getKepalaDivisi() {
        return kepalaDivisi;
    }

    public void setKepalaDivisi(Pegawai kepalaDivisi) {
        this.kepalaDivisi = kepalaDivisi;
    }

    public Pegawai[] getDataPegawai() {
        return dataPegawai;
    }

    public void setDataPegawai(Pegawai dataPegawai) {
        this.dataPegawai[this.jumPe] = dataPegawai;
        jumPe++;
    }
    
    public Pegawai getDataPegawai(int index) {
        return dataPegawai[index];
    }

    public int getJumPe() {
        return jumPe;
    }

    public void setJumPe(int jumPe) {
        this.jumPe = jumPe;
    }
}