/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_4;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class besarDiscount {
    public static void main(String[] args) {
        Scanner nge = new Scanner(System.in);
        double barang, hasil, jumlah, total, total2; 
        double harga = 100000;
        double discount;
        
        discount = 0.1;
        System.out.print("Jumlah barang: ");
        barang = nge.nextInt();
        
        hasil = barang * harga;
        System.out.println("Total pembelanjaan: "+hasil);
        jumlah =hasil * discount;
        System.out.println("diskon: "+jumlah);
        total = hasil-jumlah;
        total2 = barang * harga;
        if (hasil >= 1000000) {
            System.out.println("Yang Dibayar: "+total);
        } if (hasil < 1000000) {
            System.out.println("Yang dibayar: "+total2);
        }
        
    }
    
}
