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
import java.util.*;

public class Testvector{
    private static void swap(List a, int i, int j) {
        Object tmp = a.get(i);
        a.set(i, a.get(j));
        a.set(j, tmp);
    }

public static void shuffle(List list, Random rnd) {
    for (int i=list.size(); i>1; i--)
    swap(list, i-1, rnd.nextInt(i));
}

public static void main(String args[]) {
    Vector v = new Vector();
    for(int i=0;i<10;i++)
        v.add(new Integer(i));
    System.out.println(v);
    v.setElementAt("Andi",1);
    System.out.println(v);
    v.set(5,"Rita");
    System.out.println(v);
    swap(v,2,5);
    System.out.println(v);
    shuffle(v,new Random());
    System.out.println(v);
}
}