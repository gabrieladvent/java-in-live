/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTAMA;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Tak Bertuan
 */

public class GRAPH {
    private int countVertex;
    private LinkedList <EDGE> adjacency [];
    private String [] kota;

GRAPH (int countVertex, String [] kota) {
    this.countVertex = countVertex;
    adjacency = new LinkedList [countVertex];
    for (int i = 0; i < countVertex; i++) {
        adjacency[i] = new LinkedList<EDGE> ();
    }
    this.kota = kota;
}

void addEdge (String awal, String tujuan, int bobot) {
    EDGE e = new EDGE (tujuan, bobot);
    adjacency [indexVertex(awal)].add (e);
}

private int indexVertex(String index){
    for (int i = 0; i < kota.length; i++) {
        if (kota[i].equals(index)) {
            return i;
        }
    }
    return -1;
}

void BFS (String awal, String tujuan) {
    int [] jarak = new int [countVertex];
    String [] titik = new String [countVertex];
    boolean visited [] = new boolean [countVertex];
    LinkedList <String> queue = new LinkedList <String>();

    visited [indexVertex(awal)] = true;
    queue.add (awal);
    titik [indexVertex(awal)] = kota [indexVertex(awal)];
    while (queue.size() != 0) {
        awal = queue.poll ();
                Iterator <EDGE> list = adjacency [indexVertex(awal)].listIterator ();
                String node;
                while (list.hasNext()) {
                    EDGE edge = list.next ();
                    node = edge.getVertex ();
                    if (!visited [indexVertex(node)]) {
                        titik [indexVertex(node)] = titik [indexVertex(awal)] + "]" + " --> " + "[" + kota [indexVertex(node)];
                        jarak [indexVertex(node)] = jarak [indexVertex(awal)] + edge.getBobot ();
                        visited [indexVertex(node)] = true;
                        queue.add (node);
                    }
                }
            
    }
    System.out.println("--> RUTE : [" + titik [indexVertex(awal)] + "]");
    System.out.println("--> JARAK: " + jarak [indexVertex(awal)] + " Km");
}
}