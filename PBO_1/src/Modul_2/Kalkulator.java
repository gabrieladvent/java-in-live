/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_2;

/**
 *
 * @author ACER
 */
public class Kalkulator {
        int angka1;
         int angka2; 
Kalkulator() {}
    public int getAngka1() {
        return angka1;
    }
    public void setAngka1(int angka1) {
        this.angka1 = angka1;
    }
    public int getAngka2() {
        return angka2;
    }
    public void setAngka2(int angka2) {
        this.angka2 = angka2;
    }
    public int tambah(){
         int total;
            return total = angka1 + angka2;
    }
    public int kurang (){
        int total;
            return total = angka1 - angka2;
    }
    public int kali (){
        int total;
            return total = angka1 * angka2;
    }
    public double bagi (){
        double total;
            return total = angka1 / angka2;
    }
}
