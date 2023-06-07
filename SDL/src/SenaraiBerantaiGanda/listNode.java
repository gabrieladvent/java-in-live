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
public class listNode {
    private int elemen;
    private listNode next;
    private listNode prev;
    
public listNode(){}
public listNode (int elemen){
    this.elemen = elemen;
}
public listNode (int elemen, listNode next, listNode prev){
    this.elemen = elemen;
    this.next = next;
    this.prev = prev;
}

    /**
     * @return the elemen
     */
    public int getElemen() {
        return elemen;
    }

    /**
     * @param elemen the elemen to set
     */
    public void setElemen(int elemen) {
        this.elemen = elemen;
    }

    /**
     * @return the next
     */
    public listNode getNext() {
        return next;
    }
    public void setNext(listNode next) {
        this.next = next;
    }
    public listNode getPrev() {
        return prev;
    }
    public void setPrev(listNode prev) {
        this.prev = prev;
    }

}
