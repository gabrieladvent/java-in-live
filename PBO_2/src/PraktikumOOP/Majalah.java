/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumOOP;

/**
 *
 * @author ASUS ZEPHYRUS
 */
public class Majalah extends Koleksi{
    protected int volume, seri;
    protected String ISSN;

    public Majalah(int volume, int seri, String ISSN) {
        super();
        this.volume = volume;
        this.seri = seri;
        this.ISSN = ISSN;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public int getSeri() {
        return seri;
    }
    public void setSeri(int seri) {
        this.seri = seri;
    }
    public String getISSN() {
        return ISSN;
    }
    public void setISSN(String ISSN) {
        this.ISSN = ISSN;
    }
}
