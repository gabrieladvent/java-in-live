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
public class BBperbandingan {
    public static void main(String[] args) {
        Scanner BB = new Scanner(System.in);
        double TB, bB, ideal;
        
        System.out.print("Tingi badan: ");
        TB = BB.nextInt();
        System.out.print("Berat: ");
        bB = BB.nextInt();
        ideal = TB / bB;
        System.out.println(ideal);
        if (ideal >= 18.5 && ideal <= 25) {
            System.out.print(ideal+" kg Berat ideal Anda");
        } else if (ideal >= 26 && ideal <= 30) {
            System.out.print(ideal+" Over");
        } else if (ideal >= 31 && ideal <= 40) {
            System.out.print(ideal+" obesitas");
        } else if (ideal > 40){
            System.out.println(ideal+ " gemuk kali");
        } else if (ideal < 18.5){
            System.out.println("Kurus");
        } 
        else {
            System.out.println("ga terdaftar");
        }
        }
    }

