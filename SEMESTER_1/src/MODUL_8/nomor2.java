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
public class nomor2 {
  public static void main(String[] args) {
        Scanner bie = new Scanner(System.in);
        double xi, kuadrat = 0, akar = 0, jumlah = 0, total = 0;
        int data, ulang;
           
                System.out.print("Masukan banyaknya data: ");
                data = bie.nextInt();
           
        for (ulang = 1; ulang <= data; ulang++) {
                System.out.print("Data ke-"+ulang+": ");
                xi = bie.nextDouble();
                kuadrat = kuadrat + (Math.pow (xi, 2));
                akar = akar + (Math.sqrt (xi));
                if (xi != 0) {
                        jumlah = jumlah + (1 / xi);
                        total = 1 / jumlah;
                } else if (xi == 0) {
                    System.out.println("Anda kurang beruntung");
                }
        }
        System.out.println("Jumlah kuadrat data: "+kuadrat);
        System.out.println("Jumlah akar data: "+akar);
        System.out.println("Jumalah 1/data untuk data yang tidak sama dengan 0: "+total);
  }  
}  
