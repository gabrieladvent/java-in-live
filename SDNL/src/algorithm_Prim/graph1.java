/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm_Prim;

import java.util.PriorityQueue;

/**
 *
 * @author Tak Bertuan
 */
public class graph1 {
    private int maxVertex = 15;
    private vertex[] vertexList;
    private int[][] adjacencyMatrix; 
    private int countVertex = 0;

public graph1() {
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

public void addVertex(char label) {
    if (countVertex < maxVertex) {
        vertexList[countVertex] = new vertex(label);
        countVertex++;
    }
}
    
public void addEdge(int satu, int dua, int value){
    adjacencyMatrix[satu] [dua] = value;
    adjacencyMatrix[dua] [satu] = value;
}
public void addEdge(char satu, char dua, int value){
    adjacencyMatrix[indexVertex(satu)][indexVertex(dua)] = value;
    adjacencyMatrix[indexVertex(dua)][indexVertex(satu)] = value;
}

private int indexVertex(char index){
    for (int i = 0; i < vertexList.length; i++) {
        if (vertexList[i].label == index) {
            return i;
        }
    }
    return -1;
}

public void bfs (char awal, char akhir){
    int seed = 0;
    PriorityQueue <Integer> queue = new PriorityQueue ();
    queue.add(seed);
    while (!queue.isEmpty()){
        int bantu = queue.remove();
        if (!vertexList [bantu].flagVisited) {
            System.out.print("[" + vertexList [bantu].label + "]");
            vertexList [bantu].flagVisited = true;
            for (int i = 0; i < countVertex; i++) {
                if (adjacencyMatrix [bantu][i] >= 1 &&
                        !vertexList[i].flagVisited) {
                    queue.add(i);
                }
            }
        }
    }
    for (int i = 0; i < countVertex; i++) {
        vertexList [i].flagVisited = false;
    }
}
}
