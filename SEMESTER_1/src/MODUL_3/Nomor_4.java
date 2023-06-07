/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_3;

/**
 *
 * @author ACER
 */
import java.util.Scanner;

public class Nomor_4 {
    public static void main(String[] args) {
        double Y, Ymax, Xmax, t, sinTheta, g = 10;
        int Vnol;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukan kecepatan awal : ");
        Vnol = input.nextInt();
        System.out.print("Masukan Sudut: ");
        sinTheta = input.nextDouble();
        System.out.print("Masukan Waktu : ");
        t = input.nextDouble();

        // Rumus ketinggian benda setelah t detik
        Y = (Vnol * sinTheta) * t - (1 / 2) * g * (Math.pow(t, 2));

        // Rumus jarak terjauh
        Xmax = (Math.pow(Vnol, 2) * 2 * sinTheta) / g;

        // Rumus ketinggian terjauh
        Ymax = Math.pow(Vnol, 2) * Math.pow(sinTheta, 2) / 2 * g;

        System.out.println("Ketinggian benda tersebut adalah " + Y + " meter");
        System.out.println("Titik tertinggi yang dicapai benda adalah " + Ymax + " meter");
        System.out.println("Titik terjauh benda tersebut adalah " + Xmax + " meter");
    }
}
