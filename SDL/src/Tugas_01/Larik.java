/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_01;

/**
 *
 * @author ACER
 */
public class Larik {
    public static void Cetak (int[] data){
        for(int i = 0; i < data.length; i++){
            System.out.print(data [i] + ", ");
            
        }
    }
    public static void cetak1 (Mhs [] mahasiswa){
        for (Mhs mahasiswa1: mahasiswa){
            System.out.print(mahasiswa1.getNama() + ", ");
            System.out.println("");
        }
    }
}
