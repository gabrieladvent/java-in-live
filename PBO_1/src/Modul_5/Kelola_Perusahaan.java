/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_5;
import Modul_2.Pegawai;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Kelola_Perusahaan {
public static void main(String []args){
        Perusahaan obj1 = new Perusahaan();
        obj1.setNama("GAB'S STORE");
        obj1.setPemilik("Gabriel");
        obj1.setAlamat("Gang Rambutan, Jl. Kanigoro, Yogyakarta");
        obj1.setNpwp("Menyediakan Jasa Kurir");
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Pegawai: "));
        Pegawai [] obj2;
        obj2 = new Pegawai [n];
        int gol = 0, stas;
        
        JOptionPane.showInternalMessageDialog(null, "Silahkan Lengkapi Data Berikut");
        for(int i = 0; i < obj2.length; i++){
                obj2 [i] = new Pegawai();
                String nama = JOptionPane.showInputDialog(null, "Masukan Nama Pegawai: "+(1 + i)+" :");
                obj2[i].setNama(nama);
                String npp = JOptionPane.showInputDialog(null, "Masukan NPP Pegawai: ");
                obj2[i].setNPP(npp);
                do{
                        gol = Integer.parseInt(JOptionPane.showInputDialog("Masukan Golongan Pegawai"
                                        + " [1/2/3]: "));
                        obj2[i].setGol(gol);
                                if(gol == 1){
                                        obj2[i].setGolongan(1300000);
                                } else if (gol == 2){
                                        obj2[i].setGolongan(1750000);
                                } else if (gol == 3){
                                        obj2[i].setGolongan(2000000);
                                } else{
                                        JOptionPane.showInternalMessageDialog(null, "Data Invalid\n"
                                                + "Silahkan Mengisi Ulang");
                                }
                } while (gol < 1 || gol > 3);
                do{
                        stas = Integer.parseInt(JOptionPane.showInputDialog("Silahkan Memilih Status Pegawai\n"
                                + " Menikah/Belum Menikah [1/2]: "));
                        if (stas == 1){
                                int anak = Integer.parseInt(JOptionPane.showInputDialog("Berapa Jumlah Anak Anda: "));
                                obj2[i].setJmlhAnak(anak);
                                JOptionPane.showInternalMessageDialog(null, "Pegawai Ini Mendapatkan Tunjangan\n"
                                                + " Sebesar: "+obj2[i].tunjanganKeluarga());
                        } else if (stas == 2){
                                int anak = 0;
                                obj2[i].setJmlhAnak(anak);
                                JOptionPane.showInternalMessageDialog(null, "Pegawai Ini Tidak Mendapatkan Tunjangan");
                        } else{
                                JOptionPane.showInternalMessageDialog(null, "Data Invalid\n"
                                                + "Silahkan Mengisi Ulang");
                        }
                } while (stas < 1 || stas > 2);
                }
        
                System.out.println("");
                System.out.println("SELAMAT DATANG DI DAFTAR PEGAWAI"
                                               + " PERUSAHAAN"+ obj1.getNama());
                System.out.println("");
                System.out.println("Pemilik: "+obj1.getPemilik());
                System.out.println("NPWP:\t "+obj1.getNpwp());
                System.out.println("Alamat:\t "+obj1.getAlamat());
                System.out.println("No  |  Nama  |  NPP  |  Golongan  |  Gaji Pokok  |  Total Gaji");
                for(int i = 0; i < obj2.length; i++){
                        System.out.println((i+1)+"   |  "+obj2[i].getNama()+"   |  "+obj2[i].getNPP()+""
                                + "   |  "+obj2[i].getGol()+"   |  "+obj2[i].HitungGaji()+"   |  "+obj2[i].GajiTotal());
                }
        System.out.println("");
                //menghitung max n min//
        Pegawai tinggi, rendah;
         tinggi = obj2[0];
         rendah = obj2[0];
        
        for (int i = 1; i < obj2.length; i++) {
                if ( obj2[i].GajiTotal() > tinggi.GajiTotal()) {
                tinggi = obj2[i];
                } 
                if (obj2[i].GajiTotal() < rendah.GajiTotal()){
                   rendah = obj2[i];
                }
        }
                //rerata//
                double total = 0;
                for(int i = 0; i < obj2.length; i++){
                       total = total + obj2[i].GajiTotal();
                }
                double rerata = total / obj2.length;
                System.out.println("Berdasarkan Data, Rata-Rata Gaji Pegawai Adalah: "+rerata);
                System.out.println("Gaji Terbesar Adalah Pegawai Dengan Nama: "+ tinggi.getNama()+" "
                        + "Dengan Gaji Rp "+tinggi.GajiTotal());
                System.out.println("Gaji Terkecil Adalah Pegawai Dengan Nama: "+ rendah.getNama()+" "
                        + "Dengan Gaji Rp "+rendah.GajiTotal());
                System.exit(0);
                
}
}