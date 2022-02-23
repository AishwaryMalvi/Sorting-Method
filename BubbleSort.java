package Sorting;

public class BubbleSort {

	public static void printArray(int [] arr) {
		int len = arr.length;
		for(int ctr = 0 ; ctr < len ; ctr++) {
			System.out.print(arr[ctr] + " ");
		}
		System.out.println(" ");
	}
	
	public void sort(int[] arr) {
		int n = arr.length;
		boolean isSwapped;
		
		for(int i = 0; i<n-1;i++) {
			isSwapped = false;
			for(int j =0;j<n-1-i;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] =temp;
					isSwapped = true;
				}
			}
			if(isSwapped == false) break;
		}
	}
	public static void main(String[] args) {
		int[] arr = new int[] {6,9,4,9,2,0,16};
		BubbleSort bs = new BubbleSort();
		bs.printArray(arr);
		bs.sort(arr);
		bs.printArray(arr);
	}

}
