/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_7;
import Modul_4.NilaiMhs;

/**
 *
 * @author ACER
 */
public class MahasiswaS1 extends NilaiMhs{
public void nilai (){
                if(super.nilaifinal() >= 80) {
                        System.out.println("Anda Mendapat Nilai 'A'");
                }else if(super.nilaifinal() >=70 && super.nilaifinal() < 80)  {
                        System.out.println("Anda Mendapat Nilai 'B'");
                }else if(super.nilaifinal() >=56 && super.nilaifinal() <70){
                        System.out.println("Anda Mendapat Nilai 'C'");
                }else if(super.nilaifinal() >= 45 && super.nilaifinal() < 56){
                        System.out.println("Anda Mendapat Nilai 'D'");
                }else{
                        System.out.println("Anda Mendapat Nilai 'E'");   
                }
}
}
