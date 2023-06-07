/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delete_2;

/**
 *
 * @author Tak Bertuan
 */
public class Tree {
    private TreeNode root;
    
Tree (){}

public TreeNode getRoot() {
    return root;
}
public void setRoot(TreeNode root) {
    this.root = root;
}

public void insertNode (int data){
    if (getRoot() == null){
        setRoot(new TreeNode (data));
    } else{
        getRoot ().insert(data);
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
private void preOrderHelper(TreeNode localRoot){
	if(localRoot != null){
		 System.out.print(localRoot.getData()+ " ");
		preOrderHelper(localRoot.getLeftNode());
		preOrderHelper(localRoot.getRightNode());
	}
}

public void inorderTraversal (){
    inOrderHelper (root);
}
private void inOrderHelper(TreeNode localRoot){
	if(localRoot != null){
		inOrderHelper(localRoot.getLeftNode());
                 System.out.print(localRoot.getData()+ " ");
		inOrderHelper(localRoot.getRightNode());
	}
}

public void postorderTraversal (){
    postOrderHelper(root);
}
private void postOrderHelper(TreeNode localRoot){
	if(localRoot != null){
		postOrderHelper (localRoot.getLeftNode());
		postOrderHelper (localRoot.getRightNode());
 		System.out.print(localRoot.getData()+ " ");
	}
}

public TreeNode leaf (TreeNode data){
    TreeNode bantu = search (data.getData());
    if (bantu.getLeftNode() == null &&
        bantu.getRightNode() == null){
        return bantu;
    } else{
        return null;
    }
}

public boolean cekDel (int data){
    TreeNode bantu = getCurrent(data);
    if (bantu == null) {
        return false;
    } else {
        if (bantu.getLeftNode() == null || bantu.getRightNode() == null) {
            return delete0 (data);
        } else if (bantu.getLeftNode() != null || bantu.getRightNode() != null){
            return delete2 (data);
        } else {
            return delete1 (data);
        }
    }
}

public boolean delete0 (int data){
    TreeNode bantu = getCurrent(data);
    if (bantu == null) {
        return false;
    } else {
        if (bantu == root){
            bantu = null;
        } else{
            if (bantu.getLeftNode() == null) {
                root = bantu.getRightNode();
            } else if (bantu.getRightNode() == null) {
                root = bantu.getLeftNode();
            }
        }
        return true;
    }
}
public boolean delete1 (int data){
    TreeNode bantu = getCurrent (data);
    TreeNode parent = getParent (data);
    if (bantu == null) {
        return false;
    } else {
        if (bantu == root) {
            bantu = null;
        } else{
            if (bantu == leaf(bantu)){
                if (bantu.getData() > parent.getData()) {
                    parent.setRightNode(null);
                } else{
                    parent.setLeftNode(null);
                }
            } else {
                if (bantu.getLeftNode() == null) {
                    if (bantu.getRightNode().getData() > parent.getData()) {
                        parent.setRightNode(bantu.getLeftNode());
                    } else{
                        parent.setLeftNode(bantu.getRightNode());
                    }
                } else if (bantu.getRightNode() == null) {
                    if (bantu.getLeftNode().getData() > parent.getData()){
                        parent.setRightNode(bantu.getRightNode());
                    } else{
                        parent.setLeftNode(bantu.getLeftNode());
                    }
                }
            }
        }
        return true;
    }
}

public boolean delete2 (int data){
    TreeNode bantu = getCurrent (data);
    TreeNode predeccessor = getPredeccessor(bantu);
    TreeNode suc = successor(bantu);
    TreeNode indukPrede = getParent(suc.getData());
    bantu.setData(suc.getData());
    
    if (indukPrede != bantu){
        if (suc.getLeftNode() != null) {
            indukPrede.setRightNode(suc.getLeftNode());
        } else {
            indukPrede.setRightNode(null);
        }
    } else {
        if (suc.getLeftNode() != null) {
            bantu.setLeftNode(suc.getLeftNode());
        } else {
            bantu.setLeftNode(null);
        }
    }
    return true;
}

public TreeNode getPredeccessor (TreeNode data){
    if (root == null){
        return null;
    } else {
        TreeNode bantu = data;
        bantu = bantu.getLeftNode();
        while (bantu.getRightNode() != null){
            bantu = bantu.getRightNode();
        }
        return bantu;
    }
}

public TreeNode successor (TreeNode data){
    if (root == null){
        return null;
    } else {
        TreeNode bantu = data;
        bantu = bantu.getRightNode();
        while (bantu.getLeftNode() != null){
            bantu = bantu.getLeftNode();
        }
        return bantu;
    }
}

public TreeNode getCurrent (int data){
    return search (data);   
}

public TreeNode getParent (int data){
    TreeNode bantu = root;
    TreeNode parent = null;
    while (bantu != null){
        if (bantu.getData() == data) {
            return parent;
        } else if (bantu.getData() > data){
            parent = bantu;
            bantu = bantu.getLeftNode();
        } else {
            parent = bantu;
            bantu = bantu.getRightNode();
        }
    }
    return null;
}

public static void main(String[] args) {
        Tree obj = new Tree();
        obj.insertNode(75); obj.insertNode(30);
        obj.insertNode(89); obj.insertNode(20);
        obj.insertNode(65); obj.insertNode(80);
        obj.insertNode(90);  
        
        System.out.println("Root: " + obj.root.getData());
        System.out.println(" Data sebelum dihapus");
        System.out.println("--> Preorder");
        obj.preorderTraversal();
        System.out.println("");
        System.out.println("--> Inorder");
        obj.inorderTraversal();
        System.out.println("");
        System.out.println("--> Postorder");
        obj.postorderTraversal();
        
//        int del1 = 42;
//        int del2 = 21;
//        int del3 = 71;
//        System.out.println("\n");
//        System.out.println("Data Setelah di Hapus");
//        obj.delete2(del1);
//        System.out.println("Data " + del1 + " dihapus");
//        System.out.println("--> Preorder");
//        obj.preorderTraversal();
}
}
