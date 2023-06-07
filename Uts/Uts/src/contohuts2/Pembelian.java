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
public class Pembelian {
    private String namaBarang;
    private int stokBarang;
    private int jmlhBarang; //jumlah barang yang dibeli
    private int hargaBarang;
    private Pelanggan[] costumer;
   

    public Pembelian(){}
    
    public int hitungTotalHarga(){
        System.out.println("");
        return 0;
    }
    
    public int hargaTotSetelahDiskon(){
        System.out.println("");
        return 0;
    }
    
    public String getNamaBarang() {
        return namaBarang;
    }
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }
    public int getJmlhBarang() {
        return jmlhBarang;
    }
    public void setJmlhBarang(int jmlhBarang) {
        this.jmlhBarang = jmlhBarang;
    }
    public int getHargaBarang() {
        return hargaBarang;
    }
    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }
    public Pelanggan[] getCostumer() {
        return costumer;
    }

     public Pelanggan getCostumer(int index){
        return getCostumer()[index];
}
   
    public void setCostumer(Pelanggan[] costumer) {
        this.costumer = costumer;
    }

}
