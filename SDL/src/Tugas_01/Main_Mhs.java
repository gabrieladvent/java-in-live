/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_01;

/**
 *
 * @author ACER
 */
public class Main_Mhs {
    public static void main(String[] args) {
            String [] mahasiswa = {"Marlin", "Ribka", "Agnes", "Benny", "Denny"};
    
    Mhs [] obj1 = new Mhs[5];
    for (int i = 0; i < 5; i++){
    obj1[i] = new Mhs();
    obj1 [i].setNama(mahasiswa[i]);
}
        
    Larik.cetak1(obj1);
    int [] data = {20, 50, 32, 21, 44};
        Larik.Cetak(data);
    }
}
