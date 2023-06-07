/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_11;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class nomor9 {
    public static void main(String[] args) {
        Scanner bie = new Scanner(System.in);
        
                System.out.print("Banyak element: ");
                int n = bie.nextInt();
        
        int bii[] = new int [n];
        for (int jumlah = 0; jumlah < bii.length; jumlah++) {
            System.out.print("Elemen-"+(jumlah+1)+": ");
            bii[jumlah] = bie.nextInt();
        }
        //bubble sort
        for (int x = 1; x < n; x++) {
            for (int j = 0; j < (n - x); j++) {
                if (bii [j] > bii[j + 1]) {
                    int data = bii [j];
                    bii [j] = bii [j +1];
                    bii [j + 1] = data; }
            }
        }
       
        System.out.println();
        System.out.print("Hasil pengurutan: ");
        for (int jumlah = 0; jumlah < n; jumlah++){
            System.out.print(bii [jumlah]+ " ");
        }
    }
}
