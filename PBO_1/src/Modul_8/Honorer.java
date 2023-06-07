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
public class Honorer extends Pegawai{
 private double lemburan;

 double getLembur (){
 return lemburan;
 }

 void setLembur(double myLembur){
 lemburan = myLembur;
 }
 @Override
 double hitungGaTot(){
 return getGapok()+lemburan;
 }
 @Override
 double getTunjangan() {
 return lemburan;
 }
 @Override
 String getStatus() {
     return "Honorer"; 
 }
    @Override
    public String getEmail() {
       return "nip@honorer.usd.ac.id";
}
}
