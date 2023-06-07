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


public class TemukanDuplikat2 {
    public static void main(String [] args) {
        String kalimat = "aku pergi aku datang aku pulang aku kembali dan aku bahagia";
        String[] kata = kalimat.split(" ");
        Set unik = new HashSet();
        Set dup = new HashSet();
        
        for (int i=0;i<kata.length;i++)
            if (!unik.add(kata[i]))
                dup.add(kata[i]);
        unik.removeAll(dup);
        System.out.println("Kata unik : " + unik);
        System.out.println("Duplikasi kata : "+dup);
    }
}