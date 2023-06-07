/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pert9;//deklarasi package

import java.util.Scanner;//deklarasi import scanner

/**
 *
 * @author komp Fernando Alvin_215314176
 */
public class DivisiMain {//deklarasi main class

    public static void main(String[] args) {//deklarasi main method
        String[] namaDiv = {"Akunting", "Pemasaran", "Kepegawaian"};//mengisi parameter namaDiv
        Scanner sc = new Scanner(System.in);//deklarasi scanner
        Pegawai peg1 = null;//nilai variabel Pegawai peg1 = null
        Pegawai kepala = null;//nilai variabel Pegawai kepala = null
        Divisi[] div = new Divisi[1]; //Array of objects

        for (int i = 0; i < div.length; i++) {//deklarasi looping for
            div[i] = new Divisi();//variabel div[i] berisi data class Divisi()
            System.out.println("Pilih tipe divisi " + (i + 1) + ":\n 1. " + namaDiv[0] + " \n 2. " + namaDiv[1] + " \n 3. " + namaDiv[2] + " ");
            //cetak tulisan "Pilih tipe divisi " + (i + 1) + ":\n 1. " + namaDiv[0] + " \n 2. " + namaDiv[1] + " \n 3. " + namaDiv[2] + " "
            System.out.print("Divisi: ");//cetak tulisan "Divisi: " 
            int pilih = sc.nextInt();//mengisi nilai variabel pilih melalui keyboard
            div[i].setNama(namaDiv[pilih - 1]);//mengisi nilai method setNama
            System.out.println("=======================================");//cetak tulisan "======================================="
            System.out.println("Divisi " + (i + 1) + " " + div[i].getNama());//cetak tulisan "Divisi " + (i + 1) + " " + div[i].getNama()
            System.out.println("Masukkan Data Kepala Divisi : ");//cetak tulisan "Masukkan Data Kepala Divisi : "
            System.out.print("Masukkan NIP : ");//cetak tulisan "Masukkan NIP : "
            String nip = sc.next();//mengisi nilai variabel nip melalui keyboard
            System.out.print("Masukkan Nama: ");//cetak tulisan "Masukkan Nama: "
            String nama = sc.next();//mengisi nilai variabel nama melalui keyboard
            System.out.print("Masukkan Alamat: ");//cetak tulisan "Masukkan Alamat: "
            String alamat = sc.next();//mengisi nilai variabel alamat melalui keyboard
            System.out.print("Masukkan Golongan: ");//cetak tulisan "Masukkan Golongan: "
            int gol = sc.nextInt();//mengisi nilai variabel gol melalui keyboard
            System.out.print("Masukkan Jumlah Anak: ");//cetak tulisan "Masukkan Jumlah Anak: "
            int jumAnak = sc.nextInt();//mengisi nilai variabel jumAnak melalui keyboard
            System.out.print("Masukkan Jam Lembur: ");//cetak tulisan "Masukkan Jam Lembur: "
            int jamLem = sc.nextInt();//mengisi nilai variabel jamLem melalui keyboard
            switch (pilih) {//deklarasi perintah switch
                case 1://deklarasi perintah case 1
                    kepala = new Akunting(nip, nama, alamat, gol, jumAnak);//isi case 1 merupakan data sub class Akunting
                case 2://deklarasi perintah case 2
                    kepala = new Pemasaran(nip, nama, alamat, gol, jumAnak);//isi case 2 merupakan data sub class Pemasaran
                case 3://deklarasi perintah case 3
                    kepala = new Kepegawaian(nip, nama, alamat, gol, jumAnak);//isi case 3 merupakan data sub class Kepegawaian
            }
            kepala.setJamLembur(jamLem);//mengisi data method setJamLembur kepala divisi
            div[i].setKepalaDivisi(kepala);//mengisi data method setKepalaDivisi

        }
        //Tampilkan data
        double gatot;//deklarasi variabel dengan nama gatot bertipe double
        for (int j = 0; j < div.length; j++) {//deklarasi looping for
            System.out.println("Data divisi " + div[j].getNama());//cetak tulisan "Data divisi " + cetak isi variabel div[j].getNama()
            System.out.println("Data Kepala Divisi :");//cetak tulisan "Data Kepala Divisi :"
            System.out.println("    NIP\t: " + div[j].getKepalaDivisi().getNip());
            //cetak tulisan "    NIP\t: " + cetak isi div[j].getKepalaDivisi().getNip()
            System.out.println("    Nama\t: " + div[j].getKepalaDivisi().getNama());
            //cetak tulisan "    Nama\t: " + cetak isi div[j].getKepalaDivisi().getNama()
            System.out.println("    Golongan\t: " + div[j].getKepalaDivisi().getGolongan());
            //cetak tulisan "    Golongan\t: " + cetak isi div[j].getKepalaDivisi().getGolongan()
            System.out.println("    Alamat\t: " + div[j].getKepalaDivisi().getAlamat());
            //cetak tulisan "    Alamat\t: " + cetak isi div[j].getKepalaDivisi().getAlamat()
            System.out.println("    Jumlah anak\t: " + div[j].getKepalaDivisi().getJumlahAnak());
            //cetak tulisan "    Jumlah anak\t: " + cetak isi div[j].getKepalaDivisi().getJumlahAnak()
            System.out.println("    Jam lembur\t: " + div[j].getKepalaDivisi().getJamLembur());
            //cetak tulisan "    Jam lembur\t: " + cetak isi div[j].getKepalaDivisi().getJamLembur()
            System.out.println("    Besar Gaji Pokok : " + div[j].getKepalaDivisi().getGajiPokok());
            //cetak tulisan "    Besar Gaji Pokok : " + cetak isi div[j].getKepalaDivisi().getGajiPokok()
            gatot = 0;
            System.out.println("\n");
            System.out.println("Data Pegawai Divisi :");
            for (int k = 0; k < div[j].getJum(); k++) {
                System.out.println("    Pegawai ke-" + k + 1 + " : " + div[j].getAnggota(k));
                System.out.println("    NIP\t: " + div[j].getAnggota(k).getNip());
                System.out.println("    Nama\t: " + div[j].getAnggota(k).getNama());
                System.out.println("    Golongan\t: " + div[j].getAnggota(k).getGolongan());
                System.out.println("    Alamat\t: " + div[j].getAnggota(k).getAlamat());
                System.out.println("    Jumlah anak\t: " + div[j].getAnggota(k).getJumlahAnak());
                System.out.println("    Jam lembur\t: " + div[j].getAnggota(k).getJamLembur());
                System.out.println("    Besar Gaji Pokok : " + div[j].getAnggota(k).getGajiPokok());

                if (div[j].getAnggota(k) instanceof Akunting) {
                    System.out.println("    Besar tunjangan jabatan: " + ((Akunting) div[j].getAnggota(k)).getTunjanganJabatan());
                } else if (div[j].getAnggota(k) instanceof Pemasaran) {
                    System.out.println("    Besar bonus " + ((Pemasaran) div[j].getAnggota(k)).getBonus());
                } else if (div[j].getAnggota(k) instanceof Kepegawaian) {
                    System.out.println("    Besar tunjangan jabatan: " + ((Kepegawaian) div[j].getAnggota(k)).getTunjanganTransport());
                }
                System.out.println("    Besar gaji total: " + div[j].getAnggota(k).getGajiTotal());
                gatot += div[j].getAnggota(k).hitungGajiTotal();
            }

        }

    }
}
