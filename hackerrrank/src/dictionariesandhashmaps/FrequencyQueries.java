package dictionariesandhashmaps;

import java.util.*;
import java.util.stream.Collectors;

public class FrequencyQueries {
    static List<Integer> freqQuery(List<int[]> queries) {
        List<Integer> resultlist=new ArrayList<>();
        List<Integer> result=new LinkedList<>();
        for(int[] i:queries){
            if(i[0]==1){
                resultlist.add(i[1]);
            }
            if(i[0]==2){
                if(resultlist.contains(i[1]))
                resultlist.remove(Integer.valueOf(i[1]));
            }
            if(i[0]==3){
               HashMap<Integer,Long> freq= resultlist.stream().collect(Collectors.groupingBy(a->a, HashMap :: new ,Collectors.counting()));
                if(freq.values().stream().anyMatch(a->a.equals((long)i[1])))
                   result.add(1);
                else result.add(0);
            }
        }
return result;
    }
    public static void main(String[] args) {
       List<int[]> queries=new ArrayList<>();
      // List<Integer> query=Arrays.asList(1,1);

        Collections.addAll(queries,new int[]{1,5},new int[]{1,6},new int[]{3,2},
                new int[]{1,10}, new int[]{1,10},new int[]{1,6},new int[]{2,5},new int[]{3,2});
        System.out.println(freqQuery(queries));
    }
}
