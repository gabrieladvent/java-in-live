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
public class Manajer extends Pegawai{
 private double tunjanganJabatan, lemburan;

 double getTunJab(){
 return tunjanganJabatan;
 }

 double getLembur(){
 return lemburan;
 }

 void setTunJab (double honJab) {
 tunjanganJabatan = honJab;
 }

 void setLembur(double overtime){
 lemburan = overtime;
 }
 
 @Override
  double hitungGaTot(){
 return getGapok()+tunjanganJabatan+lemburan;
 }
 @Override
 double getTunjangan() {
 return tunjanganJabatan+lemburan;
 }
 @Override
 String getStatus() { 
     return "Manajer"; 
 }

    @Override
    public String getEmail() {
        return " nip@manajer.usd.ac.id";
    }
}
