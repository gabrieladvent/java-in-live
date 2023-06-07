/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyek;

import java.util.ArrayList;
import java.util.List;

public class Graph {
//https://github.com/daniandhk/AlgoritmaDijkstra/blob/master/src/dijkstras/DijkstrasAlgorithm.java

    private int maxVertex = 7;
    private Vertex[] vertexList;
    private int[][] adjacencyMatrix;
    private int countVertex = 0;
    private static final int NO_PARENT = -1;

    public Graph() {
        vertexList = new Vertex[maxVertex];
        adjacencyMatrix = new int[maxVertex][maxVertex];
        for (int i = 0; i < maxVertex; i++) {
            for (int j = 0; j < maxVertex; j++) {
                if (i == j) {
                    adjacencyMatrix[i][j] = 0;
                }
            }
        }
    }

    public void addVertex(String label) {
        if (getCountVertex() < maxVertex) {
            vertexList[getCountVertex()] = new Vertex(label);
            countVertex++;
        }
    }

    public void addEdge(int titik, int tujuan, int bobot) {
        if (titik != -1 && tujuan != -1) {
            adjacencyMatrix[titik][tujuan] = bobot;
            adjacencyMatrix[tujuan][titik] = bobot;
        } else {
            System.out.println("Titik dan tujuan tidak valid");
        }

    }

    public void addEdge(String titik, String tujuan, int bobot) {
        addEdge(indeksVertex(titik), indeksVertex(tujuan), bobot);
    }

    public int indeksVertex(String label) {
        for (int i = 0; i < getCountVertex(); i++) {
            if (vertexList[i].label.equalsIgnoreCase(label)) {
                return i;
            }
        }
        return -1;
    }

    public String getVertex(int label) {
        return vertexList[label].label;
    }

    public void show() {
        for (int i = 0; i < getCountVertex(); i++) {
            for (int j = 0; j < getCountVertex(); j++) {
                if (adjacencyMatrix[i][j] != 0 && vertexList[j].flagVisited == false) {
                    System.out.println(vertexList[i].label + " terhubung ke "
                            + vertexList[j].label
                            + " dengan beban " + adjacencyMatrix[i][j]);
                    vertexList[i].flagVisited = true;
                }
            }
        }
    }

//// Function Algoritma Greedy
    public String greedy(String label) {

        int startVertex = indeksVertex(label);
        int jumlah_vertex = adjacencyMatrix[0].length;

        // menyimpan jarak terpendek
        int[] shortestDistances = new int[jumlah_vertex];

        // true jika vertex termasuk jalur terpendek / udah di proses
        boolean[] added = new boolean[jumlah_vertex];

        // inisialisasi
        for (int vertexIndex = 0; vertexIndex < jumlah_vertex; vertexIndex++) {
            shortestDistances[vertexIndex] = Integer.MAX_VALUE;
            added[vertexIndex] = false;
        }

        // Jarak source ke dirinya sendiri 0
        shortestDistances[startVertex] = 0;

        // menyimpan jalur yang terpendek
        int[] jalur = new int[jumlah_vertex];

        jalur[startVertex] = NO_PARENT;

        // mencari jalur terpendek untuk setiap vertex
        for (int i = 1; i < jumlah_vertex; i++) {
            int nearestVertex = -1;
            int shortestDistance = Integer.MAX_VALUE;
            for (int vertexIndex = 0; vertexIndex < jumlah_vertex; vertexIndex++) {
                if (!added[vertexIndex] && shortestDistances[vertexIndex] < shortestDistance) {
                    nearestVertex = vertexIndex;
                    shortestDistance = shortestDistances[vertexIndex];
                }
            }
            if (nearestVertex != -1) {
                added[nearestVertex] = true;

                for (int vertexIndex = 0; vertexIndex < jumlah_vertex; vertexIndex++) {
                    int edgeDistance = adjacencyMatrix[nearestVertex][vertexIndex];

                    if (edgeDistance > 0 && ((shortestDistance + edgeDistance) < shortestDistances[vertexIndex])) {
                        jalur[vertexIndex] = nearestVertex;
                        shortestDistances[vertexIndex] = shortestDistance + edgeDistance;
                    }
                }
            } else {
                break;
            }
        }

        int indeksMin = printSolusi(startVertex, shortestDistances, jalur);
        adjacencyMatrix[startVertex][indeksMin] = 0;
        adjacencyMatrix[indeksMin][startVertex] = 0;
        return vertexList[indeksMin].label;
    }

    // print jarak dan membuat jalur
    private int printSolusi(int startVertex, int[] jarak, int[] jalur) {
        int jumlah_vertex = jarak.length;
        int indexMin = min(jarak, startVertex);
        System.out.print("\n" + vertexList[startVertex].label + " -> ");
        System.out.print(vertexList[indexMin].label + " \t\t ");
        System.out.print(jarak[indexMin] + "\t\t");
        return indexMin;
    }

    // print jalur
    private void printJalur(int currentVertex, int[] jalur) {
        if (currentVertex == NO_PARENT) {
            return;
        }
        printJalur(jalur[currentVertex], jalur);
        System.out.print(vertexList[currentVertex].label + " ->");
    }

    public int min(int[] arr, int source) {
        int min = arr[0], index = 0;
        if (source == 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    min = arr[i];
                    index = i;
                }
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min && i != source) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }

    @Override
    public String toString() {
        System.out.println("\n Adjacency matrix ");
        for (int i = 0; i < getCountVertex(); i++) {
            for (int j = 0; j < getCountVertex(); j++) {
                System.out.print(" " + adjacencyMatrix[i][j]);
            }
            System.out.println();
        }
        return "";
    }

    public int getCountVertex() {
        return countVertex;
    }

}
