/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;
import java.util.Scanner;

public class galon {
  public static void main(String[] args) {
        Scanner bie = new Scanner(System.in);
        int Galon = 30000, btlBsr = 5000, btlKcl = 3000, Gelas = 1000;
        int jG, jB, jK, jg, jumlahGalon, jumlahBesar, jumlahKecil, jumlahGelas;
        int dG, dB, dK, dg, tJumlah, tDiscount, Bayar;
        
        System.out.println("Nota Warung ''Air Murah''");
        System.out.println("Nama : Gabriel Advent Batan");
        System.out.println("NIM  : 205314096");
        
        System.out.print("Jumlah Galon : ");
        jG = bie.nextInt();
        System.out.print("Jumlah B.Besar : ");
        jB = bie.nextInt();
        System.out.print("Jumlah B.Kecil : ");
        jK = bie.nextInt();
        System.out.print("Jumlah Gelas : ");
        jg = bie.nextInt();
        /*kalikan galon, botol besar, botol kecil, dan gelas dari keyboard
        kalikan dengan harga tiap barang */
        jumlahGalon = jG * Galon;
        jumlahBesar = jB * btlBsr;
        jumlahKecil = jK * btlKcl;
        jumlahGelas = jg * Gelas;
        //kalikan jumlah yang diatas dengan diskon tiap barang
        dG = jumlahGalon * 15 / 100;
        dB = jumlahBesar * 12 / 100;
        dK = jumlahKecil * 10 / 100;
        dg = jumlahGelas * 20 / 100;
        //total barang semua (pesanan dan harga)
        tJumlah = jumlahGalon + jumlahBesar + jumlahKecil + jumlahGelas;
        //total diskon yang didapatkan
        tDiscount = dG + dB + dK + dg;
        //yang harus dibayarkan
        Bayar = tJumlah - tDiscount;
        
        System.out.println("Pesanan    Kemasan   Harga    Jumlah           Discount");
        System.out.println("======================================================");
        System.out.println(jG+"         Galon    30000 "+jumlahGalon+"    "+dG);
        System.out.println(jB+"         B.Besar  5000  "+jumlahBesar+"    "+dB);
        System.out.println(jK+"         B.Kecil  3000  "+jumlahKecil+"    "+dK);
        System.out.println(jg+"         Gelas    1000  "+jumlahGelas+"    "+dg);
        System.out.println("======================================================");
        System.out.println("       TOTAL:              "+tJumlah+"        "+tDiscount);
        System.out.println("Dibayarkan : "+Bayar);

    }

}
