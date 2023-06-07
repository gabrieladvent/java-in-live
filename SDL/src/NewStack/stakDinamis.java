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
public class stakDinamis {
    LinkedList tumpukan;
    
public stakDinamis() {
    tumpukan = new LinkedList();
}
public void push(int elemen) {
    tumpukan.addFirst(elemen);
}
public int pop() {
    return tumpukan.removeFirst();
}
public int size() {
    return tumpukan.getSize();
}
public boolean isEmpty() {
    return tumpukan.isEmpty();
}
public void cetak() {
    tumpukan.cetak();
}

public static void main(String[] args) {
    stakDinamis stak = new stakDinamis();
        stak.push(26);
        stak.push(15);
        stak.push(8);
        stak.push(14);
        System.out.println("-->Isi stak: ");
        stak.cetak();
        System.out.println("\n");
        
        System.out.println("Tumpukan yang Dihapus: " + stak.pop());
        System.out.println("Tumpukan yang Dihapus: " + stak.pop());
        System.out.println("--> Isi stak: ");
        stak.cetak();
}
}
