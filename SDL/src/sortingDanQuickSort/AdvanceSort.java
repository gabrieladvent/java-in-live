/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingDanQuickSort;
import SearchingObjek.Mahasiswa;

/**
 *
 * @author ACER
 */
public class AdvanceSort {
public static void quickSort(int[] data, int awal, int akhir) {
    if (awal < akhir) {
        int i = awal + 1;
        int j = akhir;
        while ((i <= akhir) && (data[i] <= data[awal])) {
            i += 1; //i++
        }
        while ((j > awal) && data[j] > data[awal]) {
            j -= 1; //j--
        }
        while (i < j) {
            int n = data[i];
            data[i] = data[j];
            data[j] = n;
            while ((i <= akhir) && (data[i] <= data[awal])) {
                i += 1; //i++
            }
            while ((j > awal) && data[j] > data[awal]) {
                j -= 1; //j--
            }
        }
    int temp = data[awal];
    data[awal] = data[j];
    data[j] = temp;
    quickSort(data, awal, j - 1);
    quickSort(data, j + 1, akhir);
    }
}
public static void quickObjek(Object[] data, int awal, int akhir) {
    if (awal < akhir) {
        int i = awal + 1;
        int j = akhir;
        while ((i <= akhir) && ((((Comparable) data[i]).
                compareTo(data[awal]) < 0)
                || (((Comparable) data[i]).
                        compareTo(data[awal]) == 0))) {
            i += 1;
        }while ((j > awal) && (((Comparable) data[j]).
                compareTo(data[awal]) > 0)) {
            j -= 1;
        }while (i < j) {
            Object n = data[i];
            data[i] = data[j];
            data[j] = n;
            while ((i <= akhir) && ((((Comparable) data[i]).
                    compareTo(data[awal]) < 0)
                    || (((Comparable) data[i]).
                            compareTo(data[awal]) == 0))) {
                i += 1;
            }while ((j > awal) && (((Comparable) data[j]).
                    compareTo(data[awal]) > 0)) {
                j -= 1;
            }
        }
    Object temp = data[awal];
    data[awal] = data[j];
    data[j] = temp;
    quickObjek(data, awal, j - 1);
    quickObjek(data, j + 1, akhir);
    }
}

public static void main(String[] args) {
    //SORT DATA PRIMITIF//
    int data[]={5, 8, 26, 15, 11, 31, 7, 40, 23, 25};
    int i;
    System.out.println("--> DATA PRIMITIF");
    System.out.println("Data Sebelum Diurutkan: ");
    for (i = 0; i < data.length; i++) {
                System.out.print(data[i]+ ", ");
            }
    quickSort (data, 0, data.length - 1);    
    System.out.println("\nData Setelah Diurutkan: ");
        for(i = 0; i < data.length; i++){
            System.out.print(data[i]+", ");           
        }
    System.out.println("\n");
    System.out.println("--> DATA OBJEK");
    //SORT DATA OBJEK//
    Mahasiswa[] obj = new Mahasiswa[5];
    obj[0] = new Mahasiswa("Gabriel", 205314096);
    obj[1] = new Mahasiswa("Catrien", 205314093);
    obj[2] = new Mahasiswa("Christa", 205314095);
    obj[3] = new Mahasiswa("Lebonan", 205314074);
    obj[4] = new Mahasiswa("Marcelia", 205314075);
    System.out.println("Data sebelum diurutkan: ");
        for (i = 0; i < obj.length; i++) {
            System.out.println(obj [i] + ", ");
    }
    System.out.println("\nData Setelah Diurutkan: ");
    quickObjek(obj, 0, obj.length - 1); 
       for (i = 0; i < obj.length; i++) {
            System.out.println(obj[i] + ", ");
        }
    }
}
