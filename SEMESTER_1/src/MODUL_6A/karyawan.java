/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_6A;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class karyawan {
    public static void main(String[] args) {
        Scanner bie = new Scanner(System.in);
        int masa, golongan;
        double gaji, hadiah = 0;
        System.out.print("Masukan gaji pokok: ");
        gaji = bie.nextInt();
        System.out.print("Masukan Golongan: ");
        golongan = bie.nextInt();
        System.out.print("Masukan Masa Kerja: ");
        masa = bie.nextInt();
        
        switch (golongan) {
            case 1:
                if (masa >= 1 && masa <= 10) {
                    hadiah = 0.5 * gaji;
            }   else if (masa >= 11 && masa <= 20) {
                    hadiah = 0.6 * gaji;
            }   else if (masa >= 21 && masa <= 30) {
                    hadiah = 0.7 * gaji;
            }
                break;
            case 2:
                if (masa >= 1 && masa <= 10) {
                    hadiah = 0.6 * gaji;
            }   else if (masa >= 11 && masa <= 20) {
                    hadiah = 0.7 * gaji;
            }   else if (masa >= 21 && masa <= 30) {
                    hadiah = 0.8 * gaji;
            }
                break;
            case 3:
                if (masa >= 1 && masa <= 10) {
                    hadiah = 0.7 * gaji;
            }   else if (masa >= 11 && masa <= 20) {
                    hadiah = 0.8 * gaji;
            }   else if (masa >= 21 && masa <= 30) {
                    hadiah = 0.9 * gaji;
            }
                break;
            case 4: 
                if (masa >= 1 && masa <= 10) {
                    hadiah = 0.8 * gaji;
            }   else if (masa >= 11 && masa <= 20) {
                    hadiah = 0.9 * gaji;
            }   else if (masa >= 21 && masa <= 30) {
                    hadiah = 1 * gaji;
            }
    }
        System.out.println("Jumlah yang diterima dari bonus tahunan sebesar: Rp."+hadiah);
}
}