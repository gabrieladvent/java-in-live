/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_2;

/**
 *
 * @author ACER
 */
public class RekeningBank {
        private String nomorRekening;
        private int saldo;
        
public RekeningBank (String nomor) {
        nomorRekening = nomor;
        saldo = 0;
 }
public int cekSaldo() {
        return saldo;
 }
 public void tabung(int jumlah) {
        saldo = saldo + jumlah;
 }
 public void ambil(int jumlah){
        saldo = saldo - jumlah;
 }
}
