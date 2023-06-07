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
public class mainmahasiswa {
public static void main(String [] args){
        MahasiswaS1 obj1 = new MahasiswaS1();
            obj1.setNama("Gabriel Advent Batan");
            obj1.setNim("205314096");
            obj1.setUts1(98);
            obj1.setUts2(90);
            obj1.setUas(87);
        MahasiswaS2 obj2 = new MahasiswaS2();
            obj2.setNama("Yohana Christanty Golu Ritan");
            obj2.setNim("121214093");
            obj2.setUts1(87);
            obj2.setUts2(80);
            obj2.setUas(70);
            
        System.out.println("SELAMAT DATANG DIPERHITUNGAN NILAI AKHIR");
        System.out.println("--Untuk Mahasiswa S1--");
        System.out.println("Nama Mahasiswa:\t "+obj1.getNama());
        System.out.println("Nim:\t \t "+obj1.getNim());
        System.out.println("UTS 1  |  UTS 2  |  UAS");
        System.out.println(obj1.getUts1()+"   |  "+obj1.getUts2()+"   |  "+obj1.getUas());
        System.out.println("Nilai Akhir:\t "+obj1.nilaifinal());
        obj1.nilai();
        System.out.println("");
        System.out.println("--Untuk Mahasiswa S2--");
        System.out.println("Nama Mahasiswa:\t "+obj2.getNama());
        System.out.println("Nim:\t \t "+obj2.getNim());
        System.out.println("UTS 1  |  UTS 2  |  UAS");
        System.out.println(obj2.getUts1()+"   |  "+obj2.getUts2()+"   |  "+obj2.getUas());
        System.out.println("Nilai Akhir:\t "+obj2.nilaifinal());
        obj2.nilai();
}
}
