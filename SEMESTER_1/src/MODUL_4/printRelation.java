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
public class printRelation 
{
    public static void main(String s[]) 
    {
        int a = 7 * 3 + 6 / 2 - 5;
        int b = 21 - 8 + a % 3 * 11;
        if (a < b)
        {
            System.out.println("A is less than B");
        }
        if (a == b) //Ada tanda merah karena yang benar adalah == (tidak ada tanda = dalam operator relasional
        {
            System.out.println("A is equal to B");
        }
        if (a > b)
        {
            System.out.println("A is greater than B");
        }
    }
}
