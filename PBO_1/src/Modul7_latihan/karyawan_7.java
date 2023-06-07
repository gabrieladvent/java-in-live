/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul7_latihan;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class karyawan_7 {
Scanner bii = new Scanner(System.in);
        int npp, jmlh_anak, tunj, gaji, jens;
        String nma;
        final static int subs_anak = 100000;
        final int gaj_pok = 2500000;
        final int upah = 100000;
karyawan_7(){}
public int total_tunj(int jmlh){
        return tunj = jmlh * subs_anak;
}
public void kary (){
        System.out.println("1. Karyawan Tetap\n2. Karyawan Kontrak");
        System.out.print("Masukan Jenis Karyawan : ");
                int jns = bii.nextInt();
                jens = jns;
        if (jns == 1){
                this.gaji = this.gaj_pok + this.tunj;
        } else if (jns == 2){
                System.out.print("Masukan Jumlah Hari Pegawai Bekerja: ");
                        int day = bii.nextInt();
                this.gaji = (this.upah * day) + this.tunj;
        }
}
}