/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4;

/**
 *
 * @author Tak Bertuan
 */
public class har {
    public static void main(String[] args) {
        int bulan = 12;
        int tahun = 2019;
        int jumlahHari = 0;

        switch (bulan) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                jumlahHari = 31;
                break;
            case 4: case 6:
            case 9: case 11:    
                jumlahHari = 30;
                break;
            case 2:
                if (tahun % 4 == 0)
                    jumlahHari = 29;
                else
                    jumlahHari = 28;
                break;
            default:
                System.out.println("Maaf bulan hanya sampai 12.");
                break;
        }
        System.out.println("Jumlah hari = " + jumlahHari);
    }
        
}
