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
public class DivisiMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pegawai data;
        int b = 0;
        do {
            Pegawai kepala = new Pegawai();
            System.out.print("Nama Divisi\t: ");
            String div1 = input.next();
            System.out.print("Kepala Divisi\t: ");
            kepala.setNamaPegawai(input.next());
            Divisi divisi1 = new Divisi(div1, kepala);
            System.out.print("Jumlah Pegawai\t: ");
            int jum = input.nextInt();
            for (int i = 0; i < jum; i++) {
                System.out.print((i+1)+". " + "Nama\t: ");
                String nama = input.next();
                System.out.print("   " + "ID\t: ");
                String id = input.next();
                data = new Pegawai();
                data.setNamaPegawai(nama);
                data.setId(id);
                divisi1.setDataPegawai(data);
            }
            System.out.println(" ");
            System.out.println("Divisi : " + divisi1.getNamaDivisi());
            System.out.println("Kepala : " + divisi1.getKepalaDivisi().getNamaPegawai());
            System.out.println("Nama Pegawai ");
            for (int i = 0; i < jum; i++) {
                System.out.println((i+1)+". " + divisi1.getDataPegawai(i).getNamaPegawai()+ " (" + divisi1.getDataPegawai(i).getId() + ")");
            }
            System.out.println("-----------------------------");
            System.out.println(" ");
            b++;
        } while (b < 3);
    } 
}
