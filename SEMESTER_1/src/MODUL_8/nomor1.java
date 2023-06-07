/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_8;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class nomor1 {
        public static void main(String[] args ){
        Scanner bie = new Scanner(System.in);
        double r, total = 0, bagi = 0, Totalser = 0, Totalpar = 0, Hasilpar = 0;
    
        System.out.print("Anda mau berapa banyak Resistor: ");
        int N = bie.nextInt();
    
        for (int ulang = 1; ulang <= N; ulang++) {
                System.out.print("Resistor ke-"+ulang+": ");
                r = bie.nextDouble();
                Totalser =  Totalser + r;
                Totalpar = Totalpar + (1/r);
        }
  
        System.out.println("Silahkan pilih jenis susunannya: ");
        System.out.print("1. Seri \n2. pararel \nMasukan pilihan Anda: ");
        int bi = bie.nextInt();
   
        if (bi == 1) {
                System.out.println("Jadi gabungan susunan seri adalah: "+Totalser);   
        } else if (bi == 2) {
                Hasilpar = 1 / Totalpar;
                System.out.println("Jadi gabungan susunan pararel adalah: "+Hasilpar);
        } else
            System.out.println("Tidak ada pilihan");
    
    }
}
