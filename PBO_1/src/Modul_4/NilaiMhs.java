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
public class NilaiMhs {
        private String nama, nama2,nim, huruf;
        private double uts1, uts2, uas;

public NilaiMhs() {}
public NilaiMhs (String nama2){
    this.nama2 = nama2;
}

public String getNama() {
        return nama;
}
public void setNama(String nama) {
        this.nama = nama;
}

public String getNim(){
    return nim;
}
public void setNim(String nim) {
        this.nim = nim;
}

public String getHuruf(){
    return huruf;
}
public void setHuruf(String huruf) {
        this.huruf = huruf;
}

public double getUts1() {
        return uts1;
}
public void setUts1(double uts1) {
        this.uts1 = uts1;
}

public double getUts2() {
        return uts2;
}
public void setUts2(double uts2) {
        this.uts2 = uts2;
}

public double getUas() {
        return uas;
}
public void setUas(double uas) {
        this.uas = uas;
}

public double nilaifinal(){
        double total;
            return total = (0.3 * uts1) + (0.3 * uts2) + (0.4 * uas);
}
}
