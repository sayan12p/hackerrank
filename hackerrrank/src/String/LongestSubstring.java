package String;

import java.util.HashMap;

public class LongestSubstring {
public static 	int lengthOfLongestSubstring(String s) {
	HashMap<Character, Integer> seen=new HashMap<>();
	int ret=0,slow=0,n=s.length();
	for(int i=0;i<s.length();i++) {
		if(seen.containsKey(s.charAt(i))) {
			slow=Math.max(slow, seen.get(s.charAt(i))+1);
		}
		seen.put(s.charAt(i),i);
		ret=Math.max(ret, i-slow+1);
	}
	return ret;
}
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}
}
