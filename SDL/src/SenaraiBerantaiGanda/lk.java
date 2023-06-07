/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SenaraiBerantaiGanda;

/**
 *
 * @author Tak Bertuan
 */
import java.util.Scanner;
import java.util.LinkedList;
import java.util.InputMismatchException;
/**
 *
 * @author Thinkpad X250
 */
public class lk {

    /**
     * @param args the command line arguments
     */
    private  static LinkedList<String> data = new LinkedList<String>();
    private static Scanner input(){
        return new Scanner (System.in);
    }
    private static void displayData(){
        System.out.println("\nData dalam List: "+ data);
        System.out.println("Total Data      : "+data.size());
    }
    private static void addData(){
        System.out.print("Masukkan Data: ");
        String tempData = input().nextLine();
        data.add(tempData);
        displayData();
    }
     private static void addDataToFirst(){
        System.out.print("Masukkan Data: ");
        String tempData = input().nextLine();
        data.addFirst(tempData);
        displayData();
    }
    private static void addDataToLast(){
        System.out.print("Masukkan Data: ");
        String tempData = input().nextLine();
        data.addLast(tempData);
        displayData();
    }
    private static void addDataAtLocation(){
       boolean status = true;
       int indexData = 0;
       displayData();
       while (status){
           System.out.print("Pilih Index data yang ingin disisipi data: [0-"+(data.size()-1)+"]: "); 
           try{
               status = false;
               indexData = input().nextInt();
               
           }
           catch(InputMismatchException e){
               System.out.println("Data harus berupa angka!");
               status = true;
           }
       }
       System.out.print("Data yang ingin disispkan pada index data ke- "+indexData + ": ");
       String tempData = input().nextLine();
       data.add(indexData, tempData);
       displayData();
    }
    private static boolean searchData(String data){
        return data.contains(data);
    }
    private static void removeData(){
        boolean status = true;
        int indexData = 0;
        displayData();
        while(status){
            System.out.print("Pilih index data yang ingin dihapus: [0-" + (data.size() - 1)+"]: ");
            try{
                status = false;
                indexData =input().nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("Data harus berupa angka !");
                status = true;
            }
            
        }
        data.remove(indexData);
        displayData();
    }
    private static void removeDataAtFirst(){
        data.removeFirst();
        displayData();
    }
    private static void removeDataAtLast(){
        data.removeLast();
        displayData();
    }   
    private static void removeDataByContent(){
        displayData();
        System.out.print("Masukkan data yang ingin dihapus: ");
        String dt = input().nextLine();
        if(searchData(dt)){
            data.remove(dt);
        }
        else{
            System.out.println("Anda memasukkan data yang tidak tersimpan di dalam list");
            
        }
        displayData();
    }
    
    private static void programExit(){
        System.exit(0);
    }
    
    private static void programSwitcher(){
        boolean status = true;
        int indexMenu = 0;
        while(status){
            try{
                status = false;
                System.out.print("Pilih menu [1-9]: ");
                indexMenu = input().nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("Masukkan harus berupa angak!");
                status = true;
            }
        }
        switch(indexMenu){
            case 1: addData(); break;
            case 2: addDataToFirst();break;
            case 3: addDataToLast();break;
            case 4: addDataAtLocation();break;
            case 5: removeData();break;
            case 6: removeDataAtFirst();break;
            case 7: removeDataAtLast();break;
            case 8: removeDataByContent();break;
            case 9: programExit();break; 
        }
        programMenu();
    }
    private static void programMenu(){
        System.out.println("\n. : PROGRAM MENU : ."
                +"\n 1. Add Data"
                +"\n 2. Add Data at First"
                +"\n 3. Add Data at Last"
                +"\n 4. Add Data at N Index"
                +"\n 5. Remove Data at N Index"
                +"\n 6. Remove Data at First"
                +"\n 7. Remove Data at Last"
                +"\n 8. Remove Data by Data Content"
                +"\n 9. Program Exit");
        programSwitcher();
    }
    public static void main(String[] args) {
        programMenu();
    }
    
}
