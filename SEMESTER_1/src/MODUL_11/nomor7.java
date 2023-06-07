 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_11;

/**
 *
 * @author ACER
 */
public class nomor7 {
    public static void main (String[] args){
        int [ ] usia1 = {18,39,45,50,65,70,90};
        int []usia2 = {20,32,54,66,75,80,85,89,90,95,96};
        int [ ]gabungan = new int [usia1.length + usia2.length];//menggabungkan kedua array di atas ke dalam array baru
        int Gab = 0;
        
                System.out.print("-> Daftar usia pertama: ");
                        for (int k = 0; k < usia1.length; k++){
                                gabungan[k]= usia1[k];
                                Gab++;
                                System.out.print(usia1[k]+ ", ");
                        }
                        
                System.out.println();
                System.out.print("-> Daftar usia kedua: ");
                        for(int l = 0; l < usia2.length; l++){
                                gabungan[Gab] = usia2 [l];
                                Gab++;
                                System.out.print(usia2[l]+", ");
                        }
                        
        for (int i = 0; i < gabungan.length; i++){
                for (int j = i + 1; j < gabungan.length; j ++){
                    //proses bubble sort. 1. ciptakan dua pengulangan seperti di atas. 2. ciptakan sebuah pengandaian. 3. buat perhitungan
                        if(gabungan[i] > gabungan [j]){
                                int  bii = gabungan[j];
                                gabungan[j] = gabungan [i];
                                gabungan[i]= bii;
                        }
                }
        }
        //proses mencetak pengurutan dari gabungan array
        System.out.println();
        System.out.print("-> Urutan usia keduanya adalah: ");
                for (int i = 0; i < gabungan.length; i++){
                System.out.print(gabungan[i]+ ", ");
                }
                
    }
}
