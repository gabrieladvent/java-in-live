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
public class Dosen extends Civitas {
     private String nidn;
     private double suhubadan;

    public Dosen() {
        super();
        this.nidn = "0";
        this.suhubadan = 35.5;
    }

    public Dosen(String idCivitas, String nama, String alamat, String hobi, int lama, String nidn, double suhubadan) {
        super(idCivitas, nama, alamat, hobi, lama);
        this.nidn = nidn;
        this.suhubadan = suhubadan;
    }
}
