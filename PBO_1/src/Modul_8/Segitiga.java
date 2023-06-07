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
public class Segitiga extends BangunDatar{
    double a, b, c;
    
public Segitiga(double a, double b, double c){
        this.a = a; this.b = b; this.c = c;
}
    @Override
double hitungKel(){
        return a + b + c;
}
    @Override
 double hitungLuas(){
        return 1 * (a + b + c) / 2;
 }
    @Override
 String Status(){
        return "Segitiga";
 }
}
