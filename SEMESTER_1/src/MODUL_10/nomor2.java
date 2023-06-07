/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_10;
import java.util.Scanner;
/**
 *
 * @author ACER
 */

public class nomor2 {
        static int pascal() {
                Scanner bie = new Scanner(System.in);
                int baris, rumus;
                System.out.print("Masukkan jumlah baris segitiga pascal yang anda inginkan : ");
                baris = bie.nextInt();
                System.out.println("Jadi segitiga pascal dengan "+baris+" baris adalah: ");
                        for(int i=0; i<=baris; i++){
                        for(int j=1; j<= baris-i; j++){
                                System.out.print(" "); }
                        for(int k=0; k<=i; k++){
                                rumus = faktorial(i) / (faktorial(i - k) * faktorial(k));
                                System.out.print(rumus+" "); }
                                System.out.println(); }
                return 0;
        }
     
        static int faktorial(int n){
                int hasilFak = 1;
                        if (n == 0) return 1;
                        else for (int i = 1; i<=n; i++) hasilFak = hasilFak*i;
                return hasilFak;
        }
            
        public static void main(String[] args) {
                System.out.println(" SELAMAT DATANG DI PERHITUNGAN SEGITIGA PASCAL");
                System.out.println("DENGAN MENGGUNAKAN RUMUS FAKTORIAL DAN KOMBINASI");
                System.out.println("------------------------------------------------");
                System.out.println();
                pascal();
                System.out.println();
                System.out.println("Terima kasih :) ");
        }
}
