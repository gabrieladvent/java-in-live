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
public class TreeNode {
    char data;
    TreeNode leftNode, rightNode;

public TreeNode (char data){
    this.data = data;
    leftNode = rightNode = null;
}

public void insert (char value) {
    if (value < data){
        if (leftNode == null){
            leftNode = (new TreeNode (value));
        } else {
            leftNode.insert (value); 
        }
    } else if (value > data) {
        if (rightNode == null) {
            rightNode = (new TreeNode (data));
        } else {
            rightNode.insert(data);
        }
    }
}
}