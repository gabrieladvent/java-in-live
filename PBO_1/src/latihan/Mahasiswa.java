/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author ACER
 */
public abstract class Mahasiswa implements Learner {
        protected String nama, tglLahir, nim ,tampilHuruf;
        protected double uts1 ,uts2 ,uas ,hitungNilai;
        
public String getnama() {
        return nama;
}
public void setNama(String nama) {
        this.nama = nama;
}

public String gettglLahir() {
        return tglLahir;
}
public void settglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
}

public String getnim() {
        return nim;
}
public void setnim(String nim) {
        this.nim = nim;
}

public double getuts1() {
        return uts1;
}
public void setuts1(double uts1) {
        this.uts1 = uts1;
}

public double getuts2() {
        return uts2;
}
public void setuts2(double uts2) {
        this.uts2 = uts2;
}

public double getuas() {
        return uas;
}
public void setuas(double uas) {
        this.uas = uas;
}

public String getTampilHuruf() {
        return tampilHuruf;
}
public void setTampilHuruf(String tampilHuruf) {
        this.tampilHuruf = tampilHuruf;
}

public double getHitungNilai() {
        return 0.3 * uts1 + 0.3 * uts2 + 0.4 * uas;
}
public void setHitungNilai(double hitungNilai) {
        this.hitungNilai = hitungNilai;
}
}
