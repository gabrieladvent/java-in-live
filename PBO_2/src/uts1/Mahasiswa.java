/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usd;

/**
 *
 * @author hertada
 */
public class Mahasiswa extends Civitas {
    private String nim;
    private double beratbadan;

    public Mahasiswa() {
        super();
        this.nim="000000";
        this.beratbadan = 50.5;
    }

    public Mahasiswa(String idCivitas, String nama, String alamat, String hobi, int lama, String nim, double beratbadan) {
        super(idCivitas, nama, alamat, hobi, lama);
        this.nim = nim;
        this.beratbadan = beratbadan;
    }
}
