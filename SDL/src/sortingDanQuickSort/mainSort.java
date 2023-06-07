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
public class mainSort {
public static void main(String[] args) {
        int data[] = {5, 8, 26, 11, 31, 15};
        System.out.println("Data sebelum terurutkan");
            for (int i = 0; i < data.length; i++) {
                System.out.print(data[i]+ ", ");
            }
        System.out.println("\n");
        System.out.println("--> Bubble Sort Ascending");
            Sorting.BubbleSortAsc(data);
            for (int i = 0; i < data.length; i++) {
                System.out.print(data[i] + ", ");
            }
        System.out.println("\n");
        System.out.println("--> Bubble Sort Descending");
            Sorting.BubbleSortDesc(data);
            for (int i = 0; i < data.length; i++) {
                System.out.print(data[i] + ", ");
            }
            
        System.out.println("\n");
        System.out.println("--> Selection Sorting Ascending");
        Sorting.SelectedSortAsc(data); 
        for(int i:data){  
            System.out.print(i+" ");  
        }
        System.out.println("\n");
        System.out.println("--> Selection Sorting Descending");
        Sorting.SelectedSortDesc(data); 
        for(int i:data){  
            System.out.print(i+" ");  
        }
        
        System.out.println("\n");
        System.out.println("--> Insertion Sorting Ascending");
        Sorting.insertionSortAsc(data);
        for(int i:data){    
            System.out.print(i+" ");    
        }
        System.out.println("\n");
        System.out.println("--> Insertion Sorting Descending");
        Sorting.insertionSortDesc(data);
        for(int i:data){    
            System.out.print(i+" ");    
        }
        System.out.println("\n");
        
        //PENGGUNAAN MATH.RANDOM DAN SYSTEM NANOTIME//
//        int n = 1000000;
//        int [] random = new int [n];
//        for (int i = 0; i < random.length; i++) {
//            random [i] = (int) (Math.random() * 100);
//        }
//        System.out.println("Jumlah Data: " + n);
//        long x = System.nanoTime();
//        System.out.println("Awal --> " + x);
//        //System.out.println("buble sort asc");
//        //System.out.println("Select sort asc");
//        System.out.println("Insert sort asc");
//        
//        //Sorting.BubbleSortAsc(random);
//        //Sorting.SelectedSortAsc(random);
//        Sorting.insertionSortAsc(random);
//        long y = System.nanoTime();
//        System.out.println("Akhir --> " + y);
//        long akhir = y - x;
//        System.out.println("Selisih --> " + akhir);
//        System.out.println("");
//        
//        //System.out.println("buble sort desc");
//        //System.out.println("Select sort desc");
//        System.out.println("insert sort dsc");
//        
//        //Sorting.BubbleSortDesc(random);
//        //Sorting.SelectedSortDesc(random);
//        Sorting.insertionSortDesc(random);
//        long desc = System.nanoTime();
//        System.out.println("Akhir --> " + desc);
//        long akhir1 = desc - x;
//        System.out.println("Selisih --> " + akhir1);
//        System.out.println("");
//        
//        
    }

}
