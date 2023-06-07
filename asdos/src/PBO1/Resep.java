/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO1;

/**
 *
 * @author Tak Bertuan
 */
public class Resep {

    private String namaD, id, namaP, NIK, alamat, daftar;//deklarasi variable dengan nama namaD, id bertipe String (private)
    private int total;

    Resep() {//deklarasi constructor dengan parameter 2 parameter String
        this.namaD = namaD;//nilai variabel namaD sama dengan dokter
        this.id = id;//nilai variabel id sama dengan no
        this.namaP = namaP;
        this.NIK = NIK;
        this.alamat = alamat;
        this.daftar = daftar;
    }

    public void setNamaD(String d) {//method setter namaD
        namaD = d;//nilai variabel namaD sama dengan d
    }

    public String getNamaD() {//method getter namaD
        return namaD;//mengembalikan nilai variabel namaD
    }

    public void setId(String d) {//method setter id
        id = d;//nilai variabel id sama dengan d
    }

    public String getId() {//method getter id
        return id;//mengembalikan nilai variabel id
    }

    public String getNamaP() {
        return namaP;
    }

    public void setNamaP(String namaP) {
        this.namaP = namaP;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getDaftar() {
        return daftar;
    }

    public void setDaftar(String daftar) {
        this.daftar = daftar;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
