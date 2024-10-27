package program.arrays;
import java.util.Scanner;

public class DigitSumArray7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the target element:");
        int target = sc.nextInt();
        System.out.println("Enter the element in the array:");
        int [] arr=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }

        digitSumOfArray(arr,target);
        for(int value:arr){
            System.out.print(value+"\t");
        }


    }

    private static void digitSumOfArray(int[] arr,int target) {
        int index=0;
        for (int i =0;i<arr.length;i++){

                int digitSum = 0;

                int n= arr[i];

                while (n != 0) {
                    int lastDigit = n % 10;
                    digitSum = digitSum + lastDigit;
                    n = n / 10;
                }
                if (digitSum == target) {
                    arr[index]=arr[i];
                    index++;
                    //System.out.print(arr[i]);
                }

            }
        while(index<arr.length){
            arr[index]=0;
            index++;
        }



    }
//    private static void digitSumOfArray(int[] arr,int target) {
//        for (int i =0;i<arr.length;i++){
//
//            int digitSum = 0;
//
//            int n= arr[i];
//
//            while (n != 0) {
//                int lastDigit = n % 10;
//                digitSum = digitSum + lastDigit;
//                n = n / 10;
//            }
//            if (digitSum == target) {
//
//                System.out.print(arr[i]);
//            }
//        }
//    }
}
