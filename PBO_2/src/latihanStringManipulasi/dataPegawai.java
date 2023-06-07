/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanStringManipulasi;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author ACER
 */
public class dataPegawai {
     ArrayList<Pegawai> pegawaiList = new ArrayList<>();
        Pegawai pegawai;
    public dataPegawai(){
        pegawaiList.clear();
    }
    public void fillData() {
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
        pegawai = new Pegawai("Patricius Sugeng", "Jl. Kantil 3 no.272 Condong Catur",4000000, LocalDate.of(1999, 2, 20));
        pegawaiList.add(pegawai);
        pegawai = new Pegawai("Tarcisia Sutirah", "Jl. Cempaka 64B Condong Catur",1800000, LocalDate.of(1992, 2, 22));
        pegawaiList.add(pegawai);
    }
}
