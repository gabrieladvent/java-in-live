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
public class Lingkaran extends BangunDatar{
        double r;
        final double phi = 3.14;
    
public Lingkaran(double r){
        this.r = r;
}    
    @Override
double hitungKel(){
        return 2 * phi * r;
}
    @Override
double hitungLuas(){
        return phi * (r * r);
}
    @Override
String Status(){
        return "Lingkaran";
}
}
