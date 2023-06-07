/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohuts2;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String[] tipePel ={"Member","NoMember"};
        
        Pembelian pem = null;
        System.out.print("Masukkan jumlah pembeli: ");
        Pelanggan[] pel = new Pelanggan[key.nextInt()];
        for(int i =0; i < pel.length ; i++){
            pel[i] = new Pelanggan();
            System.out.println();
            System.out.print("1. "+tipePel[0]+"\n2. "+tipePel[1]+" \n--> Pilih Status:");
            int pilih = key.nextInt();
            pel[i].setTipePel(tipePel[(pilih-1)]);
            System.out.print("Jumlah barang yang dibeli");
            int masuk = key.nextInt();
            for(int k = 0; k < masuk; k++){
            System.out.println();
            System.out.println((k+1)+("Data Barang"));
            System.out.print("Nama Barang: ");
            String namaBar = key.next();
            System.out.print("Jumlah Barang yang dibeli: ");
            int jumBar = key.nextInt();
            System.out.print("Harga Barang: ");
            int hargaBar = key.nextInt();
               switch(pilih){
                case 1:
                    System.out.println("Potongan Harga 20%");
                    pem = new Member(namaBar,jumBar,hargaBar);
                    int diskon = (int) ((hargaBar*jumBar)* 0.2);
                    ((Member)pem).setPotHarga(diskon);
                    break;
                case 2:
                    pem = new NoMember(namaBar,jumBar,hargaBar);
                    break;
            }
            pem.setNamaBarang(namaBar);
            pem.setJmlhBarang(jumBar);
            pem.setHargaBarang(hargaBar);
            pel[i].setPembelian(pem);
            }
            int hargaTotDis = 0;
        
            System.out.println();
            for(int j =0; j < pel[i].getJumPel(); j++){
                System.out.println("==STRUK PEMBELIAN==");
                System.out.println("Tipe Pelanggan: "+pel[i].getTipePel());
                System.out.println("Nama barang: "+pel[i].getPembelian(j).getNamaBarang());
                System.out.println("Jumlah Barang yang sudah dibeli: "+pel[i].getPembelian(j).getJmlhBarang());
                System.out.println("Harga Barang: "+pel[i].getPembelian(j).getHargaBarang()); 
                hargaTotDis = hargaTotDis + pel[i].getPembelian(j).hitungTotalHarga() - ((Member)pem).getPotHarga();
  
            }
            if(pilih ==1) {
                    System.out.println("Harga Total: "+((Member)pem).hitungTotalHarga());
                    System.out.println("Besar Potongan Harga: "+((Member)pem).getPotHarga());                    
                    System.out.println("Harga Total setelah diskon: "+hargaTotDis);
                } 
            else if(pilih ==2){
                System.out.println("Tidak Mendapat Potongan");
                System.out.println("Harga Total: "+ ((NoMember)pem).hitungTotalHarga());
            }
          
        }
    }
}

