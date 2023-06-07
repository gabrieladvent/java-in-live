/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaKoleksi;

/**
 *
 * @author ACER
 */
import java.util.Vector;

public class DemoVector {
    public static void main(String [] arg) {
        Vector<Integer> v = new Vector<Integer>();
        v.add(22);
        v.add(10);
        v.add(15);
        v.add(3);
        v.add(8);
        v.add(2);
        System.out.println("Jumlah Elemen Vector : " +v.size());
        System.out.println("Cetak isi Vector = ");
        for(int i=0;i<v.size();i++) {
            System.out.print(" "+v.get(i));
        }
    }
     
}
