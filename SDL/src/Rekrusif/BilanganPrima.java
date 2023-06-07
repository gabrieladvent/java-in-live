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
public class BilanganPrima {
        private static int bilPrima(int nmr, int index) {
        if (index == 1)
            return 1;
        else if (nmr % index == 0)
            return 1 + bilPrima(nmr, --index);
        else
            return 0 + bilPrima(nmr, --index);
    }
 
    public static boolean cekBilangan(int no) {
        if (no > 1)
            return (bilPrima(no, no) == 2);
        else
            return false;
    }

    public static void main(String[] args) {
        int data = 10;
        for (int i = 1; i <= data; i++){
            if(cekBilangan(i))
                System.out.print(i + ", ");
        }
    }
}
