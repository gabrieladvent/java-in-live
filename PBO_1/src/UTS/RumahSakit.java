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
public class RumahSakit {
        private String kode_RS, nama_RS, kota;
        Pasien usi;
        private Pasien[] daft_pasi;
        private double rerat;

    public Pasien getUsi() {
        return usi;
    }

    public void setUsi(Pasien usi) {
        this.usi = usi;
    }
        

    public double getRerat() {
        return rerat;
    }

    public void setRerat(double rerat) {
        this.rerat = rerat;
    }
        
RumahSakit(String kode_RS, String nama_RS){
        this.kode_RS = kode_RS;
        this.nama_RS = nama_RS;
}

public String getKode_RS() {
        return kode_RS;
}
public void setKode_RS(String kode_RS) {
        this.kode_RS = kode_RS;
}

public String getKota(){
    return kota;
}
public void setKota(String kota){
    this.kota = kota;
}

public String getNama_RS() {
        return nama_RS;
}
public void setNama_RS(String nama_RS) {
        this.nama_RS = nama_RS;
}

public Pasien[] getDaft_pasi() {
        return daft_pasi;
}
public void setDaft_pasi(Pasien[] daft_pasi) {
        this.daft_pasi = daft_pasi;
}

public  Pasien umur(){
            return usi;
}

public double rata(){
            return rerat;
}
}