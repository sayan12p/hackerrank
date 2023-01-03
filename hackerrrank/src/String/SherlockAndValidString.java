package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SherlockAndValidString {
	 public static String isValid(String s) {
		    // Write your code here
		 Map<Character,Integer> frequencies=new HashMap<>();
		 char[] ch=s.toCharArray();
		 for(char c:ch) {
			 frequencies.put(c, frequencies.getOrDefault(c,0)+1);
		 }
		List<Integer> values= frequencies.values().stream().collect(Collectors.toList());
		List<Integer> distinct=new ArrayList<Integer>();
		 boolean f=values.stream().allMatch(values.get(0)::equals);
		 if(f) return "YES";
		 for(Integer i:values) {
			 if(!i.equals(values.get(0))) {
				 distinct.add(i);
			 }
		 }
		if(distinct.size()==1) return "YES";
		 return "NO";
		    }
	public static void main(String[] args) {
		System.out.println(isValid("aabbccddeefghi"));
	}

}
