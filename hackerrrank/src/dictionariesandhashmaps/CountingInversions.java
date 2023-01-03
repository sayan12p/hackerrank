package dictionariesandhashmaps;

import java.util.Arrays;
import java.util.List;

public class CountingInversions {
    public static int countInversions(List<Integer> arr) {
        // Write your code here
   int[] arr1=arr.stream().mapToInt(Integer::intValue).toArray();
    int[] temp=new int[arr1.length];
    Arrays.fill(temp,0);
   return mergesort(arr1,temp,0,arr1.length-1);

    }
    public static int mergesort(int[]arr,int[] temp,int left,int right){
        int invversioncount=0; 
        if(left<right){
           int  mid=left+right/2;

        
        invversioncount+=mergesort(arr,temp,left,mid);
        invversioncount+=mergesort(arr,temp,mid+1,right);

        invversioncount+=merge(arr,temp,left,mid+1,right);
        }
        return invversioncount;
    }
    private static long merge(int[] a,int[] temp,int l,int m,int r){
       int i,j,k;
       int invcount=0;
       i=l;j=m;k=l;
       while(i<=m-1 && j<=r){
           if(a[i]<=a[j]){
               temp[k++]=a[i++];
           }else{
               temp[k++]=a[j++];
               invcount+=m-i;
           }
       }
       while(i<=m-1){
           temp[k++]=a[i++];
       }
       while(j<=r){
           temp[k++]=a[j++];
       }
       for( i=l;i<=m;i++){
           a[i]=temp[i];
       }
       return invcount;
    }
    public static void main(String[] args) {
        List<Integer> arrlist= Arrays.asList(2, 1, 3, 1, 2);
        System.out.println(countInversions(arrlist));
    }
}
