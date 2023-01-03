package Sorting;

public class QuickSort {

	public static void main(String[] args) {
		int[] x= {9,2,4,7,3,7,10};
		printArray(x);
		int low=0;
		int high=x.length-1;
		quicksort(x,low,high);
		printArray(x);
	}

	private static void quicksort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		if(arr==null|| arr.length==0)return;
		if(low>=high) return;
		int mid=low+(high-low)/2;
		int i=low;
		int j=high;int pivot=arr[mid];
		while(i<=j) {
			while(arr[i]<pivot) {
				i++;
			}
			while(arr[j]>pivot) {
				j--;
			}
			if(i<=j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		while(low<j) {
			quicksort(arr, low, j);
		}
		while(i<high) {
			quicksort(arr, i, high);
		}
	}
	
	public static void printArray(int[] x) {
		for (int a : x)
		System.out.print(a + " ");
		}

}
