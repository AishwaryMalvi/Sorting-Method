package Sorting;

public class SquareOfSortedArray {
	
	public int[] SortedArray(int[] arr) {
		int n = arr.length;
		int[] result = new int[n];
		int i=0,j=n-1;
		for(int k =n-1;k>=0;k--) {
			if(Math.abs(arr[i])>Math.abs(arr[j])){
				result[k] = arr[i] * arr[i];
				i++;
			}
			else {
				result[k] = arr[j] *arr[j];
				j--;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquareOfSortedArray sosa = new SquareOfSortedArray();
		int[] arr = new int[] {-2,-5,7,9,24};
		for(int i : arr ) {
			System.out.print(i + " ");
		}
		System.out.println();
		int[] arr2 = sosa.SortedArray(arr);
		for(int i : arr2 ) {
			System.out.print(i + " ");
		}
	}

}
