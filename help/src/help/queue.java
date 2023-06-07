/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package help;

import java.util.LinkedList;

/**
 *
 * @author Tak Bertuan
 */
public class queue {
    private LinkedList <Integer> list = new LinkedList <Integer>();
    
    public queue (){
        list = new LinkedList <Integer> ();
    }
    
    public void add (Integer item){
        list.addLast(item);
    }
    
    public Integer poll (){
        return list.poll();
    }
    
    public Integer peek (){
        return list.getFirst ();
    }
    
    public boolean isEmpty (){
        return list.isEmpty();
    }
    
    public int size (){
        return list.size();
    }
}
