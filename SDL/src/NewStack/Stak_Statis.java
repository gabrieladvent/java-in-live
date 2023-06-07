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
public class Stak_Statis {
    int [] elemen;
    int front = -1;
    int size;
    
Stak_Statis (){}
Stak_Statis (int ukuran){
    elemen = new int [ukuran];
}
public boolean push (int tambah){
    if (size < elemen.length){
        front ++;
        elemen [front] = tambah;
        size ++;
        return true;
    } else {
        return false;
    }
}
public int pop (){
    if (!isEmpty()){
        int hapus = elemen [front];
        front--;
        size--;
        return hapus;
    } else {
        throw new NoSuchElementException();
    }
}
public boolean isEmpty (){
    if (size == 0){
        return true;
    } else {
        return false;
    }
}
public int size (){
    return size;
}
  public void printdata(){
        if (size == 0){
            System.out.println("Data Yang Dimasukan Kosong");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.print("["+elemen[i]+ "], ");
            }
        }
  }
public static void main(String[] args) {
    Stak_Statis stak = new Stak_Statis (7);
    stak.push(26);
    stak.push(15);
    stak.push(8);
    stak.push(14);
    System.out.println("-->Isi Tumpukan: ");
    stak.printdata();
    System.out.println("\n");
    
    System.out.println("Data Yang Dihapus: "+ stak.pop());
    System.out.println("Data Yang Dihapus: "+ stak.pop());
    System.out.println("--> Isi Tumpukan");
    stak.printdata();
}
}
