/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumpangBang;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author Tak Bertuan
 */
public class LinkedListOrdered<E> extends LinkedList<E> {

    public boolean addSort(E data) {
        ListIterator<E> iterator = this.listIterator();
        while(iterator.hasNext()){
            E bantu = iterator.next();
            if(((Comparable)bantu).compareTo(data)>0){
                iterator.previous();
                iterator.add(data);
                return true;
        }else if(((Comparable)bantu).compareTo(data)==0){
            iterator.add(data);
            return true;
        }
        }
            iterator.add(data);
     
        return true;
    }
    
    public static void main(String[] args) {
        LinkedListOrdered<String> list = new LinkedListOrdered<>();
        list.addSort("aaa");
        list.addSort("bbb");
        list.addSort("ddd");
        
//        Iterator iterator = list.listIterator();
        System.out.println(list.toString());
        list.addSort("ccc");
//        list.addSort("bbb");
        System.out.println(list.toString());
    }
}
