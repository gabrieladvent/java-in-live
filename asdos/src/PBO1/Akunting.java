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
public class Akunting extends Pegawai {//deklarasi sub class
    Akunting(String nip, String nama, String alamat, int golongan, int jumlahAnak){//deklarasi constructor dengan parameter
        super(nip, nama, alamat, golongan, jumlahAnak);//deklarasi variabel yang merujuk ke variabel pada class Pegawai  
    }
    private double tunjanganJabatan;//deklarasi variabel dengan nama tunjanganJabatan bertipe double (private)

    public double getTunjanganJabatan() {//deklarasi method getter TunjanganJabatan
        return tunjanganJabatan;//mengembalikan nilai tunjanganjabatan
    }

    public void setTunjanganJabatan(double tunjanganJabatan) {//deklarasi method setter TunjanganJabatan
        this.tunjanganJabatan = tunjanganJabatan;//nilai variabel this.tunjanganJabatan = tunjanganJabatan
    }
    public double hitungGajiTotal(){//deklarasi method
        double bantu = tunjanganJabatan;
        double ban = super.getGajiPokok() + bantu;
        return ban;
    }
}
