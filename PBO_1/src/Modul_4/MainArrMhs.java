/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_4;

import javax.swing.*;
public class MainArrMhs {

public static void main (String[] args) {
 //--------- Mendeklarasikan dan mengalokasikan array ---------//
 Mahasiswa[] mhs;
mhs = new Mahasiswa[2];
String nama, nim, imil;
int umur;
for (int i = 0; i < mhs.length; i++) {

//----------- Membaca data dari keyboard-------------------//
nim = JOptionPane.showInputDialog(null, "Masukkan nim : " );
nama = JOptionPane.showInputDialog(null, "Masukkan nama : ");
umur = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan umur : "));
imil =JOptionPane.showInputDialog(null, "Masukkan email : ");

//----Membuat obyek baru bertipe Mahasiswa dan mengisikan nilainya----//
mhs[i] = new Mahasiswa(nim, nama);
mhs[i].setEmail(imil);
mhs[i].setUmur(umur);
 }
//-------------- Menghitung umur rata-rata --------------//

 float sum = 0, rataUmur;
 for (int i = 0; i < mhs.length; i++) {
 sum += mhs[i].getUmur();
 }
 rataUmur = sum / (float) mhs.length;

 System.out.println( "Rata-rata umur: " + rataUmur );
 System.out.println( );
//------ Mencari mahasiswa termuda dan tertua ----------//

 Mahasiswa termuda, //menunjuk ke mahasiswa termuda
 tertua; //menunjuk ke mahasiswa tertua
 termuda = tertua = mhs[0];
 for (int i = 1; i < mhs.length; i++) {
 if ( mhs[i].getUmur() < termuda.getUmur() ) {
 //mencari mahasiswa yang lebih muda
 termuda = mhs[i];
 }
 else if ( mhs[i].getUmur() > tertua.getUmur() ) {
 //mencari mahasiswa yang lebih tua
 tertua = mhs[i];
 }
 }

 System.out.println("Tertua : " + tertua.getNama()
 + " berumur " + tertua.getUmur() + " tahun.");

 System.out.println("Termuda : " + termuda.getNama()
 + " adalah " + termuda.getUmur()+ " tahun.");
 //----------- Mencari mahasiswa tertentu ------------//

 String searchName = JOptionPane.showInputDialog(null,"Nama yang akan di cari :");
 int i = 0;
 while ( i < mhs.length && !mhs[i].getNama().equals( searchName ) ){
 i++;
 }

 if (i == mhs.length) {
 //Tidak ditemukan nama tsb di array mhs
 System.out.println( searchName + " tidak ada di array" );
 }
 else {
 //Pencarian berhasil menemukan nama tsb di array mhs
 System.out.println("Ditemukan " + searchName + " pada posisi " + i);
 }
 }
}
