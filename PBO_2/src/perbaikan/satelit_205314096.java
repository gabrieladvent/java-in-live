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
public class satelit_205314096 extends Telepon{
    private String paket_sli, fitur;
    
public satelit_205314096(){}
public satelit_205314096(String nomor, String pelanggan, int abonemen, String operator, LocalDate tahun, String paket_sli, String fitur){
    super(nomor, pelanggan, abonemen, operator, tahun);
    this.paket_sli = paket_sli;
    this.fitur = fitur;
}

    public String getPaket_sli() {
        return paket_sli;
    }

    public void setPaket_sli(String paket_sli) {
        this.paket_sli = paket_sli;
    }

    public String getFitur() {
        return fitur;
    }

    public void setFitur(String fitur) {
        this.fitur = fitur;
    }

    @Override
    public String toString() {
        return "satelit_205314096{" + "paket_sli=" + paket_sli + ", fitur=" + fitur + '}';
    }

}
