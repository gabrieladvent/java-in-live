/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_9;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class nomor4 {
        public static void main (String [] args){
        Scanner bie = new Scanner (System.in);
        int n, i, k, j;
        int rerata=0, warga=0, totalUsia = 0;
        double ds =0, kuadrat = 0;
        String a = " ", b = " ", c = " ", d = " ", e = " ";
       
        System.out.println("          SELAMAT DATANG DI GABRIEL'S DATA");
        System.out.println("------------------------------------------------------");
        System.out.println("Catatan: Diharapkan memilih menu secara berurutan");
        System.out.println();
        do {
        System.out.println("         Menu");
        System.out.println("1. Masukan Data Usia");
        System.out.println("2. Rata-Rata ");
        System.out.println("3. Devisi Standar ");
        System.out.println("4. Diagram Batang ");
        System.out.println("5. Exit");
         System.out.print("Silahkan memilih menu yang Anda mau: ");
         n = bie.nextInt(); //tempat memilih menu di atas
         
        if (n==1){ //menu pertama
                System.out.print("Masukan jumlah warga yang mau dianalisis: ");
                warga = bie.nextInt();
                System.out.println();
                        for (i =1; i<=warga; i++){
                                System.out.print("Silahkan memasukan usia penduduk ke-"+i+": ");
                                int usia;
                                usia = bie.nextInt();
                                if (usia >= 0 && usia <= 20) a+= "*"; // a = a + * (membuatnya variabel ini bernilai *)
                               else if ( usia >= 21 && usia <= 40) b+= "*"; 
                               else if (usia >= 41 && usia <= 60) c+= "*";
                                else if (usia >= 61 && usia <= 80) d+= "*";
                                else if (usia >= 81 && usia <= 100) e+= "*";
                                       totalUsia += usia;
                                       kuadrat = (kuadrat + Math.pow(usia,2));
                        }
                   System.out.println();     
                   
        }else if (n == 2){ //menu kedua
                rerata = totalUsia / warga;
                System.out.print("Dari "+warga+" penduduk di atas, maka ");
                System.out.println("rata-rata usia penduduk di atas adalah: "+rerata);
                System.out.println();
                
        }else if (n == 3){ // menu ketiga
            double  varian;
            varian = (kuadrat - warga * Math.pow(rerata, 2) / warga);
            ds = Math.sqrt(varian);
            System.out.println("Berdasarkan data yang dimasukan, maka Deviasi Standarnya adalah: "+ds);
            System.out.println();
                
        }else if (n == 4 ){ //menu keempat
                        System.out.print("Jadi distribusi usia "+warga+" penduduk sesuai data di atas");
                        System.out.println(" jika dibuat menjadi diagram batang adalah: ");
                        System.out.println("Dari umur 0-20 tahun\t: "+a);
                        System.out.println("Dari umur 21-40 tahun\t: "+b);
                        System.out.println("Dari umur 41-60 tahun\t: "+c);
                        System.out.println("Dari umur 61-80 tahun\t: "+d);
                        System.out.println("Dari umur 81-100 tahun\t: "+e);
                        System.out.println();
        }else if (n == 5) { //menu kelima atau menu penutup untuk membuat program berhenti
            System.out.println("Terima kasih sudah berkunjung :)");
        }
        }while (n  != 5);
    
}
}
