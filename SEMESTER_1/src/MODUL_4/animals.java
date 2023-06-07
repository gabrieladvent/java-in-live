/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_4;

/**
 *
 * @author ACER
 */
public class animals {
    public static void main(String[] args) {
        boolean rabbit = true;
        boolean donkey = false;
        boolean leporidae = true;
        
        if (rabbit && donkey || donkey && leporidae || donkey)
            System.out.print("DOG ");
        if (rabbit && donkey || donkey && leporidae || donkey || rabbit)
            System.out.println("CAT ");

    }
}