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
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args)
    {
        Queue<String> antrian = new PriorityQueue<>();
        antrian.add("Tatik");  
        antrian.add("Klepont");  
        antrian.add("Herry");  
        antrian.add("Kuri");  
        antrian.add("Fany");  
        antrian.add("Kuro");  
        antrian.add("Dupont");  
        antrian.add("Iko");    
        antrian.add("Resa");    
        antrian.add("Maxi");    
        System.out.println("Elemen antrian adalah " + antrian);
        String ambilAntrian = antrian.remove();
        System.out.println("Elemen yang diambil - " + ambilAntrian);
        System.out.println("Elemen antrian saat ini adalah " + antrian);
        ambilAntrian = antrian.poll();
        System.out.println("Elemen yang diambil - " + ambilAntrian);
        antrian.remove("Maxi");
        System.out.println("Maxi diambil dari antrian " + antrian);
        ambilAntrian = antrian.poll();
        System.out.println("Elemen yang diambil - " + ambilAntrian);
        System.out.println("Elemen antrian saat ini adalah " + antrian);
        System.out.println("Dewi dimasukkan dalam antrian");
        antrian.offer("Dewi");
        System.out.println("Elemen antrian saat ini adalah " + antrian);
        String antrianDepan = antrian.peek();
        System.out.println("Antrian terdepan - " + antrianDepan);
  
        int size = antrian.size();
        System.out.println("Besar antrian - " + size);
    }
    
}
