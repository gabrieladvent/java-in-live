/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SenaraiBerantaiGanda;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;
/**
 *
 * @author Tak Bertuan
 */
public class new_main {
 private  static LinkedList<String> data = new LinkedList<String>();
 private static LinkedList <String> list = new LinkedList <String>();
    private static Scanner input(){
        return new Scanner (System.in);
    }
    private static void displayData(){
        System.out.println("\nData dalam List: "+ data);
        System.out.println("Total Data      : "+data.size());
    }
    private static void addData(){
        System.out.print("Masukkan Data (Berupa NIM): ");
        String tempData = input().nextLine();
        data.add(tempData);
        System.out.println("Antrian Berhasil Ditambahkan");
        System.out.println("Total Antrian: " + data.size());
        System.out.println("");
    }
    private static boolean searchData(String data){
        return data.contains(data);
    }  
    private static void removeDataAtFirst(){
        data.removeFirst();
        displayData();
    }
    
    private static void programExit(){
        System.exit(0);
    }
    private static void cetak (){
        int i = 1;
        System.out.println("--> Daftar Antiran: ");
        for (String m : data) {
            System.out.println(i++ + ". " + m);
        }
        System.out.println("");
    }
    private static void cetak2(){
        System.out.println("--> Daftar Antrian Yang Sudah Dilayani");
        System.out.println("--> "+ list);
        System.out.println("");
    }
    private static void programSwitcher(){
        boolean status = true;
        int indexMenu = 0;
        while(status){
            try{
                status = false;
                System.out.print("--> Pilih menu [1-5]: ");
                indexMenu = input().nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("Masukkan harus berupa angka!");
                status = true;
            }
        }
        switch(indexMenu){
            case 1: addData(); break;
            case 2: cetak(); break;
            case 3: removeDataAtFirst();break;
            case 4: cetak2(); break;
            case 5: programExit();break; 
        }
        programMenu();
    }
    private static void programMenu(){
        System.out.println("===== M E N U =====");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Daftar Antrian");
        System.out.println("3. Panggil Antrian");
        System.out.println("4. Cetak Antrian Yang Sudah Dilayani");
        System.out.println("5. Keluar");
        programSwitcher();
    }
    public static void main(String[] args) {
        programMenu();
    }
    
}  

