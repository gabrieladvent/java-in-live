/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRAKT1;

import java.util.Scanner;

/**
 *
 * @author Tak Bertuan
 */
public class main {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        Kelas pbo2 = new Kelas ();
        Dosen dosen = new Dosen ();
        
        
        System.out.print("Masukan nama dosen: ");
        dosen.setNamal(inp.next());
        System.out.print("Masukan NIP: ");
        dosen.setNip(inp.next());
        pbo2.setDosen(dosen);
        
        System.out.print("Masukan jumlah mahasiswa: ");
        int jum = inp.nextInt();
        Mahasiswa [] list = new Mahasiswa [jum];
        for (int i = 0; i < jum; i++) {
            list [i] = new Mahasiswa ();
            System.out.print("Masukan Nama mahasiswa: ");
            list [i].setNama(inp.next());
        }
        
        pbo2.setListMahasiswa(list);
        System.out.println(pbo2.getDosen().getNamal());
        for (int i = 0; i < pbo2.getListMahasiswa().length; i++) {
            System.out.println();
        }
    }
}
