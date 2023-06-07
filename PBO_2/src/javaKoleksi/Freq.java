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
import java.util.Map;

public class Freq {
    private static final Integer ONE = new Integer(1);
    
    public static void main(String [] args) {
        String kalimat = "aku pergi aku datang aku pulang aku kembali dan aku bahagia";
        String[] kata = kalimat.split(" ");
        Map m = new HashMap();
        for (int i=0;i<kata.length;i++) {
            Integer freq = (Integer) m.get(kata[i]);
            m.put(kata[i], (freq==null ? ONE : new Integer(freq.intValue()+1)));
        }
        System.out.println(m.size()+" kata berbeda terdeteksi : ");
        System.out.println(m);
    }
}
