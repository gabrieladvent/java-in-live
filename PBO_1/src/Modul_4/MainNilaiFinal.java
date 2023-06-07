/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_4;
import javax.swing.JOptionPane;

public class MainNilaiFinal {
public static void main(String[] args){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Mahasiswa: "));
        
        NilaiMhs [] mhs;
        mhs = new NilaiMhs[n];
        String nama, nim;
        double uts1, uts2, uas;
        
        for (int i = 0; i < mhs.length; i++) {
                nama = JOptionPane.showInputDialog(null, "Masukan nama mahasiswa: "+(1+i));
                nim    = JOptionPane.showInputDialog(null, "Masukkan nim : " );
                uts1  = Double.parseDouble(JOptionPane.showInputDialog("Masukan nilai UTS pertama: "));
                uts2 = Double.parseDouble(JOptionPane.showInputDialog("Masukan nilai UTS kedua: "));
                uas    = Double.parseDouble(JOptionPane.showInputDialog("Masukan nilai UAS: "));
                
                mhs[i] = new NilaiMhs();
                mhs[i].setNama(nama);
                mhs[i].setNim(nim);
                mhs[i].setUts1(uts1);
                mhs[i].setUts2(uts2);
                mhs[i].setUas(uas);
        }
        
        //MENENTUKAN NILAI FINAL//
        for (int i = 0; i < mhs.length; i++) {
                if(mhs[i].nilaifinal() >= 80) {
                        mhs[i].setHuruf("A");
                }else if(mhs[i].nilaifinal() >=65 && mhs[i].nilaifinal() < 80)  {
                        mhs[i].setHuruf("B");
                }else if(mhs[i].nilaifinal() >=55 && mhs[i].nilaifinal() <65){
                        mhs[i].setHuruf("C");
                }else if(mhs[i].nilaifinal() >= 50 && mhs[i].nilaifinal() < 55){
                        mhs[i].setHuruf("D");
                }else{
                        mhs[i].setHuruf("E");   
                }
        }
        
        //cetak//
        System.out.println("                   DAFTAR NILAI MAHASISWA INFORMATIKA");
        System.out.println("No       NIM             Nama\t         Uts1\t   Uts2\t  Uas\t  Total\t  Final\t");
        System.out.println("==================================================================================");
            for (int i = 0; i < n ;i++){
                System.out.println((i+1) + "\t  "+mhs[i].getNim()+"\t  "+mhs[i].getNama()+"\t  "+mhs[i].getUts1()+"\t  "+mhs[i].getUts2()+
                                                "\t  "+mhs[i].getUas()+"\t  "+mhs[i].nilaifinal()+"\t  "+mhs[i].getHuruf());
        }
                    //tentukan nilai tertinggi//
         NilaiMhs tinggi, rendah;
         tinggi = mhs[0];
         rendah = mhs [0];
        
        for (int i = 1; i < mhs.length; i++) {
            tinggi = mhs[i];
                if ( mhs[i].nilaifinal() > tinggi.nilaifinal()) {
                    mhs[i]=tinggi ;
                } else {
                    mhs [i] = rendah;
                }
        }  
        System.out.println("Nilai tertinggi: "+rendah.nilaifinal()); 
        System.out.println("NIlai terendah : "+ tinggi.nilaifinal());
}
}

     