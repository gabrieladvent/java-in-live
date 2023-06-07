/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_11;

/**
 *
 * @author ACER
 */

import java.util.Scanner;
public class hii {
    // deklarasi semua variabel sebagai variabel global
    static int n;
    static String[] nim, nama;
    static double[] uts1, uts2, uas, nilaiTotal;
    static char[] nilaiHuruf;
    
    public static void main(String[] args) {
        //Program utama
         Scanner nilai = new Scanner(System.in);
         System.out.print("Masukkan jumlah mahasiswa : ");
         n=nilai.nextInt();
         
        //alokasi variabel array
         nim = new String[n];
         nama=new String [n];
         uts1=new double[n];
         uts2=new double[n];
         uas=new double[n];
         nilaiTotal=new double[n];
         nilaiHuruf=new char[n];
         
         bacaData();
         hitungTotalNilai();
         konversiNilai();
            System.out.println();
         System.out.println("Daftar Nilai Mahasiswa Informatika USD.");
         tampilNilai();
         urutNilai();
            System.out.println();
         System.out.println("Daftar Nilai Mahasiswa Informatika USD Urut Terbaik.");
         tampilNilai();
   
     
       
    }
    //sub program untuk membaca data mahasiswa dan lainnya
    static void bacaData(){
        for (int i = 0; i < n; i++) {
            Scanner nilai=new Scanner(System.in);
            System.out.println();
            System.out.print("Masukkan NIM Mahasiswa ke-"+(i+1)+"       : ");
            nim[i]=nilai.next();
            System.out.print("Masukkan Nama mahasiswa ke-"+(i+1)+"      : ");
            nama[i] = nilai.next();
            System.out.print("Masukkan nilai US 1 mahasiswa ke-"+(i+1)+": ");
            uts1[i] = nilai.nextDouble();
            System.out.print("Masukkan nilai US 2 mahasiswa ke-"+(i+1)+": ");
            uts2[i] = nilai.nextDouble();
            System.out.print("Masukkan nilai UAS mahasiswa ke-"+(i+1)+" : ");
            uas[i] = nilai.nextDouble();
            
        }
    }
    //sub program untuk menghitung nilai total
    static void hitungTotalNilai(){
        for (int i=0;i<n;i++){
            nilaiTotal[i]=(0.3*uts1[i])+(0.3*uts2[i]+(0.4*uas[i]));
    }
    
}
    //sub program untuk mengkoversi nilai total menjadi nilai huruf
    static void konversiNilai(){
        for (int i=0;i<n;i++){
            if ((nilaiTotal[i] >= 80) && (nilaiTotal[i] <= 100)){
                nilaiHuruf[i]='A';
                }
                else if ((nilaiTotal[i] >= 65) && (nilaiTotal[i] < 80)){
                    nilaiHuruf[i]='B';
                    }
                    else if ((nilaiTotal[i] >= 55) && (nilaiTotal[i] < 65)){
                        nilaiHuruf[i]='C';
                         }
                        else if ((nilaiTotal[i] >= 45) && (nilaiTotal[i] < 55)){
                            nilaiHuruf[i]='D';
                               }
                             else {
                                 nilaiHuruf[i]='E';
                                        }
}
    }
    //sub program untuk menampilkan seluruh nilai
     static void tampilNilai(){ 
        System.out.println("No       NIM             Nama\t         Us1\t   Us2\t  Uas\t  Total\t  Final\t");
        System.out.println("----------------------------------------------------------------------------");
            for (int i=0;i<n;i++){
        System.out.println((i+1)+ "  \t" +nim[i]+ "  \t" +nama[i]+ "  \t" +uts1[i]+ "  \t" +uts2[i]+ "  \t" +uas[i]+ "  \t" +nilaiTotal[i]+ "  \t" +nilaiHuruf[i]+ "  \t");
               
     }
}
     // Sub Program untuk Mengurutkan Data dengan menggunakan metode Bubble Sort
 // Prinsip kerja bubble sort:
   // 1. membaca 2 data lalu mempertukarkan posisinya jika urutannya keliru
 // 2. lakukan langkah 1 berulang-ulang untuk seluruh data
      static void urutNilai(){
 
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (nilaiTotal[j] < nilaiTotal[j+1])
            {
                // tukarkan temp1 dan nilaiTotal[i]
                Double temp1 = nilaiTotal[j];
                nilaiTotal[j] = nilaiTotal[j+1];
                nilaiTotal[j+1] = temp1;

                // tukarkan temp2 dan nim[i]
                String temp2 = nim[j];
                nim[j] = nim[j+1];
                nim[j+1] = temp2;

                // tukarkan temp3 and nama[i]
                String temp3 = nama[j];
                nama[j] = nama[j+1];
                nama[j+1] = temp3;

                // tukarkan temp4 dan us1[i]
                Double temp4 = uts1[j];
                uts1[j] = uts1[j+1];
                uts1[j+1] = temp4;

                // tukarkan temp5 dan us2[i]
                Double temp5 = uts2[j];
                uts2[j] = uts2[j+1];
                uts2[j+1] = temp5;

                // tukarkan temp6 dan uas[i]
                Double temp6 = uas[j];
                uas[j] = uas[j+1];
                uas[j+1] = temp6;

                // tukarkan temp7 dan nilaiHuruf[i]
                char temp7 = nilaiHuruf[j];
                nilaiHuruf[j] = nilaiHuruf[j+1];
                nilaiHuruf[j+1] = temp7;
 
 
 }
}
}
