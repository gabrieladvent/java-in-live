/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoh;

/**
 *
 * @author hertada
 */
public class siswa {
    private String nama;
    private String namaortu;
    private int nilai;
    
    public siswa() {
        this.nama="noname";
        this.namaortu="none";
    }

    public siswa(String nama, String alamat, int nilai) {
        this.nama = nama;
        this.namaortu = namaortu;
        this.nilai = nilai;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the namaortu
     */
    public String getNamaortu() {
        return namaortu;
    }

    /**
     * @param namaortu the namaortu to set
     */
    public void setNamaortu(String namaortu) {
        this.namaortu = namaortu;
    }

    /**
     * @return the nilai
     */
    public int getNilai() {
        return nilai;
    }

    /**
     * @param nilai the nilai to set
     */
    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
    
}
