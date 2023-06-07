/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perusahaan;

/**
 *
 * @author Tak Bertuan
 */
public class AlamatADT {
    String namaJalan;
    String RTRWKec;
    String kota;
 
public void setNamaJalan(String namaJalan) {
    this.namaJalan = namaJalan;
}
public void setRTRWKec(String RTRWKec) {
    this.RTRWKec = RTRWKec;
} 
public void setKota(String kota) {
    this.kota = kota;
}
public String getNamaJalan() {
    return this.namaJalan;
}
public String getRTRWKec() {
    return this.RTRWKec;
}
public String getKota() {
    return this.kota;
}
}
