/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Search205314096;

/**
 *
 * @author ACER
 */
public class methodUTS {
    public static void Print(Object [] data){
    for (int i = 0; i < data.length; i++){
         System.out.println("Index ke-" + i + " : " + data [i]);
    }   
}
    
    public static void quickObjek(Object[] data, int awal, int akhir) {
    if (awal < akhir) {
        int i = awal + 1;
        int j = akhir;
        while ((i <= akhir) && ((((Comparable) data[i]).compareTo(data[awal]) < 0)
                || (((Comparable) data[i]).compareTo(data[awal]) == 0))) {
            i += 1;
        }
        while ((j > awal) && (((Comparable) data[j]).compareTo(data[awal]) > 0)) {
            j -= 1;
        }
        while (i < j) {
            Object n = data[i];
            data[i] = data[j];
            data[j] = n;
            while ((i <= akhir) && ((((Comparable) data[i]).compareTo(data[awal]) < 0)
                    || (((Comparable) data[i]).compareTo(data[awal]) == 0))) {
                i += 1;
            }
            while ((j > awal) && (((Comparable) data[j]).compareTo(data[awal]) > 0)) {
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
    
    public static int interpolasi (Object data [], Object find){
    int low = 0;
    int high = data.length - 1;
    int mid;
    while (low <= high){
        mid = low + ((((Barang)find).getBerat() - 
                ((Barang)data[low]).getBerat()) * (high - low)) /
        (((Barang)data [high]).getBerat() - ((Barang)data [low]).getBerat()); //RUMUS//
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
