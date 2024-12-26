package program.arrays;

import java.util.Scanner;

public class ReverseAnArray4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
        System.out.println("Enter the elements");
        int []arr = new int[size];
        for(int i =0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
       int[] rev=reverseArray(arr);
        for (int value:rev){
            System.out.print(value+" \t ");
        }
    }
    //optimize
//    public static void reverseArray(int[] array)
//    {
//        for (int i= 0;i<array.length/2;i++){
//            int temp = array[i];
//            array[i]=array[array.length-i-1];
//            array[array.length-i-1]=temp;
//        }
    //or
    // int first=0;
    //int last =array.length-1;
    //while(first<last){
    //           int temp = array[last];
    //           array[last]=array[first];
    ////         array[first]=temp;
    //           first++;
    //           last--;
//
//    }
    //alternate
      public static int[] reverseArray(int[] array)
    {
        int[] temp=new int[array.length];
        for(int i =array.length-1;i>=0;i--){
            temp[temp.length-i-1]=array[i];
        }

    return temp;
    }
}
