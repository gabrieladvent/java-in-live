/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_6;
import Hitung.hitung;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Static {
public static void main(String [] args){
        Scanner bie = new Scanner(System.in);
        
        System.out.print("Masukan Nama Pegawai:\t \t\t ");
        String nma = bie.next();
        System.out.print("Masukan Jumlah Jam Deflaut:\t\t ");
        int jm = bie.nextInt();
        System.out.print("Masukan Jumlah Jam Kerja "+nma+":\t\t ");
        int jam = bie.nextInt();
        System.out.print("Masukan Upah Per Jam Untuk Tiap Pegawai: Rp ");
        int upah = bie.nextInt();
        
        
        System.out.println("Berdasarkan Perhitungan, Pegawai dengan nama: "+nma+""
                + "\nMendapat Gaji Lembur Sebesar: Rp "+hitung.gaji(jam, jm, upah));
}
}
