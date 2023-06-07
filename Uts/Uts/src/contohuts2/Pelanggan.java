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
public class Pelanggan {
    private int jumPel;
    private static int MAX_PEMBELIAN = 10;
    private Pembelian cos;
    private Pembelian[] pembelian;
    private String tipePel;


    public Pelanggan(){
        pembelian = new Pembelian[MAX_PEMBELIAN];
        jumPel =0;
    }
    public Pelanggan(String tipe){
        this.tipePel = tipe;
        this.pembelian = new Pembelian[MAX_PEMBELIAN];
        jumPel=0;   
    }
    public String getTipePel() {
        return tipePel;
    }
    public void setTipePel(String tipePel) {
        this.tipePel = tipePel;
    }
    public Pembelian getPembelian(int index) {
        return pembelian[index];
    }
    public void setPembelian(Pembelian Pembelian) {
        this.pembelian[jumPel] = Pembelian;
        jumPel++;
    }
  
    public int getJumPel() {
        return jumPel;
    }
    public void setJumPel(int jumPel) {
        this.jumPel = jumPel;
    }
    public Pembelian getCos() {
        return cos;
    }
    public void setCos(Pembelian cos) {
        this.cos = cos;
    }
 
}
