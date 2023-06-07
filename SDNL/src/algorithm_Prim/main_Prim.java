/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm_Prim;

import java.util.ArrayList;

/**
 *
 * @author Tak Bertuan
 */
public class main_Prim {
public static void main(String[] args) {
    graph graph = new graph();
    graph.addVertex('A');
    graph.addVertex('B');
    graph.addVertex('C');
    graph.addVertex('D');
    graph.addVertex('E');
    graph.addVertex('F');
    graph.addVertex('G');
    graph.addVertex('H');
    graph.addVertex('I');
    graph.addVertex('J');
    
        
    graph.addEdge('A', 'B', 5);
    graph.addEdge('A', 'C', 5);
    
    graph.addEdge('B', 'D', 4);
    graph.addEdge('B', 'E', 9);
    
    graph.addEdge('C', 'D', 4);
    graph.addEdge('C', 'F', 7);
    
    graph.addEdge('D', 'E', 8);
    graph.addEdge('D', 'F', 6);
    
    graph.addEdge('E', 'F', 10);
    graph.addEdge('E', 'G', 10);
    graph.addEdge('E', 'H', 8);
    graph.addEdge('E', 'I', 9);
    
    graph.addEdge('F', 'G', 3);
    
    graph.addEdge('G', 'H', 6);
    graph.addEdge('G', 'J', 7);
    
    graph.addEdge('H', 'I', 4);
    graph.addEdge('H', 'J', 6);
    
    graph.addEdge('I', 'J', 7);
    
    graph.bfs();
    System.out.println("Keterangan Graph: ");
    graph.showGraph();
    System.out.println("\n");
    System.out.println("Minimum Spaning Tree");
    ArrayList <edge> obj = graph.getPrimEdges();
    for (int i = 0; i < obj.size(); i++) {
        System.out.println(obj.get(i).getVertexA().label + " --> " +
                           obj.get(i).getVertexB().label + " = " + 
                           obj.get(i).getWeight());
    }
}
}
