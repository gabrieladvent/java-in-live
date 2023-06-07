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
public class Karyawan extends MasterKaryawan{
    String jabatan;
    Double gaji = Double.valueOf(0.0D), 
                  insentif = Double.valueOf(0.0D),
                  bonus = Double.valueOf(0.0D);
  
public void setJabatan(String jabatan) {
    this.jabatan = jabatan;
}
public String getJabatan() {
    return this.jabatan;
}
public void setInsentif(Double insentif) {
    this.insentif = insentif;
}
public void setBonus(Double bonus) {
    this.bonus = bonus;
}
public Double getInsentif() {
    return this.insentif;
}
public Double getBonus() {
    return this.bonus;
}
public void setGaji(Double gaji) {
    this.gaji = gaji;
}

public void setNama(String nama) {
    this.nama = nama;
}
public void setNPP(String NPP) {
    this.NPP = NPP;
}
public void setAlmtLkp(AlamatADT almtLkp) {
    this.almtLkp = almtLkp;
}
public Double getGaji() {
    return this.gaji;
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
