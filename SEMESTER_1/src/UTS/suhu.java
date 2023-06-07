/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

import java.util.Scanner;

public class suhu {

    public static void main(String[] args) {
        Scanner bie = new Scanner(System.in);

        int pilih;
        double Celcius, Reamur, Fahrenheit;
        System.out.println("KONVERSI SUHU");
        System.out.println("Nama    : Gabriel Advent Batan");
        System.out.println("NIM     : 205314096");
        System.out.println("Pilihan :\n1. Celcius \n2. Fahrenheit \n3. Reamur");
        System.out.print("Silahkan Pilih: ");
        pilih = bie.nextInt();
        switch (pilih) {

            case 1:
                System.out.print("Masukkan suhu Celcius: ");
                Celcius = bie.nextDouble();
                Reamur = (4.0 / 5.0) * Celcius;
                Fahrenheit = (9.0 / 5.0) * Celcius + 32;
                System.out.println("Suhu Reamur: " + Reamur);
                System.out.println("Suhu Fahrenheit: " + Fahrenheit);
                break;

            case 2:
                System.out.print("Masukkan suhu Reamur: ");
                Reamur = bie.nextInt();
                Fahrenheit = (9.0 / 4.0) * Reamur + 32;
                Celcius = (5.0 / 4.0) * Reamur;
                System.out.println("Suhu Fahrenheit: " + Fahrenheit);
                System.out.println("Suhu Celcius: " + Celcius);
                break;

            case 3:
                System.out.print("Masukkan suhu Fahrenheit: ");
                Fahrenheit = bie.nextDouble();
                Reamur = (4.0 / 9.0) * (Fahrenheit - 32);
                Celcius = (5.0 / 9.0) * (Fahrenheit - 32);
                System.out.println("Suhu Reamur: " + Reamur);
                System.out.println("Suhu Celcius: " + Celcius);
                break;

            //jika salah masukan di pilihan
            default:
                System.out.println("INVALID");

        }
    }

}