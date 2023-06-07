/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_4;

/**
 *
 * @author ACER
 */
public class Mahasiswa {
    private String nim;
 private String nama;
 private String email;
 private int umur;

 public Mahasiswa(String no, String nm) {
 nim=no;
 nama=nm;
 }
 public String getNim() {
 return nim;
 }
 public String getNama() {
 return nama;
 }
 public String getEmail() {
 return email;
 }
 public void setEmail(String email) {
 email = email;
 }
 public int getUmur() {
 return umur;
 }
 public void setUmur(int usia){
 umur = usia;
 }

}
