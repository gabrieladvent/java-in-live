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
public class SparePart implements Tagihan{
    private String kodePart;
    private double harga;
    private double jumlah;
    
public SparePart(String kodePart, double harga, double jumlah){
    this.kodePart = kodePart;
    this.jumlah = jumlah;
    this.harga = harga;
}
public double total(){
    return harga * jumlah;
}
    @Override
    public double getTagihan() {
        return 0;
    }
    
    public String toString(){
        return "Spare Part 1 " + " Rp." + harga + " * " + jumlah + " buah = " + total(); 
    }
}
  