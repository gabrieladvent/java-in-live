/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO1;
import java.util.Scanner;
/**
 *
 * @author Tak Bertuan
 */
public class mainRekening {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        rekening obj = new rekening ();
        
        obj.setNama("Arii");
        obj.setSaldo(50000);
        System.out.println("--------------");
        System.out.println("Rekening Bank " + obj.getNama());
        System.out.println("Saldo: " + obj.getSaldo());
        System.out.println("--------------");
        System.out.println("Anda akan menarik");
        obj.ambil(50000);
    }
}
