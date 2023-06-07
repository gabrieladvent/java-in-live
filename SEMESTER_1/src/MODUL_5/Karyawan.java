/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_5;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Karyawan {
    public static void main(String[] args) {
        Scanner gab = new Scanner(System.in);
        double gajiPokok = 1000000, golongan;
        double bonus = 0, masa;
        
        System.out.print("Masukan Golongan: ");
        golongan = gab.nextDouble();
        System.out.print("Masukan Masa Kerja: ");
        masa = gab.nextDouble();
        
        if (golongan == 1) {
            if(masa >= 1 && masa <= 10) {
                bonus = 0.5 * gajiPokok;
            } else if (masa >= 11 && masa <= 20) {
                bonus = 0.6 * gajiPokok;
            } else if (masa >= 21 && masa <=30) {
                bonus = 0.7 * gajiPokok;
            } else if (masa > 31) {
                System.out.println("Anda sudah Pensiun\nSilahkan melapor ke Administrator");
            }
        } else if (golongan == 2) {
            if(masa >= 1 && masa <= 10) {
                bonus = 0.6 * gajiPokok;
            } else if (masa >= 11 && masa <= 20) {
                bonus = 0.7 * gajiPokok;
            } else if (masa >= 21 && masa <=30) {
                bonus = 0.8 * gajiPokok;
            } else if (masa > 31) {
                System.out.println("Anda sudah Pensiun\nSilahkan melapor ke Administrator");
            }
        } else if (golongan == 3) {
            if(masa >= 1 && masa <= 10) {
                bonus = 0.7 * gajiPokok;
            } else if (masa >= 11 && masa <= 20) {
                bonus = 0.8 * gajiPokok;
            } else if (masa >= 21 && masa <=30) {
                bonus = 0.9 * gajiPokok;
            } else if (masa > 31) {
                System.out.println("Anda sudah Pensiun\nSilahkan melapor ke Administrator");
            }    
        } else if (golongan == 4) {
            if(masa >= 1 && masa <= 10) {
                bonus = 0.8 * gajiPokok;
            } else if (masa >= 11 && masa <= 20) {
                bonus = 0.9 * gajiPokok;
            } else if (masa >= 21 && masa <=30) {
                bonus = 1 * gajiPokok;
            } else if (masa > 31) {
                System.out.println("Anda sudah Pensiun\nSilahkan melapor ke Administrator");
            } 
        }
            System.out.println("Bonus akhr tahun anda adalah: "+bonus);
        
    }
}

