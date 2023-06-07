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
public class Bawah_pro extends Atas_pro{
    public void cetak2() {
 System.out.println("Ada di class BAWAH ..");
 System.out.println("i = "+i);
 }
public static void main(String[] args) {
 Bawah_pro bwh = new Bawah_pro();
 bwh.cetak1();
 bwh.cetak2();
}
}
