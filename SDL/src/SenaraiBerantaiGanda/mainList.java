/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SenaraiBerantaiGanda;

/**
 *
 * @author Tak Bertuan
 */
public class mainList {

    public static void main(String[] args) {
        linkList simp = new linkList();
        simp.addFirst(8);
        simp.toString();
        simp.addLast(15);
        simp.toString();
        simp.addLast(26);
        simp.toString();
        simp.addLast(14);
        simp.toString();
        System.out.println("Jumlah Simpul: " + simp.getSize());
        simp.searchNode(14)  ;
        System.out.println("");
        
        simp.removeFirst();
        simp.toString();
        simp.removeLast();
        simp.toString();
        simp.removeLast();
        simp.toString();
        System.out.println("Jumlah Simpul: " + simp.getSize());
        
    }
}
