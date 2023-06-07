/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_5_Latihan;

import Modul_3.Pgw;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class MainMahasiswa {
    public static void main(String[] args) {
Pgw dsn1=new Pgw("P1678","Adi Bangun");
dsn1.setGelar("M.Sc");
dsn1.setEmail("adi@yahoo.com");

Mahasiswa mhs1=new Mahasiswa("085314200","Ria ");
mhs1.setPembimbing(dsn1);
mhs1.setEmail("ria@gmail.com");

Pgw dsnSem=mhs1.getPembimbing();
String nm=dsnSem.getNama();
JOptionPane.showMessageDialog(null, "Pembimbing "+mhs1.getNim()+" adalah "+nm+" pembimbing "+JOptionPane.INFORMATION_MESSAGE);
} }


