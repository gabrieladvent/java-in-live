/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MERGESORT;

import java.util.Arrays;
import static java.util.Arrays.sort;

/**
 *
 * @author Tak Bertuan
 */
public class Merge_sort {
    public static void main(String[] args) {
          //membuat array dengan panjang 1000000
        int[] data = new int[1000000];
        //perulangan for untuk membuat data random
        for (int i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * data.length + 1);;
        }
        // variable untuk menampung waktu sebelum dan sesudah running
        long start, stop;
        // insertionDsc
        start = System.nanoTime();
        //copy array data
        insertionSortAsc(Arrays.copyOf(data, data.length));
        stop = System.nanoTime();
        System.out.println("\t\tUntuk N="+data.length+"\n");
        System.out.println("|Algoritma\t |\tLama Waktu (Nano detik)|");
        System.out.println("|-------------------------------------------------|");
        System.out.println(" InsertionAsc\t |\t" + (stop - start) );
         System.out.println("|-------------------------------------------------|");
        // quicksortDsc
        start = System.nanoTime();
        //copy array data
        quickSortAsc(Arrays.copyOf(data, data.length));
        stop = System.nanoTime();
        System.out.println(" QuickSortAsc\t |\t" + (stop - start)  );
         System.out.println("|-------------------------------------------------|");
    }

    public static int sequential(int[] data, int cari) {//deklarasi method static sequential integer dengan paramater int[] data, int cari
        for (int i = 0; i < data.length; i++) {//melakukan looping sebanyak jumlah array dari data
            if (data[i] == cari) {//melakukan cek jika nilai array dari data ke i sama dengan data variable cari
                return i;//memberikan nilai kembali dari isi variable i

            }
        }
        return -1;//memberikan nilai kembali -1
    }

    public static int binary(int[] data, int cari) {//deklarasi method static binary integer dengan paramater int[] data, int cari
        int low = 0;//deklarasi variable low bertipe integer dengan isi 0
        int high = data.length;//deklarasi variable high bertipe integer dengan isi banyaknya array of data
        //melakukan looping untuk menemukan posisi dari angka yang di cari dengan menggunakan algoritma binary search
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (data[mid] < cari) {
                low = mid + 1;
            } else if (data[mid] > cari) {
                high = mid - 1;
            } else if (data[mid] == cari) {
                return mid;//memberikan nilai kembali dari isi variable mid
            }
        }
        return -1;//memberikan nilai kembali -1
    }

    public static int interpolation(int[] data, int cari) {//deklarasi method static interpolation integer dengan paramater int[] data, int cari
        int low = 0;//deklarasi variable low bertipe integer dengan isi 0
        int high = (data.length - 1);//deklarasi variable high bertipe integer dengan isi banyaknya array of data dikurangi 1
        //melakukan looping untuk menemukan posisi dari angka yang di cari dengan menggunakan algoritma interpolation search
        while (cari >= data[low] && cari <= data[high] && low <= high) {
            int probe = low + (high - low) * (cari - data[low]) / (data[high] - data[low]);
            if (high == low) {
                if (data[low] == cari) {
                    return low;//memberikan nilai kembali dari isi variable low
                } else {
                    return -1;//memberikan nilai kembali -1
                }
            }
            if (data[probe] == cari) {
                return probe;//memberikan nilai kembali dari isi variable probe
            }
            if (data[probe] < cari) {
                low = probe + 1;
            } else {
                high = probe - 1;
            }
        }
        return -1;//memberikan nilai kembali -1
    }

    public static void bubbleSort(int[] data, boolean type) {//deklarasi method static bubbleSort void dengan paramater int[] data,boolean type
        int n = data.length;//deklarasi variable n integer dengan isi dari jumlah array of data
        int temp = 0;//deklarasi variable temp ineteger dengan isi 0

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {//melakukan perulangan selama nilai j lebih kecil dari nilai n di kurangi i
                if (type == true) {//data ascending
                    if (data[j - 1] > data[j]) {//melakukan check jika nilai array data ke j-1 lebih besar dari nilai array data ke j
                        //melakukan penukaran isi dari array data menggunakan variable temp
                        temp = data[j - 1];
                        data[j - 1] = data[j];
                        data[j] = temp;
                    }
                } else if (type == false) {//data descending
                    if (data[j - 1] < data[j]) {//melakukan check jika nilai array data ke j-1 lebih besar dari nilai array data ke j
                        //melakukan penukaran isi dari array data menggunakan variable temp
                        temp = data[j - 1];
                        data[j - 1] = data[j];
                        data[j] = temp;
                    }
                }
            }
        }
    }

    public static void selectionSort(int[] data, boolean type) {//deklarasi method static selectionSort void dengan paramater int[] data,boolean type
        int n = data.length;//deklarasi variable n integer dengan isi dari jumlah array of data
        int temp = 0;//deklarasi variable temp ineteger dengan isi 0
        for (int i = 0; i < n - 1; i++) {//melakukan perulangan selama nilai i lebih kecil dari nilai n di kurangi 1
            int min = i;//deklarasi variable min dengan isi variable i
            for (int j = i + 1; j < n; j++) {//melakukan perulangan selama nilai j lebih kecil dari nilai variable n
                if (type == true) {//data ascending
                    if (data[j] < data[min]) {//melakukan pengecekan jika nilai array data ke j lebih kecil dari nilai array data ke min
                        min = j;//mengisi variable min dengan isi variable j
                    }
                } else if (type == false) {//data descending
                    if (data[j] > data[min]) {//melakukan pengecekan jika nilai array data ke j lebih kecil dari nilai array data ke min
                        min = j;//mengisi variable min dengan isi variable j
                    }
                }
            }
            //melakukan penukaran isi dari array data menggunakan variable temp
            temp = data[min];
            data[min] = data[i];
            data[i] = temp;
        }
    }

    public static void insertionSortAsc(int[] data) {
        int n = data.length;
        for (int j = 1; j < n; j++) {
            int key = data[j];
            int i = j - 1;
            while ((i > -1) && (data[i] > key)) {
                data[i + 1] = data[i];
                i--;

            }

            data[i + 1] = key;
        }
    }

    public static void insertionSortDsc(int[] data) {
        int n = data.length;
        for (int j = 1; j < n; j++) {
            int key = data[j];
            int i = j - 1;
            while ((i > -1) && (data[i] < key)) {
                data[i + 1] = data[i];
                i--;
            }

            data[i + 1] = key;
        }

    }

    public static void quickSortAsc(int[] list) {
        quickSortAsc(list, 0, list.length - 1);
    }

    private static void quickSortAsc(int[] list, int first, int last) {
        if (last > first) {
            int pivotIndex = partitionAsc(list, first, last);
            quickSortAsc(list, first, pivotIndex - 1);//mengurutkan data disebelah kiri
            quickSortAsc(list, pivotIndex + 1, last);// mengurutkan data disebelah kanan
        }
    }

    private static int partitionAsc(int[] list, int awal, int akhir) {
        //menentukan pivot = elemen awal
        int pivot = list[awal];
        int i = awal + 1; // Indeks untuk pencarian maju
        int j = akhir; // Indeks untuk pencarian mundur

        while (j > i) {
            // Cek elemen yang lebih kecil dari pivot
            while (i <= j && list[i] <= pivot) {
                i++;
            }

            // Cek elemen yang lebih besar dari pivot
            while (i <= j && list[j] > pivot) {
                j--;
            }

            // Tukar i dan j
            if (i < j) {
                int temp = list[j];
                list[j] = list[i];
                list[i] = temp;
            }
        }
        // Cek elemen yang lebih besar dari pivot
        while (j > awal && list[j] >= pivot) {
            j--;
        }

//        menentukan nilai pivot
        if (pivot > list[j]) {
            list[awal] = list[j];
            list[j] = pivot;
            return j;
        } else {
            return awal;
        }
    }

    public static void quickSortDsc(int[] list) {
        quickSortDsc(list, 0, list.length - 1);// panggil quicksort 3 parameter
    }

    private static void quickSortDsc(int[] list, int first, int last) {
        if (last > first) {
            int pivotIndex = partitionDsc(list, first, last); // cari pivot
            quickSortDsc(list, first, pivotIndex - 1); // mengurutkan yang sebelah kiri
            quickSortDsc(list, pivotIndex + 1, last); // mengurutkan yang sebelah kanan
        }
    }

    /**
     * Partition the array list[first..last]
     */
    private static int partitionDsc(int[] list, int awal, int akhir) {
        //menentukan pivot = elemen awal
        int pivot = list[awal];
        int i = awal + 1; // Indeks untuk pencarian maju
        int j = akhir; // Indeks untuk pencarian mundur

        while (j > i) {
            // Search forward from left
            while (i <= j && list[i] > pivot) {
                i++;
            }

            // Search backward from right
            while (i <= j && list[j] <= pivot) {
                j--;
            }

            // Swap two elements in the list
            if (i < j) {
                int temp = list[j];
                list[j] = list[i];
                list[i] = temp;
            }
        }

        while (j > awal && list[j] < pivot) {
            j--;
        }

        // Swap pivot with list[high]
        if (pivot < list[j]) {
            list[awal] = list[j];
            list[j] = pivot;
            return j;
        } else {
            return awal;
        }
    }

    /**
     * Partition the array list[first..last]
     */
    public static void cetak(int[] data) {//deklarasi method static cetak void dengan paramater int[] data
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " "); // print out isi setiap array data
        }
        System.out.println();
    }
}

