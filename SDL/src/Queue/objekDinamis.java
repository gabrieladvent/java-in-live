/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

import NewStack.LinkedList_Objek;
import NewStack.Mahasiswa;

/**
 *
 * @author Tak Bertuan
 */
public class objekDinamis {
    LinkedList_Objek antrian;    
public objekDinamis(LinkedList_Objek antrian) {
        this.antrian = antrian;
}
public objekDinamis (){
        antrian = new LinkedList_Objek();
}   
public void enqueue (Object data){
        antrian.addLast(data);
}
public Object dequeue(){
        return antrian.removeFirst();
}
public int Size() {
        return antrian.size();
}
public boolean isEmpty() {
        if (antrian.size() == -1){
            return true;
        } 
        return false;
}    
public void cetak(){
        System.out.println(antrian.toString());
}
public static void main(String[] args) {
        objekDinamis queue = new objekDinamis();
        queue.enqueue(new Mahasiswa("Gabriel", 205314096, "Informatika", "Jogja"));
        queue.enqueue(new Mahasiswa("Lestin", 205314095, "Informatika", "Atambua"));
        queue.enqueue(new Mahasiswa("Agnes", 191114069, "Bimbingan Konseling", "Bangka"));
        queue.enqueue(new Mahasiswa("Gabriela", 202114056, "Akutansi", "Kupang"));
        queue.enqueue(new Mahasiswa("Damian", 205314100, "Informatika", "Jakarta"));
        System.out.println("--> Daftar Mahasiswa: ");
        queue.cetak();
        
        System.out.println("Antrian yang dikeluarkan pertama: \n" + queue.dequeue()); 
        System.out.println("Antrian yang dikeluarkan kedua: \n" + queue.dequeue()); 
        System.out.println("Antrian yang dikeluarkan ketiga: \n" + queue.dequeue()); 
        System.out.println("--> Daftar Mahasiswa saat ini");
        queue.cetak();
}
}
