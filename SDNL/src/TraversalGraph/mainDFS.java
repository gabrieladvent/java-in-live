/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TraversalGraph;

/**
 *
 * @author Tak Bertuan
 */
public class mainDFS {
public static void main(String[] args) {
    graph graph = new graph();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('F');
        graph.addVertex('G');
        graph.addVertex('H');
        
        graph.addEdge('A', 'B', 5);
        graph.addEdge('A', 'D', 7);
        graph.addEdge('A', 'F', 4);
        graph.addEdge('B', 'C', 7);
        graph.addEdge('B', 'D', 6);
        graph.addEdge('C', 'D', 6);
        graph.addEdge('C', 'G', 9);
        graph.addEdge('C', 'H', 15);
        graph.addEdge('D', 'G', 5);
        graph.addEdge('F', 'G', 9);
        graph.addEdge('G', 'H', 8);

        
        System.out.println("Keterangan dari graph yang dibuat: ");
        graph.showGraph();
        System.out.println("Hasil Deep-First Search   ");
        graph.dfs();
        System.out.println("\n\n\n");
        System.out.println("Hasil Adjacency Matrix: ");
        graph.toString();
        
}
}
