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
public class beratBadan {
    public static void main(String[] args) {
         Scanner keyboard = new Scanner(System.in);
         System.out.println("PROGRAM BERAT IDEAL");
         System.out.println("--------------------");
         
         int TB, BI;
         String nama;
         System.out.print("Masukan Nama :");
         nama = keyboard.nextLine();
         System.out.print("Tinggi Anda (cm) :");
         TB = keyboard.nextInt();
         
         BI = TB - 100;
         System.out.println("Berat Ideal Anda Adalah :"+BI+"kg");
    }
}
