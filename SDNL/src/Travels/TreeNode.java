/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Travels;

/**
 *
 * @author Tak Bertuan
 */
public class TreeNode {
    private int data;
    private TreeNode leftNode;
    private TreeNode rightNode;
    
TreeNode (int data){
    this.data = data;
}
public int getData (){
    return data;
}
public void setData (int data){
    this.data = data;
}

public TreeNode getLeftNode() {
        return leftNode;
}
public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
}

public TreeNode getRightNode() {
        return rightNode;
}
public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
}
}
