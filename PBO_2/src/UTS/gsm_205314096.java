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
public class gsm_205314096 extends Telepon{
    private String paketInternet;
    private LocalDate tipe;
    
gsm_205314096 (){}
public gsm_205314096 (String paketInternet, LocalDate tipe){
    this.paketInternet = paketInternet;
    this.tipe = tipe;
}

    /**
     * @return the paketInternet
     */
    public String getPaketInternet() {
        return paketInternet;
    }

    /**
     * @param paketInternet the paketInternet to set
     */
    public void setPaketInternet(String paketInternet) {
        this.paketInternet = paketInternet;
    }

    /**
     * @return the tipe
     */
    public LocalDate getTipe() {
        return tipe;
    }

    /**
     * @param tipe the tipe to set
     */
    public void setTipe(LocalDate tipe) {
        this.tipe = tipe;
    }

    @Override
    public String toString() {
        return "gsm_205314096{" + "paketInternet=" + paketInternet + ", tipe=" + tipe + '}';
    }

}
