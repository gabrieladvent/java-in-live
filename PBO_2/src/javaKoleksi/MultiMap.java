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
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiMap {
    public static void main(String[] args) {
        Map m = new HashMap();
        
        String str[] = {"Andi","Ani","Anisa"};
        List l = Arrays.asList(str);
        
        m.put(new Integer(1), l);
        
        String str2[] = {"Budi", "Badu", "Bina"};
        l = Arrays.asList(str2);
        
        m.put(new Integer(2), l);
        
        System.out.println(m);
    }
}
