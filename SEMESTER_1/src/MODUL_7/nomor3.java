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
public class nomor3 {
    public static void main(String[] args){
        Scanner bie = new Scanner(System.in); 
        int ulang = 1, many, mangga;
        
        System.out.print("Banyak mangga yang diproses: ");
        many = bie.nextInt();
        
        do {
            System.out.print("Berat mangga ke-"+ulang+": ");
            mangga = bie.nextInt();
            
                if (mangga < 500) {
                    System.out.println("Kualitas: BIASA \n->Dapat dijual di dalam negeri");
                 } else if (mangga >= 500 && mangga < 750) {
                    System.out.println("Kualitas: BAGUS \n->Dapat diolah menjadi juice");
                 } else if (mangga > 750) {
                    System.out.println("Kualitas: UNGGUL \n->Dapat dijadikan barang ekspor");
                 }
            ulang++;
        } while (ulang <= many && mangga > 0);
        
    }
}
