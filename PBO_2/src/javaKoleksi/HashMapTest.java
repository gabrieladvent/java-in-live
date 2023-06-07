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

public class HashMapTest {
    public static void main(String [] args) {
        HashMap hm = new HashMap();
        hm.put("mahasiswa1", "Tono Antono");
        hm.put("mahasiswa2", "Busi Susilo");
        hm.put("mahasiswa3", "Ahmad Pandemi");
        hm.put("mahasiswa4", "Corona Sucovid");
        hm.put("mahasiswa5", "Simasker Kain");
        hm.put("mahasiswa6", "HAndy Sanitizer");
        hm.put("mahasiswa7", "Cucilo Tanganmu");
        hm.put("mahasiswa8", "Patkai Sabuni");
        System.out.println(hm);
    }
}
