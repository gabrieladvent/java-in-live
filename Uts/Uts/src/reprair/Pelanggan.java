/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reprair;

/**
 *
 * @author Tak Bertuan
 */
public class Pelanggan implements HitungHarga{
    private String namaBarang;
    private int jumlahBarang;
    private int hargaBarang;
    
Pelanggan (){};

@Override
public int hitungHargaTotal() { return 0; }

public String getNamaBarang() {
    return namaBarang;
}
public void setNamaBarang(String namaBarang) {
    this.namaBarang = namaBarang;
}

public int getJumlahBarang() {
    return jumlahBarang;
}
public void setJumlahBarang(int jumlahBarang) {
    this.jumlahBarang = jumlahBarang;
}

public int getHargaBarang() {
    return hargaBarang;
}
public void setHargaBarang(int hargaBarang) {
    this.hargaBarang = hargaBarang;
}

}
