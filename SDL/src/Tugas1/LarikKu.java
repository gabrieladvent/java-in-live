/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class LarikKu{
    double [] data;
    int maxData;
    int jumlahData = 0;
Scanner inp = new Scanner(System.in);
LarikKu(int maxData){
    this.maxData = maxData;
    data = new double [maxData];
}
public void tambahBelakang (double data){
    this.data [jumlahData] = data;
    jumlahData++;
}
public void tambahDepan (double data){
    jumlahData++;
    for(int i = jumlahData; i >0;){
        this.data[i] = this.data[--i];
        this.data[0] = data;
    }
}
public void printData(){
    System.out.println("Jumlah data: "+jumlahData);
     System.out.print("Larik = ");
     for(int i = 0; i < jumlahData; i++){
         System.out.print(data[i] + "; ");
     }
     System.out.println("\n");
}
public void cariData(double data) {
        int i;
        boolean ketemu = false;
        
        for (i = 0; i < jumlahData; i++)
            if(this.data[i] == data){
                ketemu = true;
                break;
            }
            
        if(ketemu)
            System.out.println(data+" ada di-indeks no: " +i);
        else
            System.out.println(data+" tidak ada di larik");
        System.out.println();
    }
static void cetak (int [] a){
  System.out.print("data array ={");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ; ");
        }
        System.out.println("}");
    }
    public static void cetak1(Object[] a){
        System.out.println("\nDATA MAHASISWA\n");
        for (int i = 0; i < a.length; i++) {
            System.out.println("MAHASISWA "+(i+1));
            System.out.println(a[i]);
            System.out.println("============================================");
            System.out.println();
        }  
}
}
//Breakroom 6
//Anggota:
//Febronia Anindwi
//Gabriel Advent Batan
//Ario Tua Purba
//Katrina Yuliana Kartika
//Rositong Sihotang
