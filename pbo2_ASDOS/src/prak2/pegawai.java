/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak2;

/**
 *
 * @author Tak Bertuan
 */
public class pegawai implements pendapatan{
    private String n_induk;
    private String nama;
    private double g_pokok;

    public String getN_induk() {
        return n_induk;
    }

    public void setN_induk(String n_induk) {
        this.n_induk = n_induk;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getG_pokok() {
        return g_pokok;
    }

    public void setG_pokok(double g_pokok) {
        this.g_pokok = g_pokok;
    }
    
    @Override
    public double hitungGaji (){
        return 0;
    }
}
