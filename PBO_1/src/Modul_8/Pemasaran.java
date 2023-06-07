/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_8;

/**
 *
 * @author ACER
 */
public class Pemasaran extends Pegawai{
 private double bonus;

 double getBonus(){
 return bonus;
 }

 void setBonus(double myBonus){
 bonus = myBonus;
 }
 
 @Override
double hitungGaTot(){
 return getGapok()+bonus;
 }
@Override
 double getTunjangan() {
 return bonus;
 }
 @Override
 String getStatus() { 
     return "Pemasaran";
 }

    @Override
    public String getEmail() {
        return "nip@marketing.usd.ac.id";
    }

}

