/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PunyaCatrien;

import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class rip {
    public static void main(String[] args) {
        String inputStr = JOptionPane.showInputDialog(null, "Masukkan umur anda");
        int age;
        try {
            age = Integer.parseInt(inputStr);
            System.out.println("Umur anda : " + age + " tahun");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Inputan anda salah, harap input dengan angka");
            inputStr = JOptionPane.showInputDialog(null, "Masukkan umur anda");
            age = Integer.parseInt(inputStr);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }
}