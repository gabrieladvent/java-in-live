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
public class Marketing extends pegawai implements tugasBelajar{
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    @Override
    public double hitungGaji (){
        return 0;
    }

    @Override
    public boolean isSelesai(boolean n) {
        return true;
    }
}
