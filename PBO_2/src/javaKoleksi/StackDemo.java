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
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("Cetak stack awal berurutan biasa ");
        for(String s : stack) {
            System.out.println(s);
        }
        System.out.println("Keluarkan satu ");
        System.out.println(stack.pop());
        System.out.println("Tambahkan tiga");                        
        stack.push("D");
        stack.push("E");
        stack.push("F");
        System.out.println("Cetak stack sesuai urutan keluar");
        while(!stack.empty()) {
            System.out.println(stack.pop());
        }
        System.out.println("Selesai");
    }
}