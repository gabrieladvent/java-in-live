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

public class TestDosen {
   public static void main(String[] args) {
      Set<Dosen> dosenSet = new HashSet<>();
      dosenSet.add(new Dosen("Tamara", "8181818", 41));
      dosenSet.add(new Dosen("Audy", "2323211", 48));
      dosenSet.add(new Dosen("Kayetanus", "2134556", 60));
      System.out.println(dosenSet);  
      for (Dosen p : dosenSet) p.sayHello();
      System.out.println(dosenSet.add(new Dosen("Tamara", "8181818", 41)));  
   }
    
}
