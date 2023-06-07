/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumOOP;

/**
 *
 * @author ASUS ZEPHYRUS
 */
public class Dosen extends Peminjam{
    protected String nip;
    
    public Dosen(String nip){
        super();
        this.nip = nip;
    }
    public String getNip() {
        return nip;
    }
    public void setNip(String nip) {
        this.nip = nip;
    }
}
