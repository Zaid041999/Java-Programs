package program.arrays;

import java.util.Scanner;

public class ArrayInputFromUserAndGiveOutput1 {
    public static void main(String[] args) {
        outputArray(inputArray());
    }
   static int[] inputArray(){
       System.out.println("Enter the size of Array");
       Scanner sc =new Scanner(System.in);
       int size =sc.nextInt();
       int[] intArray = new int[size];
       for (int i = 0; i < intArray.length; i++) {
           System.out.println("Enter the element");
           intArray[i]= sc.nextInt();
       }
        return intArray;
    }
    static void outputArray(int[] intArray){
        System.out.println("======for loop======");
        for (int i = 0; i <intArray.length ; i++) {
            System.out.println(intArray[i]);
        }

        System.out.println("======for each loop======");
        for(int arr:intArray){
            System.out.println(arr);
        }
    }
}
