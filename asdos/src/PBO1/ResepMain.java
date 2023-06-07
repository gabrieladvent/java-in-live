/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7;

/**
 *
 * @author Tak Bertuan
 */
import java.util.Scanner;
public class ResepMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        int harga = 0, total = 0;
        Dokter ddokter = new Dokter();
        Pasien dpasien = new Pasien();
        Obat dobat = null;
        Obat max,min;
        Resep resep1 = new Resep("Resep");

        System.out.print("1. Nama Dokter\t: ");
        ddokter.setNamaDokter(input.next());
        System.out.print("2. ID Dokter\t: ");
        ddokter.setIdDokter(input.next());
        System.out.print("3. Nama Pasien\t: ");
        dpasien.setNamaPasien(input.next());
        System.out.print("4. ID Pasien\t: ");
        dpasien.setIdPasien(input.next());
        System.out.print("5. Jumlah Obat\t: ");
        int jum = input.nextInt();
        System.out.println(" ");
        for (int i = 0; i < jum; i++) {
            dobat = new Obat();
            System.out.print((i+1)+". " + "Obat  : ");
            nama = input.next();
            System.out.print("   " + "Harga : Rp ");
            harga = input.nextInt();
            total = total + dobat.getHargaObat();
            dobat.setNamaObat(nama);
            dobat.setHargaObat(harga);resep1.setDataObat(dobat);
        }
        
        
        
        max = min = dobat;
        for (int i = 0; i < jum; i++) {
            if (resep1.getDataObat(i).getHargaObat() < min.getHargaObat()) {
                min = resep1.getDataObat(i);
            } else if (resep1.getDataObat(i).getHargaObat() > min.getHargaObat()){
                max = resep1.getDataObat(i);
            }
        }
        System.out.println(" ");
        System.out.println("=== RESEP OBAT ===");
        resep1.setDokter(ddokter);
        resep1.setPasien(dpasien);
        System.out.println("Nama Dokter : " + resep1.getDokter().getNamaDokter());
        System.out.println("Nama Pasien : " + resep1.getPasien().getNamaPasien());
        System.out.println(" " + resep1.getNamaResep());
        for (int i = 0; i < jum; i++) {
            System.out.println((i+1)+"." + resep1.getDataObat(i).getNamaObat() + " Rp " + resep1.getDataObat(i).getHargaObat());
        }
        System.out.println(" ");
        System.out.println("Total Harga\t: Rp " + total);
        System.out.println("Harga Terbesar : Rp " + max.getHargaObat() + " - " + max.getNamaObat());
        System.out.println("Harga Terkecil : Rp " + min.getHargaObat() + " - " + min.getNamaObat());
    }
}
