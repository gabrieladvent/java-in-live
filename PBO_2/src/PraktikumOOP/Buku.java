/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumOOP;

import javax.swing.JDialog;

/**
 *
 * @author ASUS ZEPHYRUS
 */
public class Buku extends Koleksi{
    protected int hal;
    protected String ISBN;
    
    public Buku(){   
    }
    public Buku(int hal, String ISBN) {
        super();
        this.hal = hal;
        this.ISBN = ISBN;
    }

    public int getHal() {
        return hal;
    }
    public void setHal(int hal) {
        this.hal = hal;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public static void main(String[] args) {
        JDialog defaultJDialog;
    }
}
