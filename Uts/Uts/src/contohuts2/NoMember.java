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
public class NoMember extends Pembelian {
    int totalHarga;
    
    public NoMember(){}
    
    public NoMember(String namaBarang,int jmlhBarang,int HargaBarang){}
      
    @Override
    public int hitungTotalHarga(){
    totalHarga += super.getHargaBarang()* super.getJmlhBarang();
    return totalHarga;
    }     
    
}
