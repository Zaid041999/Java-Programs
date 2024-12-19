package program.arrays.searchingandsorting;

import java.util.Scanner;


public class InsertionSort5 {
    public static void insertionSort(int []array){
        for(int i=1;i< array.length-1;i++){
            int temp = array[i];
            int j = i-1;
           while(j>=0 && array[j]>temp){
               array[j+1]=array[j];
               j--;
           }
           array[j+1]=temp;
        }
    }
    public static void printArray(int []array){
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
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

        insertionSort(arr);
        printArray(arr);
    }
}
