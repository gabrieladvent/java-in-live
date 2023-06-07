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
public class linkList {
    private listNode head;
    private int size;

    public linkList() {
        head = new listNode();
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

    public listNode addBefore(int elemen, listNode bantu) {
        listNode baru = new listNode(elemen);
        baru.setNext(bantu);
        baru.setPrev(bantu.getPrev());
        bantu.getPrev().setNext(baru);
        bantu.setPrev(baru);
        size++;
        return baru;
    }

    public int remove(listNode bantu) {
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
    public int getSize() {
        return size;
    }
    
    public listNode searchNode(int value){
        int i = 0;   
        listNode bantu = head;
        if(head == null){
            System.out.println("List Kosong");
        }
        while(bantu != null){
            if(bantu.getElemen() == value){
                System.out.println("Node ada diposisi: "+ i);
                break;
            }
            bantu = bantu.getNext();
            i++;
        }
        return null;
    }
    //add_Mid & remove_mid
    void addMid (int bantu){
        listNode baru = new listNode();
    }
    
    @Override
    public String toString() {
        String temp = "";
        listNode bantu = head.getNext();
        while (bantu != head) {
            temp = "Nilai Yang Ditambah/Dihapus: "+ bantu.getElemen();
            bantu = bantu.getNext();
        }
        System.out.println(temp);
        return temp;
    }
       
}
