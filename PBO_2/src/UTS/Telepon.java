/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;
import java.time.LocalDate;

/**
 *
 * @author ACER
 */
public class Telepon {
    private String nomor;
    private String pelanggan;
    private int abonemen;
    private String operator;
    private LocalDate tahunLangganan;
    
Telepon (){}
public Telepon (String nomor, String pelanggan, int abonemen, String operator, LocalDate tahunLangganan){
    this.nomor = nomor;
    this.pelanggan = pelanggan;
    this.abonemen = abonemen;
    this.operator = operator;
    this.tahunLangganan = tahunLangganan;
}

    /**
     * @return the nomor
     */
    public String getNomor() {
        return nomor;
    }

    /**
     * @param nomor the nomor to set
     */
    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    /**
     * @return the pelanggan
     */
    public String getPelanggan() {
        return pelanggan;
    }

    /**
     * @param pelanggan the pelanggan to set
     */
    public void setPelanggan(String pelanggan) {
        this.pelanggan = pelanggan;
    }

    /**
     * @return the abonemen
     */
    public int getAbonemen() {
        return abonemen;
    }

    /**
     * @param abonemen the abonemen to set
     */
    public void setAbonemen(int abonemen) {
        this.abonemen = abonemen;
    }

    /**
     * @return the operator
     */
    public String getOperator() {
        return operator;
    }

    /**
     * @param operator the operator to set
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * @return the tahunLangganan
     */
    public LocalDate getTahunLangganan() {
        return tahunLangganan;
    }

    /**
     * @param tahunLangganan the tahunLangganan to set
     */
    public void setTahunLangganan(LocalDate tahunLangganan) {
        this.tahunLangganan = tahunLangganan;
    }

    @Override
    public String toString() {
        return "Telepon{" + "nomor=" + nomor + ", pelanggan=" + pelanggan + ", abonemen=" + abonemen + ", operator=" + operator + ", tahunLangganan=" + tahunLangganan + '}';
    }
    
}
