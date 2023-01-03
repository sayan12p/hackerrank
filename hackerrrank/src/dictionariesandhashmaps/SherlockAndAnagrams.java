package dictionariesandhashmaps;

import java.util.*;

public class SherlockAndAnagrams {

    public static int sherlockAndAnagrams(String s) {
    int slength=s.length();
        Map<String,Integer> freq=new HashMap<>();
        for(int i=0;i<slength;i++){
            String substr="";
            for(int j=i;j<slength;j++){
                substr+=s.charAt(j);
                char[] temp=substr.toCharArray();
                Arrays.sort(temp);
                    freq.put(new String(temp),freq.getOrDefault(new String(temp),0)+1);

            }
        }
        int counter=0;
        for(Map.Entry<String,Integer> me:freq.entrySet()){
            counter+=me.getValue()*(me.getValue()-1)/2;
        }
        return counter;
    }

    public static void main(String[] args) {
    String[] arr={"abcd"};
        Arrays.stream(arr).forEach(s-> {System.out.println(sherlockAndAnagrams(s));});
    }
}
