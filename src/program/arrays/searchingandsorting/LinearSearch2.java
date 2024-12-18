package program.arrays.searchingandsorting;

import java.util.Scanner;
//Time Complexity
//BestCase->O(1)
//WorstCase->O(n)
public class LinearSearch2 {

    public static int linearSearch(char []array,char target){

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
        char []arr =new char[size];

        System.out.println("Enter the element in the array one by one :");
        for (int i = 0; i <size ; i++) {
                 System.out.print("Character " + (i + 1) + ": ");
                 arr[i] = sc.next().charAt(0);
        }
        System.out.println("Enter the target element :");
        char target = sc.next().charAt(0);

        //call the linearSearch()
        int index = linearSearch(arr,target);
        if (index==-1){
            System.out.println("Element is not present int the array");
        }else {
            System.out.println("Element present at index :" + index);
        }
    }
}
