/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_3;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class nilaiSiswa {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Nilai Mahasiswa");
        double US1, US2, UAS, NF;
        double per1, per2, per3;
        
        per1 = 0.3; //didapat dari 30% (30/100)
        per2 = 0.3; //didapat dari 30% (30/100)
        per3 = 0.4; //didapat dari 40% (40/100)
        System.out.print("Nilai ujian sisipan 1 :");
        US1 = keyboard.nextDouble();
        System.out.print("Nilai ujian sisipan 2 :");
        US2 = keyboard.nextDouble();
        System.out.print("Nilai ujian akhir semester :");
        UAS = keyboard.nextDouble();
        
        NF = ((per1 * US1) + (per2 * US2) + (per3* UAS));
        System.out.println("________________________________________________");
        System.out.println("Nilai Final :"+NF);
                
    }
    
}
