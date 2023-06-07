/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_5_Latihan;

import Modul_3.Pgw;

/**
 *
 * @author ACER
 */
public class Mahasiswa {
    private String nim;
private String nama;
private String email;
private Pgw pembimbing;

public Mahasiswa(String nim,String nama){
this.nim=nim;
this.nama=nama;
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
this.email = email;
}
public Pgw getPembimbing() {
return pembimbing;
}
public void setPembimbing(Pgw pembimbing) {
this.pembimbing = pembimbing;
}
}

