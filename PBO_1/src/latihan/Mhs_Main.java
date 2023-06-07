/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Mhs_Main {

    public static void main(String[] args) {
        //membuat objek untuk Scanner
        Scanner baku = new Scanner(System.in);

        //membuat jumlah inputan banyak mahasiswa sebanyak n buah
        System.out.print("Masukkan jumlah mahasiswa : ");
        int n = baku.nextInt();

        Mahasiswa[] mahasiswa = new Mahasiswa[n];
        System.out.println();

        //membuat inputan untuk masing-masing variabel dari kelas S1 dan S2 menggunakan perulangan for
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Mahasiswa ke- " + (i + 1));
            System.out.println("Pilih Jenjang Pendidikan : \n1.S1 \n2.S2");
            System.out.print("Silahkan masukkan? ");
            String pilih = baku.next();

            System.out.print("Nama : ");
            String nama = baku.next();

            System.out.print("Nim  : ");
            String nim = baku.next();

            System.out.print("Tanggal lahir : ");
            String tglLahir = baku.next();

            System.out.print("Nilai uts 1 : ");
            double uts1 = baku.nextDouble();

            System.out.print("Nilai uts 2 : ");
            double uts2 = baku.nextDouble();

            System.out.print("Nilai uas : ");
            double uas = baku.nextDouble();
            System.out.println(" ");

            if (pilih.equals("1")) {
                mahasiswa[i] = new S1();
            } else {
                mahasiswa[i] = new S2();
            }
            mahasiswa[i].setNama(nama);
            mahasiswa[i].setnim(nim);
            mahasiswa[i].settglLahir(tglLahir);
            mahasiswa[i].setuts1(uts1);
            mahasiswa[i].setuts2(uts2);
            mahasiswa[i].setuas(uas);

        }
        System.out.println(" ");
        System.out.println("No.\t Nama\t  Nim\t  Tgl Lahir\t  Pendidikan\t  uts1\t  uts2\t  uas\t  Nilai\t  Final");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < mahasiswa.length; i++) {
            String y = "";
            if (mahasiswa[i] instanceof S1) {
                y = "S1";
            } else {
                y = "S2";
            }

            System.out.println((i + 1) + ".  \t" + mahasiswa[i].getnama() + "     " + mahasiswa[i].getnim()
                    + "    " + mahasiswa[i].gettglLahir() + "        " + y + "    "
                    + mahasiswa[i].getuts1() + "    " + mahasiswa[i].getuts2()
                    + "  " + mahasiswa[i].getuas() + "    " + mahasiswa[i].getCourseGrade() + "    " + mahasiswa[i].getTampilHuruf());

        }

    }
}
