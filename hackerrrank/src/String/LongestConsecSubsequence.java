package String;

import java.util.HashSet;

public class LongestConsecSubsequence {

public static int longestConsecutive(int[] nums) {
     HashSet<Integer> set=new HashSet<>();
     for(int e:nums) {
    	 set.add(e);
     }
     int count=1;
     for(int i=0;i<nums.length;i++) {
		int left=nums[i]-1;
    	 int right=nums[i]+1;
    	
    	 while(set.contains(left)) {
    		 count++;
    		 set.remove(left);
    		 left--;
    	 }
    	 while(set.contains(right)) {
    		 count++;
    		 set.remove(right);
    		 right--;
    	 }
    	
     }
     return Math.max(count, 1);
    }
	public static void main(String[] args) {
		int[] nums=new int[] {100,4,200,1,3,2};
		System.out.print(longestConsecutive(nums));
	}
}
