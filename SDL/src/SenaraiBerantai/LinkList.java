package SenaraiBerantai;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tak Bertuan
 */
public class LinkList {
   private ListNode firstNode;
   private ListNode lastNode;
   private String nama;

    public LinkList() {
        firstNode = null;
        lastNode = null;
    }

    public LinkList(String nama) {
        this.nama = nama;
    }
    public void addFirst(int data){
        if (isEmpty()){ //Algoritma B
            ListNode baru = new ListNode(data);
            firstNode = baru;
            lastNode = baru;
        }else{//Algoritma C
            ListNode baru = new ListNode(data);
            baru.setNext(firstNode);
            firstNode = baru;
        }
    }
    public void addLast(int data){
        if (isEmpty()){//Algoritma B
            ListNode baru = new ListNode(data);
            firstNode = baru;
            lastNode = baru;
        }else{//Algoritma D
            ListNode baru = new ListNode(data);
            lastNode.setNext(baru);
            lastNode = baru;
        }
    }
    public ListNode removeFirst(){
        if(!isEmpty()){
            if(firstNode == lastNode){
                ListNode temp;
                temp = firstNode;
                lastNode = firstNode = null;
                return temp;
            }else{ 
                ListNode temp;
                temp = firstNode;
                firstNode = firstNode.getNext();
                return temp;
            }
        }else{
            return null;
        }
    }
    public ListNode removeLast(){
        if(!isEmpty()){
            if(firstNode == lastNode){ 
                ListNode temp;
                temp = firstNode;
                lastNode = firstNode = null;
                return temp;
            }else{ 
                ListNode temp;
                temp = firstNode;
                while(temp.getNext() != lastNode){
                    temp = temp.getNext();
                }
                lastNode = temp;
                temp = temp.getNext();
                lastNode.setNext(null);
                return temp;
            }
        }else{
            return null;
        }
    }
    void addMid (int elemen){
        ListNode baru = new ListNode();
        ListNode bantu = firstNode;
        if (isEmpty()){
            firstNode = lastNode = baru;
        } else if (baru.getData() < firstNode.getData()){
            addFirst(elemen);
        } else if (baru.getData() > lastNode.getData()){
            addLast(elemen);
        } else {
            while(bantu.getNext().getData() < elemen){
                bantu = bantu.getNext();
            }
            baru.setNext(bantu.getNext());
            bantu.setNext(baru);
        }
    }
    
    public boolean isEmpty(){
        return(firstNode == null);
    }
    public void print(){
        ListNode n = firstNode;
        if(n == null){
            System.out.println("Kosong");
        }else{
            while(n != null){
                n.tampil();
                n = n.next;
            }
            System.out.println("");
        }
    }
}
