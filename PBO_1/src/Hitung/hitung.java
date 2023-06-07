/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hitung;

/**
 *
 * @author ACER
 */
public class hitung {
        public static int jmlhJamKerja, jamDeflaut, UpahprJam;
        public static int bsrGjiLembur;

public static int gaji(int jumlahJamKerja, int jamDefault, int upahPerJam){
             bsrGjiLembur = upahPerJam * (jamDefault - jumlahJamKerja);
return bsrGjiLembur;
}
}
