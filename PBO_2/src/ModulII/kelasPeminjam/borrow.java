/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModulII.kelasPeminjam;

import java.time.LocalDate;
public class borrow {
    private String nama, status, judulBuku;
    private int id;
    private LocalDate tglpinjam, tglkembali;
    
public borrow (){}
public borrow (String nama, String status, int id, String judulBuku, 
        LocalDate tglpinjam, LocalDate tglkembali){
    this.nama = nama;
    this.status = status;
    this.judulBuku = judulBuku;
    this.id = id;
    this.tglpinjam = tglpinjam;
    this.tglkembali = tglkembali;
}

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getjudulBuku() {
        return judulBuku;
    }
    public void setjudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getTglpinjam() {
        return tglpinjam;
    }
    public void setTglpinjam(LocalDate tglpinjam) {
        this.tglpinjam = tglpinjam;
    }

    public LocalDate getTglkembali() {
        return tglkembali;
    }
    public void setTglkembali(LocalDate tglkembali) {
        this.tglkembali = tglkembali;
    }
}
