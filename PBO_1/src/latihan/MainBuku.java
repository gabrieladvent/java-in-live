/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class MainBuku {
    
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		Peminjam1 peminjam1 = new Peminjam1("A", "Ucup", "LA");
		Peminjam1 peminjam2 = new Peminjam1("B", "Otong");
		peminjam2.setAlamat("WDC");
		Peminjam1 peminjam3 = new Peminjam1("C");
		peminjam3.setNama("Asep");
		peminjam3.setAlamat("NYC");
		
		
		Buku1 buku1 = new Buku1("001");
		buku1.setNamaPeminjam(peminjam1);
		buku1.setLamaSewa(5);
		
		Buku1 buku2 = new Buku1("002");
		buku2.setNamaPeminjam(peminjam2);
		buku2.setLamaSewa(11);
		Buku1 buku3 = new Buku1("003");
		buku3.setNamaPeminjam(peminjam3);
		buku3.setLamaSewa(6);
		
		buku1.show();
		System.out.println();
		buku2.show();
		System.out.println();
		buku3.show();
	}
}
