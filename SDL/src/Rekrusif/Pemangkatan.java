/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rekrusif;

/**
 *
 * @author ACER
 */
public class Pemangkatan {
public static int pangkat (int x, int y){
    if (y > 0)
        return x * pangkat(x, y - 1);
    else
        return 1;
    
}

public static void main(String[] args) {
    System.out.println("----Bilangan x dipangkatkan y----");
    int x = 4;
    int y = 3;
    System.out.println("Bilangan x = " + x);
    System.out.println("Bilangan y = " + y);
    System.out.println(x + " dipangkatkan " + y + " adalah = " + pangkat(x, y));
} 
}
