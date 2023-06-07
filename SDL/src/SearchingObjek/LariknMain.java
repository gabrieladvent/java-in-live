/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SearchingObjek;
import java.util.Arrays;

/**
 *
 * @author ACER
 */
public class LariknMain {
public static void Print(Object [] data){
    for (int i = 0; i < data.length; i++){
         System.out.println("Index ke-" + i + " : " + data [i]);
    }   
}

public static int sequentialObjek (Object data[], Object find){
    for(int i = 0; i < data.length; i++){
        if (((Comparable) data [i]).compareTo(find)== 0)
            return i;
        }
        return -1;
}

public static int binaryObjek (Object data [], Object find){
    int low = 0;
    int high = data.length - 1;
    int mid;
    
    while (low <= high){
        mid = (low + high) / 2;
        if (((Comparable) data [mid]).compareTo(find)== 0){
            return mid;
        } else {
            if (((Comparable) data [mid]).compareTo(find)== 1){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
    }
  return -1;
}

public static void main(String [] args){
    Mahasiswa mhs[] = new Mahasiswa [5];
    mhs[0] = new Mahasiswa ("Gabriel", 205314096);
    mhs[1] = new Mahasiswa ("Catrien", 205314093);
    mhs[2] = new Mahasiswa ("Chriesta", 205314095);
    mhs[3] = new Mahasiswa ("Lebonan", 205314074);
    mhs[4] = new Mahasiswa ("Supriosa", 205314075);
    
    System.out.println("--> Sequential Search Objek");
    Print(mhs);
    Mahasiswa mencari = new Mahasiswa("Gabriel", 205314096);
    int hasil = sequentialObjek(mhs, mencari);
    if (hasil == -1){
        System.out.println("Mahasiswa dgn nim: "+ mencari.getNim() +
                " Tidak ditemukan");
    } else {
        System.out.println("Mahasiswa dengan nim: "+mencari.getNim() + 
                " Ada di index: "+hasil);
    }
    
    System.out.println("");
    System.out.println("--> Binary Search Objek");
    Arrays.sort(mhs);
    Print(mhs);
    Mahasiswa cari = new Mahasiswa ("Supriosa", 205314075);
     hasil = binaryObjek (mhs, cari);
     if (hasil == -1){
        System.out.println("Mahasiswa dgn nim: "+ mencari.getNim() + 
                " Tidak ditemukan");
    } else {
        System.out.println("Mahasiswa dengan nim: "+mencari.getNim() + 
                " Ada di index: "+hasil);
    }
     
    System.out.println("");
    System.out.println("--> Interpolation Search Objek");
    Print(mhs);
    Mahasiswa Search = new Mahasiswa ("Supriosa", 205314075);
     hasil = interpolasi(mhs, Search);
     if (hasil == -1){
        System.out.println("Mahasiswa dgn nim: "+ mencari.getNim() +
                " Tidak ditemukan");
    } else {
        System.out.println("Mahasiswa dengan nim: "+mencari.getNim() +
                " Ada di index: "+hasil);
    }
}

public static int interpolasi (Object data [], Object find){
    int low = 0;
    int high = data.length - 1;
    int mid;
    while (low <= high){
        mid = low + ((((Mahasiswa)find).getNim() - 
                ((Mahasiswa)data[low]).getNim()) * (high - low)) /
        (((Mahasiswa)data [high]).getNim() - ((Mahasiswa)data [low]).getNim()); //RUMUS//
        if (((Comparable) data [mid]).compareTo(find)== 0){
            return mid;
        } else {
            if (((Comparable) data [mid]).compareTo(find)== 1){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
    }
    return -1;
}
}