/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_1;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class BujurSangkarMain {
    public static void main(String[] args) {
        BujurSangkar bujur1=new BujurSangkar();
        BujurSangkar bujur2=new BujurSangkar();
        Scanner tombol = new Scanner(System.in);
            
                System.out.print("Masukkan sisi bujur sangkar I: ");
                        bujur1.sisi = tombol.nextInt();
                System.out.print("Masukkan sisi bujur sangkar II: ");
                        bujur2.sisi = tombol.nextInt();
                System.out.println("Luas Bujur Sangkar dengan sisi= "+bujur1.sisi+" adalah: "+bujur1.luas());
                System.out.println("Luas Bujur Sangkar dengan sisi= "+bujur2.sisi+" adalah: "+bujur2.luas());
 }
}