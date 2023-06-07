/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaanusd;
public class PerpustakaanUSD {
    public static void main(String[] args) {
        Buku novel = new Buku();
        novel.setIdKoleksi("05");
        novel.setIsbn     ("230401");
        novel.setJudul    ("Dilan");
        novel.setPenerbit ("Jefri");
        try {
            novel.setTahunTerbit(2018);
        } catch (Exception ex) {
            System.out.println(ex);
        } try {
            novel.setJumlahHalaman(150);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        Majalah bobo = new Majalah();
        bobo.setIdKoleksi("04");
        bobo.setIsbn     ("260919");
        bobo.setJudul    ("Seekor Burung Bangau");
        bobo.setPenerbit ("bobo");
        bobo.setSeries   ("1");
       try {
            bobo.setTahunTerbit(2007);
        } catch (Exception ex) {
            System.out.println(ex);
        }
       bobo.setVolume("10");
       
       Mahasiswa maba = new Mahasiswa();
       maba.setNama     ("Katharina Tyas Aprilia");
       maba.setNim      ("195314031");
       maba.setAlamat   ("Tiwir,Sumbersari");
       maba.tambahPinjam(bobo);
       maba.tambahPinjam(novel);
       
        System.out.println ("========== Perpustakaan Universitas Sanata Dharma ==========");
        System.out.println ("");
        System.out.println (" Nama Mahasiswa = " + maba.getNama());
        System.out.println (" NIM            = " + maba.getNim());
        System.out.println (" Alamat         = " + maba.getAlamat());
        maba.daftarPinjam  ();
        
        System.out.println("\n Pengembalian : ");
        
        maba.kembaliPinjaman(bobo);
        maba.setTelatPengembalian(1);
        maba.daftarPinjam();
        
        System.out.println (" Telat Pengembalian = " + maba.getTelatPengembalian());
        System.out.println (" Denda              = Rp " + maba.getdenda());
        System.out.println (" ");
        
        CD_DVD film = new CD_DVD();
        film.setIdKoleksi ("06");
        film.setJudul     ("Love is Deep");
        film.setIsbn      ("24062001");
        film.setPenerbit  ("Film Korea");
        try {
            film.setTahunTerbit(2028);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        film.setFormat("mp3");
        
        Dosen dsn = new Dosen();
        dsn.setNama("Via");
        dsn.setNip("195314036");
        dsn.setAlamat("Jogja");
        dsn.tambahPinjam(film);
        dsn.tambahPinjam(bobo);
        System.out.println (" Nama Dosen = " + dsn.getNama());
        System.out.println (" NIP        = " + dsn.getNip());
        System.out.println (" Alamat     = " + dsn.getAlamat());
        dsn.daftarPinjam();
        System.out.println ("\n Pengembalian : ");
        dsn.kembaliPinjaman(film);
        dsn.setTelatPengembalian(5);
        dsn.daftarPinjam();
        System.out.println (" Telat Mengembalikan = " + dsn.getTelatPengembalian());
        System.out.println (" Denda               = " + dsn.getDenda());
        System.out.println ();
        
        MasyarakatUmum mu = new MasyarakatUmum();
        mu.setNama    ("Margaretha Navi");
        mu.setNomorKTP("195314032");
        mu.setAlamat  ("Magelang");
        mu.tambahPinjam(bobo);
        mu.tambahPinjam(novel);
        mu.tambahPinjam(film);
        System.out.println (" Nama   = " + mu.getNama());
        System.out.println (" NIK    = " + mu.getNomorKTP());
        System.out.println (" Alamat = " + mu.getAlamat());
        mu.daftarPinjam();
        
        System.out.println ("\n Pengembalian : ");
        mu.kembaliPinjaman(bobo);
        mu.setTelatPengembalian(2);
        mu.daftarPinjam();
        System.out.println (" Telat Mengembalikan = " + mu.getTelatPengembalian());
        System.out.println (" Denda               = " + mu.getDenda());
        System.out.println ("");
        System.out.println (" ========== Terimakasih Atas Kepercayaan Anda ==========");
        System.out.println ("");
        System.out.println (" @Katharina Tyas Aprilia");
        
    }
    
    
}
