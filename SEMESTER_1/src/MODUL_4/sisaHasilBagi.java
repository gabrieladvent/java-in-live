/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_4;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class sisaHasilBagi {
    public static void main(String[] args) {
        Scanner bagi = new Scanner(System.in);
        int angka;
        
        System.out.print("Masukan angka: ");
        angka = bagi.nextInt();
        
        if (angka % 2 == 2){
            System.out.print(angka+" adalah bilangan genap");
        } else {
            System.out.print(angka+" adalah bilangan ganjil");
        }
    }    
}
