/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_4;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class nilaiFinal {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double uts1, uts2, uas, total;
        
       System.out.print("Nilai UTS 1: ");
       uts1 = keyboard.nextDouble();
       System.out.print("Nilai UTS 2: ");
       uts2 = keyboard.nextDouble();
       System.out.print("Nilai UAS: ");
       uas = keyboard.nextDouble();
       
       total = (0.3 * uts1) + (0.3 * uts2) + (0.4 * uas);
       System.out.println("total "+total);
       if (total >= 80) {
           System.out.println("A");
       } else if (total >= 65 && total < 80) {
           System.out.println("B");
       } else if (total >= 55 && total < 65) {
           System.out.println("C");
       } else if (total >= 50 && total < 55) {
           System.out.println("D");
       } else {
           System.out.println("E");
       }
           
       }
        
        
    }
   
