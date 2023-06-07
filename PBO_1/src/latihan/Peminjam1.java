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
public class Peminjam1 {
    
	private String idPeminjam, nama, alamat;

	public Peminjam1(String idPeminjam, String nama, String alamat) {
		setIdPeminjam(idPeminjam);
		setNama(nama);
		setAlamat(alamat);
	}
	public Peminjam1 (String idPeminjam, String nama) {
		setIdPeminjam(idPeminjam);
		setNama(nama);
	}
	public Peminjam1(String idPeminjam) {
		setIdPeminjam(idPeminjam);
	}
	
	public String getIdPeminjam() {
		return idPeminjam;
	}

	public void setIdPeminjam(String idPeminjam) {
		this.idPeminjam = idPeminjam;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
}
