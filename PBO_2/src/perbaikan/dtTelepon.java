/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perbaikan;

import java.util.ArrayList;

/**
 *
 * @author Tak Bertuan
 */
public class dtTelepon {

    Telepon TeleponList;
public dtTelepon(){};
public static void isiData(ArrayList<Telepon> Data) {  
    dlTelepon dialog = new dlTelepon(null, true, "Isi Data", Data);
    dialog.setVisible(true);
}
public static void hapusData (ArrayList<Telepon> Data, int selectedRow){
    Data.remove(selectedRow);
}
public static void cariData (ArrayList<Telepon> Data){
    dlTelepon dialog = new dlTelepon(null, true, "Cari Data", Data);
    dialog.setVisible(true);
}
}
