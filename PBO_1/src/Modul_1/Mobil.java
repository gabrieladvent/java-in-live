/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_1;

/**
 *
 * @author ACER
 */
public class Mobil {
        String warna;

        Mobil (String wrn) { //constructor
        warna = wrn;
        }
 void jalan_maju() {
        System.out.print("Mobil warna " + warna);
        System.out.println(" Maju !");
 }
 public static void main(String[] args) {
        Mobil sedan = new Mobil("merah");
        sedan.jalan_maju();
 }  
}
