/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO1;

import java.util.Scanner;

/**
 *
 * @author Tak Bertuan
 */
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        DataPasien obj1 = new DataPasien();
        DataDokter obj2 = new DataDokter();
        Resep obj3 = new Resep();
        
        System.out.print("Nama Dokter: ");
        obj2.setN(in.next());
        System.out.print("ID: ");
        obj2.setID(in.next());
        System.out.print("Alamat: ");
        obj2.setA(in.next());
        
        System.out.print("Obat: ");
        obj3.setObat(in.next());
        
        System.out.print("Pasien: ");
        obj1.setNama(in.next());
        System.out.print("Umur: ");
        obj1.setUmur(in.next());
        System.out.print("Alamat: ");
        obj1.setAlamat(in.next());
//        obj1.setNm(obj2.getN());
//        obj1.setObt(obj3.getObat());
        
    }
}
