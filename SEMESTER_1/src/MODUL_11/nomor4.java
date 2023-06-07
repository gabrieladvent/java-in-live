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
public class nomor4 {
        public static void main(String[] args) {     
            int total= 0, rerata= 0, max= 0, min = 0;
        int[] skor = new int[5];
        Scanner bie = new Scanner(System.in);
        System.out.println("Masukkan 5 data bulat");
        
        //Membaca 5 data bulat
        for(int i = 0; i <=4; i++){
            System.out.print("Data ke "+(i + 1)+" \t: ");
            skor[i] = bie.nextInt();
            if ((i + 1) == 1) max = skor [i];
                else if (skor [i] > max) max = skor [i];
            if ((i + 1) == 1) min = skor [i];
                else if (skor [i] < min) min = skor [i];
        }
        
        //Menampilkan data dari akhir ke awal
        for(int i=0; i <= 4; i++) {
            System.out.println("Data ke "+ (i + 1) +" adalah "+skor [4 - i]);
                total  = total + skor[i];
        }
        
        rerata = total / 5; //seharusnya bilangan 5 diganti dengan variabel apa sih supaya nnti jgn diganti lagi :(
        System.out.println("Total nilai yang dimasukan adalah\t\t: "+total);
        System.out.println("Dari nilai total di atas, rata-ratanya adalah\t: "+rerata);
        System.out.println("Nilai maksimumnya adalah\t\t\t: "+max);
        System.out.println("Nilai minimalnya adalah\t\t\t\t: "+min);
    }
}
