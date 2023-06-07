/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package STRING_MANIPULATION;

/**
 *
 * @author ACER
 */
class Ch9TestChar {
    
    public static void main (String[] args) {

        System.out.println("Kode ASCII dari karakter X : " + (int)'X' );

        System.out.println("Karakter dengan kode ASCII 88 : " + (char)88 );
        if (Character.isUpperCase('a'))
            System.out.println("Huruf Besar");
        else
            System.out.println("Huruf besarnya a adalah : "+Character.toUpperCase('a'));
        
        char angka='8';
        if (Character.isDigit(angka))
            System.out.println("Angka "+angka);
        
         char huruf='z';
        if (Character.isLetter(huruf))
            System.out.println("Huruf "+huruf);
        
    }
}
