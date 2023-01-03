package Sorting;

public class SearchMinInRotatedArray {

	public static int findmin(int[] nums) {
		int lo=0,hi=nums.length-1;
		while(lo<hi) {
			int mid=lo+(hi-lo)/2;
			if(nums[mid]<nums[hi]) {
				hi=mid;
			}else lo=mid+1;
		}
		return nums[lo];
	}
	public static void main(String[] args) {
		int[] nums=new int[] {4,5,6,7,0,1,2};
		System.out.print(findmin(nums));
	}
	
}
