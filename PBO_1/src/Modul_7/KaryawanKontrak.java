/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_7;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class KaryawanKontrak extends Karyawan{
        Scanner inp = new Scanner(System.in);
        private int upah;

public int getUpah() {
        return upah;
}
public void setUpah(int upah) {
        this.upah = upah;
}

public int hitungUph (){
        System.out.print("Masukan Jumlah Hari Masuk: ");
        int day = inp.nextInt();
        int gaji = (upah * day) + super.tunj();
        return gaji;
} 
}
