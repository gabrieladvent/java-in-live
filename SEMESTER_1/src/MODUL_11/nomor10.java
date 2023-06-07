/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_11;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class nomor10 {
public static void main(String[] args) {
        Scanner bie = new Scanner(System.in);
        System.out.print("Masukan jumlah mahasiswa: ");
        int n = bie.nextInt();
        
        //mendeklarasi array
        String mhs[] = new String [n];
        String nim[] = new String [n];
        String huruf[] = new String [n];
        double uts1[] = new double [n];
        double uts2[] = new double [n];
        double uas[] = new double [n];
        double totalNil[] = new double [n];
        double total[] = new double [n];
        double gabungan[] = new double [n];
        char nilaiFin[] = new char [n];
        
        //proses memasukan data
        for (int i = 0; i < n; i++) {
                System.out.print("-> Nama Mahasiswa ke-"+(i+1)+"\t: ");
                        mhs[i] = bie.next();
                System.out.print("\tNIM\t\t: ");
                        nim[i] = bie.next();
                System.out.print("\tNilai UTS pertama\t\t: ");
                        uts1[i] = bie.nextDouble();
                System.out.print("\tNilai UTS kedua\t\t: ");
                        uts2[i] = bie.nextDouble();
                System.out.print("\tNilai Ujian Akhir (UAS)\t: ");
                        uas[i] = bie.nextDouble();
            
            //mengihitung nilai yg dimasukan
                gabungan[i] = uts1[i] + uts2[i] + uas[i]; 
                totalNil[i] = (0.3 * uts1[i]) + (0.3 * uts2[i]) + (0.4 * uas[i]);
            
            //konversi nilai ke bentuk huruf
                if (totalNil[i] >= 80) {
                        huruf[i] = "A";
                } else if (totalNil[i] >= 65 && totalNil[i] < 80) {
                        huruf[i] = "B";
                } else if (totalNil[i] >= 55 && totalNil [i] < 65) {
                        huruf[i] = "C";
                } else if (totalNil[i] <= 50 && totalNil[i] < 55) {
                        huruf[i] = "D";
                } else if (totalNil[i] < 50) {
                        huruf[i] = "E"; }
        }
        //mencetak nilai pertama kali yang belum berurut
        System.out.println("Daftar nilai mahasiswa");
        System.out.println("No       NIM             Nama\t         Uts1\t   Uts2\t  Uas\t  Total\t  Final\t");
        System.out.println("==============================================================================");
        
        for (int i = 0; i < n ;i++){
        System.out.println((i+1)+ "   \t" +nim[i]+ "      \t" +mhs[i]+ "       \t" +uts1[i]+ "  \t" +uts2[i]+ "   \t" +uas[i]+ "  \t" +gabungan[i]+ "  \t" +huruf[i]+ "  \t");
            }
        
        System.out.println("===============================================================================");
        System.out.println();
         
        //aligoritma bubble sort. mengurutkan nilai
        for (int i= 0; i < n; i++){
                 for (int j = 0; j < (n - (i +1)); j++) {
                        if (gabungan[j] < gabungan[j + 1]){
                    //1. untuk tipe string
                                String urut = mhs[j];
                                mhs[j] = mhs[j + 1];
                                mhs[j + 1] = urut;
                    
                                urut = nim[j];
                                nim [j] = nim[j +1];
                                nim[j + 1] = urut;
                    
                    //2. untuk tipe double
                                double urut2 = uts1[j];
                                uts1[j] = uts1[j+1];
                                uts1 [j + 1] = urut2;
                    
                                 urut2 = uts2[j];
                                uts2[j] = uts2[j+1];
                                 uts2 [j + 1] = urut2;
                    
                                urut2 = uas[j];
                                uas[j] = uas[j+1];
                                uas [j + 1] = urut2;
                    
                                urut2 = gabungan[j];
                                gabungan[j] = gabungan[j+1];
                                gabungan [j + 1] = urut2;
                    
                    //3. untuk nilai yg huruf
                                String urut3 = huruf[j];
                                huruf[j] =huruf[j + 1];
                                huruf[j + 1] = urut3;

                        }
                }
        }
        //cetak kedua yang sudah berurutan
        System.out.println("Daftar nilai mahasiswa setelah diurutkan");
        System.out.println("No       NIM             Nama\t         Uts1\t   Uts2\t  Uas\t  Total\t  Final\t");
        System.out.println("==================================================================================");
        
            for (int i = 0; i < n ;i++){
        System.out.println((i+1)+ "   \t" +nim[i]+ "      \t" +mhs[i]+ "       \t" +uts1[i]+ "  \t" +uts2[i]+ "   \t" +uas[i]+ "  \t" +gabungan[i]+ "  \t" +huruf[i]+ "  \t");
            }
        System.out.println("==================================================================================");
        
        }
    }

