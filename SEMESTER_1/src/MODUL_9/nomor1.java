package MODUL_9;
import java.util.Scanner;

public class nomor1 {
    public static void main(String[] args){
        Scanner bie = new Scanner(System.in);
        int baris, kolom;
        
        do {
        System.out.print("Silahkan masukan jumlah baris yang Anda mau: ");
        baris = bie.nextInt();
        System.out.print("Silahkan masukan jumlah kolom yang Anda mau: ");
        kolom = bie.nextInt();
                if (baris <= 0 || kolom <= 0){
                    System.out.println("\nSilahkan mengisi ulang dengan bilangan di atas angka 0");
                } } while (baris <=0 || kolom <= 0); //mengulang jika user memasukan nilai baris dan kolom <= 0

        for (int i = 0; i <= baris; i++) { 
                for (int j = 0; j <= kolom; j++) {
                       if (j == i) {  //pemilihan untuk menentukan nilai matriks
                           System.out.print(" 1 "); } 
                       else {
                           System.out.print(" 0 "); }
                }
        System.out.println(); //mencetak bagian baris 
        }
        
    }
}
