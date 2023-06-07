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
import java.util.Map;
import java.util.Set;

public class TestMap {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        m1.put(new Integer(1),"abc");
        m1.put(new Integer(2),"abc");
        m1.put(new Integer(3),"def");
        
        Map m2 = new HashMap();
        m2.put(new Integer(1),"klm");
        m2.put(new Integer(2),"abc");
        m2.put(new Integer(3),"def");
        m2.put(new Integer(4),"klm");
        m2.put(new Integer(5),"abc");
        
        m1.putAll(m2);
        System.out.println(m1);
        
        Set set = m1.keySet();
        System.out.println(set);
        
        System.out.println(m1.values());
        
        System.out.println(m1.entrySet());
        
        for (Iterator i=m1.entrySet().iterator(); i.hasNext();) {
            Map.Entry e = (Map.Entry) i.next();
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }
}