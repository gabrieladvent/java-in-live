/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_7;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class nomor4 {
    public static void main(String[] args) {
        Scanner bie = new Scanner(System.in);
        int data = 1, many;
        double jumlah = 0, max = 0, min = 0,  kuadrat = 0;
        double rerata, rent, varian, ds, bilangan;
        System.out.print("Masukan banyak data: ");
        many = bie.nextInt();
        
        do {
            System.out.print("Masukan data ke-"+data+": ");
            bilangan = bie.nextDouble();
            jumlah = jumlah + bilangan;
            
                if (data == 1) max = bilangan;
                else if (bilangan > max) max = bilangan;
                    if (data == 1) min = bilangan;
                    else if (bilangan < min) min = bilangan;
            kuadrat = kuadrat + Math.pow(bilangan, 2); 
            data++;
        } while (data <= many);
        
        rerata = jumlah / many;
        varian = (kuadrat - many * Math.pow(rerata, 2) / many);
        ds = Math.sqrt(varian);
        rent = max - min;
        
        System.out.println("Data terbesar: "+max);
        System.out.println("Data terkecil: "+min);
        System.out.println("Rentang data: "+rent);
        System.out.println("Rata-rata "+many+" bilangan tersebut adalah: "+rerata);
        System.out.println("Variansi: "+varian);
        System.out.println("Deviasi standart: "+ds);

    }
}
