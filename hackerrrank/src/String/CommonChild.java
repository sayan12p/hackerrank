package String;

import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class CommonChild {
	
	
			public static Set<String> givesubsequence(String s1,int i,String s2,int j,Set<String> st1) {
				 
				 if(i==j) {return st1;}
				 else {
					 givesubsequence(s1,i+1, s2, j,st1);
					 s1=s1+s2.charAt(i);
					 st1.add(s1);
					 givesubsequence(s1,i+1, s2, j,st1);
				 }
				 return st1;
	}
	 public static int commonChild(String s1, String s2) {
		    // Write your code here
		Set<String> st1=givesubsequence("",0,s1,s1.length(),new HashSet<>());
		Set<String> st2=givesubsequence("",0, s2, s2.length(),new HashSet<>());
		st1.retainAll(st2);
		Optional<Integer> common=st1.stream().map(s->s.length()).max((i1,i2)->{return i1.compareTo(i2);});
		if(common.isPresent()) return common.get();
		else return 0;
		}
	public static void main(String[] args) {
	System.out.println(commonChild("SHINCHAN", "NOHARAAA"));	
	}
}
