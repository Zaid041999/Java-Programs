package program.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.prefs.PreferenceChangeListener;

public class FindDuplicateFromArray11 {
    public static void main(String[] args) {
        //duplicate value equal to two  not more than two for each number using brute force method
        int a[]={1,2,3,2,3,4,5};
        System.out.print("a :");
        for (int i = 0; i <a.length-1 ; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if ((a[i] == a[j]) &&(i!=j)) {
                    System.out.print(a[j]+" ");
                }
            }

        }
        System.out.println();
        //duplicate value equal to two not more than two for each number using Set Interface
        int[] b ={1,2,3,2,3,4,5};
        Set<Integer> s=new HashSet<>();
        System.out.print("b :");
        for (int num : b){
            if(s.add(num)==false){
                System.out.print(num+" ");
            }
        }
        System.out.println();
        //Using HashTable
        int[] c ={1,2,3,2,3,4,5,3,2};
        System.out.print("c :");
        Map<Integer,Integer> hm =new HashMap<>();
        //To store the num in hash table
        for(int num : c){
            Integer count = hm.get(num);
            if(count==null){
                hm.put(num,1);
            }else {
                count++;
                hm.put(num,count);
            }
        }
        //To access the duplicate element
        Set<Map.Entry<Integer,Integer>> es=hm.entrySet();
        for(Map.Entry<Integer,Integer> me : es){
            if(me.getValue()>1){
                System.out.print(me.getKey()+" ");
            }
        }
    }
}
