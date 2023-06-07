/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_Katrin;
import Modul_4.Buku;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class main_komp {
public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jumlah Laptop Yang Mau Didata: ");
        int n = input.nextInt();
        
        hrg_komp[] obj2 = new hrg_komp[n];
        spek_komp[] obj3 = new spek_komp[n];
        
        System.out.println("");
        for(int i = 0; i < obj2.length; i++){
        obj2[i] = new hrg_komp();
        obj3[i] = new spek_komp();
                System.out.print("Masukan Nama Komputer "+(i + 1)+": ");
                        String nm = input.next();
                        obj3[i].setNama(nm);
                System.out.println("Masukan Spesifikasi Komputer");
                System.out.print("-> Ram\t \t \t: ");
                        String ram = input.next();
                        obj3[i].setRam(ram);
                System.out.print("-> Jumlah DDR\t \t: ");
                        String ddr = input.next();
                        obj3[i].setDdr(ddr);
                System.out.print("-> Prosesor\t \t: ");
                        String prosesor = input.next();
                        obj3[i].setProsesor(prosesor);
                System.out.print("Masukan Harga Komputer  : ");
                        int harga = input.nextInt();
                        obj2[i].setHrg(harga);
                System.out.println("");
                
        }
        Komp obj1 = new Komp("HORAS STORE", "Medan");
        obj1.setHarga(obj2);
        obj1.setSpek(obj3);
        
        System.out.println("SELAMAT DATANG DI TOKO KOMPUTER "+obj1.getNama());
        System.out.println("Alamat: "+obj1.getALamat());
        for(int i = 0; i < obj2.length; i++){
                System.out.println("Nama Komputer "+(i+1)+": "+obj3[i].getNama());
                for(int j = 0; j < 1; j++){
                    System.out.println("-> Ram\t \t \t: "+obj1.getSpek()[j].getRam());
                    System.out.println("-> DDR\t \t \t: "+obj1.getSpek()[j].getDdr());
                    System.out.println("-> Prosesor\t \t: "+obj1.getSpek()[j].getProsesor());
                }
                System.out.println("-> Harga Komputer\t: "+obj2[i].getHrg());
                System.out.println("");
        }
        
        hrg_komp mahal, murah;
        mahal = murah = obj2[0];
        for (int i = 0; i < obj2.length; i++) {
            if(obj2[i].getHrg() > mahal.getHrg()){
                mahal = obj2[i];
            } else if (obj2[i].getHrg() < murah.getHrg()){
                murah = obj2[i];
            }
        }
        System.out.println("Komputer Dengan Harga Termahal Adalah: "+mahal.getHrg());
        System.out.println("Komputer Dengan Harga Termurah Adalah: "+murah.getHrg());
}
}
