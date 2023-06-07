/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_205314096;

/**
 *
 * @author Tak Bertuan
 */
public class Tree {
    private TreeNode root;

public Tree (){}
public Tree (TreeNode root){
    this.root = root;
}

public TreeNode getRoot() {
    return root;
}
public void setRoot(TreeNode root) {
    this.root = root;
}

public void insert (int data){
        TreeNode baru = new TreeNode (data);
    TreeNode bantu = root;
    if (root == null){
        root = baru;
    } else {
        while (bantu != null){
            if (baru.getData() > bantu.getData()){
                if (bantu.getRightNode() == null){
                    bantu.setRightNode(baru);
                    break;
                } else {
                    bantu = bantu.getRightNode();
                }
            } else if (baru.getData() <= bantu.getData()){
                if (bantu.getLeftNode()== null){
                    bantu.setLeftNode(baru);
                    break;
                } else {
                    bantu = bantu.getLeftNode();
                }
            }
    }
}
}

public void preorderTraversal(){
    preOrderHelper(root);
}
public void inorderTraversal (){
    inOrderHelper (root);
}
public void postorderTraversal (){
    postOrderHelper(root);
}

private void preOrderHelper(TreeNode localRoot){
	if(localRoot != null){
		 System.out.print(localRoot.getData()+ " ");
		preOrderHelper(localRoot.getLeftNode());
		preOrderHelper(localRoot.getRightNode());
	}
}

private void inOrderHelper(TreeNode localRoot){
	if(localRoot != null){
		
		inOrderHelper(localRoot.getLeftNode());
                 System.out.print(localRoot.getData()+ " ");
		inOrderHelper(localRoot.getRightNode());
	}
}
private void postOrderHelper(TreeNode localRoot){
	if(localRoot != null){
		postOrderHelper (localRoot.getLeftNode());
		postOrderHelper (localRoot.getRightNode());
 		System.out.print(localRoot.getData()+ " ");
	}
}

public void leaf (){
    int jumlah = leafHelp (root);
    if (root == null){
        System.out.println("Tree Masih Kosong");
    } else {
        System.out.println("");
        System.out.println("--> Jumlah Leaf adalah: " + jumlah);
    }
}
public int leafHelp (TreeNode root){
    if (root == null) {
        return 0;
    }
    if (root.getLeftNode() == null && 
        root.getRightNode() == null){
        System.out.print("[" + root.getData() + "]");
        return 1;
    } else {
        return leafHelp (root.getLeftNode()) + 
                leafHelp(root.getRightNode());
    }
}
}
