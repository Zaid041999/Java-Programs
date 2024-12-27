package program.arrays;

public class MissingNumberInArray17 {
    public static void missingNumber(int[] nums) {
        int sum =0;
        int expectedElement=nums.length+1;
        int totalSum=(expectedElement*(expectedElement+1))/2;
        System.out.println(totalSum);
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];

        }
        System.out.println(sum);
        int result=totalSum-sum;

        System.out.println("Missing Number is :"+ result);


    }

    public static void main(String[] args) {
        int []array={1,2,3,4,6};
        missingNumber(array);
    }
}
