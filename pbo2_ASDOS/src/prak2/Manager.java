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
public class Manager extends pegawai implements tugasBelajar{
    private double tunj_jabatan;
    private double lembur;

    public double getTunj_jabatan() {
        return tunj_jabatan;
    }

    public void setTunj_jabatan(double tunj_jabatan) {
        this.tunj_jabatan = tunj_jabatan;
    }

    public double getLembur() {
        return lembur;
    }

    public void setLembur(double lembur) {
        this.lembur = lembur;
    }
    
    @Override
    public double hitungGaji(){
        return 0;
    }

    @Override
    public boolean isSelesai(boolean n) {
        return true;
    }
}
