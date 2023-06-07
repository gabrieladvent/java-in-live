/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_3;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class nilairata {
    public static void main(String[] args) {
         Scanner keyboard = new Scanner(System.in);
         System.out.println("SD BHINEKA");
         System.out.println("===============");
         
         int tugas1, tugas2, tugas3;
         int nRT;
         System.out.print("Tugas 1 :");
         tugas1 = keyboard.nextInt();
         System.out.print("Tugas 2 :");
         tugas2 = keyboard.nextInt();
         System.out.print("Tugas 3 :");
         tugas3 = keyboard.nextInt();
         
         nRT = (tugas1 + tugas2 + tugas3) / 3;
         
         System.out.println("Nilai Rata-Rata : "+nRT);
    }
    
}
