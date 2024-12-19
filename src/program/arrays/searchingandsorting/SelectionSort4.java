package program.arrays.searchingandsorting;

import java.util.Scanner;

//Time Complexity =>O(n^2)
public class SelectionSort4 {
    public static void selectionSort(int []array){
        for(int i=0;i< array.length-1;i++){
            int minPos=i;
            //Searching update minPos
            for(int j =i+1;j< array.length;j++){
                if(array[minPos]>array[j]){
                   minPos=j;
                }
            }
            int temp = array[minPos];
            array[minPos]=array[i];
            array[i]=temp;
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

        selectionSort(arr);
        printArray(arr);
    }
}
