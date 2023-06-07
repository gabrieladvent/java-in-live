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
public class nomor3 {
    public static void main(String[] args) {
        Scanner bie = new Scanner(System.in);
        int more, i, ulang; 
        int fibo = 1, fibo1 = 1, fibo2 = 1;
       
        System.out.print("Berapa banyak bilangan yang ditampilakan : ");
        more = bie.nextInt();
        System.out.println("Jadi deret Fibonacci-nya adalah: ");
        
        for (ulang = 1; ulang < 2; ulang++) {
            System.out.print(ulang+", ");
        }
        
        for (i = 1; i <= more; i++) {
                System.out.print(fibo1+ ", ");
                fibo2 = fibo + fibo1;
                fibo = fibo1;
                fibo1 = fibo2;
        }
        
    }
}
