package program.arrays;

public class PairSumInArray14 {
    private static void pairSum(int[] array) {
        for (int i = 0; i < array.length ; i++) {
            int curr=array[i];//2,4,6,8,10
            for (int j = i+1; j <array.length ; j++) {
                System.out.print("("+curr+","+array[j]+")");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        int []array ={2,4,6,8,10};
        pairSum(array);
    }


}
