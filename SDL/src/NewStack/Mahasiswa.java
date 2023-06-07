/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewStack;

/**
 *
 * @author Tak Bertuan
 */
public class Mahasiswa implements Comparable {
    private String nama, prodi, alamat;
    private int nim;

public Mahasiswa() {}
public Mahasiswa(String nama, int nim, String prodi, String alamat) {
    this.nama = nama;
    this.nim = nim;
    this.prodi = prodi;
    this.alamat = alamat;
}

public String getNama() {
    return nama;
}
public void setNama(String nama) {
    this.nama = nama;
}
public int getNim() {
    return nim;
}
public void setNim(int nim) {
this.nim = nim;
}
public String getProdi() {
        return prodi;
}
public void setProdi(String prodi) {
        this.prodi = prodi;
}
public String getAlamat() {
        return alamat;
}
public void setAlamat(String alamat) {
        this.alamat = alamat;
}
@Override
public int compareTo(Object o) {
    if (nim == ((Mahasiswa) o).getNim()) {
    //Bisa juga dengan (((Mahasiswa) o).getNim() == nim)
        return 0;
    } else if (nim > ((Mahasiswa) o).getNim()) {
        return 1;
    } else {
        return -1;
    }
}
@Override
public String toString() {
    return "Nama " + "Mahasiswa: " + nama +
            "\nNIM: " + nim + "\nProdi: " + prodi +
            "\nAlamat: " + alamat + "\n";
}   
}

