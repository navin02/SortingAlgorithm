package com.ns.sorting.algo;

public class BubbleSort {

	public static void main(String[] args) {
		BubbleSort sort = new BubbleSort();
		int arr[] = { 64, 25, 12, 22, 11 };
		sort.sort(arr);
		sort.printArray(arr);
	}

	void sort(int arr[]) {

		int n = arr.length;
		int temp;
		boolean swapped;
		for (int i = 0; i < n; i++) {
			swapped = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (swapped == false)
				break;
		}
	}

	void printArray(int arr[]) {
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}
}
