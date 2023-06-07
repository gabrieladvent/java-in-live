/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_7_Latihan;

import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class MainDealer {
public static void main(String[] agrs){
        Mobil[] daftarmobil;
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan jumlah Mobil : "));
        daftarmobil = new Mobil[n];
        Dealer dlr = new Dealer("Gab's Dealer","Gabriel");
        dlr.setMobil(daftarmobil);
        dlr.setAlamat("Gang Rambutan, Jl. Kanigoro");
        dlr.setNPWP("Penyedia Mobil-Mobil Mewah");
        
        for (int i = 0; i < daftarmobil.length; i++){
                String warna = JOptionPane.showInputDialog(null, "Masukkan warna mobil : " );
                String merk = JOptionPane.showInputDialog(null, "Masukkan merk mobil : " );
                daftarmobil[i] = new Mobil();
                daftarmobil[i].setWarna(warna);
                daftarmobil[i].setMerk(merk);
        }
        //mencetak//
        System.out.println("Nama Dealer :"+dlr.getNamaDealer());
        System.out.println("Pemilik     :"+dlr.getPemilik());
        System.out.println("Alamat      :"+dlr.getAlamat());
        System.out.println("NPWP        :"+dlr.getNPWP());
        System.out.println("\t Daftar Mobil");
        System.out.println("====================================");
        System.out.println("No \t Warna     \t Merk");
        System.out.println("------------------------------------");
        for(int i = 0; i <daftarmobil.length; i++){
             System.out.println((i+1)+ "\t"+daftarmobil[i].getWarna()+ "\t   "+daftarmobil[i].getMerk());
        }
        //mencari mobil//
        String wrn = JOptionPane.showInputDialog(null, "Masukan Warna yang dicari :");
        for (Mobil daftarmobil1 : daftarmobil) {
        if (daftarmobil1.getWarna().equals(wrn)) {
            System.out.println(daftarmobil1.getWarna() + " Adalah Mobil: " + daftarmobil1.getMerk());
        }
    }
        System.out.println("------------------------------------");
}

}
