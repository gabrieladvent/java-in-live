/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_8;

/**
 *
 * @author ACER
 */
public class Iseng {

    public static void main(String[] args) {
        Hewan[] kewan = new Hewan[10];
        kewan[0] = new Anjing("Doggy");
        System.out.print(kewan[0].toString());
        kewan[0].suara();
        
        kewan[1] = new Kucing("Catty");
        System.out.print(kewan[1].toString());
        kewan[1].suara();
        
        kewan[2] = new Bebek("Duck");
        System.out.print(kewan[2].toString());
        kewan[2].suara();
    }
}
