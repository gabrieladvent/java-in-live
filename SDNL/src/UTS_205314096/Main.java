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
public class Main {
public static void main(String[] args) {
    Tree bst = new Tree();
    
    //--Insert Data ke dalam pohon--//
    bst.insert(47);
    bst.insert(20);
    bst.insert(57);
    bst.insert(94);
    bst.insert(86);
    bst.insert(80);
    bst.insert(35);
    bst.insert(26);
    System.out.println("Root: " + bst.getRoot().getData());
    
    /*  
    Gambar Pohon
                        47
                       /  \
                      20  57
                       \    \
                       35   94
                      /     /
                     26   86
                          /
                         80
    */
    
    //--Traversal--//
    System.out.println("---------------------------");
    System.out.println("HASIL SECARA TRAVERSAL");
    System.out.println("---------------------------");
    System.out.println("1. Preorder Traversal: ");
    System.out.print("--> ");
    bst.preorderTraversal();
    System.out.println("\n");
    
    System.out.println("2. Inorder Traversal: ");
    System.out.print("--> ");
    bst.inorderTraversal();
    System.out.println("\n");
    
    System.out.println("3. Postorder Traversal: ");
    System.out.print("-->");
    bst.postorderTraversal();
    System.out.println("");
    System.out.println("---------------------------");
    System.out.println("");
    
    System.out.println("Berdasarkan data yang dimasukan di atas");
    System.out.print("Leaf dari pohon di atas adalah: "); 
    bst.leaf();
}
}
