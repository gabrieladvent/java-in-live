/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package help;

import java.util.Vector;

/**
 *
 * @author Tak Bertuan
 */
public class node {
    Vector <Integer> path = null;
    int value;
    
    public node (Vector <Integer> Parentpath, int nodeValue){
        path = new Vector<Integer>();
        if (Parentpath != null) {
            for (int v : Parentpath){
                path.add(v);
            }
        }
        path.add(nodeValue);
        this.value = nodeValue;
    }
    
    public double hitungBobot (double [][] adj){
        double result = 0;
        if (adj != null && path != null && path.size() > 1) {
            double totalBobot = 0;
            for (int i = 0; i < path.size(); i++) {
                int v1 = path.get(i - 1);
                int v2 = path.get(i);
                if (v1 >= 0 && v2 >= 0 && v1 < adj.length && v2 < adj.length) {
                    double bobot = adj [v1][v2];
                    totalBobot = totalBobot + bobot;
                } else {
                    System.out.println("PARAMETER TIDAK VALID");
                    totalBobot = 0;
                    break;
                }
            }
            result = totalBobot;
        }
        return result;
    }
    
    public void cetak (double [][] adj, char [] label){
        System.out.print("Path: ");
        if (path != null && path.size() > 0) {
            System.out.print(label [path.get(0)]);
            for (int i = 0; i < path.size(); i++) {
                System.out.println(" " + label [path.get(i)]);
            }
        } else {
            System.out.print("NULL");
        }
    }
}
