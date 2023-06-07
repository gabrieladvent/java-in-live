/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_8;

/**
 *
 * @author ACER
 */
public class Hewan {
    private String nama;
    
    Hewan (String nama){
        this.nama = nama;
    }
void suara(){
    System.out.println("suara hewan-hewan");
}

    @Override
    public String toString() {
        String hasil = "Suara " + nama;
        return hasil;
    }

}
