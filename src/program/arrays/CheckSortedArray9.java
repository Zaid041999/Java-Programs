package program.arrays;

import java.util.Scanner;

public class CheckSortedArray9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();

        System.out.println("Enter the element in the array:");
        int [] arr =new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }


        boolean checkResult=isSorted(arr);
        System.out.println("The array is for ascending "+ (checkResult ?"":"not")+" sorted");
        boolean checkResults=isSortedDesc(arr);
        System.out.println("The array is for descending "+ (checkResults ?"":"not")+" sorted");


    }

    private static boolean isSortedDesc(int[] ar) {
        //assume array is sorted
        boolean isSorted=true;
        for (int i = 0; i < ar.length-1 ; i++) {
            //for descending
            if(ar[i+1]>ar[i]){
                isSorted=false;
            }
        }
        return isSorted;
    }
    private static boolean isSorted(int[] array) {
        //assume array is sorted
        boolean isSorted=true;
        for (int i = 0; i < array.length-1 ; i++) {
            //for ascending
            if(array[i+1]<array[i]){
                isSorted=false;
            }
        }
        return isSorted;
    }
    }





