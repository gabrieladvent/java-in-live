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
import java.util.SortedSet;
import java.util.TreeSet;

public class TestPengurutan {
    public static void main(String [] args) {
        SortedSet set = new TreeSet();
                set.add("Suzuki");
                set.add("Toyota");
                set.add("Mazda");
                set.add("Izusu");
                set.add("Cevrolet");
                set.add("Lexus");
                set.add("Daihatsu");
                System.out.println(set);
    }
}
