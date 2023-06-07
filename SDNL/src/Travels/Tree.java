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
public class Tree {
    private TreeNode root;
    
Tree (){}
Tree (TreeNode root){
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
public TreeNode search (int data){
    TreeNode bantu = root;
    if (root == null){
        return null;
    } else {
        while (bantu != null){
            if (data == bantu.getData()){
                return bantu;
            } else {
                if (data > bantu.getData()){
                    bantu = bantu.getRightNode();
                } else {
                    bantu = bantu.getLeftNode();
                }
            }
        }
    }
        return null;
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


    public static void main(String[] args) {
        Tree obj = new Tree();
        obj.insert(42); obj.insert(21);
        obj.insert(38); obj.insert(27);
        obj.insert(71); obj.insert(82);
        obj.insert(55); obj.insert(63);
        obj.insert(6);  obj.insert(2);
        obj.insert(40); obj.insert(12);
        
        System.out.println("Root: " + obj.root.getData());
        int cari = 71;
        TreeNode CARI = obj.search(cari);
        
        System.out.println("Data yang dicari: " + cari);
        if (CARI != null){
            System.out.println("Data "+ cari + " Ditemukan");
        } else{
            System.out.println("Data Tidak Ditemukan");
        }
        
        System.out.println("");
        int cari2 = 49;
        TreeNode CARI2 = obj.search(cari2);
        
        System.out.println("Data yang dicari: " + cari2);
        if (CARI2 != null){
            System.out.println("Data "+ cari2 + " Ditemukan");
        } else{
            System.out.println("Data Tidak Ditemukan");
        }
        
        System.out.println("");
        System.out.println("--> Preorder");
        obj.preorderTraversal();
        System.out.println("");
        System.out.println("--> Inorder");
        obj.inorderTraversal();
        System.out.println("");
        System.out.println("--> Postorder");
        obj.postorderTraversal();
    }
}
