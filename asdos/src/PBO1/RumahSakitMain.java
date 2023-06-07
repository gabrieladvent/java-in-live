/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO1;

import java.util.Scanner;

/**
 *
 * @author Tak Bertuan
 */
public class RumahSakitMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Resep[] akun;
        akun = new Resep[2];
        Resep max, min;
        max = min = akun[0];

        String nama, nik, add, namad, obat, id;
        int harga;

        for (int i = 0; i < akun.length; i++) {
            System.out.print("Nama Dokter : ");
            namad = sc.next();
            System.out.print("ID Dokter : ");
            id = sc.next();
            System.out.print("Nama Pasien : ");
            nama = sc.next();
            System.out.print("NIK : ");
            nik = sc.next();
            System.out.print("Alamat : ");
            add = sc.next();
            System.out.print("Daftar Obat : ");
            obat = sc.next();
            System.out.print("Total Harga : ");
            harga = sc.nextInt();
            akun[i] = new Resep();
            akun[i].setNamaP(nama);
            akun[i].setNIK(nik);
            akun[i].setAlamat(add);
            akun[i].setNamaD(namad);
            akun[i].setId(id);
            akun[i].setDaftar(obat);
            akun[i].setTotal(harga);
        }
        for (int i = 0; i < akun.length; i++) {
            if (akun[i].getTotal() < min.getTotal()) {
                min = akun[i];
            }
            if (akun[i].getTotal() > max.getTotal()) {
                max = akun[i];
            }
        }

        System.out.println();
        RumahSakit s1 = new RumahSakit("Rumah Sakit St.Elisabeth");
        s1.setObat(akun);
        System.out.println("");
        System.out.println("Selamat Datang di " + s1.getNamars());
        System.out.println("Data Administrasi Pasien : ");
        for (int i = 0; i < s1.getObat().length; i++) {
            System.out.println((i + 1) + ".) Nama Dokter : " + s1.getObat()[i].getNamaD());
            System.out.println("ID Dokter   : " + s1.getObat()[i].getId());
            System.out.println("Nama Pasien : " + s1.getObat()[i].getNamaP());
            System.out.println("NIK Pasien  : " + s1.getObat()[i].getNIK());
            System.out.println("Alamat Pasien : " + s1.getObat()[i].getAlamat());
            System.out.println("Daftar Obat Pasien : " + s1.getObat()[i].getDaftar());
            System.out.println("Total Harga Obat : " + s1.getObat()[i].getTotal());
            System.out.println("");
        }
        System.out.println("Total Obat Termahal : " + max.getTotal());
        System.out.println("Total Obat Termurah : " + min.getTotal());
    }
}