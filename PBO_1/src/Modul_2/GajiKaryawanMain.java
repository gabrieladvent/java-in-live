/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_2;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class GajiKaryawanMain {
       public static void main(String [] args){
           Scanner bie = new Scanner(System.in);
           Pegawai gajiBudi = new Pegawai();
            double gol;
            double stas;
           
           System.out.print("Silahkan Masukan Nama Anda: ");
           String nma = bie.next();
           gajiBudi.setNama(nma);
           
           System.out.print("Silahkan Masukan NPP Anda: ");
           String npp = bie.next();
           gajiBudi.setNPP(npp);
          
           
           do{
               System.out.print("Silahkan Masukan Golongan Karyawan Anda: ");
                gol = bie.nextDouble();
                if (gol == 1){
                    gajiBudi.setGolongan(1300000);
                } else if (gol == 2){
                    gajiBudi.setGolongan(1750000);
                }else if (gol == 3){
                    gajiBudi.setGolongan(2000000);
                }else {
                    System.out.println("Golongan Anda Tidak Terdaftar.\nSilahkan Masukan Ulang");
                }
           } while (gol < 1 || gol > 3);
                
           do{
               System.out.println("Status Anda: ");
               System.out.println("1. Menikah\n2. Belum Menikah");
               System.out.print("Silahkan Memilih Status Anda: ");
               stas = bie.nextDouble();
                        if (stas == 1){
                            System.out.print("Berapa Jumlah Anak Anda: ");
                            double anak = bie.nextDouble();
                            gajiBudi.setJmlhAnak(anak);
                            System.out.println("Tunjangan yang Anda Dapatkan Sebesar: Rp"+gajiBudi.tunjanganKeluarga());
                            System.out.println("Selamat!!!");
                            System.out.println("Gaji Anda Sebesar: Rp"+gajiBudi.GajiTotal());
                        }
                        else if (stas == 2){
                            System.out.println("Anda tidak mendapatkan tunjangan dari perusahaan");
                            System.out.println("Selamat!!!");
                            System.out.println("Gaji Anda Sebesar: Rp"+gajiBudi.HitungGaji());
                        } 
                        else {
                            System.out.println("Format yang anda masukan salah\nSilahkan masukan ulang");
                        }
           } while (stas < 1 || stas > 2);
       }
}
