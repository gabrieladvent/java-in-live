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
public class Kucing extends Hewan {

    Kucing (String nama){
        super (nama);
    }
    @Override
    void suara() {
        System.out.println(" : meong-meong");
    }
}
