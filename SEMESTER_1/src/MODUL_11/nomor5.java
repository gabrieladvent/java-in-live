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
public class nomor5 {
    public static void main(String[] args) {
        Scanner bie = new Scanner(System.in);
        double max= 0, min= 0, total = 0;
        
        System.out.print("Masukan jumlah data yang ingin diolah: ");
        int n = bie.nextInt();
        System.out.println();
        double Gab[] = new double [n];
     
        for (int i = 0; i < n; i++) {
                System.out.print("Masukan data ke-"+(i + 1)+": ");
                Gab[i] = bie.nextDouble();
                        if ((i + 1)== 1) max = Gab[i];
                                else if (Gab[i] > max) max = Gab[i];
                        if ((i + 1) == 1) min = Gab[i];
                                else if (Gab[i] < min) min = Gab[i];
                         total += Gab[i];
        }
   
        double rerata;
        rerata = total / n;
        System.out.println("Total nilai yang dimasukan adalah\t\t: "+total);
        System.out.println("Dari nilai total di atas, rata-ratanya adalah\t: "+rerata);
        System.out.println("Nilai maksimumnya adalah\t\t\t: "+max);
        System.out.println("Nilai minimalnya adalah\t\t\t\t: "+min);
    }
}
