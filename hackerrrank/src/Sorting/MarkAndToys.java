package Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MarkAndToys {
    public static int maximumToys(List<Integer> prices, int k) {
        // Write your code here
        Collections.sort(prices);
        long sum=0; int max=0;
        for(int i:prices) {
            sum += i;
            if (sum > k)
                break;
            max++;
        }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> prices= Arrays.asList(1,2,3,4);
        System.out.println(maximumToys(prices,7));
    }
}
