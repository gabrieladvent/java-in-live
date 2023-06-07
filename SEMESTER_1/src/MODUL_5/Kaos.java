/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_5;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Kaos {
    public static void main(String[] args) {
        Scanner gab = new Scanner(System.in);
        int jumlah, harga = 0, ukuran;
        int S = 30000, M = 38000, L = 45000, XL = 50000, XXL = 60000;
        
        System.out.println("Silahkan memilih ukuran kaos dengan ketentuan: ");
        System.out.println("1. S\n2. M\n3. L\n4. XL\n5. XXL");
        System.out.print("Ukuran kaos: ");
        ukuran = gab.nextInt();
        System.out.print("Jumlah kaos: ");
        jumlah = gab.nextInt();

        if (ukuran == 1) {
            harga = 30000 * jumlah;  
        } else if (ukuran == 2) {
            harga = 38000 * jumlah;
        } else if (ukuran == 3) {
            harga = 45000 * jumlah;
        } else if (ukuran == 4) {
            harga = 50000* jumlah;
        } else if (ukuran == 5) {
            harga = 60000 * jumlah;
        } else
            System.out.println("INVALID!!!");
        
        System.out.println("Total pembayaran: Rp."+harga);
    }
}
