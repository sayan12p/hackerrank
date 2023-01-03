package String;

public class MakingAnagrams {
	public static int makeAnagram(String a, String b) {
	    // Write your code here
		int min_deletions=0;
		int[] a_frequencies=new int[26];
		int[] b_frequencies=new int[26];
		for(int i=0;i<a.length();i++) {
			char current_char=a.charAt(i);
			int char_to_int=(int)current_char;
			int position=char_to_int-(int)'a';
			a_frequencies[position]++;
		}
		
		for(int i=0;i<b.length();i++) {
			char current_char=b.charAt(i);
			int char_to_int=(int)current_char;
			int position=char_to_int-(int)'a';
			b_frequencies[position]++;
		}
		for(int i=0;i<26;i++) {
			int diffrence=Math.abs(a_frequencies[i]-b_frequencies[i]);
			min_deletions+=diffrence;
		}
		return min_deletions;
	    }
	public static void main(String[] args) {
		System.out.print(makeAnagram("cde","dcf"));
	}

}
