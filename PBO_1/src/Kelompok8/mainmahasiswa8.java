/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kelompok8;
import Modul_4.NilaiMhs;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author ACER
 */
public class mainmahasiswa8 {
public static void main(String [] args){
        Scanner inp = new Scanner(System.in);
        NilaiMhs[] obj = new NilaiMhs [4];
        
        for(int i = 0; i < obj.length; i++){
            String nma = JOptionPane.showInputDialog(null, "Nama: ");
            String nim = JOptionPane.showInputDialog(null, "Nim: ");
            int uts1 = Integer.parseInt(JOptionPane.showInputDialog(null, "UTS 1"));
            int uts2 = Integer.parseInt(JOptionPane.showInputDialog(null, "UTS 2"));
            int uas = Integer.parseInt(JOptionPane.showInputDialog(null, "UAS"));
        obj[i] = new NilaiMhs();
            obj[i].setNama(nma);
            obj[i].setNim(nim);
            obj[i].setUts1(uts1);
            obj[i].setUts2(uts2);
            obj[i].setUas(uas);
                 
        }
        obj[0] = new MahasiswaS18();
        obj[1] = new MahasiswaS18();
        obj[2] = new MahasiswaS28();
        obj[3] = new MahasiswaS18();
        
        for(int i = 0; i < obj.length; i++){
            if(obj[i] instanceof MahasiswaS18){
                System.out.println(obj[i].getNama());
                
            }
        }
}
}
