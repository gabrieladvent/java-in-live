/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TraversalGraph;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Tak Bertuan
 */
public class graph {
    private int maxVertex = 10;
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

public void showGraph(){
    for (int i = 0; i <countVertex; i++) {
        for (int j = 0; j < countVertex; j++) {
            if (adjacencyMatrix [i][j] != 0 && adjacencyMatrix [i][j] != -1 ){
                System.out.println(vertexList [i].label
                + " terhubung dengan " + vertexList [j].label
                + " dengan bobot: " + adjacencyMatrix[i][j]);
            }
        }
        System.out.println("");
    }
}
    
public void dfs (){
    int seed = 0;
    Stack stack = new Stack ();
    stack.push(seed);
    while (!stack.isEmpty()){
        int bantu = (Integer) stack.pop();
        if (!vertexList[bantu].flagVisited){
            System.out.print("[" + vertexList[bantu].label + "]");
            vertexList [bantu].flagVisited = true;
            for (int i = countVertex -1; i >= 0; i--) {
                if (adjacencyMatrix [bantu] [i] >= 1 && !vertexList[i].flagVisited) {
                    stack.push(i);
                }
            }
        }
    }
    for (int i = 0; i < countVertex; i++) {
        vertexList [i].flagVisited = false;
    }
}

public void bfs (){
    int seed = 0;
    Queue <Integer> queue = new LinkedList ();
    queue.add(seed);
    while (!queue.isEmpty()){
        int bantu = queue.remove();
        if (!vertexList [bantu].flagVisited) {
            System.out.print("[" + vertexList [bantu].label + "]");
            vertexList [bantu].flagVisited = true;
            for (int i = 0; i < countVertex; i++) {
                if (adjacencyMatrix [bantu][i] >= 1 && !vertexList[i].flagVisited) {
                    queue.add(i);
                }
            }
        }
    }
    for (int i = 0; i < countVertex; i++) {
        vertexList [i].flagVisited = false;
    }
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
