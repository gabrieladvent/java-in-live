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
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main (String[] args) {
        ArrayList<Orang> list1 = new ArrayList<Orang>();
        for(int i = 0; i < 10; i++) {
            list1.add(new Orang("Orang ke-" + i));
        }
        for(int i = 0; i < list1.size();i++) {
            System.out.println(list1.get(i).name);
        }
    }
}

class Orang {
    public String name;
    public Orang(String name) {
        this.name = name;
        }
}