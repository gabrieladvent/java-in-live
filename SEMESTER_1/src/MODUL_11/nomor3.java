/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_11;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class nomor3 {
    public static void main(String[] args) {
        int[] skor = new int[5];
        int[] cadangan = skor;
        
        Scanner bie = new Scanner(System.in);
        System.out.println("Masukkan 5 data bulat");
        
        //Membaca 5 data bulat
        for(int i = 0; i <=4; i++){
            System.out.print("Data ke "+(i + 1)+" : ");
            skor[i] = bie.nextInt();
        }
        //Menampilkan data dari akhir ke awal
        for(int i=0; i <= 4; i++) System.out.println("Data ke "+ (i+1) +" adalah "+skor[4-i]);
        System.out.println();
        for(int i=0; i <= 4; i++) System.out.println("Data ke "+ (i+1) +" adalah "+cadangan[4-i]); 
        
    }           
}
