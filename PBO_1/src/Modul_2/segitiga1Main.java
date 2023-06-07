/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_2;
import java.util.Scanner;
public class segitiga1Main {
    public static void main(String [] args) {
        segitiga1 seg1 = new segitiga1();
        Scanner input = new Scanner(System.in);
        
        System.out.print("nilai x1: ");
        seg1.x1= input.nextDouble();
        
        System.out.print("nilai y1: ");
        seg1.y1 = input.nextDouble();
        
        System.out.print("nilai x2: ");
        seg1.x2 = input.nextDouble();
        
        System.out.print("nilai y2: ");
        seg1.y2 = input.nextDouble();
        
        System.out.print("nilai x3: ");
        seg1.x3 = input.nextDouble();
        
        System.out.print("nilai y3: ");
        seg1.y3 = input.nextDouble();
        System.out.print("nilai tinggi: ");
        seg1.tinggi = input.nextDouble();
        
        System.out.println("Luas Prisma: "+seg1.luasPrisma());
        

    }
}