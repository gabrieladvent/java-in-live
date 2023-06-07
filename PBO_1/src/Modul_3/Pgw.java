/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_3;

/**
 *
 * @author ACER
 */
public class Pgw {
        private String nip;
        private String nama;
        private String email;
        private String gelar;
public Pgw(String nip,String nama) {
        this.nip=nip;
        this.nama=nama;
}
public String getNIP() {
        return nip;
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
public String getGelar() {
        return gelar;
}
public void setGelar(String gelar) {
        this.gelar = gelar;
}
}
