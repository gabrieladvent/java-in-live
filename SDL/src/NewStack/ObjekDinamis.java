/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewStack;

/**
 *
 * @author Tak Bertuan
 */
public class ObjekDinamis {
    LinkedList_Objek tumpukan;

public ObjekDinamis (LinkedList_Objek tumpukan) {
    this.tumpukan = tumpukan;
}    
ObjekDinamis(){
    tumpukan = new LinkedList_Objek();
}
void Push(Object elemen){
    tumpukan.addFirst(elemen);
}
Object Pop(){
    return tumpukan.removeFirst();
}
public int Size() {
    return tumpukan.size();
}
public boolean isEmpty() {
    return tumpukan.isEmpty();
}
public void cetak(){
    System.out.println(tumpukan.toString());
}
    
public static void main(String[] args) {
    ObjekDinamis stak = new ObjekDinamis();
        stak.Push(new Mahasiswa("Gabriel", 205314096, "Informatika", "Jogja"));
        stak.Push(new Mahasiswa("Lestin", 205314095, "Informatika", "Atambua"));
        stak.Push(new Mahasiswa("Agnes", 191114069, "Bimbingan Konseling", "Bangka"));
        stak.Push(new Mahasiswa("Gabriela", 202114056, "Akutansi", "Kupang"));
        stak.Push(new Mahasiswa("Damian", 205314100, "Informatika", "Jakarta"));
        System.out.println("--> Daftar Mahasiswa");
        stak.cetak();
        System.out.println("\n");
        
        System.out.println("Mahasiswa Yang Dihapus:\n" + stak.Pop());
        System.out.println("Mahasiswa Yang Dihapus:\n" + stak.Pop());
        System.out.println("Mahasiswa Yang Dihapus:\n" + stak.Pop());
        System.out.println("--> Daftar Mahasiswa");
        stak.cetak();
}
}
