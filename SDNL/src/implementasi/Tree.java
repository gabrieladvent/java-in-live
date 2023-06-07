/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementasi;

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

public void depth (int data){
    TreeNode bantu = root;
    int dept = 0;
    if (root == null){
        dept = 0;
    } else{
        while (bantu != null){
            if (data == bantu.getData()){
                System.out.println("Data " + data
                + " Berada di depth: " + dept);
                break;
            } else {
                if (data > bantu.getData()){
                    bantu = bantu.getRightNode();
                    dept++;
                } else {
                    bantu = bantu.getLeftNode();
                    dept ++;
                }
            }
        }
    }
}

public void height (int data){
    TreeNode bantu = root;
    int high = 1;
    if (root == null){
        high = 0;
    } else{
        while (bantu != null){
            if (data == bantu.getData()){
                System.out.println("Data " + data
                + " Berada di hight: " + high);
                break;
            } else {
                if (data > bantu.getData()){
                    bantu = bantu.getRightNode();
                    high++;
                } else {
                    bantu = bantu.getLeftNode();
                    high ++;
                }
            }
        }
    }
}

public void leaf (){
    int jumlah = leafHelp (root);
    if (root == null){
        System.out.println("Tree Masih Kosong");
    } else {
        System.out.println("Jumlah Leaf adalah: " + jumlah);
    }
}
public int leafHelp (TreeNode root){
    if (root == null) {
        return 0;
    }
    if (root.getLeftNode() == null && 
        root.getRightNode() == null){
        System.out.println("Leaf: " + root.getData());
        return 1;
    } else {
        return leafHelp (root.getLeftNode()) + 
                leafHelp(root.getRightNode());
    }
}

public void descendant (int data){
    if (search (data) == null){
        System.out.println("Tree tidak ditemukan");
    } else{
        System.out.print("Descendant dari node [" + data + "] adalah: ");
        TreeNode bantu = search (data);
        preOrderHelper(bantu.getLeftNode());
        preOrderHelper(bantu.getRightNode());
        System.out.println("");
    }
}
private void preOrderHelper(TreeNode localRoot){
	if(localRoot != null){
		 System.out.print(localRoot.getData()+ " ");
		preOrderHelper(localRoot.getLeftNode());
		preOrderHelper(localRoot.getRightNode());
	}
}

public void internalNode (){
    
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
        
        System.out.println("--> DEPTH <--");
        obj.depth(42);
        System.out.println("");
        
        System.out.println("--> HEIGHT <--");
        obj.height(6);
        System.out.println("");
        
        System.out.println("--> LEAF <--");
        obj.leaf();
        System.out.println("");
        
        System.out.println("--> DESCENDANT <--");
        obj.descendant(21);
    }
}