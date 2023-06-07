/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_6B;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class puing {
    public static void main(String[] args) {
        Scanner bie = new Scanner(System.in);
        int hit = 1, C, R = 0, F = 0;
        String inti = " ";
                
        while (hit <= 10) {
            System.out.print("masukan nilai ke-"+hit+": ");
            C = bie.nextInt();
            R = (4 * C) / 5;
            F = (9 * C) / 5 + 32;
          inti = inti+ ""+C+ "  |  " +R+ "  |  " +F+"\n";
            hit++;
        }
        
        System.out.println("");
        System.out.println("Tabel Konversi suhu");
        System.out.println("");
        System.out.println("C   |  F  |   R");
        System.out.println(inti);
    }
}
