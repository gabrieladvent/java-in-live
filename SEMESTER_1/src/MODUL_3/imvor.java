/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_3;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class imvor {
    public static void main(String [] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Kelontong Store");
       int hargaBarang, hargaDiscount, discount;
       int total;
       int jumlahBarang;
       discount = 20 * 100;
       System.out.print("Harga Barang :");
       jumlahBarang = keyboard.nextInt();
       System.out.print("Jumlah Barang :");
       hargaBarang = keyboard.nextInt();
       total = jumlahBarang * hargaBarang;
       System.out.println("-----------------------");
       System.out.println("Total : "+total);
       hargaDiscount = (total) - (discount);
       System.out.println("Discount :"+discount);
       System.out.println("Total harga setelah mendapatkan diskon :"+hargaDiscount);
    }
}
