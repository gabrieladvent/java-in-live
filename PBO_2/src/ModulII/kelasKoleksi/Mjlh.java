/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModulII.kelasKoleksi;

/**
 *
 * @author ACER
 */
public class Mjlh {
    private String jdlMajalah, volume, series;
    private int issn;

public Mjlh(){}
public Mjlh (String jdlMajalah, String volume, String series, int issn){
    this.jdlMajalah = jdlMajalah;
    this.volume = volume;
    this.series = series;
    this.issn = issn;
}
    public String getJdlMajalah() {
        return jdlMajalah;
    }
    public void setJdlMajalah(String jdlMajalah) {
        this.jdlMajalah = jdlMajalah;
    }
    public String getVolume() {
        return volume;
    }
    public void setVolume(String volume) {
        this.volume = volume;
    }
    public String getSeries() {
        return series;
    }
    public void setSeries(String series) {
        this.series = series;
    }
    public int getIssn() {
        return issn;
    }
    public void setIssn(int issn) {
        this.issn = issn;
    }

}
