/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewStack;

/**
 *
 * @author Tak Bertuan
 */
public class ListNode_Objek {
    Object elemen;
    ListNode_Objek next;
    ListNode_Objek prev;

public ListNode_Objek(){}
public ListNode_Objek (Object elemen) {
        this.elemen = elemen;
}
public ListNode_Objek (Object elemen, ListNode_Objek next,
            ListNode_Objek prev) {
        this.elemen = elemen;
        this.next = next;
        this.prev = prev;
}
public Object getElemen() {
        return elemen;
}
public void setElemen(Object elemen) {
        this.elemen = elemen;
}
public ListNode_Objek getNext() {
        return next;
}
public void setNext(ListNode_Objek next) {
        this.next = next;
}
public ListNode_Objek getPrev() {
        return prev;
}
public void setPrev(ListNode_Objek prev) {
        this.prev = prev;
}
}
