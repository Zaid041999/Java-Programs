package program.arrays;
import java.util.Scanner;

public class CountTargetElement8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();

        System.out.println("Enter the element in the array:");
        int [] arr =new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element");
        int target= sc.nextInt();

        int count  =countTargetElement(arr,target);
        System.out.print("Count of element is:"+count);


    }

    private static int countTargetElement(int[] array,int targetElement) {
      int count=0;
        for (int i =0;i<array.length;i++){
            if(array[i]==targetElement){
                count++;
            }
        }
       return count;
    }

}
