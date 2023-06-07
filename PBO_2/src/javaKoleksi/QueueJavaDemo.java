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
import java.util.LinkedList;
import java.util.Queue;
  
public class QueueJavaDemo {
  
    public static void main(String[] args)
    {
        Queue<String> antrian = new LinkedList<>();
  
        antrian.add("Dupont");  
        antrian.add("Klepont");  
        antrian.add("Kuri");  
        antrian.add("Kuro");  
        antrian.add("Iko");    
        System.out.println("Elemen antrian adalah " + antrian);
        String ambilAntrian = antrian.remove();
        System.out.println("Elemen yang diambil - " + ambilAntrian);
        System.out.println("Elemen antrian saat ini adalah " + antrian);
        String antrianDepan = antrian.peek();
        System.out.println("Antrian terdepan - " + antrianDepan);
  
        int size = antrian.size();
        System.out.println("Besar antrian - " + size);
    }
}
