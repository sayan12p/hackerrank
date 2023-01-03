package String;

public class SpecialStringAgain {
    static long substrCount(int n, String s) {
        int ans=n;
        for(int i=0;i<n;i++){
            int repeat=0;
        while(i+1<n && s.charAt(i)==s.charAt(i+1)){
                repeat++;
                i++;
        }
        ans+=(repeat*(repeat+1))/2;
int pointer =1;
while(i-pointer>=0 && i+pointer<n && s.charAt(i+pointer)==s.charAt(i-1)
&& s.charAt(i-pointer)==s.charAt(i-1)){
ans++;
pointer++;
}

    }
    return ans;
    }
    public static void main(String[] args) {
        String s="mnonopoo";
       int n=s.length();
      System.out.println(substrCount(n, s)); 
    }
}
