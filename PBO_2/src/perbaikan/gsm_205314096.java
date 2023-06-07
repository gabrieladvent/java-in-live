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
public class gsm_205314096 extends Telepon{
    private String paket_internet, imei;
    
public gsm_205314096(){}
public gsm_205314096(String nomor, String pelanggan, int abonemen, String operator, LocalDate tahun, String paket_internet, String imei){
    super(nomor, pelanggan, abonemen, operator, tahun);
    this.paket_internet = paket_internet;
    this.imei = imei;
}

    public String getPaket_internet() {
        return paket_internet;
    }

    public void setPaket_internet(String paket_internet) {
        this.paket_internet = paket_internet;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    @Override
    public String toString() {
        return "gsm_205314096{" + "paket_internet=" + paket_internet + ", imei=" + imei + '}';
    }

}
