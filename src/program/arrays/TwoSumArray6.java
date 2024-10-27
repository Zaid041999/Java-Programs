package program.arrays;
import java.util.Scanner;

public class TwoSumArray6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the target element");
        int target= sc.nextInt();
        System.out.println("Enter the element in the array:");
        int [] arr=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
       // twoSumOfArray(arr,target);
        int[] twoArray =twoSumOfArray(arr,target);
        for(int value:twoArray){
            System.out.print(value+"\t");
        }

    }

    private static int[] twoSumOfArray(int[] arr,int target) {
        int temp[]=new int[arr.length];
        for (int i =0;i<arr.length;i++){
            for (int j =i+1;j< arr.length;j++){
                if(arr[i]+arr[j] == target){
                    //return new int[]{i,j};
                    temp[0]=arr[i];
                    temp[1]=arr[j];
                }
            }

        }
        //return new int[]{} ;
        return temp;
    }
    // private static int[] twoSumOfArray(int[] arr,int target) {
    //
    //        for (int i =0;i<arr.length;i++){
    //            for (int j =i+1;j< arr.length;j++){
    //                if(arr[i]+arr[j] == target){
    //                    return new int[]{i,j};
    //
    //                }
    //            }
    //
    //        }
    //        return new int[]{} ;
    //
    //    }
}
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.
//
//
//
//Example 1:
//
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//Example 2:
//
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//Example 3:
//
//Input: nums = [3,3], target = 6
//Output: [0,1]
//
//
//Constraints:
//
//2 <= nums.length <= 104
//-109 <= nums[i] <= 109
//-109 <= target <= 109
//Only one valid answer exists.
//
//
//Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
