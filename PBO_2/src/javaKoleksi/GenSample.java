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
class BasicGeneric<A> {
   private A data;
   public BasicGeneric(A data) {
      this.data = data;
   }
   public A getData() {
      return data;
   }
}

public class GenSample {
   public String method(String input) {
        String data1 = input;
        BasicGeneric<String> basicGeneric = new BasicGeneric<String>(data1);
        String data2 = basicGeneric.getData();
        return data2;
   }
   public Integer method(int input) {
        Integer data1 = new Integer(input);
        BasicGeneric <Integer> basicGeneric = new BasicGeneric <Integer>(data1);
        Integer data2 = basicGeneric.getData();
        return data2;      
   } 
   public static void main(String args[]) {
        GenSample sample = new GenSample();
        System.out.println(sample.method("Beberapa data generic"));
        System.out.println(sample.method(1234));
   }
}
