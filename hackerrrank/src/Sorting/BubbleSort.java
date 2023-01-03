package Sorting;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    public static void countSwaps(List<Integer> a) {
        // Write your code here
        int counter=0;
        int n=a.size();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(a.get(j)>a.get(j+1)){
                    int temp=a.get(j);
                    int temp1=a.get(j+1);
                    a.set(j+1,temp);
                    a.set(j,temp1);
                    counter++;
                }
            }
        }
        System.out.println("Array is sorted in "+counter +" swaps.");
        System.out.println("First Element: "+ a.get(0));
        System.out.println("Last Element: " +a.get(a.size()-1));

    }
    public static void main(String[] args) {
       List<Integer> a= Arrays.asList(1,2,3);
       countSwaps(a);
    }
}
