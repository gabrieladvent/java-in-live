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
public class Umum extends Peminjam{
    protected String nik;
    
    public Umum(String nik){
        super();
        this.nik = nik;
    }
    public void setNik(String nik){
        this.nik = nik;
    }
    public String getNik(){
        return nik;
    }
}
