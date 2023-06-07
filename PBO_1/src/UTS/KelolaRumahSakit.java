/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class KelolaRumahSakit {
public static void main(String [] args){
        Scanner bi = new Scanner(System.in);
        Pasien[] pas; RumahSakit Rs;
        System.out.print("Masukan Kapasitas Rumah Sakit: ");
        int n = bi.nextInt();
        pas = new Pasien[n];
        
        System.out.println("INPUT DATA PASIEN");
        for(int i = 0; i < pas.length; i++){
            System.out.print("Masukan Nama Pasien "+(i+1)+": ");
            String nma = bi.next();
            System.out.print("Masukan NIK Pasien: ");
            String nik = bi.next();
            System.out.print("Masukan Usia Pasien: ");
            int umr = bi.nextInt();
            System.out.println("");
            pas[i] = new Pasien(nik, nma);
            pas[i].setUsia(umr);
        }
        
        System.out.println("INPUT DATA RUMAH SAKIT");
        Rs = new RumahSakit("01112", "RSUD. Larantuka");
        Rs.setKota("Larantuka");
        Rs.setDaft_pasi(pas);
        System.out.println("Nama Rumah Sakit: "+Rs.getNama_RS());
        System.out.println("Kode Rumah Sakit: "+Rs.getKode_RS());
        System.out.println("Kota Rumah Sakit: "+Rs.getKota());
        System.out.println("");
        System.out.println("NIK  |  Nama  |  Usia");
        for(int i = 0; i < pas.length; i++){
            System.out.println(pas[i].getNik()+"  |  "+pas[i].getNama()+"  |  "+pas[i].getUsia());
        }
        
        double total= 0;
        for(int i = 0; i < pas.length; i++){
        total = total + pas[i].getUsia();
        }
        double rerata = total/n;
        Rs.setRerat(rerata);
        System.out.println("Rata-Rata Usia Pasien Adalah: "+Rs.getRerat());
        
        Pasien tua, muda;
        tua = pas[0];
        muda = pas[0];
        for(int i = 0; i < pas.length; i++){
            if (pas[i].getUsia() > tua.getUsia()){
                tua = pas[i];
            } else{
                muda = pas [i];
            }
        }
        Rs.setUsi(tua);
        Rs.setUsi(muda);
        System.out.println("Usia Tertua Adalah: "+tua.getNama()+" Dengan Nama: "+tua.getUsia());
        System.out.println("\n");
        System.out.println("usia muda " + muda.getNama());
}
}
