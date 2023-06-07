/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VMODUL_6B;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class nomor5 {
    public static void main(String[] args) {
        Scanner bie = new Scanner(System.in);
        int weight = 1, many = 0, Small = 0, Medium = 0, Big = 0, mangga;
        
        System.out.print("Banyak mangga yang diproses: ");
        many = bie.nextInt();
        
        while (weight <=many) {
            System.out.print("Berat mangga "+weight+": ");
            mangga = bie.nextInt();
            if (mangga < 200) {
                Small++;
            } else if (mangga >= 200 && mangga < 600) {
                Medium++;
            } else {
                Big++;
            }
            weight++;
        }
        System.out.println("Dari "+many+" mangga yang ditimbang:");
        System.out.println("Kecil : "+Small+" buah");
        System.out.println("Sedang: "+Medium+" buah");
        System.out.println("Besar : "+Big+" buah");
        
    }
}
