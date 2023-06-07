/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_6B;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class nomor2 {
    public static void main(String[] args) {
        Scanner bie = new Scanner(System.in);
        int data, rata = 0,  nilai, jumlah = 0, ulang = 1;
        System.out.print("Banyak data yang diproses: ");
        data = bie.nextInt();
        while (ulang <= data) {
            System.out.print("Data ke: "+ulang+"= ");
            nilai = bie.nextInt();
            jumlah = jumlah + nilai;
            rata  = jumlah / ulang;
            ulang++;
        }
        
        System.out.println("Rata-Rata data adalah: "+rata);
    }
    
}
