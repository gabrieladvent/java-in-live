/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

/**
 *
 * @author Tak Bertuan
 */
public class Graph {
    private int maxVertex = 5; //nilai 5 sesuai dengan jumlah node/vertex
    private Vertex[] vertexList; //menyimpan nama2 node/vertex
    private int[][] adjacencyMatrix; // 
    private int countVertex = 0; //menghitung jumlah node atau vertex

    public Graph() {
        vertexList = new Vertex[maxVertex];
        adjacencyMatrix = new int[maxVertex][maxVertex];
        
        //membuat nilai 0 ketika node ketemu node yang sama
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
            vertexList[countVertex] = new Vertex(label);
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
            if (vertexList[i].getLabel() == index) {
                return i;
            }
        }
        return -0;
    }

    @Override
    public String toString() {
        return "Graph{" + "maxVertex=" + maxVertex + ", vertexList=" 
                + vertexList 
                + ", adjacencyMatrix=" + adjacencyMatrix + ", countVertex=" 
                + countVertex + '}';
    }
    
    public void showGraph(){
        for (int i = 0; i < vertexList.length; i++) {
            for (int j = 0; j < vertexList.length; j++) {
                if (adjacencyMatrix[i][j] != 0 && adjacencyMatrix[i][j] != -1 &&
                        vertexList [j].flagVisited == false) {
                    System.out.println(vertexList[i].getLabel()
                            + " terhubung dengan "
                            +vertexList[j].getLabel()+ " dengan bobot " 
                            + adjacencyMatrix[i][j]);
                    vertexList[i].flagVisited = true;
                }
            }
            System.out.println("");
        }
    }
    
    public void showAdjacency() {
        for (int i = 0; i < countVertex; i++) {
            for (int k = 0; k < countVertex; k++) {
                System.out.print(adjacencyMatrix[i][k] + "\t");
            }
            System.out.println("");
        }
    }
}
