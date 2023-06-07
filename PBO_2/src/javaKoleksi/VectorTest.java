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
import java.util.Vector;

public class VectorTest {
    public static void main(String [] arg) {
        Vector v = new Vector();
        v.add("Tono");
        v.add("Abdul");
        v.add(0, "Slamet");
        v.add("Tini");
        v.add("Dewi");
        System.out.println(v);
        String name = (String) v.get(2);
        System.out.println(name);
    }
    
}
