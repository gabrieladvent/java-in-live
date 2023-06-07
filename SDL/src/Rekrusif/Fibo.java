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
public class Fibo { //Contoh 2
public static int fibo(int n) {
        if (n == 2) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else {
            return fibo(n - 2) + fibo(n - 1);
        }
}

public static int fibo2(int x) {
    if (x == 0 || x == 1) {
        return x;
    } else {
        return fibo2(x - 2) + fibo2(x - 1);
    }
}

public static void main(String args[]) {
    int n = 10;
    
    for (int i = 1; i <= n; i++) {
        System.out.print(fibo(i)+" ");
    }
    
    System.out.println("");
    for (int i = 1; i <= n; i++) {
        System.out.print(fibo2(i)+" ");
    }
 }
}