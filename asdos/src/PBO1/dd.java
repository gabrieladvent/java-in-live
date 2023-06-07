/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO1;

import java.util.Scanner;

/**
 *
 * @author Tak Bertuan
 */
public class dd {
    
    public static void main(String[] args) {
        String nm = "", kls = "";
        int nim = 0;
        for (int i = 0; i < 2; i++) {
            Scanner in = new Scanner (System.in);
        System.out.print("Nama: ");
        nm = in.nextLine();
        System.out.print("NIM: ");
        nim = in.nextInt();
        System.out.print("Kelas: ");
        kls = in.next();
        }
        
        
        
        System.out.println("\n"
                + "OUTPUT");
        for (int i = 0; i < 2; i++) {
         System.out.println("Nama: "+nm);
        System.out.println("NIM: "+nim);
        System.out.println("Kelas: "+ kls);   
        }
        
    }
}
