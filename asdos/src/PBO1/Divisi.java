/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Tak Bertuan
 */
public class Divisi {
    private String namaDivisi = "none";
    private String namaKepala = "none";
    private String [] namaPegawai = {"none"};
    
    public Divisi (){}
    public Divisi (String namaDivisi){
        this.namaDivisi = namaDivisi;
    }
    public Divisi (String namaDivisi, String namaKepala, String [] namaPegawai){
        this.namaDivisi = namaDivisi;
        this.namaKepala = namaKepala;
        this.namaPegawai = namaPegawai;
    }

    public String getNamaDivisi() {
        return namaDivisi;
    }

    public void setNamaDivisi(String namaDivisi) {
        this.namaDivisi = namaDivisi;
    }

    public String getNamaKepala() {
        return namaKepala;
    }

    public void setNamaKepala(String namaKepala) {
        this.namaKepala = namaKepala;
    }

    public String[] getNamaPegawai() {
        return namaPegawai;
    }

    public void setNamaPegawai(String[] namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    @Override
    public String toString() {
        return "Nama Divisi: " + namaDivisi
                + "\n Nama Kepala: " + namaKepala
                + "\n nama Pegawai: " + Arrays.toString (namaPegawai);
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Divisi akunting = new Divisi();
        akunting.setNamaDivisi("Akunting");
        akunting.setNamaKepala("NAndo");
        System.out.print("Masukan banyak pegawai: ");
        int jum = sc.nextInt();
        String [] pegawai = new String [jum];
        for (int i = 0; i < pegawai.length; i++) {
            System.out.print("Nama: ");
            pegawai [i]= sc.next();
        }
        akunting.setNamaPegawai(pegawai);
        System.out.println("");
        System.out.println(akunting);
    }
}
