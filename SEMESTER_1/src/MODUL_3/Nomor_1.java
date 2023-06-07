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
public class Nomor_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Menghitung keliling dan luas segitiga sisi sembarang");
        System.out.println("___________________________________________________________");
        
        double A1, B1, C1; //Variabel Absis
        double A2, B2, C2; // Variabel Koordinat
        double ab, bc, ca, keliling, luas, setengah;
        
        System.out.print("nilai absis A :");  
        A1 = input.nextDouble();
        System.out.print("nilai ordinat A :");
        A2 = input.nextDouble();
        
        System.out.print("Nilai absis B :");
        B1 = input.nextDouble();
        System.out.print("Nilai ordinat B :");
        B2 = input.nextDouble();
        
        System.out.print("Nilai absis C :");
        C1 = input.nextDouble();
        System.out.print("Nilai ordinat C :");
        C2 = input.nextDouble();
        System.out.println("__________jadi__________________");
        
        ab = Math.sqrt(Math.pow((B1 - A1), 2)) + Math.pow((B2 - A2), 2);
        bc = Math.sqrt(Math.pow((C1 -B1), 2)) + Math.pow((C2 - B2), 2);
        ca = Math.sqrt(Math.pow((A1 - C1), 2)) + Math.pow((C2 - A2),2);
        
        double A = ab;
        double B = bc;
        double C = ca;
        keliling = (A + B + C) / 2;
        setengah = (keliling) / 2;
        luas = Math.sqrt(setengah * (setengah - A)* (setengah - B) * (setengah - C));
        
        System.out.println("Jarak dari titik A ke titik B :"+A);
        System.out.println("Jarak dari titik B ke titik C :"+B);
        System.out.println("Jarak dari titik C ke titik A :"+C);
        System.out.println("..............................");
        
        System.out.println("Keliling dari segitiga sisi sembarang :"+keliling);
        System.out.print("Apabila nilai keliling sudah didapatkan ");
        System.out.println("Maka keliling setengahnya :"+setengah);
        System.out.println("Luas dari segitiga sisii sembarang adalah :"+luas);
    }
    
}
