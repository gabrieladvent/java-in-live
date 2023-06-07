/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

/**
 *
 * @author Tak Bertuan
 */
public class TreeNode {
    private int data;
    private TreeNode leftNode, rightNode, parent;

TreeNode (int data){
    this.data = data;
}

public TreeNode getParent() {
    return parent;
}
public void setParent(TreeNode parent) {
    this.parent = parent;
}

public int getData() {
    return data;
}
public void setData(int data) {
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

public void insert (int data) {
    if (data > getData ()){
        if (getRightNode() == null){
            setRightNode(new TreeNode (data));
        } else {
            getRightNode().insert (data); 
        }
    } else {
        if (getLeftNode() == null) {
            setLeftNode(new TreeNode (data));
        } else {
            getLeftNode().insert(data);
        }
    }
}
}

