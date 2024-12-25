package program.arrays.searchingandsorting;

import java.util.Scanner;


//Array should be sorted
public class BinarySearch7 {

    public static int binarySearch(int []array,int target){
        int si = 0;
        int ei =array.length-1;
        while(si<=ei){
            int mid =si +(ei-si)/2;
            if(array[mid]==target){
                return mid;
            }
            if(target<array[mid]){
                ei=mid-1;
            }
            if(target>array[mid]){
                si=mid+1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
       int [] array ={2,3,4,5,6,7};
       int target = 4;

        //call the binarySearch()
        int index = binarySearch(array,target);
        if (index==-1){
            System.out.println("Element is not present int the array");
        }else {
            System.out.println("Element present at index :" + index);
        }
    }
}
