/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kelompok8;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class mainKary8 {
public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        Karyawan8 obj1;
        obj1 = new KaryawanTetap8();
        obj1 = new KaryawanKontrak8();
        
        Karyawan8[] obj = new Karyawan8 [4];
        
        for(int i = 0; i < obj.length; i++){
        obj[i] = new Karyawan8();
            System.out.print("Nama Karyawan "+(i+1)+": ");
                String nama = inp.next();
                obj[i].setNama(nama);
            System.out.print("NPP: ");
                int npp = inp.nextInt();
                obj[i].setNpp(npp);
            System.out.print("Jumlah Anak: ");
                int anak = inp.nextInt();
                obj[i].setJmlAnak(anak);
        }
        obj[0] = new KaryawanKontrak8();
        obj[1] = new KaryawanTetap8();
        obj[2] = new KaryawanTetap8();
        obj[3] = new KaryawanKontrak8();
        
        for(int i = 0; i < obj.length; i++){
            if (obj[i] instanceof KaryawanTetap8){
            }
        }
}
}
