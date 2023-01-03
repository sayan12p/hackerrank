package Sorting;

import java.util.*;

public class Fraudelent {

    public static int activityNotifications(List<Integer> expenditure, int d) {
        // Write your code here
        int[] cnt=new int[201];
        int n=expenditure.size();
        int res = 0;
        for(int i=0;i<d;i++){
            cnt[expenditure.get(i)]++;
        }
        for (int i = d; i < n; i++) {
            int m = getmedian(i,expenditure);
            //out.println(m);
            if (expenditure.get(i) >= m) {
                res++;
            }
            cnt[expenditure.get(i - d)]--;
            cnt[expenditure.get(i)]++;
        }
        return res;
    }

    public static int getmedian(int d,List<Integer> expenditure) {
        Integer[] a = expenditure.stream().toArray(Integer[]::new);
        int r = d / 2;
        if (d % 2 == 1) {
            r++;
        }
        int res = 0;
        boolean odd = d % 2 == 1;
        for (int k = 0; k <= 200; k++) {
            while (r > 0 && a[k] > 0) {
                a[k]--;
                r--;
            }
            if (r == 0) {
                res += k;
                if (d % 2 == 0) {
                    d--;
                    r++;
                    if (a[k] > 0) {
                        return 2 * k;
                    }
                } else {
                    break;
                }
            }
        }
        return res * (odd ? 2 : 1);
    }




public static void main(String args[]){
        List<Integer> arrlist=Arrays.asList(2, 3, 4, 2, 3, 6, 8, 4, 5);
        System.out.println(activityNotifications(arrlist,5));

}


}
