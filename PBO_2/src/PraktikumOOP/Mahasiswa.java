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
public class Mahasiswa extends Peminjam{
    protected String nim;
     public Mahasiswa(String nim){
         super();
         this.nim = nim;
     }
    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
}
