/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekspresi;

/**
 *
 * @author Tak Bertuan
 */
public class stack {
    private listTree stacktree;
    
public stack (){
    stacktree = new listTree ();
}

public void push (TreeNode node){
    stacktree.masukDepan(node);
}

public TreeNode pop (){
    return stacktree.removeDepan();
}

public boolean isEmpty (){
    return stacktree.isEmpty();
}

public void print (){
    stacktree.print();
}
}