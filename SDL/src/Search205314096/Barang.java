/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Search205314096;

/**
 *
 * @author ACER
 */
public class Barang implements Comparable{
    private String nama;
    private int berat;
    
Barang (){}
public Barang (String nama, int berat){
    this.nama = nama;
    this.berat = berat;
}

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    @Override
    public int compareTo(Object o) {
    if (berat == ((Barang) o).getBerat()) {
    //Bisa juga dengan (((Mahasiswa) o).getNim() == nim)
        return 0;
    } else if (berat > ((Barang) o).getBerat()) {
        return 1;
    } else {
        return -1;
    }
}
    
    public String toString() {
    return "Nama Barang: " + nama + "\nBerat: \t" + berat;
}
}
