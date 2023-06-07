/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pert9;//deklarasi package

/**
 *
 * @author komp 
 * Fernando Alvin_215314176
 */
public class Divisi { //deklarasi Kelas

    public static final int maxAnggota = 100;//deklarasi variabel dengan nama "maxAnggota" bertipe static final int (public)
    private String nama;//deklarasi variabel dengan nama "nama" bertipe tipe String (private)
    private Pegawai anggota[];//deklarasi array anggota bertipe kelas Pegawai
    private Pegawai kepalaDivisi;//deklarasi atribut kepalaDivisi bertipe kelas Pegawai
    private int jum;//deklarasi variabel dengan nama "jum" bertipe int (private)

    public Divisi() {//deklarasi constructor tanpa parameter
    }

    public Divisi(String nama) {//deklarasi constructor dengan parameter
        this.nama = nama;//nilai variabel this.nama = nama
        this.anggota = new Pegawai[maxAnggota];//nilai variabel this.anggota = new Pegawai[maxAnggota]
        this.jum = 0;//nilai variabel this.jum = 0
    }

    public void setAnggota(Pegawai diva) {//deklarasi method setter Anggota 
        this.anggota[jum] = diva;//nilai variabel this.anggota[jum] = diva
        jum++;//perintah jum inkremen
    }

    public String getNama() {//deklarasi method getter Nama
        return nama;//mengembalikan nilai variabel nama
    }

    public void setNama(String nama) {//deklarasi method setter Nama
        this.nama = nama;//nilai variabel this.nama = nama
    }

    public Pegawai[] getArrayAnggota() {//deklarasi method getter ArrayAnggota
        return anggota;//mengembalikan nilai variabel anggota
    }

    public Pegawai getAnggota(int jum) { //Metode getter ini untuk mengambil satu objek dari array anggota
        return anggota[jum];//mengembalikan nilai variabel anggota[jum]
    }

    public void setAnggota(Pegawai anggota, int a) {//deklarasi method setter Anggota
        this.anggota[a] = anggota;//nilai variabel this.anggota[a] = anggota
    }

    public Pegawai getKepalaDivisi() {//deklarasi method getter KepalaDivisi
        return kepalaDivisi;//mengembalikan nilai variabel kepalaDivisi
    }

    public void setKepalaDivisi(int a) {//deklarasi method setter KepalaDivisi
        this.kepalaDivisi = anggota[a - 1];//nilai variabel this.kepalaDivisi = anggota[a - 1]
    }

    public void setKepalaDivisi(Pegawai a) {//deklarasi method setter KepalaDivisi
        this.kepalaDivisi = a;//nilai variabel this.kepalaDivisi = a
    }

    public int getJum() {//deklarasi method getter Jum
        return jum;//mengembalikan nilai variabel jum
    }
}
