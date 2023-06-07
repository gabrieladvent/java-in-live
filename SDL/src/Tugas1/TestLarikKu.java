/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author ACER
 */
public class TestLarikKu {
    public static void main(String[] args) {
 long start, stop;
 LarikKu larik1 = new LarikKu(100000);
 System.out.println("Tambah Belakang data 3.14");
 larik1.tambahBelakang(3.14);
 larik1.printData();
 System.out.println("Tambah Belakang data 2.17");
 larik1.tambahBelakang(2.17);
 larik1.printData();
 System.out.println("Tambah Belakang Beberapa Kali");
 larik1.tambahBelakang(6.67);
 larik1.tambahBelakang(1.67);
 larik1.tambahBelakang(9.1);
 larik1.tambahBelakang(8.31);
 larik1.tambahBelakang(1.38);
 larik1.tambahBelakang(9.8);
 larik1.tambahBelakang(7.29);
 larik1.tambahBelakang(0.25);
 larik1.printData();
 System.out.println("Tambah Depan data 10.1");
 larik1.tambahDepan(10.1);
 larik1.printData();
 System.out.println("Cari Data 9.1");
 larik1.cariData(9.1);
 System.out.println("Cari Data -6.66");
 larik1.cariData(-6.66);
 System.out.println("Tambah Belakang 90000 Data Random");
 for(int i = 0; i < 90000; i++){
 larik1.tambahBelakang(Math.random());
 }

 System.out.println("Tambah Depan");
 larik1.tambahDepan(1.11);
 larik1.printData();
 }
} 

