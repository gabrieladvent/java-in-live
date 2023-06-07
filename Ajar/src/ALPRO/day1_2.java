/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ALPRO;

import java.util.Scanner;

/**
 *
 * @author Tak Bertuan
 */
public class day1_2 {

    public static void main(String[] args) {
        int bilangan1, bilangan2;
        
        
        Scanner keyboard = new Scanner(System.in);
       System.out.print("masukkan bilngan1 : "); 
       bilangan1 = keyboard.nextInt();
       System.out.print("masukkan bilangan2 : ");
       bilangan2 = keyboard.nextInt();
       
        if (bilangan1 > bilangan2) {
            System.out.println(bilangan1+"lebih besar dari"+bilangan2);
             
        } else if (bilangan1 == bilangan2) {
            System.out.println(bilangan1+"sama dengan dari"+bilangan2);
            
        }else{
            System.out.println(bilangan1+"lebih kecil dari"+bilangan2);
        }
    }

}
