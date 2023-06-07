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
public class nomor4 {
    public static void main(String[] args) {
        Scanner bie = new Scanner(System.in);
        int S = 1, C = 0, E= 1;
        int n1, n2,n3, n4, n5, n6, n7, n8, n9, n10;
        
        System.out.print("Nilai 1: ");
        n1 = bie.nextInt();
        System.out.print("Nilai 2: ");
        n2 = bie.nextInt();
        System.out.print("Nilai 3: ");
        n3 = bie.nextInt();
        System.out.print("Nilai 4: ");
        n4 = bie.nextInt();
        System.out.print("Nilai 5: ");
        n5 = bie.nextInt();
        System.out.print("Nilai 6: ");
        n6 = bie.nextInt();
        System.out.print("Nilai 7: ");
        n7 = bie.nextInt();
        System.out.print("Nilai 8: ");
        n8 = bie.nextInt();
        System.out.print("Nilai 9: ");
        n9 = bie.nextInt();
        System.out.print("Nilai 10: ");
        n10 = bie.nextInt();

        
        while (S <= 10) {
            System.out.print("Masukan data ke "+S+" : ");
            C = bie.nextInt();
            
            S++;  
        }
        System.out.println("Tabel Konversi Suhu");
        System.out.println("Celcius   Reamur   Fahrenheit");
        
    }
    
}
