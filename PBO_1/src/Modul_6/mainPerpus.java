/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_6;

import Modul_4.Buku;
import Modul_5.karangan;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class mainPerpus {
public static void main(String [] args){
     karangan[] pengarang;
          perpus lbr = new perpus("Perpustakaan Daerah Larantuka", "Larangtuka, Flores Timur");
          
          int n = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Buku: "));
          Buku[] bk = new Buku[n];
          //Perpus [] perp = new Perpus[n];
        for (int i = 0; i < bk.length; i++) {
            bk[i] = new Buku();
            String judul = JOptionPane.showInputDialog(null, "Masukan Judul Buku "
                    + (i + 1) + " :");
            bk[i].setJudul(judul);
            int tahun = Integer.parseInt(JOptionPane.showInputDialog("Masukan Tahun Terbit Buku"));
            bk[i].setTerbit(tahun);
            int jmlh = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Pengarang:"));

            pengarang = new karangan[jmlh];

            for (int j = 0; j < pengarang.length; j++) {
                String nma = JOptionPane.showInputDialog(null, "Masukan Nama Pengarang "
                        + (1 + j) + " :");
                String nik = JOptionPane.showInputDialog(null, "Masukan NIK Pengarang "
                        + (1 + j) + " :");
                String alamat = JOptionPane.showInputDialog(null, "Masukan Alamat Pengarang: ");
                pengarang[j] = new karangan(nma, nik, alamat);
            }
            bk[i].setPengarang(pengarang);
        }
        System.out.println("");
        System.out.println("Nama Perpustakaan: "+perpus.getNmaPerpus());
        System.out.println("Alamat Perpustakaan: "+perpus.getAlamat());
        System.out.println("");
        for (int i = 0; i < bk.length; i++) {
            System.out.print((i + 1) + " |\t " + bk[i].getJudul() +" |\t " + bk[i].getTerbit() + " |\t  ");
            for (int j = 0; j < bk[i].getPengarang().length; j++) {
                System.out.println((j + 1) + ". " + bk[i].getPengarang()[j].getNama() + " |\t " + bk[i].getPengarang()[j].getNik()
                        + " |\t " + bk[i].getPengarang()[j].getAlamat());
            }
        }
       
        System.out.println("");
         String nm = JOptionPane.showInputDialog(null, "Judul Buku yang dicari");
        String  search= perpus.cari(nm);
        int i = 0;
        while(i < bk.length && !bk[i].getJudul().equals(nm)){
            i++;
        }
        if (i == bk.length) {
            System.out.println("Buku Dengan Nama: "+nm + " Tidak Ditemukan ");
        }else{
            System.out.println("Judul Buku Yang Dicari : " +nm);
            System.out.println("Judul Buku : " +bk[i].getJudul());
            System.out.println("Tahun Terbit : " +bk[i].getTerbit());
            System.out.println("Nama Pengarang : " +bk[i].getPengarang() [i].getNama());
        }
}
}
