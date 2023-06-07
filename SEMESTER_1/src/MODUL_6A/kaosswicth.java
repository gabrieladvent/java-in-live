/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_6A;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class kaosswicth {
    public static void main(String[] args) {
        Scanner bie = new Scanner(System.in);
        

        int jumlah, ukuran;
        int total = 0;
        
        System.out.println(" 1. S\n 2. M\n 3. L\n 4. XL\n 5. XXL");
        System.out.print("Ukuran kaos: ");
        ukuran = bie.nextInt();
        System.out.print("Jumlah kaos: ");
        jumlah = bie.nextInt();

        //h1 = S * jumlah;   
       // h2 = M * jumlah;
        //h3 = L * jumlah;
        //h4 = XL * jumlah;
        //h5 = XXL * jumlah;

        switch (ukuran) {
            case 1: 
                total = 30000 * jumlah;
                break;
            case 2 :
                total = 38000 * jumlah;
                break;
            case 3 :
                total = 45000 * jumlah;
                break;
            case 4 :
                total = 50000 * jumlah;
                break;
            case 5 : 
                total = 60000 * jumlah;
        }
        System.out.println("Total pembelanjaan: "+total);
    }
}
