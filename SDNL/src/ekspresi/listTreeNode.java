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
public class listTreeNode {
    TreeNode data;
    listTreeNode nextNode;

public listTreeNode(TreeNode treeNode) {
    this.data = treeNode;
    nextNode = null;
}
public listTreeNode (TreeNode treeNode, listTreeNode node){
    data = treeNode;
    nextNode = node;
}

TreeNode getTreeNode (){
    return data;
}

listTreeNode getNext (){
    return nextNode;
}
}