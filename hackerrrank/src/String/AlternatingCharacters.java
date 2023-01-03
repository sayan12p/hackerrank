package String;

public class AlternatingCharacters {

	 public static int alternatingCharacters(String s) {
		    // Write your code here
		char[] ch=s.toCharArray();int noofdeletions=0;
		for(int i=0;i<ch.length-1;i++) {
			if(ch[i]==ch[i+1]) {
				noofdeletions++;
			}
		}
		return noofdeletions;
		    }
	 
	 public static void main(String[] args) {
		System.out.print(alternatingCharacters("AAABBB"));
	}
}
