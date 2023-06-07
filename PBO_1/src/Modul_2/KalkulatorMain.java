/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_2;
import java.util.Scanner;

public class KalkulatorMain {
    public static void main(String [] args) {
        Scanner bie = new Scanner(System.in);
        int pilih;
        Kalkulator hit1 = new Kalkulator();
        
        System.out.println("Selamat Datang di Perhitungan");
        System.out.print("Masukan Bilangan Pertama: ");
                int angk = bie.nextInt();
                hit1.setAngka1(angk);
        System.out.print("Masukan Bilangan Kedua: ");
                int angk2 = bie.nextInt();
                hit1.setAngka2(angk2);
                
        System.out.println();
        do {
                System.out.println("->1. Pejumlahan\n->2. Pengurangan\n->3. Perkalian\n->4. Pembagian");
                System.out.print("Silahkan Memilih: ");
                pilih = bie.nextInt();
                        if (pilih == 1){
                                System.out.println("Hasilnya: "+ hit1.tambah());
                        } 
                        else if (pilih == 2){
                                System.out.println("Hasilnya: "+ hit1.kurang());
                        }
                        else if (pilih == 3){
                                System.out.println("Hasilnya: "+ hit1.kali());
                        }
                        else if (pilih == 4){
                                System.out.println("Hasilnya: "+ hit1.bagi());
                        }
                        else {
                            System.out.println("Silahkan memasukin ulang pilihannya");
                        }
        }     while (pilih < 1 || pilih > 4);
        }
}
        
    

