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
public class nomor4 {
public static void main(String[] args) {
        Scanner bie = new Scanner(System.in);
        System.out.println("SELAMAT DATANG DI PERHITUNGAN FUNGSI DENSITAS (KEPADATAN)");
        System.out.println("=========================================================");
        System.out.println();
        System.out.println("Sebagai pengingat: fungsi densitas ini akan ditampilkan \ndalam bentuk diagram ke samping kanan dengan bintang (*)");
        System.out.println();
        int n;
        do {
                System.out.print("Silahkan memasukan nilai kepadatan f(z): ");
                        n = bie.nextInt();
                                if (n < 30 || n > 60) {
                                        System.out.println("Silahkan memasukan nilai ulang");
                                        System.out.println("Dengan ketentuan 30 > n < 60");
                                        System.out.println();}
        } while(n < 30 || n > 60);
        
        for (double  z = -4; z <= 4; z= z+0.5) {
	int jumBintang = normal(n ,z);
	bintang(jumBintang);
        }
        System.out.println("Maka diagram desintas (kepadatan) akan terlihat seperti di atas.");
        System.out.println("Terima kasih :) ");
    }

        static int normal(int n, double z) {
                double e = 2.71828;
                double f = (1 / Math.sqrt(2 * Math.PI)) * Math.pow(3, -0.5 * z * z);
                return (int) Math.round(n * f); 
        }

        static void bintang(int m) {
                for(int i = 1; i <= m; i++) 
                System.out.print ("*");
	System.out.println();
        }
}
