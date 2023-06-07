package UAS;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tak Bertuan
 */
public class Orangsakit {
    static int[] jumlahPasien = {4, 48, 35, 86, 9, 23, 59, 8, 40, 100}; //Data jumlah pasien
    public static void main(String[] args) {
        //main memanggil method secara berurut
        perulangan();
        perhitungan();
        perbandingan();
        jumlah();
    }

    static void perulangan() {
        /*
        menghitung perulangan dari data pasien
        untuk masuk ke dalam tiap kategori
        */
        System.out.println("No.\tJumlah Pasien\t Kategori");
        System.out.println("==================================");
        for (int i = 0; i < jumlahPasien.length; i++) {

            if (jumlahPasien[i] <= 10) {
                System.out.println(i + 1 + "\t      " + jumlahPasien[i] + "\t\t " + "Hijau");
            } else if (jumlahPasien[i] > 10 && jumlahPasien[i] <= 50) {
                System.out.println(i + 1 + "\t      " + jumlahPasien[i] + "\t " + "Orange");
            } else {
                System.out.println(i + 1 + "\t      " + jumlahPasien[i] + "\t " + "Merah");
            }
        }
        System.out.println("==================================");
    }

    static void perhitungan() {
        /*
        Menghitung total pasien
        dan rata-rata dari jumlah pasien
        */
        int total = 0, rereta = 0;
        for (int i = 0; i < jumlahPasien.length; i++) {
            total += jumlahPasien[i];
            rereta = total / jumlahPasien[i];
        }
        System.out.println("Total pasien\t\t\t: " + total);
        System.out.println("Rata-rata jumlah pasien\t\t: " + rereta);
    }

    static void perbandingan() {
        /*
        Menhitung (membandingkan) jumlah pasien 
        yang terbanyak dan pasien yang paling sedikit
        */
        int max = 0, min = 0;
        for (int i = 0; i < jumlahPasien.length; i++) {
            if ((i + 1) == 1) {
                max = jumlahPasien[i];
            } else if (jumlahPasien[i] > max) {
                max = jumlahPasien[i];
            }
            if ((i + 1) == 1) {
                min = jumlahPasien[i];
            } else if (jumlahPasien[i] < min) {
                min = jumlahPasien[i];
            }
        }
        System.out.println("Jumlah pasien terbanyak\t\t: " + max);
        System.out.println("Jumlah pasien paling sedikit\t: " + min);
    }

    static void jumlah() {
        /*
        Menghitung jumlah pasien dari masing-masing daerah
        yang dibagi menjadi 3 bagians
        */
        int H = 0, K = 0, M = 0;
        for (int i = 0; i < jumlahPasien.length; i++) {
            if (jumlahPasien[i] >= 0 && jumlahPasien[i] <= 10) {
                H++;
            } else if (jumlahPasien[i] >= 11 && jumlahPasien[i] <= 50) {
                K++;
            } else if (jumlahPasien[i] > 50) {
                M++;
            }
        }
        System.out.println();
        System.out.println("Jumlah daerah zona hijau\t: " + H);
        System.out.println("Jumlah daerah zona orange\t: " + K);
        System.out.println("Jumlah daerah zona merah\t: " + M);
    }
}
