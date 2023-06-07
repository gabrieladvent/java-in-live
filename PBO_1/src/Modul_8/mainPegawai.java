/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_8;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class mainPegawai {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double tunjangan;

        System.out.print("Banyak Pegawai: ");
        int jumpeg = inp.nextInt();

        Pegawai[] pegawai = new Pegawai[jumpeg];
        for (int i = 0; i < jumpeg; i++) {
            System.out.print("Masukan NPP Karyawan: ");
            int npp = inp.nextInt();
            System.out.print("Masukan Nama Karyawan: ");
            String nama = inp.next();
            System.out.println("PILIH JABATAN");
            System.out.println("1. Manajer\n2. Marketing\n3. Honorer");
            System.out.print("Pilih (dengan huruf): ");
             String jabat = inp.next();
            System.out.print("Masukan Gaji Pegawai: ");
            int gaji = inp.nextInt();
            if (jabat.equalsIgnoreCase("Marketing")) {
                int bonus;
                pegawai[i] = new Pemasaran();
                Pemasaran mar1;
                mar1 = (Pemasaran) pegawai[i];
                System.out.print("Gaji Bonus: ");
                bonus = inp.nextInt();
                
            } else if (jabat.equalsIgnoreCase("Manajer")) {
                double tunjab, lembur;
                pegawai[i] = new Manajer();
                Manajer man1;
                man1 = (Manajer) pegawai[i];
                System.out.print("Masukan Tunjangan Jabatan: ");
                tunjab = inp.nextDouble();
                System.out.print("Masukan gaji lembur: ");
                lembur = inp.nextDouble();
                man1.setLembur(lembur);
                man1.setTunJab(tunjab);
                
            } else if (jabat.equalsIgnoreCase("Honorer")) {
                int lembur;
                pegawai[i] = new Honorer();
                Honorer hon1;
                hon1 = (Honorer) pegawai[i];
                System.out.print("Masukan Gaji Lembur: ");
                lembur = inp.nextInt();
                hon1.setLembur(lembur);
            }
            pegawai[i].setNama(nama);
            pegawai[i].setNpp(npp);
            pegawai[i].setGapok(gaji);
        }
        System.out.println("");
        System.out.println("No  ||  NPP  ||  Nama  ||  Status  ||  Gaji Pokok  ||  Tunjangan  ||  Gaji Total  ||  Email");
        for (int i = 0; i < jumpeg; i++) {
            System.out.print((i + 1) + ".  " + pegawai[i].getNpp() + " " + pegawai[i].getNama() + " " + pegawai[i].getStatus());
            if (pegawai[i] instanceof Manajer) {
                //menampilkan status manajer dan menghitung tunjangan manajer
                Manajer man1;
                man1 = (Manajer) pegawai[i];
                System.out.print(" Manajer ");
                tunjangan = man1.getTunJab() + man1.getLembur();
            } else if (pegawai[i] instanceof Pemasaran) {
                //menampilkan status pemasaran dan menghitung tunjangannya
                Pemasaran pem1;
                pem1 = (Pemasaran) pegawai[i];
                System.out.print(" Pemasaran ");
                tunjangan = pem1.getBonus();
            } else if (pegawai[i] instanceof Honorer) {
                //menampilkan status honorer dan hitung tunjangannya
                Honorer hon1;
                hon1 = (Honorer) pegawai[i];
                System.out.print(" Honorer ");
                tunjangan = hon1.getLembur();
            }
            //dilanjutkan mencetak gajiPokok, tunjangan dan gaji total
            //untuk setiap karyawan
            System.out.println(pegawai[i].getGapok() + " " + pegawai[i].getTunjangan() + " "
                    + "" + pegawai[i].hitungGaTot() + "" + pegawai[i].getEmail());
        }
    }
}
