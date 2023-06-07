/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_3;

/**
 *
 * @author ACER
 */
public class warungMakan {
    public static void main(String [] args) {

        
        int jumlahMakan, jumlahLauk, jumlahMinum;
        int jM = 8000, jL = 2000, JM = 3000;
        int hargaTotal;
        
        jumlahMakan = jM;
        jumlahLauk = jL;
        jumlahMinum = JM;
        
        jM *= 2;
        jL *= 2;
        JM *= 2;
        
        
        hargaTotal = jM + jL + JM;
        
        System.out.println("Warung Makan Rapuyapayu");
        System.out.println("________________________");
        
        System.out.println("Jumlah Makan 2 :"+jM);
        System.out.println("Jumlah Lauk  2 :"+jL);
        System.out.println("Jumlah Minum 2 :"+JM);
        System.out.println("____________________+");
        System.out.println("Harga Total  :"+hargaTotal);
        System.out.println("                     TERIMA KASIH:)");   
    }
    
}
