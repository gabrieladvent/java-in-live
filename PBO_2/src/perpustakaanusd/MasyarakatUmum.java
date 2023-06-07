/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaanusd;

/**
 *
 * @author Katharina Tyas
 */
public class MasyarakatUmum extends Peminjam {
    private String nomorKTP;

    public String getNomorKTP() {
        return nomorKTP;
    }

    public void setNomorKTP(String nomorKTP) {
        this.nomorKTP = nomorKTP;
    }
    
    public int getDenda() {
        return getTelatPengembalian() * 100000;
    }
}
