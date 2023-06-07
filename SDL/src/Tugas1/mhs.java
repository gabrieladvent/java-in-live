/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author ACER
 */
public class mhs {
        private String nama, nim, alamat;

    public mhs() {}

    public String getNim() {
        return nim;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        return "" + "Nama Mahasiswa\t: " + nama + "\nNIM      \t: " + nim + "\nAlamat   \t: " + alamat;
    }


}
