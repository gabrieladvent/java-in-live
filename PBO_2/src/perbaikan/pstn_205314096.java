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
public class pstn_205314096 extends Telepon{
    private String paket_bicara;
    private String tipe;
    
public pstn_205314096(){}
public pstn_205314096(String nomor, String pelanggan, int abonemen, String operator, LocalDate tahun, String paket_bicara, String tipe){
    super(nomor, pelanggan, abonemen, operator, tahun);
    this.paket_bicara = paket_bicara;
    this.tipe = tipe;
}

    public String getPaket_bicara() {
        return paket_bicara;
    }

    public void setPaket_bicara(String paket_bicara) {
        this.paket_bicara = paket_bicara;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    @Override
    public String toString() {
        return "pstn_205314096{" + "paket_bicara=" + paket_bicara + ", tipe=" + tipe + '}';
    }

}
