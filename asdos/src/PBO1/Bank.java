/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO1;

/**
 *
 * @author Tak Bertuan
 */

public class Bank {
    public static final int MAX_NASABAH=20;
    private String namaBank;
    private RekeningBank[] nasabah;
    private int jum_nasabah;

    

    public Bank(String namaBank) {
        this.namaBank = namaBank;
        nasabah=new RekeningBank[MAX_NASABAH];
        jum_nasabah=0;
    }

    public String getNamaBank() {
        return namaBank;
    }

    public void setNamaBank(String namaBank) {
        this.namaBank = namaBank;
    }
    public int getJum_nasabah() {
        return jum_nasabah;
    }
    public RekeningBank[] getNasabah() {
        return nasabah;
    }

    public RekeningBank getNasabah(int index) {
        return nasabah[index];
    }
    public void setNasabah(RekeningBank nasabah) {
        this.nasabah[this.jum_nasabah] = nasabah;
        this.jum_nasabah++;
    }
        

}

