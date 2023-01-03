package String;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int[] twosum=new int[] {2,7,11,15};int target=9;
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<twosum.length;i++) {
			int x=twosum[i];
			if(map.containsKey(target-x)) {
				System.out.print( Arrays.toString(new  int[] {map.get(target-x)+1,i+1}));
			}else map.put(x, i);
		}
	}
}
