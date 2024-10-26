package program.arrays;

import java.util.Scanner;

public class LargestElementInTheArray2 {
    public static void main(String[] args) {
        //initializing and declaration
        //int []arr={23,56,26,87,63};
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
        System.out.println("Enter the elements");
        int []arr= new int[size];
        for(int i =0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        int largestElement= largestElement(arr);
        System.out.println("Largest element in array is:"+largestElement);

    }
    public static int largestElement(int [] array){
        int largestEle=array[0];
        for(int i =0;i< array.length;i++){
            if(array[i]>largestEle){
                largestEle=array[i];
            }
        }
        return largestEle;
    }
}
