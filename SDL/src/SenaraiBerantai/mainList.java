/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SenaraiBerantai;

/**
 *
 * @author Tak Bertuan
 */
public class mainList {
    public static void main(String[] args) {
        LinkList data = new LinkList();
        data.addFirst(8); 
        data.addFirst(15); 
        data.addLast(26); 
        data.addLast(14); 
        data.addMid(100);
        data.print(); 
        
        data.removeLast(); 
        data.removeLast(); 
        data.removeFirst();
        data.removeFirst(); 
        data.print(); 
    }
}
