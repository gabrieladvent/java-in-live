/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

import NewStack.LinkedList;

/**
 *
 * @author Tak Bertuan
 */
public class queDinamis {
    LinkedList antrian;
queDinamis (){
    antrian = new LinkedList();
}
public void enqueue (int elemen){
    antrian.addFirst(elemen);
}
public int dequeue (){
    return antrian.removeLast();
}
public int size (){
    return antrian.getSize();
}
public boolean isEmpty (){
    return antrian.isEmpty();
}
public void cetak (){
    antrian.cetak();
}
public static void main(String[] args) {
        queDinamis queue = new queDinamis();
            queue.enqueue(26);
            queue.enqueue(15);
            queue.enqueue(8);
            queue.enqueue(14);
            System.out.println("--> Isi Antrian Sekarang: ");
            queue.cetak();
            System.out.println("\n");
        
            System.out.println("Antrian yang selesai pertama: " + queue.dequeue());
            System.out.println("Antrian yang selesai kedua: " + queue.dequeue());
            System.out.println("Antrian yang selesai ketiga: " + queue.dequeue());
            System.out.println("\n");
            System.out.println("--> Isi Antrian Sekarang: ");
            queue.cetak();
}
}
