/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewStack;
import java.util.NoSuchElementException;

/**
 *
 * @author Tak Bertuan
 */
public class ObjekStatis {
    Object elemen[];
    int front;
    int size;

public ObjekStatis() {
    front = -1;
    elemen = new Object [100];
    size = 0;
}
public ObjekStatis (int ukuran) {
    front = -1;
    elemen = new Object [ukuran];
    size = 0;
}
public boolean Push(Object tambah) {
    front = front + 1;
    elemen[front] = tambah;
    size++;
    return true;
}
public Object Pop() {
    Object temp = elemen[front];
    front = front - 1;
    size--;
    return temp;
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
    for (int i = 0; i < size; i++) {
        System.out.println("" + elemen[i]);
    }
}
 
public static void main(String[] args) {
    ObjekStatis tumpukan = new ObjekStatis();
//        tumpukan.Push(new Mahasiswa("Gabriel", 205314096, "Informatika", "Jogja"));
//        tumpukan.Push(new Mahasiswa("Lestin", 205314095, "Informatika", "Atambua"));
//        tumpukan.Push(new Mahasiswa("Agnes", 191114069, "Bimbingan Konseling", "Bangka"));
//        tumpukan.Push(new Mahasiswa("Gabriela", 202114056, "Akutansi", "Kupang"));
//        tumpukan.Push(new Mahasiswa("Damian", 205314100, "Informatika", "Jakarta"));
//        System.out.println("--> Daftar Mahasiswa");
//        tumpukan.cetak();
//        System.out.println("\n");
//        
//        System.out.println("Mahasiswa Yang Dihapus:\n" + tumpukan.Pop());
//        System.out.println("Mahasiswa Yang Dihapus:\n" + tumpukan.Pop());
//        System.out.println("Mahasiswa Yang Dihapus:\n" + tumpukan.Pop());
//        System.out.println("--> Daftar Mahasiswa");
//        tumpukan.cetak();

}
}
