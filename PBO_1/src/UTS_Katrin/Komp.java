/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_Katrin;

/**
 *
 * @author ACER
 */
public class Komp {
        private String nama, alamat;
        private hrg_komp [] Harga;
        private spek_komp [] Spek;
        
Komp(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
}

public String getNama() {
        return nama;
}
public void setNama(String nama) {
        this.nama = nama;
}

public String getALamat(){
        return alamat;
}
public void setAlamat(String alamat){
        this.alamat = alamat;
}
        
public hrg_komp[] getHarga() {
        return Harga;
}
public void setHarga(hrg_komp[] Harga) {
        this.Harga = Harga;
}

public spek_komp[] getSpek() {
        return Spek;
}
public void setSpek(spek_komp[] Spek) {
        this.Spek = Spek;
}
}
