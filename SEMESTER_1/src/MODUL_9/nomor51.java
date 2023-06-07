/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_9;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class nomor51 {
public static void main(String[] args) {
        Scanner bie = new Scanner(System.in);
        int baris, i, j, p;
        long ifak, jfak, imjfak, cij;

        System.out.print("Masukkan banyak baris : ");
        baris = bie.nextInt();
        System.out.println("Jadi, segitiga pascal dengan "+baris+" baris adalah: ");

        for (i = 0; i < baris; i++) {
                for (p = baris; p >= i; p--) {
                        System.out.print(" ");
                }
                        ifak = 1;
                        for (p = 1; p <= i; p++) {
                                if (i == 0) {
                                ifak = 1;
                                } else {
                                ifak = ifak * p; }
                        }
        for (j = 0; j <= i; j++) {
                jfak = 1;
                for (p = 1; p <= j; p++) {
                        if (j == 0) {
                        jfak = 1;
                        } else {
                        jfak = jfak * p; }
                }
                        imjfak = 1;
                        for (p = 1; p <= (i - j); p++) {
                        if ((i - j) == 0) {
                        imjfak = 1;
                        } else {
                        imjfak = imjfak * p; }
                        }
                cij = ifak / (jfak * imjfak);
                System.out.print(cij + " ");
        }
            System.out.println();
        }
}
    }
