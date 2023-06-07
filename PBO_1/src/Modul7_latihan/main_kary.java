/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul7_latihan;

import Modul7_latihan.karyawan_7;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class main_kary extends karyawan_7 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukan Jumlah Pegawai: ");
        int n = inp.nextInt();
        karyawan_7[] obj1;
        obj1 = new karyawan_7[n];

        for (int i = 0; i < obj1.length; i++) {
            obj1[i] = new karyawan_7();
            System.out.print("Masukan Nama Pegawai "+(i + 1)+": ");
            String nm = inp.next();
            obj1[i].nma = nm;
            System.out.print("Masukan NPP Pegawai: ");
            int npp = inp.nextInt();
            obj1[i].npp = npp;
            System.out.print("Masukan Jumlah Anak Pegawai: ");
            int anak = inp.nextInt();
            obj1[i].total_tunj(anak);
            obj1[i].jmlh_anak = anak;
            obj1[i].kary();
            System.out.println("");
        }
        System.out.println("");
        System.out.println("DAFTAR GAJIAN PEGAWAI");
       System.out.println("Nama  ||  NPP  ||  Jenis Karyawan  ||  Jumlah Anak  ||  Gaji");
        for (int i = 0; i < obj1.length; i++) {
            System.out.println(obj1[i].nma + "   ||  " + obj1[i].npp + "  ||          " + obj1[i].jens + "       ||     "
                                        + obj1[i].jmlh_anak + "         ||  " + obj1[i].gaji);
        }
        System.out.println("");
        System.out.println("Catatan:");
        System.out.println("Jika jenis karyawan 1: Karyawan tetap\nJika jenis karyawan 2: Karyawan kontrak");
    }
}
