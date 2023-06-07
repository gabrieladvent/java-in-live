/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_10;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class nomor1 {
    static int faktorial(int m) {// metode faktorial dimulai dari baris ini
	int hasFak=1;
	if (m == 0) return 1; // karena 0 != 1
	else for(int i =1; i<=m; i++) hasFak = hasFak*i; // m! = 1 x 2 x … x m
	return hasFak;
	}// metode faktorial berakhir di sini

static int komb(int n, int r) { //metode untuk menghitung kombinasi
    int kombinasi = faktorial(n) / ((faktorial(n-r)) * faktorial(r));
    return kombinasi; 
}

public static void main(String[] args) {
	int n,r, hasilFaktorial;
	Scanner bie = new Scanner(System.in);
                System.out.println("SELAMAT DATANG DI PERHITUNGAN FAKTORIAL DAN KOMBINASI");
                System.out.println("=====================================================");
        do {
	System.out.print("Masukkan nilai n : ");
	n = bie.nextInt();
	System.out.print("Masukkan nilai r : ");
	r = bie.nextInt();
                        if (n <= r) {
                        System.out.println();
                        System.out.println("Silahkan memasukan ulang nilai n dan r dengan ketentuan n <= r"); }
        } while (n <= r);
        System.out.println();
                
	 // memanggil faktorial()
                System.out.println("Jadi nilai "+n+"! adalah: "+faktorial(n));
                System.out.println("Jadi nilai "+r+"! adalah: "+faktorial(r));
	System.out.println("Dan nilai dari "+n+" kombinasi "+r+" adalah: " + komb(n, r));
                System.out.println("                              terima kasih :) ");
	}
  }


