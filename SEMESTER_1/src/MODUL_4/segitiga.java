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
public class segitiga {
    public static void main(String[] args) {
        Scanner gab = new Scanner(System.in);
        int a, b, c;
        
        System.out.print("Nilai a: ");
        a = gab.nextInt();
        System.out.print("Nilai b: ");
        b = gab.nextInt();
        System.out.print("Nilai c: "); //nilai c dimasukan setelah menghitung nilai a dan b
        c = gab.nextInt();
        // rumus untuk mendapatkan nilai c: akar pangkat a pangkat2 + b pangkat2
        if (Math.sqrt(Math.pow(a, 2) + (Math.pow(b, 2)))  == c) {
            System.out.println("Segitiga ini adalah segitiga siku-siku");
        } else {
            System.out.println("Segitiga ini bukanlah segitiga siku-siku");
        }
    }
    }
