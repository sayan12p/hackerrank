package Sorting;

public class SearchMinInRotatedSortedArray2 {

	public static int findmin(int[] nums) {
	int lo=0;
	int hi=nums.length-1;
	while(lo<hi) {
		int mid=lo+(hi-lo)/2;
		if(nums[mid]<nums[hi]) {
			hi=mid;
		}else if(nums[mid]>nums[hi]) {
			lo=mid+1;
		}else hi--;
	}
	return nums[lo];
	}
	public static void main(String[] args) {
		int [] nums=new int[] {2,2,2,0,1};
		System.out.print(findmin(nums));
	}

}
