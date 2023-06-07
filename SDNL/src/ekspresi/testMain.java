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
public class testMain {
public static void main(String[] args) {
    //String s1 = "(A+B)*((B-C)+D)";
    //String s1 = "(A+B*C)^((P+Q)*R";
    //String s1 = "(A+B)";
    //String s1 = "(A/(B+C))";
    String s1 = "(((A+B)*C)/(-(E^F)))";
    char notasi [] = new char [s1.length()];
    s1.getChars(0, s1.length(), notasi, 0);
    
    Tree obj = new Tree ();
    infix in = new infix (notasi);
    obj.setRoot(in.buat());
    
    System.out.println("\n");
    System.out.print("Hasil Prefix:\t ");
    obj.preOrder();
    System.out.println("");
    System.out.print("Hasil Infix:\t ");
    obj.inorder();
    System.out.println("");
    System.out.print("Hasil Postfix:\t ");
    obj.postorder();
}
}