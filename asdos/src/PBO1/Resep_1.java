package PBO1;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tak Bertuan
 */
public class Resep {
     private String daftarObat;
    

    public void setObat(String d){
        daftarObat = d;
    }
    public String getObat(){
        return daftarObat;
    }
    
    public void inputR(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Resep : ");
        setObat(sc.next());
        
    }
}
