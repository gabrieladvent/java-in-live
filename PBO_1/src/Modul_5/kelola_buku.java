/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_5;

import Modul_4.Buku;
import javax.swing.JOptionPane;
public class kelola_buku {

    public static void main(String[] args) {
        karangan[] pengarang;
        int jmlh;

        int n = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Buku: "));
        Buku[] book;
        book = new Buku[n];
        for (int i = 0; i < book.length; i++) {
            book[i] = new Buku();
            String judul = JOptionPane.showInputDialog(null, "Masukan Judul Buku "
                    + (i + 1) + " :");
            book[i].setJudul(judul);
            String kode = JOptionPane.showInputDialog(null, "Masukan Kode Buku");
            book[i].setKode(kode);
            int tahun = Integer.parseInt(JOptionPane.showInputDialog("Masukan Tahun Terbit Buku"));
            book[i].setTerbit(tahun);
            jmlh = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Pengarang:"));

            pengarang = new karangan[jmlh];

            for (int j = 0; j < pengarang.length; j++) {
                String nma = JOptionPane.showInputDialog(null, "Masukan Nama Pengarang "
                        + (1 + j) + " :");
                String nik = JOptionPane.showInputDialog(null, "Masukan NIK Pengarang "
                        + (1 + j) + " :");
                String alamat = JOptionPane.showInputDialog(null, "Masukan Alamat Pengarang: ");
                pengarang[j] = new karangan(nma, nik, alamat);
            }
            book[i].setPengarang(pengarang);
        }
        System.out.println("No  |  Judul Buku  |  Kode Buku  |  Tahun Terbit  |  Pengarang  |  Nik Pengarang  |  Alamat Pengarang");
        for (int i = 0; i < book.length; i++) {
            System.out.print((i + 1) + " |\t " + book[i].getJudul() + " |\t " + book[i].getKode() + " |\t " + book[i].getTerbit() + " |\t  ");
            for (int j = 0; j < book[i].getPengarang().length; j++) {
                System.out.println((j + 1) + ". " + book[i].getPengarang()[j].getNama() + " |\t " + book[i].getPengarang()[j].getNik()
                        + " |\t " + book[i].getPengarang()[j].getAlamat());
            }
        }
        System.out.println("");
        //mencari tahun//
        int thn = Integer.parseInt(JOptionPane.showInputDialog("Masukan Tahun Yang Ingin Dicari: "));
        int count = 0;
        for (int i = 0; i < book.length; i++) {
            if (thn == book[i].getTerbit()) {
                count++;
            }
        }
        //mencari buku lama dan baru
        Buku baru, lama;
        baru = book[0];
        lama = book[0];
        for (int i = 0; i < book.length; i++) {
            if (book[i].getTerbit() > baru.getTerbit()) {
                baru = book[i];
            } else if (book[i].getTerbit() < lama.getTerbit()) {
                lama = book[i];
            }
        }
        System.out.println("Jumlah Buku yang Terbit Tahun " + thn + " Adalah: "+count);
        System.out.println("Buku Terbitan Terlama Adalah: " + lama.getJudul());
        System.out.println("Buku Terbitan Terbaru Adalah: " + baru.getJudul());
    }
}
