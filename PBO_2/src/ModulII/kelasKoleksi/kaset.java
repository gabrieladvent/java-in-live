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
public class kaset {
    private String jdlKaset, format;
    private int isbn;

public kaset(){}
public kaset (String jdlKaset, String format, int isbn){
    this.jdlKaset = jdlKaset;
    this.format = format;
    this.isbn = isbn;
}
    public String getJdlKaset() {
        return jdlKaset;
    }
    public void setJdlKaset(String jdlKaset) {
        this.jdlKaset = jdlKaset;
    }
    public String getFormat() {
        return format;
    }
    public void setFormat(String format) {
        this.format = format;
    }
    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}
