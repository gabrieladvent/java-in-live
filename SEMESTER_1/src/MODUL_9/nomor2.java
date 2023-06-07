/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_9;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class nomor2 {
        public static void main(String[] args) {
        Scanner bie = new Scanner(System.in);
        int warga, umur;
        String a = " ", b = " ", c = " ", d = " ", e = " ";
        
        do {
            System.out.print("Masukan jumlah penduduk: ");
            warga = bie.nextInt();
                if (warga <= 0) {
                    System.out.println("Silahkan memasukan ulang jumlah penduduknya!");
                    System.out.println("------------------------------------------------------\n"); }
                 } while (warga <= 0); //mengulang jika user memasukan bilangan <= 0
        System.out.println();
        
        for (int ulang = 1; ulang <= warga; ulang++) { 
            System.out.print("Masukan usia warga ke-"+ulang+"\t: ");
            umur = bie.nextInt(); 
            /*
            perintah if else di bawah digunakan untuk menyeleksi bilangan yang dimasukan melalui keyboard 
            untuk dimasukan ke golongan umur yang mna
            */
            if (umur >= 0 && umur <= 20) a+= "*"; // a = a + * (membuatnya variabel ini bernilai *)
            else if ( umur >= 21 && umur <= 40) b+= "*"; 
            else if (umur >= 41 && umur <= 60) c+= "*";
            else if (umur >= 61 && umur <= 80) d+= "*";
            else if (umur >= 81 && umur <= 100) e+= "*";
        }
        
        System.out.println();
        System.out.println("Jadi distribusi usia "+warga+" penduduk sesuai data di atas adalah: ");
        System.out.println("Dari umur 0-20 tahun\t: "+a);
        System.out.println("Dari umur 21-40 tahun\t: "+b);
        System.out.println("Dari umur 41-60 tahun\t: "+c);
        System.out.println("Dari umur 61-80 tahun\t: "+d);
        System.out.println("Dari umur 81-100 tahun\t: "+e);

        }
}
