/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_3;
import javax.swing.JOptionPane;
/**
 *
 * @au  thor ACER
 */
public class MainProdi {
    public static void main(String [] args) {
        Pgw dsn = new Pgw("05072001", "Purwarno");
        dsn.setGelar("S.Fil");
        dsn.setEmail("Purwarno@gmail.com");
        
        Program_Studi kpla = new Program_Studi("5314", "Informatika");
        //kpla.setNama_prodi("Informatika");
        kpla.setKetua_prodi(dsn);
        Pgw ketua = kpla.getKetua_prodi();
        String nma = ketua.getNama();
        
        JOptionPane.showMessageDialog(null,"Kode Prodi: "+kpla.getKode_prodi()+
                "\nNama Prodi: "+kpla.getNama_prodi()+"\nDiketuai Oleh: "+nma);
    }
}
