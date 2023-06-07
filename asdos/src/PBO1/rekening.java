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
public class rekening {
    private String nama;
    private int saldo;

    public rekening() {}

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

   

    public boolean ambil (int data){
        if (saldo >= data){
            saldo = saldo - data;
            System.out.println("Penarikan Sukses!!!");
            System.out.println("Anda akan menarik: " + data);
            System.out.println("Saldo anda: " + saldo);
            return true;
           
        } else {
            System.out.println("Penarikan gagal!!!");
            System.out.println("Uang yang ingin anda tarik: " + data);
            System.out.println("Saldo anda: " + saldo);
            System.out.println("Saldo anda tidak mencukupi");
            return false;
        }
    }
}
