/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaKoleksi;

/**
 *
 * @author ACER
 */
import java.util.LinkedList;

public class LinkkedListDemo {
    private static LinkedList<Integer> l;
    public static void main(String[] args) {
        System.out.println("Program dengan LINKEDLIST default Java.");
        l = new LinkedList<Integer>();
        Integer j = null;
        int i;
        System.out.println("starting...");
        for (i = 0; i < 5; i++) {
            j = new Integer((int) (Math.random() * 100));
            l.addFirst(j);
            System.out.println("add : " + j);
        }
       for (; i < 10; i++) {
            j = new Integer((int) (Math.random() * 100));
            l.addLast(j);
            System.out.println("addLast : " + j);
        }
        for (i = 0; i < l.size(); i++) {
            System.out.println("get " + i + " : " + l.get(i));
        }
        for (i = 0; i < 5; i++) {
            System.out.println("remove : " + ((Integer) l.remove()));
        }
        while (!l.isEmpty()) {
            System.out.println("removeLast : " + ((Integer) l.removeLast()));
        }
    }    
}
