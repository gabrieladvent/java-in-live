/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO1;

/**
 *
 * @author Tak Bertuan
 */
public class RekeningBank {
    private String nama;
   private int saldo;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public int saldo (){
        return saldo;
    }
    public void simpan (int jumlah){
        saldo = saldo + jumlah;
    }
}
