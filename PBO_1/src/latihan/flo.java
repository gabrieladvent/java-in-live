/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import Modul_2.Pegawai;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class flo {
    public static void main(String[] agrs){
        Pegawai[] daftar;
        
        int jml = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan jumlah Pegawai : "));
        daftar = new Pegawai[jml];
        System.out.println("Jumalah Pegawai :"+jml);
        
        String nama, status = null, NPP;
        int  jmlanak = 0,golongan = 0; 
        System.out.println("Daftar Pegawai Baru");
        System.out.println("No \t Nama  \t NPP  \t golongan \t status   \t jumlah anak");
        System.out.println("==========================================================");
         
        for (int i = 0; i < daftar.length; i++){
            daftar[i] = new Pegawai();
            nama = JOptionPane.showInputDialog(null, "Masukkan nama : " );
            
            NPP = JOptionPane.showInputDialog(null, "Masukkan NPP : " );
            
            do{
                golongan = Integer.parseInt(JOptionPane.showInputDialog("Masukkan golongan Anda \n ([1/2/3]) "));
                if (golongan == 1){
                    daftar[i].setGolongan(1300000);
                }
                else if (golongan == 2){
                    daftar[i].setGolongan(1750000);
                }
                else if (golongan == 3){
                    daftar[i].setGolongan(2000000);
                }
                else{
                    System.out.print("Golongan anda tidak terdaftar, Silakan Masukkan ulang");
                }
            }while(golongan < 1 || golongan >4);
            
            status = JOptionPane.showInputDialog(null, "Masukkan Status : " );
             
            jmlanak = Integer.parseInt(JOptionPane.showInputDialog(null,"Masukkan jumlah anak :"));
           
            
            daftar[i].setNama(nama);
            daftar[i].setNPP(NPP);
           daftar[i].setStatus(status);
            daftar[i].setJmlhAnak(jmlanak);
        }
        for(int i = 0; i < daftar.length; i++){
            System.out.println((i+1)+ "\t" +daftar[i].getNama()+ "\t"+daftar[i].getNPP()+ "\t"
                    +daftar[i].getGolongan()+ "\t"+daftar[i].getStatus()+"\t"+daftar[i].getJmlhAnak());
        }
    }
}
