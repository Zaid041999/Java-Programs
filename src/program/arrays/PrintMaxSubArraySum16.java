package program.arrays;

public class PrintMaxSubArraySum16 {
//     Brute force O(n^3)
//    private static void maxSubArraySum(int[] array) {
//        int currSum =0;
//        int maxSum = Integer.MIN_VALUE;
//        for (int i = 0; i < array.length ; i++) {
//            int start=i;
//            for (int j = i; j < array.length ; j++) {
//                currSum=0;
//                int end =j;
//                for (int k = start; k <=end ; k++) {
//                    //sum of sub array
//                    currSum+=array[k];
//
//                }
//               System.out.println("Current Sum :"+currSum);
//                if(maxSum<currSum){
//                    maxSum=currSum;
//                }
//            }
//        }
//        System.out.println("Max Sum :"+maxSum);
//    }

//prefix Sum
//private static void prefixMaxSubArraySum(int[] array) {
//    int currSum =0;
//    int maxSum = Integer.MIN_VALUE;
//    int []prefix= new int [array.length];
//
//    prefix[0]=array[0];
//    //cal prefix array
//    for (int i = 1; i < prefix.length; i++) {
//        prefix[i]=prefix[i-1]+array[i];
//    }
//
//    for (int i = 0; i < array.length ; i++) {
//        int start=i;
//        for (int j = i; j < array.length ; j++) {
//            currSum=0;
//            int end =j;
//            currSum =start == 0 ? prefix[end]:prefix[end]-prefix[start-1];
//            if(maxSum<currSum){
//                maxSum=currSum;
//            }
//        }
//    }
//    System.out.println("Max Sum :"+maxSum);
//}
private static void kadanes(int[] array) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    for (int i = 0; i < array.length; i++) {
        currSum=currSum+array[i];
        if (currSum < 0) {
            currSum = 0;
        }
        maxSum = Math.max(currSum, maxSum);

    }
//O(n)

    System.out.println("Max Sum :"+maxSum);
}

    public static void main(String[] args) {
        int []array ={-2,-3,4,-1,-2,1,5,-3};
       // maxSubArraySum(array);
      //  prefixMaxSubArraySum(array);
        kadanes(array);
    }


}
