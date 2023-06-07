/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak2;

/**
 *
 * @author Tak Bertuan
 */
public class Honor extends pegawai{
    private double lembur;

    public double getLembur() {
        return lembur;
    }

    public void setLembur(double lembur) {
        this.lembur = lembur;
    }
    
    @Override
    public double hitungGaji (){
        return 0;
    }
}
