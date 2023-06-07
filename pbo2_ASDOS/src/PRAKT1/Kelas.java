/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRAKT1;

/**
 *
 * @author Tak Bertuan
 */
public class Kelas {
    private String nama;
    private Dosen dosen;
    private Mahasiswa [] listMahasiswa;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Dosen getDosen() {
        return dosen;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }

    public Mahasiswa[] getListMahasiswa() {
        return listMahasiswa;
    }

    public void setListMahasiswa(Mahasiswa[] listMahasiswa) {
        this.listMahasiswa = listMahasiswa;
    }
    
    
    
}
