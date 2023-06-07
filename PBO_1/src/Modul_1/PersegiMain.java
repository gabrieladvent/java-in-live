/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_1;

import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class PersegiMain {
    public static void main(String[] args) {
Persegi objPersegi=new Persegi();

objPersegi.panj=Integer.parseInt(JOptionPane.showInputDialog("Masukkan Panjang"));
objPersegi.lebar=Integer.parseInt(JOptionPane.showInputDialog("Masukkan Lebar"));
JOptionPane.showMessageDialog(null, "Luas dari persegi dengan panjang: "+objPersegi.panj
 +" dan lebar: "+objPersegi.lebar+" adalah: "+objPersegi.luas());
 }
}
