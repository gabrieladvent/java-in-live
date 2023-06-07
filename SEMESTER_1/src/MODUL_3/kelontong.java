/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_3;

/**
 *
 * @author ACER
 */
public class kelontong {
    public static void  main(String[] args) {
        System.out.println("Kelontong Store");
        System.out.println("      ><       ");
        
        int hargaBarang, jumlahBarang;
        int hargaTotal, discount, hargaDiscount;
        int hB = 5000, jB = 2, D = 20, hD;
        
        hargaBarang = hB;
        jumlahBarang = jB;
        discount = D;
        
        hargaTotal = hB * jB;
        D = 20 * 100;
        hargaDiscount = (hargaTotal) - (D);
        
        System.out.println("Harga Barang             :"+hB);
        System.out.println("Jumlah Barang            :"+jB);
        System.out.println("____________________________________________+");
        System.out.println("Total                    :"+hargaTotal);
        System.out.println("Discount                 :"+D+"%");
        System.out.println("Total yang Harus Dibayar :"+hargaDiscount);
        System.out.println("                  TERIMA KASIH :)");
        
        
        
    }
    
}
