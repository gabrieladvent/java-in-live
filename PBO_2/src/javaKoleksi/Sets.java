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
import java.util.HashSet;
import java.util.Set;


public class Sets {
    public static void main(String [] args) {
        Set s1 = new HashSet();
        Set s2 = new HashSet();
        
        for (int i = 0; i<5 ; i++)
            s1.add(new Integer(i));
        for (int i = 3; i<7 ; i++)
            s2.add(new Integer(i));
        System.out.println("S1 = " + s1);
        System.out.println("S2 = " + s2);
        
        System.out.println(s1.containsAll(s2));
        
        s1.retainAll(s2);
        System.out.println(s1);
        
        s1.removeAll(s2);
        System.out.println(s1);
    }
}
