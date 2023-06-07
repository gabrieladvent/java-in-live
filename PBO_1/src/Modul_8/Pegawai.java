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
public abstract class Pegawai implements Email{
 protected int npp;
 protected String nama;
 protected double gajiPokok;

 int getNpp(){
 return npp;
 }

 String getNama(){
 return nama;
 }

 double getGapok(){
 return gajiPokok;
 }

 void setNpp(int nopeg){
 npp = nopeg;
 }

 void setNama(String nampeg ){
 nama = nampeg;
 }

 void setGapok(double upah){
 gajiPokok = upah;
 }
abstract String getStatus();
abstract double getTunjangan();
abstract double hitungGaTot();
}

