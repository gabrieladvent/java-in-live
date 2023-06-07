 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_2;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author ACER
 */
public class KalkulatorDialog {
    public static void main(String [] args){
        Scanner bie = new Scanner (System.in);
        Kalkulator hit = new Kalkulator();
        int b;
        
        hit.angka1=Integer.parseInt(JOptionPane.showInputDialog("Masukkan Bilangan Pertama"));
        hit.angka2=Integer.parseInt(JOptionPane.showInputDialog("Masukkan Bilangan Kedua"));
        
        do{
                b= Integer.parseInt(JOptionPane.showInputDialog("Silahkan memilih:\n->1. Penjumlahan\n->2. Pengurangan\n->3. Perkalian\n->4. Pembagian"));
         //b = bie.nextInt();
                        if (b == 1){
                               JOptionPane.showMessageDialog(null, "Hasil dari "+hit.angka1
                                +" +  "+hit.angka2+" adalah: "+hit.tambah());
                        }
                        else if (b == 2){
                               JOptionPane.showMessageDialog(null, "Hasil dari "+hit.angka1
                                 +" - "+hit.angka2+" adalah: "+hit.kurang());
                        }
                        else if (b == 3){
                                JOptionPane.showMessageDialog(null, "Hasil dari "+hit.angka1
                                +" * "+hit.angka2+" adalah: "+hit.kali());
                        }
                        else if (b == 4){
                                JOptionPane.showMessageDialog(null, "Hasil dari "+hit.angka1
                                +" /  "+hit.angka2+" adalah: "+hit.bagi());
                        }
                        else {
                           JOptionPane.showMessageDialog(null, "Silahkan memasukan ulang");
                        }
        } while (b < 1 || b > 4);
        
    }
}
