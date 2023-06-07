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
public class Pegawai { //deklarasi class

    private String nip;//deklarasi variabel dengan nama "nip" bertipe String (private)
    private String nama;//deklarasi variabel dengan nama "nama" bertipe String (private)
    private String alamat;//deklarasi variabel dengan nama "alamat" bertipe String (private)
    private int golongan;//deklarasi variabel dengan nama "golongan" bertipe int (private)
    private int jumlahAnak;//deklarasi variabel dengan nama "jumlahAnak" bertipe int (private)
    private int jamLembur;//deklarasi variabel dengan nama "jamLembur" bertipe int (private)
    private double gajiTotal;//deklarasi variabel dengan nama "gajiTotal" bertipe double (private)

    Pegawai() {//deklarasi constructor tanpa parameter
    }

    Pegawai(String nip, String nama, String alamat, int golongan, int jumlahAnak) {//deklarasi constructor dengan parameter
        this.nip = nip;//nilai variabel this.nip = nip
        this.nama = nama;//nilai variabel this.nama = nama
        this.alamat = alamat;//nilai variabel this.alamat = alamat
        this.golongan = golongan;//nilai variabel this.golongan = golongan
        this.jumlahAnak = jumlahAnak;//nilai variabel this.jumlahAnak = jumlahAnak
    }

    public String getNip() {//deklarasi method getter Nip
        return nip;//mengembalikan nilai nip
    }

    public void setNip(String nip) {//deklarasi method setter Nip
        this.nip = nip;//nilai variabel this.nip = nip
    }

    public String getNama() {//deklarasi method getter Nama
        return nama;//mengembalikan nilai nama
    }

    public void setNama(String nama) {//deklarasi method setter Nama
        this.nama = nama;//nilai variabel this.nama = nama
    }

    public String getAlamat() {//deklarasi method getter Alamat
        return alamat;//mengembalikan nilai alamat
    }

    public void setAlamat(String alamat) {//deklarasi method setter Alamat
        this.alamat = alamat;//nilai variabel this.alamat = alamat
    }

    public int getGolongan() {//deklarasi method getter Golongan
        return golongan;//mengembalikan nilai golongan
    }

    public void setGolongan(int golongan) {//deklarasi method setter Golongan
        this.golongan = golongan;//nilai variabel  this.golongan = golongan
    }

    public int getJumlahAnak() {//deklarasi method getter JumlahAnak
        return jumlahAnak;//mengembalikan nilai jumlahAnak
    }

    public void setJumlahAnak(int jumlahAnak) {//deklarasi method setter JumlahAnak
        this.jumlahAnak = jumlahAnak;//nilai variabel this.jumlahAnak = jumlahAnak
    }

    public int getJamLembur() {//deklarasi method getter JamLembur
        return jamLembur;//mengembalikan nilai jamLembur
    }

    public void setJamLembur(int jamLembur) {//deklarasi method setter JamLembur
        this.jamLembur = jamLembur;//nilai variabel this.jamLembur = jamLembur
    }

    public double getGajiTotal() {//deklarasi method getter GajiTotal
        return gajiTotal;//mengembalikan nilai gajiTotal
    }

    public void setGajiTotal(double gajiTotal) {//deklarasi method setter GajiTotal
        this.gajiTotal = gajiTotal;//nilai variabel this.gajiTotal = gajiTotal
    }

    public double hitungGajiPokok() {//deklarasi method hitungGajiPokok
        double gajiPokok;//deklarasi variabel dengan nama "gajiPokok" bertipe double
        switch (golongan) {//perintah switch untuk variabel golongan
            case (1)://
                gajiPokok = 1000000;//nilai variabel gajiPokok = 1000000
                break;//perintah break
            case (2)://
                gajiPokok = 1500000;//nilai variabel gajiPokok = 1500000
                break;//perintah break
            case (3)://
                gajiPokok = 2000000;//nilai variabel gajiPokok = 2000000
                break;//perintah break
            case (4)://
                gajiPokok = 3000000;//nilai variabel gajiPokok = 3000000
                break;//perintah break
            default://perintah default
                gajiPokok = 0;//nilai variabel gajiPokok = 0
        }
        return gajiPokok;//mengembalikan nilai variabel gajiPokok
    }

    public double getGajiPokok() {//deklarasi method getter GajiPokok
        return hitungGajiPokok();//mengembalikan nilai variabel hitungGajiPokok()
    }

    public double hitungGajiTotal() {//deklarasi method hitungGajiTotal 
       // gajiTotal = hitungGajiPokok();//nilai variabel gajiTotal = hitungGajiPokok
        return gajiTotal;
    }
}
