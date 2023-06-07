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
public class Lingkaran {
       private double r;
        private double luas;
        final double PHI=3.14;
Lingkaran() {};
Lingkaran (double r){
    this.r = r;
}

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

public void luas(){
        luas=PHI*r*r;
        System.out.println("Luas lingkaran dengan jari="+r+" adalah : "+luas);
}
}