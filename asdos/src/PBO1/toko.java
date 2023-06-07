/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO1;

/**
 *
 * @author Tak Bertuan
 */
public class toko {
    private String nama;
    private int stok, harga, jum;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok + this.stok;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getJum() {
        return jum;
    }
    
    public void ambil (int jum){
        this.jum = jum;
        if (stok == 0){
            System.out.println("Stok Abis");
        } else{
            System.out.println("Anda akan mengambil: " + jum);
            stok = stok - jum;
        }
    }
    public void total (){
        int tot = jum * harga;
        System.out.println("Totalnya: "+tot);
    }
    
    
    public static void main(String[] args) {
        toko obj = new toko ();
        obj.setNama("Pensil");
        obj.setHarga(5000);
        System.out.println("Sebelum: "+obj.getStok());
        obj.setStok(10);
        System.out.println(obj.getNama());
        System.out.println(obj.getHarga());
        System.out.println(obj.getStok());
        obj.ambil(5);
        System.out.println(obj.getStok());
        obj.setStok(6);
        System.out.println(obj.getStok());
        obj.total();
        System.out.println("yang laku: "+obj.getJum());
    }
}
