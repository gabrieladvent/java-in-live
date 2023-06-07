/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_7;
/**
 *
 * @author ACER
 */
public class mainKary {
public static void main(String[] args){
        KaryawanTetap obj1 = new KaryawanTetap();
                obj1.setNama("Gabriel");
                obj1.setNpp(1120);
                obj1.setJmlAnak(2);
                obj1.setGajiPok(1000000);
         KaryawanKontrak obj2 = new KaryawanKontrak();
                obj2.setNama("Agnes");
                obj2.setNpp(0507);
                obj2.setJmlAnak(3);
                obj2.setUpah(100000);
               
         System.out.println("BERIKUT DATA PEGAWAI TETAP DAN PEGAWAI KONTRAK BESERTA GAJI");
         System.out.println(" -- Data Karyawan Tetap --");
         System.out.println("Nama:\t\t"+obj1.getNama());
         System.out.println("NPP:\t\t"+obj1.getNpp());
         System.out.println("Jumlah Anak:\t"+obj1.getJmlAnak());
         System.out.println("Gaji :\t\t"+obj1.upah());
            System.out.println("");
         System.out.println(" -- Data Karyawan Kontrak --");
         System.out.println("Nama:\t\t"+obj2.getNama());
         System.out.println("NPP:\t\t"+obj2.getNpp());
         System.out.println("Jumlah Anak:\t"+obj2.getJmlAnak());
         System.out.println("Gaji :\t\t"+obj2.hitungUph());
}
}
