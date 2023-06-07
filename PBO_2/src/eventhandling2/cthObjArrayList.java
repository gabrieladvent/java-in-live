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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author hertada
 */
public class cthObjArrayList {
    public static void main(String[] args) {
        ArrayList<Pegawai> pegawaiList = new ArrayList<>();
        Pegawai pegawai;
        pegawai = new Pegawai("Herry Suharto", "Jl. Merapi indah no.1 Depok",9500000, LocalDate.of(2002, 1, 8));
        pegawaiList.add(pegawai);
        pegawai = new Pegawai("Sri Hartati", "Jl. Pesona Gading no.1 Ngemplak Sleman",6500000, LocalDate.of(2002, 2, 8));
        pegawaiList.add(pegawai);
        pegawai = new Pegawai("Felicia Tiffany", "Jl. Pradipta Dirgantara no.1 Boyolali",3000000, LocalDate.of(2002, 10, 4));
        pegawaiList.add(pegawai);
        pegawai = new Pegawai("Maximus Quinn", "Jl. Wardhani no.1 Depok",2000000, LocalDate.of(2002, 5, 5));
        pegawaiList.add(pegawai);
        pegawai = new Pegawai("Teresa Amelia", "Jl. Blotan Wedomartani no.1 Depok",1000000, LocalDate.of(2002, 10, 14));
        pegawaiList.add(pegawai);
        
        // Set per Item data
        pegawai.setNama("Patricius Sugeng");
        pegawai.setAlamat("Jl. Kantil 3 no.272 Condong Catur");
        pegawai.setJumGaji(4000000);
        pegawai.setTgLahir(LocalDate.of(1999, 2, 20));
        pegawaiList.add(pegawai);

        pegawai.setNama("Tarcisia Sutirah");
        pegawai.setAlamat("Jl. Cempaka 64B Condong Catur");
        pegawai.setJumGaji(4400000);
        pegawai.setTgLahir(LocalDate.of(1999, 2, 22));
        pegawaiList.add(pegawai);
        
        //Lihat data
        //pegawaiList = PegawaiController.getAllCustomer();
        System.out.println(pegawaiList.get(0)); //get id obyek
        for (int i = 0; i < pegawaiList.size(); i++) {
            System.out.println(pegawaiList.get(i).getNama());
            System.out.println(pegawaiList.get(i).getAlamat());
            System.out.println(pegawaiList.get(i).getJumGaji());
            System.out.println(pegawaiList.get(i).getNama());
        }
    }
}
