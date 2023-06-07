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
public class Tree {
    private TreeNode root;

public Tree (){
    root = null;
}

public void setRoot (TreeNode root){
    this.root = root;
}

public void insert (char data){
    if (root == null){
        root = new TreeNode(data);
    } else {
        root.insert(data);
    }
}

public void preOrder (){
    orderHelp (root);
}
public void orderHelp (TreeNode data){
    if (data == null){
        return;
    }
    System.out.print(data.data + " ");
    orderHelp(data.leftNode);
    orderHelp(data.rightNode);
}

public void inorder (){
    inHelper (root);
}
private void inHelper(TreeNode data){
    if(data == null){
        return;
    }
    inHelper(data.leftNode);
    System.out.print(data.data + " ");
    inHelper(data.rightNode);
}

public void postorder (){
    postHelper(root);
}
private void postHelper(TreeNode data){
    if(data == null){
        return;
    }
    postHelper (data.leftNode);
    postHelper (data.rightNode);
    System.out.print(data.data + " ");
}
}