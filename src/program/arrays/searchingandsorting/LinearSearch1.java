package program.arrays.searchingandsorting;

import java.util.Scanner;
//Time Complexity
//BestCase->O(1)
//WorstCase->O(n)
public class LinearSearch1 {

    public static int linearSearch(int []array,int target){
        int index=-1;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==target){
                index=i;
                break;
            }

        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the the size of the Array :");
        int size = sc.nextInt();
        int []arr =new int[size];
        System.out.println("Enter the element in the array one by one :");
        for (int i = 0; i <arr.length ; i++) {
                 arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element :");
        int target = sc.nextInt();

        //call the linearSearch()
        int index = linearSearch(arr,target);
        if (index==-1){
            System.out.println("Element is not present int the array");
        }else {
            System.out.println("Element present at index :" + index);
        }
    }
}
