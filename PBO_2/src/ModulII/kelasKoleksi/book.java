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
public class book {
    private String jdlBuku, penulis, penerbit;
    private int isbn;
    
public book(){}
public book (String jdlBuku, String penulis, String penerbit, int isbn){
    this.jdlBuku = jdlBuku;
    this.penulis = penulis;
    this.penerbit = penerbit;
    this.isbn = isbn;
}

    /**
     * @return the jdlBuku
     */
    public String getJdlBuku() {
        return jdlBuku;
    }

    /**
     * @param jdlBuku the jdlBuku to set
     */
    public void setJdlBuku(String jdlBuku) {
        this.jdlBuku = jdlBuku;
    }

    /**
     * @return the penulis
     */
    public String getPenulis() {
        return penulis;
    }

    /**
     * @param penulis the penulis to set
     */
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    /**
     * @return the penerbit
     */
    public String getPenerbit() {
        return penerbit;
    }

    /**
     * @param penerbit the penerbit to set
     */
    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    /**
     * @return the isbn
     */
    public int getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}
