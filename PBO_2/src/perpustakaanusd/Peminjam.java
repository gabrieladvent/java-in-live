/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaanusd;
import java.util.LinkedList;

/**
 *
 * @author Katharina Tyas
 */
public abstract class Peminjam {
    private String nama;
    private String alamat;
    private LinkedList<Koleksi> pinjam = new LinkedList();
    private int telatPengembalian = 0;
    
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

    public int getTelatPengembalian() {
        return telatPengembalian;
    }

    public void setTelatPengembalian(int lamaKembali) {
        this.telatPengembalian = lamaKembali;
    }
    
    public void tambahPinjam (Koleksi k) {
        this.pinjam.add(k);
    }
    
    public Koleksi kembaliPinjaman (Koleksi k) {
        for (int i = 0; i < this.pinjam.size(); i++) {
            if (this.pinjam.get(i)==k) {
                return this.pinjam.remove();
            }
        } return null;
    }
    
    public void daftarPinjam() {
        System.out.println (" \n Daftar Peminjaman Koleksi");
        System.out.println (" No \tId\tJudul");
        System.out.println (" -------------------------------- ");
        for (int i = 0; i < this.pinjam.size(); i++){
            System.out.println(" " + (i+1)+ "\t"+this.pinjam.get(i).getIdKoleksi()+"\t"+
                    this.pinjam.get(i).getJudul());
        }
        System.out.println (" ");
    }
}
