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
import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {
    public static void main(String [] args) {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("rumah", "Tipe 45");
        map.put("mobil", "Ertiga");
        map.put("bunga", "Mawar");
        map.put("Notebook", "Zirex");
        System.out.println("Sebelum diubah");
        Iterator<String> ite = map.keySet().iterator();
        while(ite.hasNext()) {
            System.out.println(map.get(ite.next()));
        }
        System.out.println("Setelah diubah");
        map.put("mobil", "Avanza");
        for(String key : map.keySet()){
            System.out.println(map.get(key));
        }
    }
}
