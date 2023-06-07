/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3_Search;
import java.util.Arrays;

public class Larik {
public static void Print(int [] data){ //method cetak data yang dicari
    for (int i = 0; i < data.length; i++){
         System.out.println("Index ke-" + i + " : " + data [i]);
    }   
}

public static int sequential (int data[], int find){ //method sequential search
    for(int i = 0; i < data.length; i++){
        if (data [i] == find)
            return i;
        }
        return -1;
}

public static int binary (int data [], int find){ //method binary search
    int low = 0;
    int high = data.length - 1;
    
    while (low <= high){
        int mid = (low +high) / 2;
            if (find < data[mid]){
                high = mid - 1;
            } else if (find == data [mid]){
                return mid;
            } else if (find > data [mid]){
                low = mid + 1;
            }
    }
    return -1;
}

public static int interpolasi (int data [], int find){ //method interpolasi search
    int low = 0;
    int high = data.length - 1;
    int mid;
    for (int i = 0; i < data.length; i++){
        mid = low + ((find - data[low]) * (high - low)) /
        (data [high] - data [low]); //RUMUS//   
            if (find == data [mid])
                return mid;
            else{
                if (data [mid] > find){
                    high = mid -1;
                } else{
                    low = mid + 1;
                }
            }
    }
    return -1;
}

public static void main(String [] args){
    int data [] = {5, 8, 26, 15, 11, 31};
    System.out.print("Data yang dimasukan: "); //mencetak data yang dimasukan tetapi tidak diurutkan
    for (int i = 0; i < data.length; i++) {
        System.out.print("[" + data[i] + "]");
    }
    System.out.println("");
    System.out.print("Data setelah diurutkan: ");
    Arrays.sort(data); //mengurutkan data
    for (int i = 0; i < data.length; i++) {
        System.out.print("[" + data [i] + "]");
    }
    System.out.println("");
    System.out.println("--> Sequential Search");
    Print(data);
        System.out.println("11 berada pada index ke-" + sequential (data, 11));
    System.out.println("");
    System.out.println("--> Binary Search");
        Print(data);
        System.out.println("5 berada pada index ke-" + binary (data, 5));
    System.out.println("");
    System.out.println("--> Interpolation Search");
        Print(data);
        System.out.println("26 berada pada index ke-"+interpolasi (data, 26));
}
}