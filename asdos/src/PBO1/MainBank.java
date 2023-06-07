/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO1;

/**
 *
 * @author Tak Bertuan
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author SriHartatiWijono
 */
public class MainBank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // set nilai
        RekeningBank akun;
	String      nama;
	int jumlah;
        double        sal;
        
        System.out.print("Masukkan nama Bank :  ");
        Bank bank1=new Bank(sc.next());
        System.out.print("Berapa nasabah yang akan dimasukkan ? ");
        jumlah=sc.nextInt();
        
	for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nama : ");
            nama=sc.next();
            System.out.print("Masukkan saldo : ");
            sal=sc.nextDouble();
                     
            //create a new RekeningBank and assign values
            akun = new RekeningBank();
            akun.setNama(nama);
            akun.setSaldo((int) sal);
        
            bank1.setNasabah(akun);
        }
        
         //tampilkan nilai
        System.out.println("Bank : "+bank1.getNamaBank());
        System.out.println("Nasabah : ");
        
        for (int i = 0; i < bank1.getJum_nasabah(); i++) {
            System.out.println((i+1)+". Nama : "+bank1.getNasabah(i).getNama());
            System.out.println("  Saldo : "+bank1.getNasabah(i).getSaldo());
        }
        

    }
}

