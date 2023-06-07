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
public class urutan {
    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        int bil1, bil2, bil3;
        
        System.out.print("Masukan bilangan pertama: ");
        bil1 = angka.nextInt();
        System.out.print("Masukan bilangan kedua: ");
        bil2 = angka.nextInt();
        System.out.print("Masukan bilangan ketiga: ");
        bil3 = angka.nextInt();
        
        System.out.println("Urutannya adalah: ");
        if (bil1 < bil2 && bil2 < bil3){
            System.out.print(bil1+", "+bil2+", "+bil3);
        } else if (bil1 < bil3 && bil3 < bil2) {
            System.out.print(bil3+", "+bil2+", "+bil1);
        } else if (bil2 < bil1 && bil1 < bil3) {
            System.out.print(bil2+", "+bil3+", "+bil1);
        } else if (bil2 < bil3 && bil3 < bil1) {
            System.out.print(bil3+", "+bil1+", "+bil2);
        } else if (bil3 < bil1 && bil1 < bil2) {
            System.out.print(bil3+", "+bil1+", "+bil2);
        } else if (bil3 < bil2 && bil2 < bil1) {
            System.out.print(bil3+", "+bil2+", "+bil1);
        }
            
    }
}
