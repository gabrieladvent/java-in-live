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
public class Dosen {
   private String name;  
   private String nip;  
   private int age;
   public Dosen(String name, String nip, int age) {   
      this.name = name; this.nip = nip; this.age = age;
   }
   public String getName() {return name;}
   public String getNIP() {return nip;}
   public int getAge() {return age;}
   public String toString() {return name + "--" + nip + "--" + " (" + age + ")";}
   public void sayHello() {System.out.println(name + "("+nip+")"+" says hello");}       //untuk tes

@Override
   public boolean equals(Object o) {     
      return o != null && o instanceof Dosen && this.name.equalsIgnoreCase(((Dosen)o).name);
   }
@Override
   public int hashCode() {                     
      return this.name.toLowerCase().hashCode();
   }    
}