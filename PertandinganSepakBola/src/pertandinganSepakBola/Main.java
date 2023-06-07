package pertandinganSepakBola;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        Sekolah sekolah = new Sekolah("SMA Negeri 1");

        // Menambahkan tim
        Tim tim1 = new Tim("Tim A");
        Tim tim2 = new Tim("Tim B");
        sekolah.tambahTim(tim1);
        sekolah.tambahTim(tim2);

        // Menambahkan pemain ke tim
        Pemain pemainA1 = new Pemain("Pemain A1", 1, "Penjaga Gawang");
        Pemain pemainA2 = new Pemain("Pemain A2", 2, "Libero");
        Pemain pemainA3 = new Pemain("Pemain A3", 3, "Back Kanan");
        Pemain pemainA4 = new Pemain("Pemain A4", 4, "Back Kiri");
        Pemain pemainA5 = new Pemain("Pemain A5", 9, "Center Back");
        Pemain pemainA6 = new Pemain("Pemain A6", 10, "Gelandang Kanan");
        Pemain pemainA7 = new Pemain("Pemain A7", 11, "Gelandang Kiri");
        Pemain pemainA8 = new Pemain("Pemain A8", 12, "Gelandang Tengah");
        Pemain pemainA9 = new Pemain("Pemain A9", 13, "Kanan Luar");
        Pemain pemainA10 = new Pemain("Pemain A10", 14, "Kiri Luar");
        Pemain pemainA11 = new Pemain("Pemain A11", 19, "Penyerang");
        tim1.tambahPemain(pemainA1);
        tim1.tambahPemain(pemainA2);
        tim1.tambahPemain(pemainA3);
        tim1.tambahPemain(pemainA4);
        tim1.tambahPemain(pemainA5);
        tim1.tambahPemain(pemainA6);
        tim1.tambahPemain(pemainA7);
        tim1.tambahPemain(pemainA8);
        tim1.tambahPemain(pemainA9);
        tim1.tambahPemain(pemainA10);
        tim1.tambahPemain(pemainA11);

        Pemain pemainB1 = new Pemain("Pemain B1", 1, "Penjaga Gawang");
        Pemain pemainB2 = new Pemain("Pemain B2", 2, "Libero");
        Pemain pemainB3 = new Pemain("Pemain B3", 3, "Back Kanan");
        Pemain pemainB4 = new Pemain("Pemain B4", 4, "Back Kiri");
        Pemain pemainB5 = new Pemain("Pemain B5", 9, "Center Back");
        Pemain pemainB6 = new Pemain("Pemain B6", 10, "Gelandang Kanan");
        Pemain pemainB7 = new Pemain("Pemain B7", 11, "Gelandang Kiri");
        Pemain pemainB8 = new Pemain("Pemain B8", 12, "Gelandang Tengah");
        Pemain pemainB9 = new Pemain("Pemain B9", 13, "Kanan Luar");
        Pemain pemainB10 = new Pemain("Pemain B10", 14, "Kiri Luar");
        Pemain pemainB11 = new Pemain ("Pemain B11", 19, "Penyerang");
        tim2.tambahPemain(pemainB1);
        tim2.tambahPemain(pemainB2);
        tim2.tambahPemain(pemainB3);
        tim2.tambahPemain(pemainB4);
        tim2.tambahPemain(pemainB5);
        tim2.tambahPemain(pemainB6);
        tim2.tambahPemain(pemainB7);
        tim2.tambahPemain(pemainB8);
        tim2.tambahPemain(pemainB9);
        tim2.tambahPemain(pemainB10);
        tim2.tambahPemain(pemainB11);
        
        //Mencetak nama pemain
        System.out.println("-------------------------------------------");
        System.out.println("DAFTAR PEMAIN DARI TIM " + tim1.getNama() + " DAN TIM " + tim2.getNama());
        System.out.println("-------------------------------------------");
        Pertandingan pertandingan = new Pertandingan(tim1, tim2);
        System.out.println(pertandingan.toString());
        
        //Memulai pertandingan
        System.out.println("------------------------------------------");
        System.out.println("PERTANDINGAN SEPAK BOLA PIALA " + sekolah.getNama());
        System.out.println("------------------------------------------");
        int skor = 0;
        int pilihan = 0;
        do {
            System.out.println("PILIH MENU:");
            System.out.println("1. Tambah Skor "+tim1.getNama());
            System.out.println("2. Tambah Skor" + tim2.getNama());
            System.out.println("3. Lihat Hasil Pertandingan Sementara");
            System.out.println("4. Lihat Hasil Akhir Pertandingan");
            System.out.print("Pilih (1/2/3/4): ");
            pilihan = inp.nextInt();
            
            switch (pilihan) {
                case 1: 
                    pertandingan.gol(tim1);
                    break;
                case 2:
                    pertandingan.gol(tim2);
                    break;
                case 3:
                    System.out.println("------------------------");
                    System.out.println("HASIL PERTANDINGAN SEMENTARA");
                    System.out.println("------------------------");
                    pertandingan.hasilSementara();
                    break;
                case 4:
                    System.out.println("------------------------");
                    System.out.println("PERTANDINGAN SELESAI!!!");
                    System.out.println("------------------------");
                    pertandingan.hasil();
                    break;
                default:
                    System.err.println("PILIHAN TIDAK VALID!!!");
                    break;
            }
            System.out.println("");
        } while (pilihan != 4);
    }
}
