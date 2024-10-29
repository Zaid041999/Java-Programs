package program.arrays;

import java.util.HashSet;

public class FindTheFirstDuplicateElementInArray12 {
    public static void main(String[] args) {
        int[] a={1,2,3,2,3,4,5};
        for (int i = 0; i <a.length-1 ; i++) {
             int temp=0;
            for (int j = i+1; j <a.length ; j++) {
                if ((a[i] == a[j]) && (i!=j) ) {
                    System.out.println("The first duplicate element is :"+ a[j]);
                    temp+=1;
                    break;
                }
            }
            if(temp >0){
                break;
            }

        }

        System.out.println("=======HashSet========");
        int[] b={1,3,2,3,2,3,4,5};
        int temp=-1;

        HashSet<Integer> hs =new HashSet<>();
        for (int i = b.length-1; i >=0 ; i--) {
            if(hs.contains(b[i])){
                temp=i;
            }else {
                hs.add(b[i]);
            }
        }
        if (temp!= -1){
            System.out.println("First duplicate element of array:" + b[temp]);
        }else{
            System.out.println("There is no duplicate element in the array ");
        }
    }
}
