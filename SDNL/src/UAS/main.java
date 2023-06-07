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
public class main {
public static void main(String[] args) {
    Tree obj = new Tree();
    obj.insertNode(75); obj.insertNode(30);
    obj.insertNode(89); obj.insertNode(20);
    obj.insertNode(65); obj.insertNode(80);
    obj.insertNode(90);
    System.out.println("    1. Membuat sebuah Binary Search Tree");
    System.out.println("Root: " + obj.getRoot().getData());
    System.out.println("--> Preorder");
        obj.preorderTraversal(); 
        System.out.println("");
    System.out.println("--> Inorder");
        obj.inorderTraversal();
        System.out.println("");
    System.out.println("--> PostOrder");
        obj.postorderTraversal();
        System.out.println("");
    System.out.println("----------------------------------------");
    System.out.println("");
    
    System.out.println("    1a. Insert data 96 (NIM: 205314096)");
    System.out.println("Root: " + obj.getRoot().getData());
    obj.insertNode(96);
    System.out.println("--> Preorder");
    obj.preorderTraversal();
    System.out.println("");
    System.out.println("----------------------------------------");
    System.out.println("");
    
    System.out.println("    1b. Hapus root (75) menggunakan Predeccessor");
    System.out.println("Root sebelum dihapus: " + obj.getRoot().getData());
    obj.delete(75);
    System.out.println("Root setelah dihapus: " + obj.getRoot().getData());
    System.out.println("------------------------------------------");
    System.out.println("");
    
    System.out.println("     1c. Menampilkan traversal");
    System.out.println("Root: " + obj.getRoot().getData());
    System.out.println("--> Preorder");
        obj.preorderTraversal(); 
        System.out.println("");
    System.out.println("--> Inorder");
        obj.inorderTraversal();
        System.out.println("");
    System.out.println("--> PostOrder");
        obj.postorderTraversal();
        System.out.println("");
    System.out.println("----------------------------------------");
}
}
