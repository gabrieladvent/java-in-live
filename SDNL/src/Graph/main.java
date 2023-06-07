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
public class main {
     public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex('a');
        graph.addVertex('b');
        graph.addVertex('c');
        graph.addVertex('e');
        graph.addVertex('f');
        
        
        graph.addEdge('a', 'b', 4);
        graph.addEdge('a', 'f', 5);
//        graph.addEdge('b', 'a', 4);
        graph.addEdge('b', 'c', 5);
        graph.addEdge('b', 'e', 4);
        graph.addEdge('b', 'f', 2);
//        graph.addEdge('c', 'b', 5);
        graph.addEdge('c', 'e', 2);
//        graph.addEdge('f', 'a', 5);
        graph.addEdge('c', 'f', 4);
//        graph.addEdge('e', 'b', 4);
//        graph.addEdge('e', 'c', 2);
        graph.addEdge('e', 'f', 10);
//        graph.addEdge('f', 'b', 2);
//        graph.addEdge('f', 'c', 3);
//        graph.addEdge('f', 'e', 10);
        
        graph.showGraph();
        System.out.println("\n");
        graph.showAdjacency();
    }
}
