/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_3;

/**
 *
 * @author ACER
 */
public class Segitiga {
    private Titik titikA, titikB, titikC;
private double sisiA, sisiB, sisiC;

public Segitiga (Titik satu, Titik dua, Titik tiga){//constructor segitiga
 this.titikA = satu;
 this.titikB = dua;
 this.titikC = tiga;
}

public double hitungSisi(Titik A, Titik B){
 int x1, y1, x2,y2;
 x1 = A.getX(); y1 =A.getY();
 x2 = B.getX(); y2 = B.getY();
 return Math.sqrt( Math.pow(x1-x2, 2) + Math.pow(y1-y2,2));
}

public double hitungKeliling(){
double sisiA = hitungSisi(titikA, titikB);
double sisiB = hitungSisi(titikA, titikC);
double sisiC = hitungSisi(titikB, titikC);
 return (sisiA + sisiB +sisiC);
}
public double hitungLuas(){
 double s = hitungKeliling()/2;

 return Math.sqrt(s * (s-sisiA) * (s-sisiB) * (s-sisiC));
}
}
