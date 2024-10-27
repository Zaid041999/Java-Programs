package program.arrays;

import java.util.Scanner;

public class MoveZeroToLast10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the element in the array:");
        int [] arr=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
        moveZeroToLast(arr);
        for(int value:arr){
            System.out.print(value+"\t");
        }


    }

    private static void moveZeroToLast(int[] arr) {
        int index = 0;
        //for non zero element
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }
        //for zero elements
        while(index< arr.length){
            arr[index]=0;
            index++;
        }
    }
    }
