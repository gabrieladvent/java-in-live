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
public class nomor5 {
    public static void main(String[] args) {
        Scanner bie = new Scanner(System.in);
        System.out.print("Masukan jumlah baris: ");
        int n = bie.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                long ifak = 1;
                if (i == 0) ifak = 1;
                else for (int p = 1; p <= i; p++) ifak*= p;
                
                long jfak = 1;
                if (j ==0) jfak = 1;
                else for (int p = 1; p <= i; p++) jfak*= p;
                
                 long imjfak = 1;
                if ((i - j) == 0) imjfak = 1;
                else for (int p = 1; p <= 1; p++) imjfak*= p;
                
                long Cij = ifak / (jfak * imjfak);
                System.out.print(Cij);
            }
            System.out.println();
        }
        
    }
}
