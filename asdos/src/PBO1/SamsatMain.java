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
public class SamsatMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RegistrasiKendaraan data;
        Samsat sam1 = new Samsat ("DAERAH ISTIMEWA YOGYAKARTA");
        int total = 0;
        System.out.print("Jumlah Kendaraan : ");
        int jumlah = input.nextInt();
        for (int i = 0; i < jumlah; i++) {
            System.out.print((i+1)+". " + "Nama\t : ");
            String nama = input.next();
            System.out.println("  " + "Alamat\t: ");
            String alamat = input.next();
            System.out.println("  " + "Jenis\t: ");
            String jenis = input.next();
            System.out.println("  " + "Merk\t: ");
            String merk = input.next();
            System.out.println("  " + "Warna\t: ");
            String wwarna = input.next();
            System.out.println("  " + "Bahan Bakar : ");
            String bahanBakar = input.next();
            System.out.println("  " + "Kode Kota\t: ");
            String kodeKota = input.next();
            System.out.print("   " + "Nomor : ");
            String nomor = input.next();
            System.out.print("   " + "Harga : Rp ");
            int harga = input.nextInt();
            data = new RegistrasiKendaraan();
            data.setNama(nama);
            data.setAlamat(alamat);
            data.setJenis(jenis);
            data.setMerk(merk);
            data.setWarna(wwarna);
            data.setBahanBakar(bahanBakar);
            data.setKodeKota(kodeKota);
            data.setNokendaraan(nomor);
            data.setHarga(harga);
            sam1.setDataPemilik(data);
            total = (int) (total+data.pajak());
            System.out.println(" ");
        }
        System.out.println("   === KANTOR SAMSAT ===");
        System.out.println(" " + sam1.getNamaSamsat());
        for (int i = 0; i < sam1.getJumlahData(); i++) {
            System.out.println((i+1)+". " + "Nama Pemilik\t   : " + sam1.getDataPemilik(i).getNama());
            System.out.println("  " + " Alamat Pemilik\t: " + sam1.getDataPemilik(i).getAlamat());
            System.out.println("  " + " Jenis Kendaraan\t: " + sam1.getDataPemilik(i).getJenis());
            System.out.println("  " + " Merk Kendaraan\t: " + sam1.getDataPemilik(i).getMerk());
            System.out.println("  " + " Warna Kendaraan\t: " + sam1.getDataPemilik(i).getWarna());
            System.out.println("  " + " Bahan Bakar\t\t: " + sam1.getDataPemilik(i).getBahanBakar());
            System.out.println("  " + " Kode Kota\t\t: " + sam1.getDataPemilik(i).getKodeKota());
            System.out.println("   " + "Nomor Kendaraan : " + sam1.getDataPemilik(i).getNokendaraan());
            System.out.println("   " + "Harga Kendaraan : Rp "+ sam1.getDataPemilik(i).getHarga());
            System.out.println("   " + "Pajak Kendaraan : Rp " + sam1.getDataPemilik(i).pajak());
            System.out.println(" ");
        }
        System.out.println("Total Biaya Tahunan\t: Rp " + total);
        System.out.println("Rata Rata Biaya Tahunan\t: Rp " + total / sam1.getJumlahData());
    }
}