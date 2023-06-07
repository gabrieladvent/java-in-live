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


public class TemukanDuplikat {
    public static void main(String [] args) {
        String kalimat = "aku pergi aku datang aku pulang aku kembali dan aku bahagia";
        String[] kata = kalimat.split(" ");
        Set s = new HashSet();
        for (int i=0;i<kata.length;i++)
            if (!s.add(kata[i]))
                System.out.println("Terdeteksi Duplikasi : " + kata[i]);
        System.out.println(s.size()+" kata berbeda terdeteksi : "+s);
    }
}