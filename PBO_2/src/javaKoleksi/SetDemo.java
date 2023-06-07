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

public class SetDemo {
    public static void main(String [] args) {
        Set set = new HashSet();
        set.add("pertama");
        set.add("kedua");
        set.add("ketiga");
        set.add(new Integer(4));
        set.add(new Float(5.5F));
        set.add("kedua"); //duplikasi, tidak ditambahkan
        set.add(new Integer(4)); //duplikasi, tidak ditambahkan
        System.out.println(set);
    }
}