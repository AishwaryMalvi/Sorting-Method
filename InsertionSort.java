package Sorting;

public class InsertionSort {
	
	public static void printArray(int [] arr) {
		int len = arr.length;
		for(int ctr = 0 ; ctr < len ; ctr++) {
			System.out.print(arr[ctr] + " ");
		}
		System.out.println(" ");
	}
	
	public static void sort(int[] arr)  {
		int n = arr.length;
		
		for(int i = 1;i<n;i++) {		//unsorted
			int temp = arr[i];
			int j = i-1;				//sorted
			while(j>=0 && arr[j] >temp) {
				arr[j+1] = arr[j];		//shifthing larger element to temp by 20;
				j = j-1;
			}
			arr[j+1] = temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {6,9,4,9,2,0,16};
		InsertionSort is = new InsertionSort();
		is.printArray(arr);
		is.sort(arr);
		is.printArray(arr);
	}

}
