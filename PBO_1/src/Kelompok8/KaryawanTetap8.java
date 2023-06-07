/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kelompok8;

/**
 *
 * @author ACER
 */
public class KaryawanTetap8 extends Karyawan8{
        private int gajiPok;

public int getGajiPok() {
        return gajiPok;
}
public void setGajiPok(int gajiPok) {
        this.gajiPok = gajiPok;
}
public int upah(){
       int total = gajiPok + super.tunj();
       return total;
}
}
