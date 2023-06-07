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
public class Harii {
        public static void main(String[] args) {
            Scanner bie = new Scanner(System.in);
            
        int month;
        
        System.out.print("Bulan: ");
        month = bie.nextInt();
        
        switch (month) {
            case 1:  System.out.println("Jumlah hari: 31");
                     break;
            case 2:  System.out.println("Jumlah hari: 28/29");
                     break;
            case 3:  System.out.println("Jumlah hari: 31");
                     break;
            case 4:  System.out.println("Jumlah hari: 30");
                     break;
            case 5:  System.out.println("Jumlah hari: 31");
                     break;
            case 6:  System.out.println("Jumlah hari: 30");
                     break;
            case 7:  System.out.println("Jumlah hari: 31");
                     break;
            case 8:  System.out.println("Jumlah hari: 31");
                     break;
            case 9:  System.out.println("Jumlah hari: 30");
                     break;
            case 10: System.out.println("Jumlah hari: 31");
                     break;
            case 11: System.out.println("Jumlah hari: 30");
                     break;
            case 12: System.out.println("Jumlah hari: 31");
                     break;
            default: System.out.println("Invalid");
                     break;
        
        } 
     
    }
}

