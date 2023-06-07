/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7;

/**
 *
 * @author Tak Bertuan
 */
public class Pegawai {
    private String namaPegawai;
    private String id;

    public Pegawai() {}

    public Pegawai(String namaPegawai, String id) {
        this.namaPegawai = namaPegawai;
        this.id = id;
    }
    
    public String getNamaPegawai() {
        return namaPegawai;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
