/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTAMA;
/**
 *
 * @author Tak Bertuan
 */
public class EDGE {
    private String vertex;
    private int bobot;
    
public EDGE(String vertex, int bobot){
    this.vertex = vertex; 
    this.bobot = bobot; 
} 

public String getVertex() {
    return vertex;
}
public void setVertex(String vertex) {
    this.vertex = vertex;
}

public int getBobot() {
    return bobot;
}
public void setBobot(int bobot) {
    this.bobot = bobot;
}
}
