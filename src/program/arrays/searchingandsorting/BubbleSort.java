package program.arrays.searchingandsorting;

import java.util.Scanner;
//Time Complexity =>O(n)
public class BubbleSort {
    public static void bubbleSort(int []array){
        for(int round=0;round< array.length-1;round++){
            int swap=0;
            for(int j =0;j< array.length-1-round;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    swap=1;
                }

            }
            if(swap==0){
                break;
            }
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

        bubbleSort(arr);
        printArray(arr);
    }
}
