/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

import java.util.NoSuchElementException;

/**
 *
 * @author Tak Bertuan
 */
public class queStatis {
    int [] elemen;
    int front;
    int rear;
    int size;
queStatis (){}
queStatis (int ukuran){
    elemen = new int [ukuran];
}
public boolean enqueue (int data){
    if (size < elemen.length){
        elemen [rear] = data;
        if (rear == elemen.length - 1){
            rear = 0;
        } else {
            rear ++;
        }
        size ++;
        return true;
    } else{
    return false;
    }
}
public int dequeue (){
    if (!isEmpty()){
        int hapus = elemen [front];
        if (front == elemen.length - 1){
            front = 0;
        } else {
            front++;
        }
        size--;
        return hapus;
    } else {
        throw new NoSuchElementException();
    }
}
public int size (){
    return size;
}
public boolean isEmpty(){
    if (size == 0){
        return true;
    } else {
        return false;
    }
}
void cetak (){
    if (size == 0){
            System.out.println("Data Yang Dimasukan Kosong");
        } else {
            for (int i = front; i < rear; i++) {
            System.out.print("["+elemen[i]+ "], ");
        }
        }
}
public static void main(String[] args) {
        queStatis queue = new queStatis(7);
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
