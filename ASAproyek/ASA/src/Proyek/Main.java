/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyek;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Graph test = new Graph();
        test.addVertex("Andi");
        test.addVertex("Mika");
        test.addVertex("Gung");
        test.addVertex("Lala");
        test.addVertex("Ribka");
        test.addVertex("Gab");
        test.addVertex("Eren");
        test.addEdge("Andi", "Mika", 5);
        test.addEdge("Andi", "Ribka", 4);
        test.addEdge("Andi", "Lala", 7);
        test.addEdge("Mika", "Lala", 6);
        test.addEdge("Mika", "Gung", 7);
        test.addEdge("Gung", "Lala", 6);
        test.addEdge("Gung", "Gab", 9);
        test.addEdge("Gung", "Eren", 15);
        test.addEdge("Ribka", "Gab", 9);
        test.addEdge("Gab", "Eren", 8);
        Scanner in = new Scanner(System.in);
        String awal, hasil;
        System.out.print("Masukkan titik awal : ");
        awal = in.next();
        System.out.printf("---------------------------------------------------%n");
        System.out.printf("| %-20s | %-10s | %n", "JALUR", "JARAK");
        System.out.printf("---------------------------------------------------%n");
        for (int i = 0; i < test.getCountVertex()-1; i++) {
            if (!awal.equals("-") && test.indeksVertex(awal) != -1) {
                awal = test.greedy(awal);
            } else {
                System.out.println("Titik awal tidak ditemukan");
                break;
            }
        }
        System.out.println("");
    }
}
