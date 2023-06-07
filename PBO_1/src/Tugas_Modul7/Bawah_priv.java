/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Modul7;

/**
 *
 * @author ACER
 */
public class Bawah_priv extends Atas_priv{
    public void cetak2() {
 System.out.println("Ada di class BAWAH ..");
 System.out.println("i =");
}
public static void main(String[] args) {
 Bawah_priv bwh = new Bawah_priv();
 bwh.cetak1();
 bwh.cetak2();
}
}
