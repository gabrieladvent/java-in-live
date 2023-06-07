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
public class Harimau extends Hewan{
    Harimau (String nama){
        super (nama);
    }
    @Override
    void suara(){
            System.out.println(" : Roar");
    }
}
