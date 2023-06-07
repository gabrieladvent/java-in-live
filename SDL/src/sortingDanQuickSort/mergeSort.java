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
public class mergeSort {
    public static int [] mergeSort(int[] a, int n) {
    if (n < 2) {
        return a;
    }
    int mid = n / 2;
    int[] l = new int[mid];
    int[] r = new int[n - mid];

    for (int i = 0; i < mid; i++) {
        l[i] = a[i];
    }
    for (int i = mid; i < n; i++) {
        r[i - mid] = a[i];
    }
    mergeSort(l, mid);
    mergeSort(r, n - mid);
    merge(a, l, r, mid, n - mid);
    return a;
}
    public static void merge(int[] a, int[] l, int[] r, int left, int right) {
 
    int i = 0, j = 0, k = 0;
    while (i < left && j < right) {
        if (l[i] <= r[j]) {
            a[k++] = l[i++];
        }
        else {
            a[k++] = r[j++];
        }
    }
    while (i < left) {
        a[k++] = l[i++];
    }
    while (j < right) {
        a[k++] = r[j++];
    }
}
    
public static int ambilRandom (int min, int max){
    return (int) ((Math.random() * (max - min)) + min);
}
    
public static void main(String[] args) {
    int data [] = new int [1000000];
    for (int i = 0; i < data.length; i++) {
        data [i] = ambilRandom(100000, 10000000);
    }
    int [] urut  = mergeSort(data, data.length);
    for (int i = 0; i < data.length; i++) {
        System.out.println(urut[i]);
    }
}
}
