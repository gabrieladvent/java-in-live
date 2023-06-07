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
public class Pemasaran extends Pegawai {//deklarasi sub class

    Pemasaran(String nip, String nama, String alamat, int golongan, int jumlahAnak) {//deklarasi constructor dengan parameter
        super(nip, nama, alamat, golongan, jumlahAnak);//deklarasi variabel yang merujuk ke variabel pada class Pegawai
    }
    private double bonus;//deklarasi variabel dengan nama Bonus bertipe double (private)

    public double getBonus() {//deklarasi method getter Bonus
        return bonus;//mengembalikan nilai bonus
    }

    public void setBonus(double bonus) {//deklarasi method setter Bonus
        this.bonus = bonus;//nilai variabel this.bonus = bonus
    }

    public double hitungGajiTotal() {//deklarasi method
        double bantu = bonus;
        double ban = super.hitungGajiPokok() + bantu;
        return ban;
    }
}
