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
public class ujiicoba {
    private int saldo, akhir, tarik;

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int jumlah) {
        saldo = saldo + jumlah;
    }

    public int getAkhir() {
        akhir = saldo - tarik;
        return akhir;
    }

    public void setAkhir(int akhir) {
        this.akhir = akhir;
    }

    public int getTarik() {
        return tarik;
    }

    public void setTarik(int tarik) {
        this.tarik = tarik;
    }
    
    
    public static void main(String[] args) {
        ujiicoba obj = new ujiicoba ();
        obj.setSaldo(50000);
        System.out.println(obj.getSaldo());
        obj.setSaldo(50000);
        System.out.println(obj.getSaldo());
        System.out.println(obj.getAkhir());
        obj.setTarik(50000);
        System.out.println(obj.getSaldo());
        System.out.println(obj.getAkhir());
    }
}
