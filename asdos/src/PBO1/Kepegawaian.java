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
public class Kepegawaian extends Pegawai {///deklarasi sub class
    Kepegawaian(String nip, String nama, String alamat, int golongan, int jumlahAnak){//deklarasi constructor dengan parameter
        super(nip, nama, alamat, golongan, jumlahAnak);//deklarasi variabel yang merujuk ke variabel pada class Pegawai
    }
    private double tunjanganTransport;//deklarasi variabel dengan nama tunjanganTransport bertipe double (private)

    public double getTunjanganTransport() {//deklarasi method getter TunjanganTransport
        return tunjanganTransport;//mengembalikan nilai tunjanganjabatan
    }

    public void setTunjanganTransport(double tujanganTransport) {//deklarasi method setter TunjanganTransport
        this.tunjanganTransport = tujanganTransport;//nilai variabel this.tunjanganTransport = tujanganTransport
    }

    public double hitungGajiTotal() {//deklarasi method
        double bantu = tunjanganTransport;
        double ban = super.hitungGajiPokok() + bantu;
        
        return ban;
    }
}
