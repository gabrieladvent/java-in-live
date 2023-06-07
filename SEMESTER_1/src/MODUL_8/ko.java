/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_8;
import java.util.Scanner;

public class ko {
public static void main(String[] args) {
    Scanner bie = new Scanner(System.in);
    double r, ulang, total = 0, bagi = 0, bi, N, rt = 0;
    
       System.out.println("SIlahkan pilih: ");
   System.out.print("1. Seri \n2. pararel \npilihan: ");
   bi = bie.nextInt();
   
   if (bi == 1) {
        System.out.print("Anda mau berapa banyak hambatan: ");
        N = bie.nextInt();
       for (ulang = 1; ulang <= N; ulang++) {
           System.out.print("masukan "+ulang+": ");
           r = bie.nextInt();
           rt = rt + r;
              
       }
       System.out.println("Jadi total hambatan di rangkaian seri adalah: "+rt);
   }
   else if (bi == 2) {
        System.out.print("Anda mau berapa banyak hambatan: ");
        N = bie.nextInt();
       for (ulang = 1; ulang <=N; ulang++) {
           System.out.print("masukan "+ulang+": ");
           r = bie.nextInt();
           
       
   }
       System.out.println("Jadi total hambatan di rangkaian seri adalah: "+rt); 
}
}
}