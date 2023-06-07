/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTAMA;

import java.util.Scanner;

/**
 *
 * @author Tak Bertuan
 */
public class MAINPRO {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String awal;
        String akhir;
        String[] kota = {"TAJEM", "JANTI", "PAINGAN", "BABARSARI",
            "CANGKRINGAN", "SETURAN"};
        GRAPH jogjaMap = new GRAPH(6, kota);

       jogjaMap.addEdge("Tajem", "Janti", 7);
       jogjaMap.addEdge("Tajem", "Paingan", 2);
       jogjaMap.addEdge("Tajem", "Cangkringan", 13);
       
       jogjaMap.addEdge("Janti", "Paingan", 5);
       jogjaMap.addEdge("Janti", "Babarsari", 1);
       
       jogjaMap.addEdge("Paingan", "Babarsari", 5);
       jogjaMap.addEdge("Paingan", "Seturan", 3);
       jogjaMap.addEdge("Paingan", "Cangkringan", 15);

        System.out.print("Awal: ");
        awal = inp.next();
        System.out.print("Akhir: ");
        akhir = inp.next();
        jogjaMap.BFS(awal, akhir);

    }
}
