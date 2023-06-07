/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;
import java.util.LinkedList;
import java.util.Scanner;
/**
 *
 * @author Tak Bertuan
 */
public class stak {
    LinkedList list;
    
public stak(){
    list = new LinkedList();
}
public void add (char a){
    list.addLast(a);
}
public char pop (){
    return (char) list.removeLast();
}
public int size (){
    return list.size();
}

public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    stak obj = new stak ();
    String data;
    
    System.out.print("Masukan Kalimat Yang Anda Mau: ");
    data = input.nextLine();
    
    for (int i = 0; i < data.length(); i++) {
        obj.add(data.charAt(i));
    }
    for (int j = 0; j < data.length(); j++) {
        System.out.print(obj.pop() + " ");
    }
        
}
}
