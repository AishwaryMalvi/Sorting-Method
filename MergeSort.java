package Sorting;

public class MergeSort {
	
	public static void printArray(int [] arr) {
		int len = arr.length;
		for(int ctr = 0 ; ctr < len ; ctr++) {
			System.out.print(arr[ctr] + " ");
		}
		System.out.println(" ");
	}
	private void sort(int[] arr,int[] temp,int low,int high) {
		if(low<high) {
			int mid = low + (high - low)/2;
			sort(arr,temp,low,mid);
			sort(arr,temp,mid+1,high);
			merge(arr,temp,low,mid,high);
		}
	}
	private void merge(int[] arr, int[] temp, int low, int mid, int high) {
		// TODO Auto-generated method stub
		for(int i = low;i<=high;i++) {
			temp[i] = arr[i];
		}
		int i=low,j = mid+1,k=low;
		while(i<=mid && j<=high) {
			if(temp[i] <= temp[j]) {
				arr[k] = temp[i];
				i++;
			}
			else {
				arr[k] = temp[j];
				j++;
			}
			k++;
		}
		while(i<=mid) {
			arr[k] = arr[i];
			i++;
			k++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {6,9,4,9,2,8,16};
		MergeSort ms = new MergeSort();
		ms.printArray(arr);
		ms.sort(arr,new int[arr.length],0,arr.length-1);
		ms.printArray(arr);
	}
	

}
