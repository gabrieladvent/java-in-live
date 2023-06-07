/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_3;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class perpusMain {
    public static void main(String [] args){
        Scanner bie = new Scanner(System.in);
        cetakan terbit = new cetakan("Erlangga", "1999");
        terbit.setAlamat("Gang Rambut, Jl. Kanigoro, Yogyakarta");
     
        DataBuku perp = new DataBuku();
        System.out.print("Nama Buku yang dicari: ");
        String nmbuku = bie.next();
        perp.setJudul(nmbuku);
        
        System.out.print("Tahun Terbit\t: ");
        int thn = bie.nextInt();
        perp.setTahun_terbit(thn);
        perp.setKode_buku("01122000");
        perp.setNama_penulis("Sukina");
        perp.setPenerbit(terbit);
        
        cetakan terbt = perp.getPenerbit();
        String nm = terbt.getNama_penerbit();
        String almt = terbt.getAlamat();
        
        System.out.println("");
        System.out.println("Buku yang dicari\t: "+perp.getJudul());
        System.out.println("Penulis Buku\t\t: "+perp.getNama_penulis());
        System.out.println("Tahun Terbit Buku\t: "+perp.getTahun_terbit());
        System.out.println("Penerbit\t\t: "+nm);
        System.out.println("Tahun Berdiri\t\t: "+ terbit.getTahun_berdirinya());
        System.out.println("Alamat\t\t\t: "+almt);
        if(perp.thn_trbt() > 5){
            System.out.println("Buku ini buku lama");
        } else {
            System.out.println("Buku ini buku baru");
        }
        }
    }

