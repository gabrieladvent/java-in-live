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
public class LinkedList {
    private ListNode head;
    private int size;
    public LinkedList() {
        head = new ListNode();
        head.setNext(head);
        head.setPrev(head);
        size = 0;
    }
    public void addFirst(int elemen) {
        addBefore(elemen, head.getNext());
    }
    public void addLast(int elemen) {
        addBefore(elemen, head);
    }
    public ListNode addBefore(int elemen, ListNode bantu) {
        ListNode baru = new ListNode(elemen);
        baru.setNext(bantu);
        baru.setPrev(bantu.getPrev());
        bantu.getPrev().setNext(baru);
        bantu.setPrev(baru);
        size++;
        return baru;
    }
    public int getSize() {
        return size;
    }
    public int remove(ListNode bantu) {
        bantu.getPrev().setNext(bantu.getNext());
        bantu.getNext().setPrev(bantu.getPrev());
        bantu.setPrev(null);
        bantu.setNext(null);
        size--;
        return bantu.getElemen();
    }
    public int removeFirst() {
        return remove(head.getNext());
    }
    public int removeLast() {
        return remove(head.getPrev());
    }
    public boolean isEmpty() {
        if (head.getNext() == head) {
            return true;
        } else {
            return false;
        }
    } 
    public void cetak() {
       ListNode bantu = head.getNext();
        while (bantu != head) {
            System.out.print(bantu.getElemen()+ " ");
            bantu = bantu.getNext();
        }
        System.out.println();
    }
}

