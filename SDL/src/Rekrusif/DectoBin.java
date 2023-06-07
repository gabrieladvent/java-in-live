/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rekrusif;

/**
 *
 * @author ACER
 */
public class DectoBin {
public static void decToBin(int num) {
    if (num > 0) { 
        decToBin(num / 2);
        System.out.print(num % 2);
    }
 }
 public static void main(String[] args) {
    decToBin(4);
        System.out.println("");
    decToBin(10);
        System.out.println("");
    decToBin(100);
 }
}
