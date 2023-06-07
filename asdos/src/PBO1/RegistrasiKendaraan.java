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
public class RegistrasiKendaraan {
    private String nama;
    private String alamat;
    private String jenis;
    private String merk;
    private String warna;
    private String bahanBakar;
    private String kodeKota;
    private String nokendaraan;
    private int harga;
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    public String getKodeKota() {
        return kodeKota;
    }

    public void setKodeKota(String kodeKota) {
        this.kodeKota = kodeKota;
    }

    public String getNokendaraan() {
        return nokendaraan;
    }

    public void setNokendaraan(String nokendaraan) {
        this.nokendaraan = nokendaraan;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public double pajak(){
        return harga * 0.02;
    }
}
