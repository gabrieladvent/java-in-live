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
public class ListNode {
    private int data;
    ListNode next;

    ListNode(){}
    public ListNode(int data) {
        this.data = data;
    }

    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public ListNode getNext() {
        return next;
    }
    public void setNext(ListNode next) {
        this.next = next;
    }
    public void tampil(){
        System.out.print("("+data+")");
    }
}
