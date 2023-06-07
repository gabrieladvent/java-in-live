/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_2;

//import Modul_2.RekeningBank;

/**
 *
 * @author ACER
 */
public class BankMain {
        public static void main( String args[] ) {
                RekeningBank rekeningBudi;
                rekeningBudi = new RekeningBank("12345");
                        System.out.println("Rekening Budi = " + rekeningBudi.cekSaldo());
                        System.out.println("Menabung Rp 50.000");
                                rekeningBudi.tabung(50000);
                        System.out.println("Rekening Budi sekarang = " + rekeningBudi.cekSaldo());
                        System.out.println("Mengambil Rp 20.000");
                                rekeningBudi.ambil(20000);
                        System.out.println("Rekening Budi sekarang = " +
                                rekeningBudi.cekSaldo());
 }
}
