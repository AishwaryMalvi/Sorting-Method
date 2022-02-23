package Sorting;

public class SelectionSort {
	
	public static void printArray(int [] arr) {
		int len = arr.length;
		for(int ctr = 0 ; ctr < len ; ctr++) {
			System.out.print(arr[ctr] + " ");
		}
		System.out.println(" ");
	}
	public void sort(int[] arr) {
		int n = arr.length;
		for(int i = 0;i<n-1;i++) {
			int min = i;
			for(int j = i+1;j<n-1;j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] =temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {6,9,4,9,2,0,16};
		SelectionSort ss = new SelectionSort();
		ss.printArray(arr);
		ss.sort(arr);
		ss.printArray(arr);
	}

}
