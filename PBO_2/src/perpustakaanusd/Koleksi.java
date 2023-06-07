/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaanusd;

/**
 *
 * @author Katharina Tyas 
 */
public abstract class Koleksi {
    private String idKoleksi;
    private String judul;
    private String penerbit;
    private int    tahunTerbit;
    
    public Koleksi() {
        tahunTerbit = 2020;
    }
    public String getIdKoleksi() {
        return idKoleksi;
    }

    public void setIdKoleksi(String idKoleksi) {
        this.idKoleksi = idKoleksi;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) throws Exception {
        if (tahunTerbit > 0 ) {
            this.tahunTerbit = tahunTerbit;
        } else {
            throw new Exception (" Eror ");
        }
    }
    
}
