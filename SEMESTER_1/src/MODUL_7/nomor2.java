/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_7;
import java.util.Scanner;
/**
 * 
 *
 * @author ACER
 */
public class nomor2 {
    public static void main(String[] args){
     Scanner bie =new Scanner(System.in);
     double Final,  uts1, uts2, uas;
     
     do { 
         System.out.print("uts 1: ");
         uts1 = bie.nextDouble();
            if (uts1 < 0 || uts1 > 100)
                System.out.println("Harap memasukan nilai positif");
     } while (uts1 < 0 ||  uts1 > 100);
     
     do {
         System.out.print("uts 2: ");
         uts2 = bie.nextDouble();
            if (uts2 < 0 || uts2 > 100)
                System.out.println("Harap memasukan nilai positif");
     }
     while (uts2 < 0 || uts2 > 100);
     
     do {
         System.out.print("uas : ");
         uas = bie.nextDouble();
            if (uas < 0 || uas > 100)
                System.out.println("Harap memasukan nilai positif");
     }
     while (uas < 0 || uas > 100);
     
     Final = (0.3 * uts1) + (0.3 * uts2) + (0.4 * uas);
     
        if(Final >= 80) {
            System.out.println("A");
                }
        else if(Final >=65 && Final < 80)  {
            System.out.println("B");
                }
        else if(Final >=55 && Final <65){
            System.out.println("C");
                }
        else if(Final >= 50 && Final < 55){
            System.out.println("D");
                }
        else{
            System.out.println("E ");   
                }
     
    }
}