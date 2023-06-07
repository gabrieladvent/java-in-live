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
public class pstn_205314096 extends Telepon{
    private String paketBisara;
    private LocalDate tipe;

pstn_205314096(){}
public pstn_205314096 (String paketBisara, LocalDate tipe){
    this.paketBisara = paketBisara;
    this.tipe = tipe;
}

    /**
     * @return the paketBisara
     */
    public String getPaketBisara() {
        return paketBisara;
    }

    /**
     * @param paketBisara the paketBisara to set
     */
    public void setPaketBisara(String paketBisara) {
        this.paketBisara = paketBisara;
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
        return "pstn_205314096{" + "paketBisara=" + paketBisara + ", tipe=" + tipe + '}';
    }

}
