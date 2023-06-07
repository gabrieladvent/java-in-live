/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

import NewStack.Mahasiswa;
import java.util.NoSuchElementException;

/**
 *
 * @author Tak Bertuan
 */
public class objekStatis {
    Object elemen[];
    int front = 0;
    int rear = 0;
    int size = 0;
    
public objekStatis() {}    
public objekStatis(int ukuran) {
        elemen = new Object [ukuran];
}    
public boolean enqueue(Object data) {
        if (size < elemen.length) {
            elemen[rear] = data;
            if (rear == elemen.length - 1) {
                rear = 0;
            } else {
                rear++;
            }
            size++;
            return true;
        }
        return false;
}
public Object dequeue (){
        if (elemen.length != 0){
            Object hapus = elemen[front];
            if (front == elemen.length - 1){
                front = 0;
            } else {
                front++;
            }
            size--;
            return hapus;
        }
        throw new NoSuchElementException();
}
public Object Size() {
        return size;
}

public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
}    
public void cetak(){
        if (size == 0){
            System.out.println("Data Yang Dimasukan Kosong");
        } else {
            for (int i = front; i < rear; i++) {
            System.out.print("" + elemen[i]+"\n");
        }
        }
}
public static void main(String[] args) {
    objekStatis queue = new objekStatis(7);
    System.out.println("--> Daftar Mahasiswa: ");
        queue.enqueue(new Mahasiswa("Gabriel", 205314096, "Informatika", "Jogja"));
        queue.enqueue(new Mahasiswa("Lestin", 205314095, "Informatika", "Atambua"));
        queue.enqueue(new Mahasiswa("Agnes", 191114069, "Bimbingan Konseling", "Bangka"));
        queue.enqueue(new Mahasiswa("Gabriela", 202114056, "Akutansi", "Kupang"));
        queue.enqueue(new Mahasiswa("Damian", 205314100, "Informatika", "Jakarta"));
        queue.cetak();
        

        System.out.println("Antrian yang dikeluarkan pertama: \n" + queue.dequeue()); 
        System.out.println("Antrian yang dikeluarkan kedua: \n" + queue.dequeue()); 
        System.out.println("Antrian yang dikeluarkan ketiga: \n" + queue.dequeue()); 
        System.out.println("--> Daftar Mahasiswa saat ini: ");
        queue.cetak();
}
}
