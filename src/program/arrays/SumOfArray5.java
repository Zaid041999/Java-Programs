package program.arrays;
import java.util.Scanner;
public class SumOfArray5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the element in the array:");
        int [] arr=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }

        int sum = sumOfArray(arr);
        System.out.print("Sum of array is: "+sum);

    }

    private static int sumOfArray(int[] arr) {
        int sum =0;
        for (int i =0;i<arr.length;i++){
            sum= sum + arr[i];
        }
        return sum;
    }
}
