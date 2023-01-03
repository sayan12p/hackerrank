package common;

import java.util.Arrays;
import java.util.List;

public class SortArray {
    public static void main(String[] args) {
        List<String> slist=Arrays.asList("1","2","3");
       String s= slist.stream().max(String::compareTo).get();
       System.out.println(s);
    }
}
