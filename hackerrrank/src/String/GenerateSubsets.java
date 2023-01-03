package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateSubsets {
	public static void generatesubsets(List<Integer> nums,int currentindex,ArrayList<Integer> result,List<List<Integer>> powerset) {
		if(currentindex==nums.size()) {
			powerset.add(new ArrayList<>(result));
			return;
		}
		int currentval=nums.get(currentindex);
		result.add(currentval);
		generatesubsets(nums, currentindex+1, result, powerset);
		
		result.remove(result.size()-1);
		generatesubsets(nums, currentindex+1, result, powerset);
		
	}
	public static List<List<Integer>> subsets(List<Integer> nums){
		List<List<Integer>> powerset=new ArrayList<>();
		ArrayList<Integer> result=new ArrayList<>();
		generatesubsets(nums, 0, result, powerset);
		return powerset;
	}
	public static void main(String[] args) {
		
		List<Integer> nums=Arrays.asList(1,2,3);
		System.out.println(subsets(nums).toString());
	}

}
