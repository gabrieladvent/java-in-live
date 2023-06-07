
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tak Bertuan
 */
public class con1 {
     public static void main(String[] args) {
      //  int j = 0;
        int bil [] = {23, 26, 30, 32, 33, 69, 50, 70, 80, 55, 76, 53, 21};
        
        System.out.print ("Bilangan genap: ");
                for (int i = 0; i < bil.length; i++) {
                        if (bil [i] % 2 == 0) {
                             int   j = bil [i];
                                System.out.print(j+", ");  } 
                }
        System.out.println();
        System.out.print("Bilangan Ganjil:  ");
                for (int i = 0; i < bil.length; i++) {
                        if (bil [i] %2 != 0) {
                             int   j = bil [i];
                                System.out.print(j+", "); }
                }

    }
}


        
    
    

