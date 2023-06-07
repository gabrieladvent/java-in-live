/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reprair;

/**
 *
 * @author Tak Bertuan
 */
public class Toko{
    private String namaToko;
    private String alamat;
    private Pelanggan [] data;
    
Toko (){};
Toko (String namaToko, String alamat){
    this.namaToko = namaToko;
    this.alamat = alamat;
}

public String getNamaToko() {
    return namaToko;
}
public void setNamaToko(String namaToko) {
    this.namaToko = namaToko;
}

public String getAlamat() {
    return alamat;
}
public void setAlamat(String alamat) {
    this.alamat = alamat;
}

public Pelanggan[] getData() {
    return data;
}
public void setData(Pelanggan[] data) {
    this.data = data;
}
}
