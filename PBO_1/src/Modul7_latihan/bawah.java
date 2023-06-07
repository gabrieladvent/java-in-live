/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul7_latihan;

/**
 *
 * @author ACER
 */
public class bawah extends atas{
    public  void cetak2() {
    //   super.cetak1();
System.out.println("ada method cetak 1\nAda di class BAWAH ..");
        System.out.println("i: "+i);
        System.out.println("j: "+j);
}
public static void main(String[] args) {
bawah bwh = new bawah();
bwh.cetak1();
bwh.cetak2();
}

}
