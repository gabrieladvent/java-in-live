/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_2;

/**
 *
 * @author ACER
 */
public class konversiSuhu {
    public static void main(String[] args) {
        double c, fahrenheit, reamur, fahrea;
        
        c = 5;
        fahrenheit = (1.8) * c + 32;
        reamur = (0.8) * c;
        fahrea = 0.4 * (fahrenheit - 32);
        
        System.out.println("Suhu dalam celcius = "+c+" derajat");
        System.out.println("Suhu 5 derajat celcius = "+fahrenheit+" derajat suhu fahrenheit");
        System.out.println("Suhu 5 celcius = "+reamur+" derajat suhu reamur");
        System.out.println("Suhu 41 derajat fahrenheit = "+fahrea+" derajat suhu reamur");
        
    }
    
}
