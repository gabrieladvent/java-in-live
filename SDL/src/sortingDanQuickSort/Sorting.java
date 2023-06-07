/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingDanQuickSort;

/**
 *
 * @author ACER
 */
public class Sorting {
public static int[] BubbleSortAsc(int[] data){
        for (int iterasi = 0; iterasi < data.length - 1; iterasi++) {
            for (int elemen = 0; elemen < data.length - 1 - iterasi; elemen++) {
                if (data[elemen] > data[elemen + 1]) {
                    int n = data[elemen];
                    data[elemen] = data[elemen + 1];
                    data[elemen + 1] = n;
                }
            }
        }
        return data;
}
public static int[] BubbleSortDesc(int [] data){
        for (int iterasi = 1; iterasi <= data.length - 1; iterasi++) {
            for (int elemen = 0; elemen <= data.length - 1 - iterasi; elemen++) {
                if (data[elemen] < data[elemen + 1]) {
                    int n = data[elemen];
                    data[elemen] = data[elemen + 1];
                    data[elemen + 1] = n;
                }
            }
        }
        return data;
}

public static int [] SelectedSortAsc (int [] data){
     for (int i = 0; i < data.length - 1; i++){  
            int index = i;  
            for (int j = i + 1; j < data.length; j++){  
                if (data[j] < data[index]){  
                    index = j; 
                }  
            }  
            int smallerNumber = data[index];   
            data[index] = data[i];  
            data[i] = smallerNumber;  
        } 
    return data;
}
public static int[] SelectedSortDesc(int[] data) {
    int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (data[j] > data[min]) {
                    min = j;
                }
            }
            int temp = data[min];
            data[min] = data[i];
            data[i] = temp;
        }
        return data;
}
    
public static int [] insertionSortAsc (int [] data){
for (int iterasi = 1; iterasi <= data.length - 1; iterasi++) {
        for (int elemen = iterasi; elemen >= 1; elemen--) {
        if (data [elemen] < data [elemen - 1]){
            int n = data [elemen];
            data [elemen] = data [elemen - 1];
            data [elemen -1 ] = n;
        } else {
            elemen = 0;
        }    
    }
    }
    return data;
}
public static int [] insertionSortDesc (int [] data){
    for (int i = 1; i < data.length; i++) {
        for (int j = i; j > 0; j--) {
            if (data [j] > data [j - 1]){
                int n = data [j];
                data [j] = data [j - 1];
                data [j - 1] = n;
            }
        }
    }
    return data;
}
}