/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUBBLESORT;

import static BUBBLESORT.mergeSort.mergeSort;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Tak Bertuan
 */
public class bubble_sort {
public static int [] bubbleSort (int data []){
    for (int i = 1; i < data.length - 1; i++) {
        for (int j = 0; j < data.length - 1; j++) {
            if (data [j] > data [j + 1]) {
                int temp = data [j];
                data [j] = data [j + 1];
                data [j + 1] = temp;
            }
        }
    }
    return data;
}

public static int ambilRandom (int min, int max){
    return (int) ((Math.random() * (max - min)) + min);
}

public static void main(String[] args) {
//    int data [] = {32, 10, 53, 4, 73, 55};
//    System.out.println("Data Sebelum diurut");
//    for (int i = 0; i < data.length; i++) {
//        System.out.print("[" + data[i] + "], ");
//    }
//    int temp [] = mergeSort(data, data.length);
//    
//    System.out.println("\nData Setelah diurut menggunakan Merge Sort");
//    for (int i = 0; i < temp.length; i++) {
//        System.out.print("[" + temp[i] + "], ");
//    }
//    System.out.println("\n");
    
    int data [] = new int [10];
    System.out.println("Data sebelum diurut: ");
    for (int i = 0; i < data.length; i++) {
        data [i] = ambilRandom(100000, 10000000);
        System.out.print("[" + data[i] + "], ");
    }
    System.out.println("\n");
    
    int bantu [] = new int [data.length];//untuk tampng data
    for (int i = 0; i < data.length; i++) {
        bantu [i] = data[i];
    }
    
    long start = System.nanoTime();
    int urut [] = bubbleSort(bantu);
    System.out.println("Data diurut dengan Bubble Sort");
    for (int i = 0; i < urut.length; i++) {
        System.out.print("[" + urut[i] + "], ");
    }
    System.out.println("");
        long end = System.nanoTime();
        long Selisih = end - start;
        double SelisihInSecond = (double) Selisih / 1000000000;
        System.out.println(SelisihInSecond + " seconds");
        long convert = TimeUnit.SECONDS.convert(Selisih, TimeUnit.NANOSECONDS);
        System.out.println(convert + " seconds");
        System.out.println("");
        
        start = System.nanoTime();
        int [] urutMe  = mergeSort(bantu, bantu.length);
        System.out.println("Data diurut dengan Merge Sort");
        for (int i = 0; i < data.length; i++) {
            System.out.print("[" + urut[i] + "], ");
        }
        System.out.println("");
        end = System.nanoTime();
        Selisih = end - start;
        SelisihInSecond = (double) Selisih / 1000000000;
        System.out.println(SelisihInSecond + " seconds");
        convert = TimeUnit.SECONDS.convert(Selisih, TimeUnit.NANOSECONDS);
        System.out.println(convert + " seconds");
}
}