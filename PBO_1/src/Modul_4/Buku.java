/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_4;
import Modul_5.karangan;

public class Buku {
        private String kode, judul;
        private int terbit;
        karangan [] Pengarang;
        
public Buku(){}

public String getKode() {
        return kode;
}
public void setKode(String kode) {
        kode = kode;
}

public String getJudul() {
        return judul;
}
public void setJudul(String j) {
        judul = j;
}

public int getTerbit() {
        return terbit;
}
public void setTerbit(int terbit) {
        this.terbit = terbit;
}

public void setPengarang(karangan[] Pengarang) {
        this.Pengarang = Pengarang;
}
public karangan[] getPengarang() {
        return Pengarang;
}
}