/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author ACER
 */
public class Buku1 {
    
	private String kodeBuku;
	private Peminjam1 namaPeminjam;
	private int lamaSewa;
	private static final int biayaPinjamPaket = 10000;
	private static final int jumlahHariPinjamPaket = 6;
	private static final int biayaDendaPerhari = 1000;	
	
	public Buku1(String kodeBuku) {
		setKodeBuku(kodeBuku);
	}
	public String getKodeBuku() {
		return kodeBuku;
	}
	public void setKodeBuku(String kodeBuku) {
		this.kodeBuku = kodeBuku;
	}
	public Peminjam1 getNamaPeminjam() {
		return namaPeminjam;
	}
	public void setNamaPeminjam(Peminjam1 namaPeminjam) {
		this.namaPeminjam = namaPeminjam;
	}
	public int getLamaSewa() {
		return lamaSewa;
	}
	public void setLamaSewa(int lamaSewa) {
		this.lamaSewa = lamaSewa;
	}
	
	public double biayaPinjamSatuBuku(int jumlahHariPinjam) {
		return biayaPinjamPaket+(jumlahHariPinjam - jumlahHariPinjamPaket) * biayaDendaPerhari;
	}
	
	public void show() {
		System.out.println("Kode Buku \t: " + getKodeBuku());
		System.out.println("Nama Penyewa \t: " + getNamaPeminjam().getNama());
		System.out.println("Lama Sewa \t: " + getLamaSewa());
		System.out.println("Biaya Pinjam \t: " + biayaPinjamSatuBuku(getLamaSewa()));
	}
}
