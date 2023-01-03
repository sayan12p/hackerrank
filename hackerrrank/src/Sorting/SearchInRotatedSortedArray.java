package Sorting;

public class SearchInRotatedSortedArray {
	
	public static int getpivot(int[] nums) {
		int lo=0;int hi=nums.length-1;
		while(lo<hi) {
		int mid=lo+(hi-lo)/2;
		if(nums[mid]<nums[hi]) {
			hi=mid;
		}else lo=mid+1;
		}
		return lo;
	}
	public static int search(int[] nums,int target) {
		if(nums==null|| nums.length==0) return -1;
		
		int pivot=getpivot(nums);
		int lo=0,hi=nums.length-1;
		if(target<=nums[hi]) {lo=pivot;
		}else hi=pivot-1;
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
			if(nums[mid]==target) return mid;
			if(nums[mid]>target) {
				hi=mid-1;
			}else lo=mid+1;
		}
		return -1;
	}
	public static void main(String[] args) {
			int[] nums=new int[] {4,5,6,7,0,1,2};
			int target=3;
			System.out.println(search(nums, target));
	}

}
