package com.ns.sorting.algo;

public class InsertionSort {
	void sort(int arr[]) {
		int n = arr.length;
		int key;
		int j;
		for (int i = 1; i < n; i++) {
			key = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
	
	void printArray(int arr[]) {
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}
	
	public static void main(String[] args) {
		InsertionSort sort = new InsertionSort();
		int arr[] = { 64, 25, 12, 22, 11 };
		sort.sort(arr);
		sort.printArray(arr);
	}
}
