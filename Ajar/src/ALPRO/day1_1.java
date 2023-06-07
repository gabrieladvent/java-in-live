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
public class day1_1 {
    public static void main (String[]args){
       Scanner keyboard  = new Scanner (System.in);
        double angka;
        System.out.print("masukkan angka: ");
        angka = keyboard.nextDouble();
        if(angka % 2 == 0){
            System.out.println("bilGenap");
            
        } else {
            System.out.println("bilGanjil");
        }
    }
}
