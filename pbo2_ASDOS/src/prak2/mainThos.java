/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak2;
import java.util.Scanner;

/**
 *
 * @author Tak Bertuan
 */
public class mainThos {
    public static void main(String[] args) {
    Scanner inp = new Scanner (System.in);
    System.out.print("Masukan jumlah Pegawai: ");
        int jmlh = inp.nextInt();
        
    pegawai [] pgw = new pegawai [jmlh];
        OUTER:
        for (int i = 0; i < jmlh; i++) {
            System.out.print("Nama: ");
            String nm = inp.next();
            System.out.print("Nomor Induk: ");
            String indk = inp.next();
            System.out.print("Masukan Gaji Pokok: ");
            int gaji = inp.nextInt();
            System.out.println("Jabatan:");
            System.out.println("1. Manager");
            System.out.println("2. Marketing");
            System.out.println("3. Honorer");
            System.out.print("Pilih: ");
            int pilih = inp.nextInt();
            switch (pilih) {
                case 1:
                    pgw [i] = new pegawai ();
                    Manager mngr = (Manager) pgw [i];
                    System.out.print("Status Belajar: ");
                        boolean isClear = inp.nextBoolean();
                    System.out.print("Masukan Jumlah tunjangan: ");
                        int tunj = inp.nextInt();
                    System.out.print("Masukan gaji lembur: ");
                            int lemb = inp.nextInt();
                    mngr.setTunj_jabatan(tunj);
                    mngr.setLembur(lemb);
                    mngr.isSelesai(isClear);
                    break;
                    
                case 2:
                    int bonus;
                    pgw [i] = new pegawai ();
                    Marketing markt = (Marketing) pgw [i];
                    System.out.print("Status Belajar: ");
                        isClear = inp.nextBoolean();
                    System.out.print("Masukan Bonus: ");
                        bonus = inp.nextInt();
                    markt.setBonus(bonus);
                    markt.isSelesai(isClear);
                    break;
                case 3:
                    pgw [i] = new pegawai ();
                    Honor hnr = (Honor) pgw [i];
                    System.out.print("Gaji lemburt: ");
                        lemb = inp.nextInt();
                    hnr.setLembur(lemb);
                    break;
                default:
                    System.err.println("Tidak Ada dalam pilihan");
                    break OUTER;
            }
            pgw [i].setNama(nm);
            pgw [i].setN_induk(indk);
            pgw [i].setG_pokok(gaji);
        }
        for (int i = 0; i < jmlh; i++) {
            System.out.print(i + 1 + ". " + pgw [i].getN_induk() + " " + pgw [i].getNama());
        }
    }
    
    
}
