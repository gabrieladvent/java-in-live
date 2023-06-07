/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaKoleksi;

import java.util.*;
/**
 *
 * @author hertada
 */
public class ListExample {
    public static void main (String[] args) {
        List list = new ArrayList();
        list.add("kesatu");
        list.add("kedua");
        list.add("ketiga");
        list.add(new Integer(4));
        list.add(new Float(5.0F));
        list.add("kedua");  //duplikasi
        list.add(new Integer(4)); //duplikasi
        System.out.println(list);
    }
}
