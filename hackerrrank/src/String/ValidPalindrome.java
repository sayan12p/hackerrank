package String;

public class ValidPalindrome {

public static boolean isPalindrome(String s) {
        
	if(s==null || s.length()==0) return false;
	s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
	}
	return true;
    }
	public static void main(String[] args) {
		String s="A man, a plan, a canal: Panama";
		System.out.print(isPalindrome(s));
	}
}
