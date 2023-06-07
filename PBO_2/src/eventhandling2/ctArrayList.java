/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventhandling2;

/**
 *
 * @author ACER
 */
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author hertada
 */
public class ctArrayList {
  public static void main(String[] args) {
    ArrayList<String> mahasiswa = new ArrayList<String>();
    mahasiswa.add("BERNADETHA MEGA DEVINA AYUNINGTYAS");
    mahasiswa.add("MARCELIA PUTRI SUPRIOSA");
    mahasiswa.add("GRATIA STEPHANIE KONO");
    mahasiswa.add("FEBRONIA ANINDWI ADRISTY");
    mahasiswa.add("FREDERIKA NOVELIANI");
    mahasiswa.add("CATRIEN LATUMAERISSA");
    mahasiswa.add("CHRISTA ADELESTIN SERAN");
    mahasiswa.add("KATRINA YULIANA KARTIKA");
    mahasiswa.add("MORINDA ALICIA SIALLAGAN");
    mahasiswa.add("SRI DIVA OCTAVIANI");
    //Cetak dan ambil data
    System.out.println("====Cetak dan Ambil Data=======");
    System.out.println(mahasiswa);
    System.out.println(mahasiswa.get(3));
        for (int i = 0; i < mahasiswa.size(); i++) {
            System.out.println(mahasiswa.get(i));
        }
    //dapat juga menggunakan format ini
    System.out.println("====For biasa=======");
        for (String i : mahasiswa) {
            System.out.println(i);
        }
    //mengurutkan data arraylist
    System.out.println("====Menggunakan Collections=======");
        Collections.sort(mahasiswa);  // urutkan data mahasiswa
            for (String i : mahasiswa) {
            System.out.println(i);
        }

    //set Data
    System.out.println("====Set Data=======");
    mahasiswa.set(7, "BENEDICTUS HERRY SUHARTO");
    System.out.println(mahasiswa.get(7));
    //Hapus data
    mahasiswa.remove(7);
    System.out.println(mahasiswa.get(7));
    //Hapus Semua data
    // mahasiswa.clear();
    //lihat Ukuran arraylist
    System.out.println(mahasiswa.size());
    

  }
    
}
