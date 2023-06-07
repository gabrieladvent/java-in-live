/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_9;

/**
 *
 * @author ACER
 */
public class nomor3 {
    public static void main(String[] args) {
        int jam, menit, detik;
        for (jam = 1; jam <= 12; jam++) {
            for (menit = 1; menit <= 60; menit++) {
                for (detik = 1; detik <= 60; detik++) {
                    if (detik == 1) {
                        System.out.print("Detik ke :1 ");
                    } else {
                        System.out.print(detik+" "); }
                }
                System.out.println();
                System.out.println("Menit ke: "+menit);
            }
            System.out.println();
            System.out.println("Jam ke: "+jam);
            System.out.println();
	}
    }
}
