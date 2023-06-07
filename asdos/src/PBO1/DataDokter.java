/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO1;

import java.util.Scanner;

/**
 *
 * @author Tak Bertuan
 */
public class DataDokter {
    private String namaDokter,id,alamat;
    public void setN(String d){
        namaDokter = d;
    }
    public String getN(){
        return namaDokter;
    }
    public void setID(String d){
        id = d;
    }
    public String getID(){
        return id;
    }
    public void setA(String d){
        alamat = d;
    }
    public String getA(){
        return alamat;
    }
    public void inputD(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Nama Dokter: ");
        setN(sc.next());
        System.out.print("ID Dokter: ");
        setID(sc.next());
        System.out.print("Alamat Dokter: ");
        setA(sc.next());
        System.out.println("");
    }
}
