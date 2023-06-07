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
public class Vertex {
    private char label; // memberikan node2
    boolean flagVisited; //mengecek apakah node sudah dikunjungi atau belum. default: false.
    
    public Vertex(char label) {
        this.label = label;
        this.flagVisited = false;
    }
    
    public char getLabel() {
        return label;
    }
    
    public void setLabel (char label) {
        this.label = label;
    }
}
