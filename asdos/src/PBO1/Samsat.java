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
public class Samsat {
    static int maxRegister = 20;
    private String namaSamsat;
    private RegistrasiKendaraan[] dataPemilik;
    private int jumlahData;

    public Samsat(String namaSamsat) {
        this.namaSamsat = namaSamsat;
        dataPemilik = new RegistrasiKendaraan[maxRegister];
        jumlahData = 0 ;
    }

    public static int getMaxRegister() {
        return maxRegister;
    }

    public static void setMaxRegister(int maxRegister) {
        Samsat.maxRegister = maxRegister;
    }

    public String getNamaSamsat() {
        return namaSamsat;
    }

    public void setNamaSamsat(String namaSamsat) {
        this.namaSamsat = namaSamsat;
    }

    public RegistrasiKendaraan[] getDataPemilik() {
        return dataPemilik;
    }

    public void setDataPemilik(RegistrasiKendaraan dataPemilik) {
        this.dataPemilik[this.jumlahData] = dataPemilik;
        this.jumlahData++;
    }
    
    public RegistrasiKendaraan getDataPemilik(int index) {
        return dataPemilik[index];
    }

    public int getJumlahData() {
        return jumlahData;
    }

    public void setJumlahData(int jumlahData) {
        this.jumlahData = jumlahData;
    }
}
