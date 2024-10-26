package program.arrays;

import java.util.Scanner;

public class SecondLargestElementInTheArray3 {
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

        int secondLargestElement= sLargestElement(arr);
        System.out.println("Second largest element in array is:"+secondLargestElement);

    }
    public static int sLargestElement(int [] array){
        int largestEle=array[0];
        int sLargest=0;
        for(int i =0;i< array.length;i++){
            if(array[i]>largestEle){
                sLargest=largestEle;
                largestEle=array[i];
            } else if (array[i]>sLargest && array[i]!=largestEle) {
                sLargest=array[i];

            }
        }
        return sLargest;
    }
}
