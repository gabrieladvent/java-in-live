/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3_Search;

import SenaraiBerantaiGanda.listNode;

/**
 *
 * @author Tak Bertuan
 */


public class LinkedList {

    private listNode head;
    private int size;

    public LinkedList() {
        this.size = 0;
        head = new listNode();
        head.setNext(head);
        head.setPrev(head);
    }

    private listNode addBefore(int elemen, listNode node) {
        listNode baru = new listNode(elemen);
        node.getPrev().setNext(baru);
        baru.setPrev(node.getPrev());
        baru.setNext(node);
        node.setPrev(baru);
        size++;
        return baru;
    }

    public int remove(listNode node) {
        listNode kiri = node.getPrev();
        listNode kanan = node.getNext();
        kiri.setNext(kanan);
        kanan.setPrev(kiri);
        node.setNext(null);
        node.setPrev(null);
        size--;
        return node.getElemen();
    }

    public void addFirst(int elemen) {
        addBefore(elemen, head.getNext());
    }

    public void addLast(int elemen) {
        addBefore(elemen, head);
    }

    public int removeFirst() {
        int elemen = remove(head.getNext());
        return elemen;
    }

    public int removeLast() {
        int elemen = remove(head.getPrev());
        return elemen;
    }

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        listNode node = head.getNext();
        while (node != head) {
            int elemen = node.getElemen();
            str.append(elemen);
            str.append(" ");
            node = node.getNext();
        }
        return str.toString();
    }
              
    public int get(int index) {
        listNode n = getNode(index);
        if (n == null) {
            try {
                System.out.println("DATA TIDAK DITEMUKAN!");
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }

            return -1;
        } else {
            return n.getElemen();
        }
    }

    public int remove(int index) {
        listNode node = getNode(index);
        return remove(node);
    }

    private listNode getNode(int index) {
        listNode node = head;
        node = node.getNext();
        int i = 0;
        while (node != head) {
            if (i == index) {
                return node;
            }
            node = node.getNext();
            i++;
        }
        return null;
    }

    public void add(int data, int index) { //method yang hrs ditambahkan
        listNode node = getNode(index); //method ini akan dibantu oleh method addBefore
        addBefore(data, node);
        
    }
    
    public int size(){
        return size;
    }
    
    public boolean isEmpty(){
        if(size == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        LinkedList daftar = new LinkedList();
        daftar.addLast(3);
        daftar.addLast(8);
        daftar.addLast(0);
        daftar.addLast(9);

        System.out.println();
        System.out.println(daftar.toString());
        int nilai = daftar.get(1);
        System.out.println("Nilai index 1 --> " + nilai + "\n");
        int hapus = daftar.remove(1);
        System.out.println("Nilai " + hapus + " Dihapus");
        System.out.println(daftar.toString() + "\n");
        daftar.add(6, 1);
        System.out.println("Nilai 6 di add atau ditambahkan ke index 1 ");
        System.out.println(daftar.toString());
        System.out.println("Total data ditampung : " + daftar.size);
        daftar.get(2);
        daftar.getNode(3);
        System.out.println("apa ");
    }

}

