/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Tak Bertuan
 */
public class graph {
    private int maxVertex = 15;
    private vertex[] vertexList;
    private int[][] adjacencyMatrix; 
    private int countVertex = 0;

public graph() {
    vertexList = new vertex[maxVertex];
    adjacencyMatrix = new int[maxVertex][maxVertex];
    for (int i = 0; i < maxVertex; i++) {
        for (int j = 0; j < maxVertex; j++) {
            if (i == j) {
                adjacencyMatrix[i][j] = 0;
            } else {
                adjacencyMatrix[i][j] = -1;
            }
        }
    }
}

public void addVertex(String label) {
    if (countVertex < maxVertex) {
        vertexList[countVertex] = new vertex(label);
        countVertex++;
    }
}
    
public void addEdge(int satu, int dua, int value){
    adjacencyMatrix[satu] [dua] = value;
    adjacencyMatrix[dua] [satu] = value;
}
public void addEdge(String satu, String dua, int value){
    adjacencyMatrix[indexVertex(satu)][indexVertex(dua)] = value;
    adjacencyMatrix[indexVertex(dua)][indexVertex(satu)] = value;
}

private int indexVertex(String index){
    for (int i = 0; i < vertexList.length; i++) {
        if (vertexList[i].label.equals(index)) {
            return i;
        }
    }
    return -1;
}

void BFS (String awal, String tujuan) {
    int [] jarak = new int [countVertex];
    String [] titik = new String [countVertex];
    LinkedList <String> queue = new LinkedList <String>();

    vertexList[indexVertex(awal)].flagVisited = true;
    queue.add (awal);
    titik [indexVertex(awal)] = vertexList [indexVertex(awal)].label;
    while (queue.size() != 0) {
        if (awal == tujuan) {
            break;
        }else{
           awal = queue.poll ();
                String node;
                int i = 0;
                while (adjacencyMatrix [indexVertex(awal)][i] > 0) {
                    int EDGE = i;
                    node = vertexList[i].label;
                    if (!vertexList[indexVertex(node)].flagVisited) {
                        titik [indexVertex(node)] = titik [indexVertex(awal)] + "]" + " --> " +
                                "[" + vertexList [indexVertex(node)].label;
                        jarak [indexVertex(node)] = jarak [indexVertex(awal)] + EDGE;
                        vertexList[indexVertex(node)].flagVisited = true;
                        queue.add (node);
                    }
                } 
        }
    }
    System.out.println("--> RUTE : [" + titik [indexVertex(awal)] + "]");
    System.out.println("--> JARAK: " + jarak [indexVertex(awal)] + " Km");
}

@Override
public String toString() {
    String output = " ";
    for (int i = 0; i < vertexList.length; i++) {
            for (int k = 0; k < vertexList.length; k++) {
                System.out.print(adjacencyMatrix[i][k] + "\t");
            }
            System.out.println("");
        }
    return output;
}
}

