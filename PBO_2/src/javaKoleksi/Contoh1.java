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
import java.util.List;

public class Contoh1 {
    public static void main (String[] args) {
        List list = new ArrayList();
        list.add("Yoseph");
        list.add("Cesario");
        list.add("Tani");
        list.add("Parera");
        System.out.println(list);
        System.out.println("2 : " + list.get(2));
        System.out.println("0 : " + list.get(0));
    }
}
