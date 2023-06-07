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
public class mergeSort2 {
    public static void merge(int Arr[], int start, int mid, int end) {

	// create a temp array
	int temp[] = new int[end - start + 1];

	// crawlers for both intervals and for temp
	int i = start, j = mid+1, k = 0;

	// traverse both arrays and in each iteration add smaller of both elements in temp 
	while(i <= mid && j <= end) {
		if(Arr[i] <= Arr[j]) {
			temp[k] = Arr[i];
			k += 1; i += 1;
		}
		else {
			temp[k] = Arr[j];
			k += 1; j += 1;
		}
	}

	// add elements left in the first interval 
	while(i <= mid) {
		temp[k] = Arr[i];
		k += 1; i += 1;
	}

	// add elements left in the second interval 
	while(j <= end) {
		temp[k] = Arr[j];
		k += 1; j += 1;
	}

	// copy temp to original interval
	for(i = start; i <= end; i += 1) {
		Arr[i] = temp[i - start];
	}
}
    public static void mergeSort(int Arr[], int start, int end) {

	if(start < end) {
		int mid = (start + end) / 2;
		mergeSort(Arr, start, mid);
		mergeSort(Arr, mid+1, end);
		merge(Arr, start, mid, end);
	}
}
    public static void main(String[] args) {
        int data[]={5, 8, 26, 15, 11, 31, 7, 40, 23, 25};
    int i;
    mergeSort(data, data.length, 0);
        for (i = 0; i < data.length; i++) {
            System.out.print(data [i] + ", ");
        }
    }
}
