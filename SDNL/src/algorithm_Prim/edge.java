/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm_Prim;

/**
 *
 * @author Tak Bertuan
 */
public class edge {
    private vertex vertexA;
    private vertex vertexB;
    private int weight;
    
public edge (){}

public vertex getVertexA() {
    return vertexA;
}
public void setVertexA(vertex vertexA) {
    this.vertexA = vertexA;
}

public vertex getVertexB() {
    return vertexB;
}
public void setVertexB(vertex vertexB) {
    this.vertexB = vertexB;
}

public int getWeight() {
    return weight;
}
public void setWeight(int weight) {
    this.weight = weight;
}
}
