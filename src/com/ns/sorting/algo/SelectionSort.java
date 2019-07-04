package com.ns.sorting.algo;

public class SelectionSort {
	public static void main(String[] args) {
		SelectionSort sort=new SelectionSort();
		 int arr[] = {64,25,12,22,11};
		 sort.sort(arr);
		 sort.printArray(arr);
	}

	void sort(int arr[]) {
		
			int n = arr.length;
			int min_index;
			int temp;
			for (int i = 0; i < n - 1; i++) {
				min_index = i;
				for (int j = i + 1; j < n; j++) {
					if (arr[j] < arr[min_index])
						min_index = j;
				}
				temp = arr[i];
				arr[i] = arr[min_index];
				arr[min_index] = temp;
			}
		}
	
	
	void printArray(int arr[]) {
	    
		for(int i:arr) {
			System.out.print(i + " ");
		}
	}
}
