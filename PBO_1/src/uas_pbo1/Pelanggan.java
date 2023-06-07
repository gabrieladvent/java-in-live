/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_pbo1;

/**
 *
 * @author ACER
 */
public class Pelanggan {
    private String Nama;
    private int Nomor;
    
public Pelanggan (){}
public Pelanggan (String Nama, int Nomor){
    this.Nama = Nama;
    this.Nomor = Nomor;
}

public String getNama() {
        return Nama;
}
public void setNama(String Nama) {
        this.Nama = Nama;
}

public int getNomor() {
        return Nomor;
}
public void setNomor(int Nomor) {
        this.Nomor = Nomor;
}
public  void nomor(){
    if (Nomor > 200 && Nomor <1){
        Nomor = 96;
    }
}

    @Override
    public String toString(){
    return Nomor + "  " + Nama;
}
}