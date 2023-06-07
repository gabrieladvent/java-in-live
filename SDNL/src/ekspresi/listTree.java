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
public class listTree {
    private listTreeNode firstNode;
    private listTreeNode lastNode;
    private String name;
    
public listTree (){
    name = "List: ";
}
public listTree (String listname){
    name = listname;
    firstNode = lastNode = null;
}

public void masukDepan (TreeNode data){
    if (isEmpty ()) {
        firstNode = lastNode = new listTreeNode (data);
    } else {
        firstNode = new listTreeNode (data, firstNode);
    }
}

public void masukBlkng (TreeNode data){
    if (isEmpty ()) {
        firstNode = lastNode = new listTreeNode (data);
    } else {
        lastNode = lastNode.nextNode = new listTreeNode (data);
    }
}

public TreeNode removeDepan (){
    if (isEmpty ()){
        return null;
    }
    TreeNode hapusItem = firstNode.data;
    if (firstNode == lastNode){
        firstNode = lastNode = null;
    } else {
        firstNode = firstNode.nextNode;
    }
    return hapusItem;
}

public TreeNode removeBlkng (){
    if (isEmpty ()) {
        return null;
    }
    TreeNode hapusItem = lastNode.data;
    if (firstNode == lastNode) {
        firstNode = lastNode = null;
    } else {
        listTreeNode current = firstNode;
        while (current.nextNode != lastNode){
            current = current.nextNode;
        }
        lastNode = current;
        current.nextNode = null;
    }
    return hapusItem;
}

public boolean isEmpty (){
    if (firstNode == null){
        return true;
    } else {
        return false;
    }
}

public void print (){
    if (isEmpty ()){
        System.out.println("Empty: " + name);
        return;
    }
    System.out.print("The " + name + " is: ");
    listTreeNode current = firstNode;
    while (current != null){
        System.out.print(current.data.toString() + " ");
        current = current.nextNode;
    }
    System.out.println("\n");
}
}