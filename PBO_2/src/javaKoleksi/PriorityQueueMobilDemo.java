/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaKoleksi;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author ACER
 */
class Mobil implements Comparable<Mobil>{  
int id;  
String nama,pemilik,nopol;  
int harga;  
public Mobil(int id, String nama, String pemilik, String nopol, int harga) {  
    this.id = id;  
    this.nama = nama;  
    this.pemilik = pemilik;  
    this.nopol = nopol;  
    this.harga = harga;  
}  
public int compareTo(Mobil b) {  
    if(id>b.id){  
        return 1;  
    }else if(id<b.id){  
        return -1;  
    }else{  
    return 0;  
    }  
}  
}  

public class PriorityQueueMobilDemo {
public static void main(String[] args) {  
    Queue<Mobil> queue=new PriorityQueue<Mobil>();  
    Mobil b1=new Mobil(121,"Suzuki Ertiga","Sri Hartati","AB 1234 RX",80000000);  
    Mobil b2=new Mobil(233,"Honda Mobilio","Haris Sri Windono","AB 1002 LY",160000000);  
    Mobil b3=new Mobil(199,"Toyota Avanza","Eko Hari Permadi","AD 2121 JK",140000000);  
    Mobil b4=new Mobil(303,"Daihatsu GrandMax","Puspaningtyas Sanjoyo Adi","AD 2675 LM",125000000);  
    Mobil b5=new Mobil(404,"Isuzu Panther","Robertus Adi Nugroho","L 8485 XC",115000000);  
    Mobil b6=new Mobil(511,"Mitsubishi Xpander","Paulina Herunngsih Prima Rosa","R 8789 S",185000000);  
    Mobil b7=new Mobil(100,"Mazda RX-8","Benedictus Herry Suharto","AB 1 BA",350000000);  
    queue.add(b1);  
    queue.add(b2);  
    queue.add(b3);  
    queue.add(b4);  
    queue.add(b5);  
    queue.add(b6);  
    queue.add(b7);  
    System.out.println("Traversing elemen antrian:");  
    for(Mobil b:queue){  
        System.out.println(b.id+" "+b.nama+" "+b.pemilik+" "+b.nopol+" "+b.harga);  
    }
    System.out.println("");
    queue.remove();  
    System.out.println("Setelah 1 mobil diambil dari record:");  
    for(Mobil b:queue){  
        System.out.println(b.id+" "+b.nama+" "+b.pemilik+" "+b.nopol+" "+b.harga);  
        }  
}      
}
