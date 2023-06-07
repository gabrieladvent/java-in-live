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
public class mainPerpus2 {
public static void main(String[] args){
           karangan[] pengarang;
          perpus lbr = new perpus("Sadhar", "Yogya");
          
          int n = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Buku: "));
          Buku[] bk = new Buku[n];
          Perpus_1 [] perp = new Perpus_1[n];
          for(int i = 0; i < bk.length; i++){
                String judul = JOptionPane.showInputDialog(null, "Masukan Judul Buku "
                    + (i + 1) + " :");
                String kode = JOptionPane.showInputDialog(null, "Masukan Kode Buku :");
                int tahun = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan Tahun Terbit Buku :"));
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
                bk[i] = new Buku();
                bk[i].setJudul(judul);
                bk[i].setKode(kode);
                bk[i].setTerbit(tahun);
                bk[i].setPengarang(pengarang);
                
          }
          for(int i = 0; i < perp.length; i++){
              perp[i].setKoleksi(bk);
          }
          String nm = JOptionPane.showInputDialog(null, "Masukan Judul Buku ");
          Perpus_1.cari(nm);
}
}
