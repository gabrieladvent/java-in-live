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
public class nomor6 {
    public static void main(String[] args) {
        Scanner bie = new Scanner(System.in);
            int A [] = {2,7,3,9,4,1,34,25,76,80,90,54,21,78};
            System.out.print("Nilai yang dicari: ");
        int n = bie.nextInt();
        boolean benar=false;
        for(int i = 0; i < A.length; i++){
                if (A [i] ==n){
                    System.out.println("Angka " +n + "\nBerada pada index: "+i);
                    benar = true;
                }
        }
        if (benar == false){
            System.out.println("Angka " +n +" tidak ada dalam index");
        }    
}
}