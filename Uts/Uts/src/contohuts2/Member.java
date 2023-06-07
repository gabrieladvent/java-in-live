/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohuts2;

/**
 *
 * @author ACER
 */
public class Member extends Pembelian{
    private int potHarga;
    int total =0;
    public Member(){}
    
    public Member(String namaBarang,int jmlhBarang,int HargaBarang){}  
    
    public int getPotHarga() {
        return potHarga;
    }
    public void setPotHarga(int potHarga) {
        this.potHarga = potHarga;
    }
    @Override
    public int hitungTotalHarga(){
        total = total + this.getHargaBarang()* this.getJmlhBarang();
        return total;
    }
    
    @Override
    public int hargaTotSetelahDiskon(){
        int hargaTot = hitungTotalHarga() - getPotHarga();
        return hargaTot;
    } 
}
