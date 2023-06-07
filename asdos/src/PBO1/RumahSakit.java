/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO1;

/**
 *
 * @author Tak Bertuan
 */
public class RumahSakit {
    private String namars;
    private Resep[] obat;
    
    public RumahSakit(String namars){
        this.namars = namars;
    }

    public String getNamars() {
        return namars;
    }

    public void setNamars(String namars) {
        this.namars = namars;
    }

    public Resep[] getObat() {
        return obat;
    }

    public void setObat(Resep[] obat) {
        this.obat = obat;
    }
}