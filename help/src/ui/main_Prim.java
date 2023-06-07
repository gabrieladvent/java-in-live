/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.ArrayList;

/**
 *
 * @author Tak Bertuan
 */
public class main_Prim {
public static void main(String[] args) {
    graph graph = new graph();
    graph.addVertex("A");
    graph.addVertex("B");
    graph.addVertex("C");
    graph.addVertex("D");
    
        
    graph.addEdge("A", "B", 5);
    graph.addEdge("A", "C", 5);
    
    graph.addEdge("B", "D", 4);
    
    graph.addEdge("C", "D", 4);
    
    graph.BFS("A", "D");
}
}
//Gabriel Advent Batan
