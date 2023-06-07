/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4;

import java.util.Scanner;

/**
 *
 * @author Tak Bertuan
 */
public class contoh1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      System.out.print("Pilihan : \n 1. Sistem Informasi \n 2. Teknik Industri \n "
              + "3. Teknik Informatika \n\n Masukan pilihan :");
      
         int jurusan = in.nextInt();
        switch (jurusan){
            case 1:
                System.out.println("Jurusan Sistem Informasi");
                break;
            case 2:
                System.out.println("Jurusan Teknik Industri");
                break;
            case 3:
                System.out.println("Jurusan Teknik Informatika");
                break;
            default:
                System.out.println("Pilihan Tidak Tersedia");
        }
    }
}
