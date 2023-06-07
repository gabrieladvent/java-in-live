/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perbaikan;
import java.time.LocalDate;

/**
 *
 * @author Tak Bertuan
 */
public class Telepon {
    private String nomor, pelanggan, operator;
    private LocalDate tahun;
    private int abonemen;
    
public Telepon (String nomor, String pelanggan, int abonemen, String operator, LocalDate tahun){
    this.nomor = nomor; this.pelanggan = pelanggan;
    this.abonemen = abonemen; this.operator = operator;
    this.tahun = tahun;
}
public Telepon (){}

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public String getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(String pelanggan) {
        this.pelanggan = pelanggan;
    }

    public int getAbonemen() {
        return abonemen;
    }

    public void setAbonemen(int abonemen) {
        this.abonemen = abonemen;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public LocalDate getTahun() {
        return tahun;
    }

    public void setTahun(LocalDate tahun) {
        this.tahun = tahun;
    }

    @Override
    public String toString() {
        return "Telepon{" + "nomor=" + nomor + ", pelanggan=" + pelanggan + ", abonemen=" + abonemen + ", operator=" + operator + ", tahun=" + tahun + '}';
    }
}
