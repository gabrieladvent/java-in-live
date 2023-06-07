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
public class prima {
    public static void main(String[] args) {
        System.out.println("Bilangan prima :");
        for (int i = 1; i <10; i++) {
            if (cetakprima(i, 2)) {
                System.out.print(i + "  ");
            }
        }
    }

    public static boolean cetakprima(int n, int i) {
        if (n <= i) {
            if (n == i){
                return true;
            } else{
                return false;
            }
        }
        if (n % i == 0) {
            return false;
        }
        return cetakprima(n, i + 1);
    }
}
