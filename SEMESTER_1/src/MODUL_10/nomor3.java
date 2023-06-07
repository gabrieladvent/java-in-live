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
public class nomor3 {
        static double x1, x2, x3, y1, y2, y3;
     //SELAIN METHOD HITUNGLUAS DAN METHOD BACATITIK, SEMUA MEMPUNYAI NILAI RETURN (NILAI BALIK)

        static void bacaTitik() {
        System.out.println("Isi dahulu nilai absis dan ordinat titik");
                Scanner bie = new Scanner(System.in);
                System.out.print("Masukan nilai absis ke-1\t: ");
                        x1 = bie.nextDouble();
                System.out.print("Masukan nilai ordinat ke-1\t: ");
                        y1 = bie.nextDouble();
                System.out.print("Masukan nilai absis ke-2\t: ");
                        x2 = bie.nextDouble();
                System.out.print("Masukan nilai ordinat ke-2\t: ");
                        y2 = bie.nextDouble();
                System.out.print("Masukan nilai absis ke-3\t: ");
                        x3 = bie.nextInt();
                System.out.print("Masukan nilai ordinat ke-3\t: ");
                        y3 = bie.nextDouble();
        }
        
        static double hitungJarak(double a, double b, double c, double d) { //int supaya bilangan yang dihasilkan tidak bernilai koma
                double sisi = Math.sqrt(Math.pow((b - a), 2) + Math.pow((d - c), 2));
                return  sisi; 
        }
        
        static double hitungKeliling(double sisiA, double sisiB, double sisiC) { //int supaya bilangan yang dihasilkan tidak bernilai koma
                double kel = sisiA + sisiB+ sisiC;
                return  kel;
        }
        
        static void hitungLuas() {
                double sisiA = hitungJarak (x1, x2, y1, y2); 
                double sisiB =hitungJarak (x2, x3, y2, y3); 
                double sisiC = hitungJarak (x3, x1, y3, y1); 
                System.out.println("- Jarak dari titik a ke titik b adalah:\t "+sisiA); 
                System.out.println("- Jarak dari titik b ke titik c adalah:\t "+sisiB); 
                System.out.println("- Jarak dari titik c ke titik a adalah:\t "+sisiC);
                System.out.println();
                System.out.println ("- Berdasarkan jarak ketiga titik, \nmaka dapat disimpulkan bahwa keliling segitiga ini adalah: "+hitungKeliling(sisiA, sisiB, sisiC));
                double s =hitungKeliling(sisiA, sisiB, sisiC) / 2;
                double luas =  Math.sqrt(s * (s - sisiA) * (s - sisiB) * (s - sisiC)); 
                System.out.println();
                System.out.println("- Berdasarkan jarak sisi, dan keliling \nmaka dapat disimpulkan bahwa luas segitiga tersebut adalah: "+luas);/* variabel luas bertipe int
                supaya nilai yang dihasilkan tidak bernilai koma :)
                */
        }
        
        public static void main(String[] args) {
        System.out.println("SELAMAT DATANG DI PERHITUNGAN KELILING DAN LUAS SEGITIGA");
        System.out.println("               BERDASARKAN TITIK ORDINAT");
        System.out.println("---------------------------------------------------------");
        System.out.println();
                bacaTitik(); //memanggil method bacaTitik
                hitungLuas(); //memanggil method hitungLuas
        System.out.println("terima kasih :) ");
        }
}
