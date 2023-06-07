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
public class MasterKaryawan {
    String nama;
    String NPP;
    AlamatADT almtLkp;
    
public void setNama(String nama) {
    this.nama = nama;
}
public void setNPP(String NPP) {
    this.NPP = NPP;
}
public void setAlmtLkp(AlamatADT almtLkp) {
    this.almtLkp = almtLkp;
}
public String getNama() {
    return this.nama;
}
public String getNPP() {
    return this.NPP;
}
public AlamatADT getAlmtLkp() {
    return this.almtLkp;
}
}
