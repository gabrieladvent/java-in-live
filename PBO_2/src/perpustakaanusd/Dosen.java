/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaanusd;

/**
 *
 * @author Katharina yas
 */
public class Dosen extends Peminjam {
    private String nip;
    
    public void setNip ( String nip ) {
        this.nip = nip;
    }
    
    public String getNip(){
        return nip;
    }
    
    public int getDenda() {
        return getTelatPengembalian() * 500000;
    }
    
}
