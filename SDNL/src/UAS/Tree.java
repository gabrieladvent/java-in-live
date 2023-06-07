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

public boolean delete (int data){
    TreeNode bantu = getCurrent (data);
    TreeNode predeccessor = getPredeccessor(bantu);
    TreeNode indukPrede = getParent(predeccessor.getData());
    bantu.setData(predeccessor.getData());
    
    if (indukPrede != bantu){
        if (predeccessor.getLeftNode() != null) {
            indukPrede.setRightNode(predeccessor.getLeftNode());
        } else {
            indukPrede.setRightNode(null);
        }
    } else {
        if (predeccessor.getLeftNode() != null) {
            bantu.setLeftNode(predeccessor.getLeftNode());
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
}
