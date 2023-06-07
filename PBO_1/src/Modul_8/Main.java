/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_8;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Main {
public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("Masukan Jumlah Bangun Datar Yang Ingin Dieksekusi: ");
        int n = inp.nextInt();
        BangunDatar[] obj = new BangunDatar[n];
        for(int i = 0; i < obj.length; i++){
                System.out.println("");
                System.out.println("\t==BANGUN DATAR KE-"+(i+1)+"==");
                System.out.println("Pilihan: ");
                System.out.println("1. Persegi \n2. Segitiga \n3. Lingkaran");
                System.out.print("Masukan Pilihan Anda  (dalam bentuk huruf): ");
                      String choose = inp.next();
            if( "1".equalsIgnoreCase(choose)){
                System.out.print("Masukan Nilai Panjang Persegi: ");
                    double p = inp.nextDouble();
                System.out.print("Masukan Nilai Lebar Persegi: ");
                    double l = inp.nextDouble();
                    
                obj[i] = new Persegi(p, l);
                Persegi persegi;
                persegi = (Persegi) obj[i];
                
            } else if ("2".equalsIgnoreCase(choose)){
                System.out.print("Masukan Sisi A: ");
                    double a = inp.nextDouble();
                System.out.print("Masukan Sisi B: ");
                    double b = inp.nextDouble();
                System.out.print("Masukan Sisi C: ");
                    double c = inp.nextDouble();
                    
                obj[i] = new Segitiga(a, b, c);
                Segitiga segitiga;
                segitiga = (Segitiga) obj[i];
                
            } else if ("3".equalsIgnoreCase(choose)){
                System.out.print("Masukan Jari-Jari Lingkaran: ");
                    double r = inp.nextDouble();
                
                obj[i] = new Lingkaran(r);
                Lingkaran lingkaran;
                lingkaran = (Lingkaran) obj[i];
                
            }
        }
        System.out.println("");
        System.out.println("\t==TERIMA KASIH SUDAH MENGISI DATA BANGUN DATAR");
        System.out.println("");
        System.out.println("==============================================");
        System.out.println("No.     Bangun Datar     Keliling     Luas");
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < obj.length; i++) {
            System.out.println((i+1)+"         "+obj[i].Status()+"        "+obj[i].hitungKel()+"      "+obj[i].hitungLuas());
        }
        System.out.println("===============================================");
        
        
}    

} 